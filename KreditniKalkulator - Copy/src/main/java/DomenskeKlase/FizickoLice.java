package DomenskeKlase;

import java.sql.ResultSet;
import java.util.Calendar;

import Rezultat.*;

public class FizickoLice extends OpstiDomenskiObjekat{
	
			private String imePrezime, datumRodjenja, jmbg,  zanimanje,  adresaPreb,datPreseljenja, datZaposlenja;
			private double mesecniPrihod;// din
			private boolean drzavljaninRS;
			private int duzinaPoslovanja;//meseci
			private int starost;//god
			private int duzinaStanovanjaNaIstomMestu;//god
			
			public FizickoLice(){}
			//komitent
			public FizickoLice(String ime, String prezime,
					String datumRodjenja,  String jmbg,
					 String zanimanje, String mestoPreb,
					String adresaPreb, String datPreseljenja,
					double mesecniPrihod, int duzinaPoslovanja) {
				super();
				this.imePrezime = ime+" "+prezime;				
				this.datumRodjenja = datumRodjenja;				
				this.jmbg = jmbg;				
				this.zanimanje = zanimanje;				
				this.adresaPreb = adresaPreb;
				this.datPreseljenja = datPreseljenja;
				this.mesecniPrihod = mesecniPrihod;
				this.duzinaPoslovanja = duzinaPoslovanja;
			}
			
			
			//bez adrese i preselenja
			public FizickoLice(String ime, String prezime,
					String datumRodjenja, String jmbg, 
					String zanimanje, double mesecniPrihod, int duzinaPoslovanja) {
				super();
				this.imePrezime = ime+" "+prezime;
				
				this.datumRodjenja = datumRodjenja;
				this.jmbg = jmbg;				
				this.zanimanje = zanimanje;
				this.mesecniPrihod = mesecniPrihod;
				this.duzinaPoslovanja = duzinaPoslovanja;
			}



			//zaposleni clanovi domacinstva
			public FizickoLice(String imePrezime, double mesPrih){
				this.imePrezime = imePrezime;				
				this.mesecniPrihod = mesPrih;
			}						
			//ovlasceno lice/pravno lice
			public FizickoLice(String ime, String prezime, String jmbg){
				this.imePrezime = ime+" "+prezime;
				this.jmbg = jmbg;
				
			}
			
			//get set
			public int getDuzinaPoslovanja() {
				return duzinaPoslovanja;
			}

			public void setDuzinaPoslovanja(int duzinaPoslovanja) {
				this.duzinaPoslovanja = duzinaPoslovanja;
			}
			public String getImePrezime() {
				return imePrezime;
			}
			public void setImePrezime(String ime) {
				this.imePrezime = ime;
			}
			
			public String getDatumRodjenja() {
				return datumRodjenja;
			}
			public void setDatumRodjenja(String datumRodjenja) {
				this.datumRodjenja = datumRodjenja;
			}
			public String getJmbg() {
				return jmbg;
			}
			public void setJmbg(String jmbg) {
				this.jmbg = jmbg;
			}
			
			public String getZanimanje() {
				return zanimanje;
			}
			public void setZanimanje(String zanimanje) {
				this.zanimanje = zanimanje;
			}
			public double getMesecniPrihod() {
				return mesecniPrihod;
			}
			public void setMesecniPrihod(double mesecniPrihod) {
				this.mesecniPrihod = mesecniPrihod;
			}			

			public String getAdresaPreb() {
				return adresaPreb;
			}

			public void setAdresaPreb(String adresaPreb) {
				this.adresaPreb = adresaPreb;
			}

			public String getDatPreseljenja() {
				return datPreseljenja;
			}

			public void setDatPreseljenja(String datPreseljenja) {
				this.datPreseljenja = datPreseljenja;
				int[] i = parseDat(datPreseljenja);
				setDuzinaStanovanjaNaIstomMestu(razlikaUGodinama(i));
			}
			public int getStarost() {
				return starost;
			}
			public void setStarost(int starost) {
				this.starost = starost;
			}
			public int getDuzinaStanovanjaNaIstomMestu() {
				return duzinaStanovanjaNaIstomMestu;
			}
			public void setDuzinaStanovanjaNaIstomMestu(int duzinaStanovanjaNaIstomMestu) {
				this.duzinaStanovanjaNaIstomMestu = duzinaStanovanjaNaIstomMestu;
			}
			public Rezultat obradiRS(ResultSet rs){
				return new Rezultat(false);
			}
			public boolean isDrzavljaninRS() {
				return drzavljaninRS;
			}
			public void setDrzavljaninRS(boolean drzavljaninRS) {
				this.drzavljaninRS = drzavljaninRS;
			}
			public String getDatZaposlenja() {
				return datZaposlenja;
			}
			public void setDatZaposlenja(String datZaposlenja) {
				this.datZaposlenja = datZaposlenja;
			}
			
			public int razlikaUGodinama(int[] datum){
				int r = 0;
				int[] dDat = danasnjiDatum();
				int dd = dDat[0];
				int dm = dDat[1];
				int dg = dDat[2];
				
				int dan = datum[0];
				int mesec = datum[1];
				int god = datum[2];
				
				//problem sa buducnosti
				if(dg < god || (dg == god && dm < mesec)||(dg == god && dm == mesec && dd < dan))
				{
					System.out.println("Datum je posle danasnjeg datuma");
					return -1;
				}
				r = dg-god;
				if(dm > mesec||(dm == mesec && dd<=dan)) r++;
				
				 
				
				return r;
			}
			
			public int[] danasnjiDatum(){
				int[] dd = new int[3];
				
				String danasnjiDatum = Calendar.getInstance().getTime().toString();				
				
				String danasGod = danasnjiDatum.substring(danasnjiDatum.length()-4, danasnjiDatum.length());
				
				int dg = Integer.parseInt(danasGod);
				dd[2] = dg;
				
				int dm = 0;
				String d = danasnjiDatum.substring(4, 7);
				
				if(d.equals("Jan")) dm = 1;
				if(d.equals("Feb")) dm = 2;
				if(d.equals("Mar")) dm = 3;
				if(d.equals("Apr")) dm = 4;
				if(d.equals("May")) dm = 5;
				if(d.equals("Jun")) dm = 6;
				if(d.equals("Jul")) dm = 7;
				if(d.equals("Aug")) dm = 8;
				if(d.equals("Sep")) dm = 9;
				if(d.equals("Oct")) dm = 10;
				if(d.equals("Nov")) dm = 11;
				if(d.equals("dec")) dm = 12;
				dd[1] = dm;
				
				String danasnjiDan = danasnjiDatum.substring(8, 10);			
				int dDan = Integer.parseInt(danasnjiDan);
				dd[0] = dDan;
				
				return dd;
			}	
			
			
			public int[] parseDat(String d){
				int[] niz = new int[3];		
				String dan = "";
				String mes = "";
				String god = "";
				
				int br = 0;
				for(int i = 0;i<d.length();i++){
					if(d.charAt(i)=='/' && br == 0){
						dan = d.substring(0,i);
						br=1;
						}else{
								if(d.charAt(i)=='/' && br == 1){
									mes = d.substring(dan.length()+1,i);
									god = d.substring(i+1,d.length());
									}			
				}
				}		
				try{
				niz[0] = Integer.parseInt(dan);
				niz[1] = Integer.parseInt(mes);
				niz[2] = Integer.parseInt(god);
					
				}catch(NumberFormatException e){
					System.out.println("Greska 22: "+e.getMessage());
				}		
				return niz;
			}
}
