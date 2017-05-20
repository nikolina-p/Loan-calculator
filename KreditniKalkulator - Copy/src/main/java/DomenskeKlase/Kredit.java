package DomenskeKlase;

import java.sql.ResultSet;

import Rezultat.Rezultat;

public class Kredit extends OpstiDomenskiObjekat{
			
			private int zeljeniRokOtpalte, minRokOtplate, predlozeniRokOtplate, maxRokOtplate, rokOtplateGod;  //godine
			private double iznosKredita, godAnuitet, depozit, mesRata ;
			private String  vrstaKredita; 
			private boolean osiguranjeNKOSK, namenski; 
			boolean indexirani;
			private String rocnost;
			private Kamata kamata = null;
			private DiskontnaStopa diskStopa = null;
			private boolean zirant;
			private double pokrivenostProfakturama;
			private double vrednostHipo = 0;
			private String valuta;
			private double zaloga = 0;// ??????izbaciti
			private int grejsPeriod = 0;
			private String sifVlasnika = "";
			private int stanje = 0;
			private int kamataID = 1;
			
			public int getStanje() {
				return stanje;
			}
			public void setStanje(int stanje) {
				this.stanje = stanje;
			}
			public String getSifVlasnika() {
				return sifVlasnika;
			}
			public void setSifVlasnika(String sifVlasnika) {
				this.sifVlasnika = sifVlasnika;
			}
			public double getZaloga() {
				return zaloga*iznosKredita;
			}
			public void setZaloga(double zaloga) {
				this.zaloga = zaloga;
			}
			public int getGrejsPeriod() {
				return grejsPeriod;
			}
			public void setGrejsPeriod(int grejsPeriod) {
				this.grejsPeriod = grejsPeriod;
			}
			public String getValuta() {
				return valuta;
			}
			public void setValuta(String valuta) {
				this.valuta = valuta;
			}
			public double getPokrivenostProfakturama() {
				return pokrivenostProfakturama;
			}
			public void setPokrivenostProfakturama(double pokrivenostProfakturama) {
				this.pokrivenostProfakturama = pokrivenostProfakturama;
				if(pokrivenostProfakturama== 100){
					setNamenski(true);
					
				}else{
					setNamenski(false);
				}
			}
			public boolean isZirant() {
				return zirant;
			}
			public void setZirant(boolean zirant) {
				this.zirant = zirant;
			}
			public Kredit(){
				iznosKredita = 0;
				
			}
			public Kredit(int zeljeniRokOtpalte, double iznosKredita, String valuta, String vrstaKredita,
					boolean osiguranjeNKOSK) {
				super();
				this.zeljeniRokOtpalte = zeljeniRokOtpalte;
				this.iznosKredita = iznosKredita;				
				this.valuta = valuta;
				this.vrstaKredita = vrstaKredita;
				this.osiguranjeNKOSK = osiguranjeNKOSK;				
				maxRokOtplate = 0;
				predlozeniRokOtplate = 0;
				rokOtplateGod = 0;
				char c = 0;
				kamata = new Kamata("",c);
				diskStopa = new DiskontnaStopa(0,0);
				rocnost = "";
				grejsPeriod = 0;
			}
			//get set ...			
			public int getZeljeniRokOtpalte() {
				return zeljeniRokOtpalte;
			}
			public void setZeljeniRokOtpalte(int zeljeniRokOtpalte) {
				this.zeljeniRokOtpalte = zeljeniRokOtpalte;
			}
			public int getMinRokOtplate() {
				return minRokOtplate;
			}
			public void setMinRokOtplate(int minRokOtplate) {
				this.minRokOtplate = minRokOtplate;
			}
			public int getPredlozeniRokOtplate() {
				return predlozeniRokOtplate;
			}
			public void setPredlozeniRokOtplate(int predlozeniRokOtplate) {
				this.predlozeniRokOtplate = predlozeniRokOtplate;
			}
			public double getIznosKredita() {
				return iznosKredita;
			}
			public void setIznosKredita(double iznosKredita) {
				this.iznosKredita = iznosKredita;
			}
			public double getDepozit() {
				return depozit;
			}
			public void setDepozit(double depozit) {
				this.depozit = depozit;
				
			}
			
