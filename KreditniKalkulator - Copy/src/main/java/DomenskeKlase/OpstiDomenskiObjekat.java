package DomenskeKlase;
import java.sql.*;

import Rezultat.Rezultat;



public class OpstiDomenskiObjekat {

	public Rezultat obradiRS(String tab,ResultSet rs){
		return new Rezultat(false);
	}
	
	public String vratiUslovZaNadjiSlog(String tab){
		return "";
	}
	
	public String vratiTab(){
		return "";
	}
	
	public String vratiVrednostiAtributa(){
		return "";
	}
	public String vratiNaziveKolona(){
		return "";
	}
	public String vratiAtributPretrage(){
		return "";
	}
	public void setPoslednji(ResultSet rs){
		
	}
}
