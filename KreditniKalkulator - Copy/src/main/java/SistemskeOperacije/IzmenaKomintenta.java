package SistemskeOperacije;

import DomenskeKlase.KomintentFizickoLice;
import DomenskeKlase.OpstiDomenskiObjekat;
import Rezultat.Rezultat;

public class IzmenaKomintenta extends OpstaSO{
	
	public static Rezultat izmeni(KomintentFizickoLice k){
		IzmenaKomintenta ik = new IzmenaKomintenta();	
		return ik.opsteIzvrsenjeSO(k);
	}
	
	@Override
	public Rezultat izvrsenjeSO(OpstiDomenskiObjekat o){
		KomintentFizickoLice k = (KomintentFizickoLice)o;
		Rezultat r = DBBR.izbrisiSlog(k);
		Rezultat r1 = null;
		if(r.isOk()){
		r1 = DBBR.sacuvajSlog(k);
		}
		r.setPoruka(r.getPoruka()+"\n"+r1.getPoruka());
		r.setOk(r1.isOk());
		
		return r;		
	}
	

}
