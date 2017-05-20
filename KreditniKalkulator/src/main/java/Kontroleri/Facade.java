package Kontroleri;
import DomenskeKlase.*;
import Rezultat.Rezultat;
import SistemskeOperacije.BrisanjeKomintenta;
import SistemskeOperacije.FizickoLiceProvera;
import SistemskeOperacije.IzmenaKomintenta;
import SistemskeOperacije.OdobravanjeKredita;
import SistemskeOperacije.PronadjiKomintenta;
import SistemskeOperacije.PronadjiZahtev;
import SistemskeOperacije.UnosKomintenta;


public class Facade {

	public static Rezultat proveraFizickogLica(Zahtev z){
		
		return FizickoLiceProvera.provera(z);
	}
	
	
	public static Rezultat unosKomitenta(KomintentFizickoLice k){
		Rezultat r = UnosKomintenta.unesi(k);
		return r;
	}
	
	public static Rezultat pronadjiKomitenta(KomintentFizickoLice k){
		Rezultat r = PronadjiKomintenta.pronadji(k);
		return r;
	}
	public static Rezultat izmeniKomitenta(KomintentFizickoLice k){
		Rezultat r = IzmenaKomintenta.izmeni(k);
		return r;
	}
	
	public static Rezultat brisanjeKomitenta(KomintentFizickoLice k){
		Rezultat r = BrisanjeKomintenta.brisi(k);
		return r;
	}
	public static Rezultat pronadjiZahtev(Zahtev z){
		Rezultat r = PronadjiZahtev.pronadji(z);
		return r;
	}
	
	public static Rezultat sacuvajKredit(Zahtev z){
		Rezultat r = OdobravanjeKredita.unesi(z);
		return r;
	}
}
