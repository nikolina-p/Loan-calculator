package Rezultat;

public class Rezultat {
		boolean signal = true;
		String poruka;
		
		public Rezultat(boolean signal, String poruka) {			
			this.signal = signal;
			this.poruka = poruka;
		}
		
				
		public Rezultat(boolean signal) {
			super();
			this.signal = signal;
		}



		public boolean isOk() {
			return signal;
		}
		public void setOk(boolean signal) {
			this.signal = signal;
		}
		public String getPoruka() {
			return poruka;
		}
		public void setPoruka(String poruka) {
			this.poruka = poruka;
		}
		
		
}
