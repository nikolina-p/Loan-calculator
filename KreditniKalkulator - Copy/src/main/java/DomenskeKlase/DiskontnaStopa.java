package DomenskeKlase;
import Rezultat.*;

import java.sql.*;

public class DiskontnaStopa extends OpstiDomenskiObjekat{
			private int brGod;
			private double iznosDiskStope;
			private double kamata;
			private String kamataString;
			
			public DiskontnaStopa(int brGod, double kamata) {
				super();
				this.brGod = brGod;
				this.kamata = kamata;
				String p = String.valueOf(kamata*100);
				this.kamataString = p.substring(0,2);
			}

			public int getBrGod() {
				return brGod;
			}

			public void setBrGod(int brGod) {
				this.brGod = brGod;
			}

			public double getIznosDiskStope() {
				return iznosDiskStope;
			}

			public void setIznosDiskStope(double iznosDiskStope) {
				this.iznosDiskStope = iznosDiskStope;
			}

			public double getKamata() {
				return kamata;
			}

			public void setKamata(double kamata) {
				this.kamata = kamata;
				String p = String.valueOf(kamata*100);
				this.kamataString = p.substring(0,2);
				
			}
			@Override
			public Rezultat obradiRS(String tab,ResultSet rs){				
				try{					
					while(rs.next()){						
						iznosDiskStope = iznosDiskStope + rs.getDouble(kamataString);
						}
				}catch(SQLException s){s.printStackTrace();return new Rezultat(false);}
				
				return new Rezultat(true, "Uspesno citanje disStope");
			}
			
			@Override
			public String vratiUslovZaNadjiSlog(String tab){
				return "God <= "+this.brGod;
			}
}
