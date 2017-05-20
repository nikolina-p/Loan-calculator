package DomenskeKlase;

import java.sql.*;
import Rezultat.*;

public class Kamata extends OpstiDomenskiObjekat{
		private String rocnost;
		private char rizicnaGrupa;
		private double kamata;
		
		public Kamata(String rocnost, char rizicnaGrupa) {
			super();
			this.rocnost = rocnost;
			this.rizicnaGrupa = rizicnaGrupa;
		}

		public String getRocnost() {
			return rocnost;
		}

		public void setRocnost(String rocnost) {
			this.rocnost = rocnost;
		}

		public char getRizicnaGrupa() {
			return rizicnaGrupa;
		}

		public void setRizicnaGrupa(char rizicnaGrupa) {
			this.rizicnaGrupa = rizicnaGrupa;
		}
		
		

		public double getKamata() {
			return kamata;
		}

		public void setKamata(double kamata) {
			this.kamata = kamata;
		}
		
		@Override
		public Rezultat obradiRS(String tab,ResultSet rs){
			try{
			while(rs.next()){
				String k = String.valueOf(getRizicnaGrupa());
				this.kamata = rs.getDouble(k);
				
			}
			}catch(SQLException e){
				e.printStackTrace();
				return new Rezultat(false,"Citanje kamate: neuspesno");
			}
			
			return new Rezultat(true, "Uspesno citanje kamate");	
			
			}
			
		@Override
		public String vratiUslovZaNadjiSlog(String tab){
				return "rocnost = '"+this.rocnost+"'";
		}
}
