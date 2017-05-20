package SistemskeOperacije;

import DomenskeKlase.*;
import DomenskeKlase.OpstiDomenskiObjekat;
import Rezultat.Rezultat;

public class OdobravanjeKredita extends OpstaSO{
	
	public static Rezultat unesi(Zahtev z){
		OdobravanjeKredita sk = new OdobravanjeKredita();		
		return sk.opsteIzvrsenjeSO(z);
	}
	
	@Override
	public Rezultat izvrsenjeSO(OpstiDomenskiObjekat o){
		Zahtev z = (Zahtev)o;		
		Kredit k = z.getKredit();
		
		Rezultat r = DBBR.izbrisiSlog(z);	
		if(r.isOk()){
		Rezultat r1 = DBBR.sacuvajSlog(k);
		r.setOk(r1.isOk());
		r.setPoruka(r.getPoruka()+"\n"+r1.getPoruka());
		}
		
		return r;
		
	}
}
