package DomenskeKlase;

import java.util.ArrayList;

public class Izvestaj {
		private ArrayList<Poruka> kljucniNedostaci;
		private ArrayList<Poruka> komentari;
		private int brPoruka = 0;
		
		public Izvestaj(){
			kljucniNedostaci = new ArrayList<Poruka>();
			komentari = new ArrayList<Poruka>();
		}


		public ArrayList<Poruka> getKljucniNedostaci() {
			return kljucniNedostaci;
		}


				
		public String dajSvePoruke(){
			String poruke = "KLJUCNI NEDOSTACI";
			poruke = poruke+""+vratiKljucneNedostatke()+"\nUPOZORENJA";
			
			return poruke;
		}
		
		public String dajSvePorukeHronoloski(){
			return "(&*(^*&^&%&%&$&$";
		}
		// prepraviti class Poruka da dobije polje int redniBr da bih kasnije videla kako idu hronoloski
		public void addPoruka(String poruka, int sgn){
			Poruka p = new Poruka(poruka, sgn);
			brPoruka++;
			
			if(sgn == 0){
				this.kljucniNedostaci.add(p);
				
			}else{			
			if(sgn == 2){
				this.komentari.add(p);
				
			}else{System.out.println("Nepoznata operacija : Izvestaj");}
			}
						 
		}


		public ArrayList<Poruka> getKomentari() {
			return komentari;
		}
		
		public String vratiKljucneNedostatke(){
			String kn = "";
			for(int i = 0;i<kljucniNedostaci.size();i++){
				kn = kn +kljucniNedostaci.get(i).getPoruka()+"\n";
			}
			return kn;
		}
		
		public String vratiKomentare(){
			String kn = "";
			for(int i = 0;i<komentari.size();i++){
				kn = kn +komentari.get(i).getPoruka()+ "\n";
			}
			return kn;
		}
}
