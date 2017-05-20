package SistemskeOperacije;

import DomenskeKlase.*;
import DomenskeKlase.OpstiDomenskiObjekat;
import Rezultat.Rezultat;
import java.sql.*;

public class PronadjiZahtev extends OpstaSO{
	
	public static Rezultat pronadji(Zahtev z){
		PronadjiZahtev pz = new PronadjiZahtev();
		return pz.opsteIzvrsenjeSO(z);
	}
	
	@Override
	public Rezultat izvrsenjeSO(OpstiDomenskiObjekat o){
		Zahtev z = (Zahtev)o;
		Rezultat r = new Rezultat(true);
		ResultSet rs = DBBR.vratiSlog(z, r);
		try{
			if(rs.next()){
				z.setStanje(false);
				if(rs.getInt("stanje")==1) z.setStanje(true);
				z.getKomitent().setJmbg(rs.getString("SifVlasnika"));
				z.getKredit().setIznosKredita(rs.getInt("Iznos"));
				z.getKredit().setValuta(rs.getString("Valuta"));
				z.getKredit().setVrstaKredita(rs.getString("VrstaKredita"));
				z.getKredit().setPokrivenostProfakturama(rs.getDouble("Profakture"));
				z.getKredit().setRokOtplateGod(rs.getInt("RokOtplate"));
				z.getKredit().setDepozit(rs.getDouble("Depozit"));
				z.getKredit().setOsiguranjeNKOSK(true);
				if(rs.getString("Osiguranje").equals("false")) z.getKredit().setOsiguranjeNKOSK(false);
				z.getKredit().setGrejsPeriod(rs.getInt("GrejsPeriod"));
				z.getKredit().setVrednostHipo(rs.getDouble("Hipoteka"));
				z.getKredit().setZirant(true);
				if(rs.getString("Zirant").equals("0")) z.getKredit().setZirant(true);
				z.getKredit().setMesRata(rs.getDouble("Anuitet"));
				System.out.println("MESECNA RATA::: "+z.getKredit().getMesRata());
			}else{
				return new Rezultat(false, "Zahtev ne postoji u bazi");
			}
		}catch(SQLException e){
			return new Rezultat(false, "Neuspesno citanje RS-a");
		}
		r.setPoruka("Uspesno citanje RS-a");
		return r;
		
	}
}
