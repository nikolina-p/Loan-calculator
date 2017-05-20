package SistemskeOperacije;


import Kontroleri.*;
import Rezultat.Rezultat;

import DomenskeKlase.*;
public class FizickoLiceProvera extends OpstaSO{
	
	static String fileName;
		
	public static Rezultat provera(Zahtev z){
		FizickoLiceProvera flp = new FizickoLiceProvera();
		fileName = "";
		if(z.getKredit().getVrstaKredita().equals("POTROSACKI")) fileName = "Pravila_Potrosacki";
		if(z.getKredit().getVrstaKredita().equals("STAMBENI")) fileName = "Pravila_Stambeni";
		if(z.getKredit().getVrstaKredita().equals("ADAPTACIJA I REKONSTRUKCIJA")) fileName = "Pravila_AIR";
		
		return flp.opsteIzvrsenjeSO(z);
	}
	
	
	@Override
	public Rezultat izvrsenjeSO(OpstiDomenskiObjekat odo){		
		Zahtev z = (Zahtev)odo;
		RuleRunner rr = new RuleRunner(); 
		
		//postaviti ID zahteva(zadnji u bazi +1)		
		Rezultat r = DBBR.vratiPoslednji(z);		
//baza		
		if(r.isOk()){
			//provera istorije poslovanja sa bankom
			Rezultat r1 = DBBR.vratiSlogove("Krediti", z.getKomitent());
			r.setPoruka(r.getPoruka()+"\n"+r1.getPoruka());
			r.setOk(r1.isOk());
//baza       citanje podataka iz baze o komitentu
			if(r.isOk()){
				Rezultat r7 = DBBR.vratiSlogove("FizickoLice", z.getKomitent());
				r.setPoruka(r.getPoruka()+"\n"+r7.getPoruka());
				r.setOk(r7.isOk());
				
			}
//pravila					
					if(r.isOk()){
						//System.out.println("Starost: "+z.getKomitent().getStarost()+" RokOtplae: "+z.getKredit().getRokOtplateGod());
							Rezultat r2 = rr.obradiZahtevRF(z,fileName);//provera osnovnih uslova
							r.setOk(r2.isOk());
							r.setPoruka(r.getPoruka()+"\n"+r2.getPoruka());
							
							if(r.isOk()) z.setSgn(true); //prvi put sam prosla (ovo se koristi u pravilima)
													
//baza                          ako zahtev nije odbijen i nije se desila neka greska u programu onda...
								//uzeti kamate iz baze
							if(z.isStanje() && r.isOk()){
								if(z.getKredit().getRocnost()!= "" && z.getGrupaR()!= 0){
								
								z.getKredit().getKamata().setRocnost(z.getKredit().getRocnost());
								z.getKredit().getKamata().setRizicnaGrupa(z.getGrupaR());
								Rezultat r3 = DBBR.vratiSlogove("Kamate", z.getKredit().getKamata());
								r.setOk(r3.isOk());
								r.setPoruka(r.getPoruka()+"\n"+r3.getPoruka());		
											
								}
								}
							
//baza                       uzeti diskontnu stopu
							if(z.isStanje() && r.isOk()){
								if(z.getKredit().getKamata().getKamata()!= 0 ){								
								z.getKredit().getDiskStopa().setBrGod(z.getKredit().getRokOtplateGod());
								z.getKredit().getDiskStopa().setKamata(z.getKredit().getKamata().getKamata());
								Rezultat r4 = DBBR.vratiSlogove("FinansijskaTablica", z.getKredit().getDiskStopa());
								r.setOk(r4.isOk());
								r.setPoruka(r.getPoruka()+"\n"+r4.getPoruka());	
								if(r.isOk()){
										z.getKredit().setDiskStopa(z.getKredit().getDiskStopa());
										z.getKredit().izracunajMesecnuRatu(z.getKredit().getDiskStopa());							
										}
								}
							}
							if(z.isStanje() && r.isOk() && z.isSgn()){
								Rezultat r5 = rr.obradiZahtevRF(z, fileName);//obradi ostatak pravila
								
								//System.out.println("finansijska mogucnost: "+z.getKomitent().getFinansijskaMogucnost());
								//System.out.println("Rata je "+ z.getKredit().getMesRata());
								r.setOk(r5.isOk());
								r.setPoruka(r.getPoruka()+"\n"+r5.getPoruka());
							}
							if(r.isOk()){
								
								Rezultat r6 = DBBR.sacuvajSlog(z);//sacuvaj i ako je odbijen
								r.setPoruka(r.getPoruka()+"/"+r6.getPoruka());
								r.setOk(r6.isOk());
							}				
					}
		
	}
		return r;
	}
}
