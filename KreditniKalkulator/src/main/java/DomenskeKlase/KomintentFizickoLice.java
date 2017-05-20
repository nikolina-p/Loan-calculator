package DomenskeKlase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import Rezultat.Rezultat;

public class KomintentFizickoLice extends FizickoLice{	
			
			private int brClanovaDom, brZaposlenih;
			private boolean klijentBanke, drugaKredZaduzenost;
			private double mesRataDrugogKred;
			private ArrayList<FizickoLice> zaposleniclanovi;
			private int ukupnoKasnjenjeIsplate, brAktivnih;
			private double ostaleFinObaveze, finansijskaMogucnost, mesPrihodDomacinstva;
			private double stopaZaduzenosti;
			
			
			public double getStopaZaduzenosti() {
				return stopaZaduzenosti;
			}
			public void setStopaZaduzenosti(double stopaZaduzenosti) {
				this.stopaZaduzenosti = stopaZaduzenosti;
			}
			public KomintentFizickoLice(){
				super();
				this.zaposleniclanovi = new ArrayList<FizickoLice>();
			}
			//za pronadji...
			public KomintentFizickoLice(String jmbg){
				setJmbg(jmbg);
				this.zaposleniclanovi = new ArrayList<FizickoLice>();
			}
			
			//sve....
			public KomintentFizickoLice(String ime, String prezime, String datumRodjenja,
					 String jmbg, 
					String zanimanje, String mestoPreb, String adresaPreb,
					String datPreseljenja, double mesecniPrihod,
					int brClanovaDom, int brZaposlenih,
					boolean klijentBanke,					
					 int duzinaPoslovanja) {
				super(ime, prezime, datumRodjenja,  jmbg, 
						zanimanje, mestoPreb, adresaPreb, datPreseljenja,
						mesecniPrihod, duzinaPoslovanja);
				this.brClanovaDom = brClanovaDom;
				this.brZaposlenih = brZaposlenih;				
				this.klijentBanke = klijentBanke;							
				this.ostaleFinObaveze = 0;
				zaposleniclanovi = new ArrayList<FizickoLice>();
				mesPrihodDomacinstva = 0;
			}
						

			public KomintentFizickoLice(String ime, String prezime, String datumRodjenja,
					String jmbg,  String zanimanje,
					double mesecniPrihod, int duzinaPoslovanja,
					boolean klijentBanke) {
				super(ime, prezime, datumRodjenja, jmbg, zanimanje,
						mesecniPrihod, duzinaPoslovanja);
				this.klijentBanke = klijentBanke;
				zaposleniclanovi = new ArrayList<FizickoLice>();
						
				
			}

			public boolean isKlijentBanke() {
				return klijentBanke;
			}

			public void setKlijentBanke(boolean klijentBanke) {
				this.klijentBanke = klijentBanke;
			}

			public boolean isDrugaKredZaduzenost() {
				return drugaKredZaduzenost;
			}

			public void setDrugaKredZaduzenost(boolean drugaKredZaduzenost) {
				this.drugaKredZaduzenost = drugaKredZaduzenost;
			}

			
			public double getMesRataDrugogKred() {
				return mesRataDrugogKred;
			}

			public void setMesRataDrugogKred(double mesRataDrugogKred) {
				this.mesRataDrugogKred = mesRataDrugogKred;
				this.ostaleFinObaveze = this.ostaleFinObaveze + mesRataDrugogKred;
			}		

			//get set
						
			public int getBrClanovaDom() {
				return brClanovaDom;
			}

			public void setBrClanovaDom(int brClanovaDom) {
				this.brClanovaDom = brClanovaDom;
			}

			public int getBrZaposlenih() {
				return brZaposlenih;
			}

			public void setBrZaposlenih(int brZaposlenih) {
				this.brZaposlenih = brZaposlenih;
			}
			public ArrayList<FizickoLice> getZaposleniclanovi() {
				return zaposleniclanovi;
			}
			
			public void addZaposleniClan(FizickoLice fl){
				this.zaposleniclanovi.add(fl);
				this.mesPrihodDomacinstva = this.mesPrihodDomacinstva + fl.getMesecniPrihod();
			}
			public String getSifKomitenta(){
				return getJmbg();
				
			}
			
			
			public int getUkupnoKasnjenjeIsplate() {
				return ukupnoKasnjenjeIsplate;
			}
			public void setUkupnoKasnjenjeIsplate(int ukupnoKasnjenjeIsplate) {
				this.ukupnoKasnjenjeIsplate = ukupnoKasnjenjeIsplate;
			}
			public int getBrAktivnih() {
				return brAktivnih;
			}
			public void setBrAktivnih(int brAktivnih) {
				this.brAktivnih = brAktivnih;
			}
			public double getOstaleFinObaveze() {
				return ostaleFinObaveze;
			}
			public void setOstaleFinObaveze(double ostaleFinObaveze) {
				this.ostaleFinObaveze = this.ostaleFinObaveze + ostaleFinObaveze;
			}
			public double getFinansijskaMogucnost() {
				return finansijskaMogucnost;
			}
			public void setFinansijskaMogucnost(double finansijskaMogucnost) {
				this.finansijskaMogucnost = finansijskaMogucnost;
			}
			public double getMesPrihodDomacinstva() {
				return mesPrihodDomacinstva;
			}
			public double vratiFinMogucnost(){
				double fmOstalih = 0;
				for(int i = 0;i<zaposleniclanovi.size();i++){
					fmOstalih =+zaposleniclanovi.get(i).getMesecniPrihod();
				}				
				double fm = stopaZaduzenosti*getMesecniPrihod()+0.3*fmOstalih-getOstaleFinObaveze();
								
				fm*=100;				
				long dlong = Math.round(fm);
				fm = Double.valueOf(dlong)/100;
				
				return fm;
			}
			//baza.....
			
