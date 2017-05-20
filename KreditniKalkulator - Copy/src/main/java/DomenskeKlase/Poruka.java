package DomenskeKlase;


public class Poruka {
		private String poruka;
		private int sgn;
		
		
		public Poruka(String poruka, int sgn) {
			super();
			this.poruka = poruka;
			this.sgn = sgn;
		}
		public String getPoruka() {
			return poruka;
		}
		public void setPoruka(String poruka) {
			this.poruka = poruka;
		}
		public int getSgn() {
			return sgn;
		}
		public void setSgn(int sgn) {
			this.sgn = sgn;
		}
		
		
}
