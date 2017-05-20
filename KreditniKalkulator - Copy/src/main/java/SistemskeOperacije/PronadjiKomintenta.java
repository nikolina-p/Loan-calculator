package SistemskeOperacije;

import Rezultat.Rezultat;
import DomenskeKlase.*;
import java.sql.*;
public class PronadjiKomintenta extends OpstaSO{

	public static Rezultat pronadji(KomintentFizickoLice k){
		PronadjiKomintenta pk = new PronadjiKomintenta();		
		return pk.opsteIzvrsenjeSO(k);
	}
	
	@Override
	public Rezultat izvrsenjeSO(OpstiDomenskiObjekat o){
		KomintentFizickoLice k = (KomintentFizickoLice)o;
		Rezultat r = new Rezultat(true);
		ResultSet rs = DBBR.vratiSlog(k, r);
		try{
		if(rs.next()){
			k.setImePrezime(rs.getString("ImePrezime"));
			k.setDatumRodjenja(rs.getString("DatumRodjenja"));
			k.setAdresaPreb(rs.getString("Adresa"));
			k.setZanimanje(rs.getString("Zanimanje"));
			k.setDatZaposlenja(rs.getString("DatumZaposljavanja"));
			k.setMesecniPrihod(rs.getDouble("MesecniPrihod"));
			int dr = rs.getInt("Drzavljanstvo");
			if(dr == 0){
			k.setDrzavljaninRS(false);
			}else {k.setDrzavljaninRS(true);}
			k.setDatPreseljenja(rs.getString("datumPreselenja"));
			r.setPoruka("Uspesno citanje RS-a\n");
		}
		
		}catch(SQLException e){
			System.out.println("GRESKA33 (PronadjiKomitenta)");
			e.printStackTrace();
			r.setOk(false);
			r.setPoruka(r.getPoruka()+"\nNEuspesno citanje RS-a");
		}
		
		return r;
	}
}