			@Override
			public String vratiTab(){
				return "FizickoLice";
			}
			
			@Override
			public String vratiVrednostiAtributa(){
				String str = "'"+getJmbg()+"','"+getImePrezime()+"','"+getDatumRodjenja()+"','"+getAdresaPreb()+"','"+getDatPreseljenja();
				str = str + "','"+getZanimanje()+"','"+getDatZaposlenja()+"','"+getMesecniPrihod();
				int i = 0;
				if(isDrzavljaninRS())i = 1;
				str = str+"','"+i+"'";
				return str;
			}
			@Override
			public String vratiNaziveKolona(){
				String str = "JMBG,ImePrezime,DatumRodjenja,Adresa,DatumPreselenja,Zanimanje";
				str = str+",DatumZaposljavanja,MesecniPrihod,Drzavljanstvo";
				return str;
			}
			@Override
			public Rezultat obradiRS(String tab,ResultSet rs){
				ukupnoKasnjenjeIsplate = 0;
				brAktivnih = 0;
			if(tab.equals("Krediti")){	
				try{
					while(rs.next()){
						boolean aktivan = rs.getBoolean("Aktivan");
						if(aktivan){
							brAktivnih++;
							ukupnoKasnjenjeIsplate = ukupnoKasnjenjeIsplate + rs.getInt("UkupnoKasnjenje");
							setOstaleFinObaveze(rs.getDouble("Anuitet"));
							
						}
						
					}
				}catch(SQLException s){
					return new Rezultat(false,"Neuspesnno citanje ResultSet-a :: KomitentFizickoLice.obradiRS()");
				}
			}
			if(tab.equals("FizickoLice")){
				try{
					while(rs.next()){
						setJmbg(rs.getString("JMBG"));						
						setImePrezime(rs.getString("ImePrezime")) ;
						setDatumRodjenja(rs.getString("DatumRodjenja"));
						setAdresaPreb(rs.getString("Adresa"));
						setZanimanje(rs.getString("Zanimanje"));
						setDatZaposlenja(rs.getString("DatumZaposljavanja")) ;
						setMesecniPrihod(rs.getDouble("MesecniPrihod"));
						int i = rs.getInt("Drzavljanstvo");
						if(i==0)setDrzavljaninRS(false);
						if(i==1) setDrzavljaninRS(true);	
						
						//namestiti starost komitenta
						int[] datRodj = parseDat(getDatumRodjenja());
						int starost = razlikaUGodinama(datRodj);
						setStarost(starost);
						//namestiti duzinu poslovanja
						int[] datZapos = parseDat(getDatZaposlenja());
						int radniStaz = razlikaUMesecima(datZapos);
						setDuzinaPoslovanja(radniStaz);
						
					}
				}catch(SQLException s){
					return new Rezultat(false,"Neuspesnno citanje ResultSet-a :: KomitentFizickoLice.obradiRS()");
				}
			}
			
				return new Rezultat(true, "Citanje RS-a :: KomitentFL.obradiRS / ");
			}
			@Override
			public String vratiUslovZaNadjiSlog(String tab){
				if(tab.equals("Krediti")){
				return "SifVlasnika = '"+getSifKomitenta()+"'";
				}
				if(tab.equals("FizickoLice"))
					return "JMBG = '"+getJmbg()+"'";
			return "";
			}
			
			//vraca razliku u mesecima izmedju danasnjeg i zadatog datuma, ako je posle danasnjeg datuma vraca -1
			public int razlikaUMesecima(int[] datum){
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
				if(dg == god){
							if(dm-1 == mesec){
								if(dd + 31- dan > 31){
									return r = 1;
								}else{
									return r = 0;
								}
							}else{
							if(dm == mesec) {
								return r = 0;
							}else{
								r = dm-mesec;
								int daniUPrvojGod = 31 - dan;
								if(daniUPrvojGod + dd > 30) 
									return r++;
							}
							}
					
				}else{
					r = (dg - god - 1)*12;
				}
				int meseciUPrvojGod = 12 - mesec;
				int meseciUTrenutnojGod = dm - 1;			
				r = r + meseciUPrvojGod + meseciUTrenutnojGod;
				
				int daniUPrvojGod = 31 - dan;
				if(daniUPrvojGod + dd > 30) r++;
				
				return r;
			}
			
			//vraca danasnji datum kao niz[dan, mesec, godima]
			@Override
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
			
}
