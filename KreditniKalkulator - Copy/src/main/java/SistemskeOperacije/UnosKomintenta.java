package SistemskeOperacije;
import Rezultat.*;
import DomenskeKlase.KomintentFizickoLice;
import DomenskeKlase.OpstiDomenskiObjekat;

public class UnosKomintenta extends OpstaSO{

	public static Rezultat unesi(KomintentFizickoLice k){
		UnosKomintenta uk = new UnosKomintenta();		
		return uk.opsteIzvrsenjeSO(k);
	}
	
	@Override
	public Rezultat izvrsenjeSO(OpstiDomenskiObjekat o){
		KomintentFizickoLice k = (KomintentFizickoLice)o;
		Rezultat r = DBBR.sacuvajSlog(k);
		
		
		return r;
		
	}
	
}
