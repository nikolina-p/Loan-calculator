package SistemskeOperacije;

import DomenskeKlase.KomintentFizickoLice;
import DomenskeKlase.OpstiDomenskiObjekat;
import Rezultat.Rezultat;

public class BrisanjeKomintenta extends OpstaSO{
	
	public static Rezultat brisi(KomintentFizickoLice k){
		BrisanjeKomintenta bk = new BrisanjeKomintenta();		
		return bk.opsteIzvrsenjeSO(k);
	}
	
	@Override
	public Rezultat izvrsenjeSO(OpstiDomenskiObjekat o){
		KomintentFizickoLice k = (KomintentFizickoLice)o;
		Rezultat r = DBBR.izbrisiSlog(k);
		return r;
		
	}
}