			public String getVrstaKredita() {
				return vrstaKredita;
			}
			public void setVrstaKredita(String vrstaKredita) {
				this.vrstaKredita = vrstaKredita;
			}
			public boolean isOsiguranjeNKOSK() {
				return osiguranjeNKOSK;
			}
			public void setOsiguranjeNKOSK(boolean osiguranjeNKOSK) {
				this.osiguranjeNKOSK = osiguranjeNKOSK;
			}			
			
			public boolean isNamenski() {
				return namenski;
			}
			public void setNamenski(boolean namenski) {
				this.namenski = namenski;
			}
			public int getMaxRokOtplate() {
				return maxRokOtplate;
			}
			public void setMaxRokOtplate(int maxRokOtplate) {				
				this.maxRokOtplate = maxRokOtplate;				
			}
			public Kamata getKamata() {
				return kamata;
			}
			public void setKamata(Kamata kamata) {
				this.kamata = kamata;
			}
			public double getAnuitet() {
				return godAnuitet;
			}
			public void setAnuitet(double anuitet) {
				this.godAnuitet = anuitet;
			}
			public String getRocnost() {
				return rocnost;
			}
			public void setRocnost(String rocnost) {
				this.rocnost = rocnost;
				//kamata ID
				if(this.rocnost.equals("kratkorocni")) this.kamataID=1;
				if(this.rocnost.equals("srednjorocni")) this.kamataID = 2;
				if(this.rocnost.equals("dugorocni")) this.kamataID = 3;
			}
			public DiskontnaStopa getDiskStopa() {
				return diskStopa;
			}
			public void setDiskStopa(DiskontnaStopa diskStopa) {
				this.diskStopa = diskStopa;
			}
			public void izracunajMesecnuRatu(DiskontnaStopa ds){
				if(diskStopa.getIznosDiskStope()!=0){
				godAnuitet = iznosKredita/this.diskStopa.getIznosDiskStope();
				setMesRata(godAnuitet/12);
				}
			}
			public double getMesRata() {
				return mesRata;
			}
			public boolean isIndexirani() {				
				if(this.valuta.equals("RSD")) {
					return false;
				}else{return true;
				}
				
			}
			public void setIndexirani(boolean indexirani) {
				this.indexirani = indexirani;
			}
			public int getRokOtplateGod() {
				return rokOtplateGod;
			}
			public void setRokOtplateGod(int rokOtplateGod) {
				this.rokOtplateGod = rokOtplateGod;
				if(rokOtplateGod <=1) setRocnost("kratkorocni");
				if(rokOtplateGod > 1 && rokOtplateGod <= 5) setRocnost("srednjorocni");
				if(rokOtplateGod> 5) setRocnost("dugorocni");
				
			}
			public void setHipo(double procenat){
				this.vrednostHipo = iznosKredita*procenat;
			}
			public double getVrednostHipo() {
				return vrednostHipo;
			}
			public void setVrednostHipo(double vrednostHipo) {
				this.vrednostHipo = vrednostHipo;
			}
			
			
			//........BAZA.......
			public Rezultat obradiRS(ResultSet rs){				
				return new Rezultat(false);
			}
			
			@Override
			public String vratiTab(){
				return "Krediti";
			}
			@Override
			public String vratiNaziveKolona(){
				String s = "SifVlasnika, Iznos, Valuta, VrstaKredita, Profakture";
				s = s+", RokOtplate, Depozit, Osiguranje,GrejsPeriod, Hipoteka";
				s = s+", Zirant, Aktivan, Anuitet, KamataID";
				return s;
			}
			
			@Override
			public String vratiVrednostiAtributa(){
				String s = "'"+sifVlasnika+"','"+iznosKredita+"','"+valuta+"','"+vrstaKredita+"','";
				s+=pokrivenostProfakturama/100+"','"+rokOtplateGod+"','"+depozit+"','"+osiguranjeNKOSK+"','";
				s+=grejsPeriod+"','"+vrednostHipo+"','"+zirant+"','"+1+"','"+getMesRata()+"','"+kamataID+"'";
				
				return s;
			}
			public void setMesRata(double mesRata) {
				this.mesRata = mesRata;
			}
}
