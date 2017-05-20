package DomenskeKlase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Zahtev extends OpstiDomenskiObjekat{
		private int zahtevID;
		private Kredit kredit;
		private KomintentFizickoLice komitent;
		private Izvestaj izvestaj;
		private boolean stanje = true;//da li je odbijen ili ne >>>>>>treba promeniti
		private boolean sgn = false; // znak za prolaz kroz prvi krug pravila
		private int zbirR = 0;
		private int brR = 0;
		private char grupaR  = 0;
		private ArrayList<String> pravila = new ArrayList<String>();
		


		public Zahtev(Kredit kredit, KomintentFizickoLice komitent, Izvestaj izvestaj) {
			super();
			this.kredit = kredit;
			this.komitent = komitent;
			this.izvestaj = izvestaj;
			
		}
		public Zahtev(int zahtevID){
			this.zahtevID = zahtevID;
			this.komitent = new KomintentFizickoLice();
			this.kredit = new Kredit();
		}

		public Kredit getKredit() {
			return kredit;
		}


		public void setKredit(Kredit kredit) {
			this.kredit = kredit;
		}


		public KomintentFizickoLice getKomitent() {
			return komitent;
		}


		public void setKomitent(KomintentFizickoLice komitent) {
			this.komitent = komitent;
		}


		public Izvestaj getIzvestaj() {
			return izvestaj;
		}


		public void setIzvestaj(Izvestaj izvestaj) {
			this.izvestaj = izvestaj;
		}


		public boolean isStanje() {
			return stanje;
		}


		public void setStanje(boolean stanje) {
			this.stanje = stanje;
		}
		
		
		public void obradiRS(ResultSet rs){}
		
		public char getGrupaR() {
			if(brR != 0){
			double r = zbirR/brR;
			if(r<=1) grupaR = 'A';
			if(1<r && r<3) grupaR = 'B';
			if(r>=3) grupaR = 'C';
			}
			return grupaR;
		}
		public void setGrupaR(int r){
			if(r == 0 || r == 2 || r == 4 || r == -2){
			zbirR =zbirR + r;
			this.brR++;
			}else{
				System.err.println("GRESKA KOD KOEFICIJENATA RIZIKA");
			}
		}


		public ArrayList<String> getPravila() {
			return pravila;
		}


		public void setPravila(String pravilo) {
			this.pravila.add(pravilo);
		}


		public boolean isSgn() {
			return sgn;
		}


		public void setSgn(boolean sgn) {
			this.sgn = sgn;
		}


		public int getZahtevID() {
			return zahtevID;
		}


		public void setZahtevID(int zahtevID) {
			this.zahtevID = zahtevID;
		}
		
		@Override
		public String vratiTab(){
			return "Zahtev";
		}
		@Override
		public String vratiVrednostiAtributa(){
			int st = 0;
			if(stanje)st = 1;
			String str = "'"+zahtevID+"','"+st+"','"+komitent.getJmbg()+"','"+kredit.getIznosKredita()+"','"+kredit.getValuta()+"','"+kredit.getVrstaKredita()+"',";
			str = str+"'"+kredit.getPokrivenostProfakturama()/100+"','"+kredit.getRokOtplateGod()+"','"+kredit.getDepozit()+"','"+kredit.isOsiguranjeNKOSK()+"','"+kredit.getGrejsPeriod()+"','"+kredit.getVrednostHipo()+"',";
			
			Double d = kredit.getMesRata();				
			d*=100;				
			long dlong = Math.round(d);
			d = Double.valueOf(dlong)/100;
			
			str = str+"'"+kredit.isZirant()+"','"+d+"'";
			return str;
		}
		@Override
		public String vratiNaziveKolona(){
			String str = "zahtevID,stanje,SifVlasnika,Iznos,Valuta,VrstaKredita,Profakture,RokOtplate,Depozit,Osiguranje";
			str = str+",GrejsPeriod,Hipoteka,Zirant,Anuitet";
			
			return str;
		}
		@Override
		public String vratiAtributPretrage(){
			return "zahtevID";
		}
		@Override
		public void setPoslednji(ResultSet rs){
			try{
				if(!rs.next()){
					zahtevID = 1;
					System.out.println(zahtevID);
				}else{
					zahtevID = rs.getInt("Max")+1;
					System.out.println(zahtevID);
				}
			}catch(SQLException e){
				System.out.println("greska setposlednji"+e.getMessage());
			}
		}
		@Override
		public String vratiUslovZaNadjiSlog(String tab){			
			return "zahtevID = "+zahtevID;
		}
}
