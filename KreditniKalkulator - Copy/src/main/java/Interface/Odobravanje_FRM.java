package Interface;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JButton;

import Kontroleri.KontrolerKI;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Odobravanje_FRM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;  //  @jve:decl-index=0:visual-constraint="12,39"
	private JLabel vrstaKred_jLabel = null;
	private JLabel sifVlasnika_jLabel = null;
	private JLabel stanje_jLabel = null;
	private JLabel iznos_jLabel = null;
	private JButton okjButton = null;
	private JLabel zahtevID_jLabel = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel valuta_jLabel6 = null;
	private JLabel jLabel6 = null;
	private JLabel rokOtplatejLabel7 = null;
	private JLabel jLabel7 = null;
	private JLabel profak_jLabel8 = null;
	private JLabel jLabel8 = null;
	private JLabel depozit_jLabel9 = null;
	private JLabel jLabel9 = null;
	private JLabel osigNKOSKjLabel10 = null;
	private JLabel jLabel10 = null;
	private JLabel grejs_jLabel11 = null;
	private JLabel jLabel11 = null;
	private JLabel zirant_jLabel12 = null;
	private JLabel jLabel12 = null;
	private JLabel hipo_jLabel13 = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JLabel logojLabel16 = null;
	private JLabel iznosDin_jLabel16 = null;
	private JLabel mesRata_jLabel16 = null;
	private JLabel iznosDinMR_jLabel161 = null;
	private JLabel mesecnaRataIznos_jLabel16 = null;
	/**
	 * This is the default constructor
	 */
	public Odobravanje_FRM() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(511, 546);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loptaVelika.JPG")));
		this.setBounds(150, 150, 456, 577);
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Odobravanje kreditnog zaduzenja");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	public JPanel getJContentPane() {
		if (jContentPane == null) {
			mesecnaRataIznos_jLabel16 = new JLabel();
			mesecnaRataIznos_jLabel16.setBounds(new Rectangle(256, 165, 82, 16));
			mesecnaRataIznos_jLabel16.setText("");
			iznosDinMR_jLabel161 = new JLabel();
			iznosDinMR_jLabel161.setBounds(new Rectangle(342, 165, 32, 16));
			iznosDinMR_jLabel161.setText("din");
			
			mesRata_jLabel16 = new JLabel();
			mesRata_jLabel16.setBounds(new Rectangle(60, 166, 187, 16));
			mesRata_jLabel16.setText("Mesecna rata........................................................");
			iznosDin_jLabel16 = new JLabel();
			iznosDin_jLabel16.setBounds(new Rectangle(340, 136, 33, 16));
			iznosDin_jLabel16.setText("din");
			logojLabel16 = new JLabel();
			logojLabel16.setBounds(new Rectangle(272, 154, 175, 346));
			logojLabel16.setIcon(new ImageIcon(getClass().getResource("/loptaOriginal3.jpg")));
			logojLabel16.setText("");
			jLabel15 = new JLabel();
			jLabel15.setBounds(new Rectangle(343, 436, 38, 16));
			jLabel15.setText("din");
			jLabel14 = new JLabel();
			jLabel14.setBounds(new Rectangle(340, 286, 38, 16));
			jLabel14.setText("%");
			jLabel13 = new JLabel();
			jLabel13.setBounds(new Rectangle(340, 317, 38, 16));
			jLabel13.setText("%");
			hipo_jLabel13 = new JLabel();
			hipo_jLabel13.setBounds(new Rectangle(257, 436, 84, 16));
			hipo_jLabel13.setText("");
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(62, 436, 188, 16));
			jLabel12.setText("Hipoteka.................................................");
			zirant_jLabel12 = new JLabel();
			zirant_jLabel12.setBounds(new Rectangle(257, 406, 121, 16));
			zirant_jLabel12.setText("");
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(62, 406, 188, 16));
			jLabel11.setText("Zirant....................................................");
			grejs_jLabel11 = new JLabel();
			grejs_jLabel11.setBounds(new Rectangle(257, 377, 121, 16));
			grejs_jLabel11.setText("");
			jLabel10 = new JLabel();
			jLabel10.setBounds(new Rectangle(62, 377, 188, 16));
			jLabel10.setText("Grejs period..........................................");
			osigNKOSKjLabel10 = new JLabel();
			osigNKOSKjLabel10.setBounds(new Rectangle(257, 346, 121, 16));
			osigNKOSKjLabel10.setText("");
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(62, 346, 188, 16));
			jLabel9.setText("Osiguranje NKOSK....................................");
			depozit_jLabel9 = new JLabel();
			depozit_jLabel9.setBounds(new Rectangle(257, 317, 81, 16));
			depozit_jLabel9.setText("");
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(62, 316, 188, 16));
			jLabel8.setText("Depozit...............................................");
			profak_jLabel8 = new JLabel();
			profak_jLabel8.setBounds(new Rectangle(257, 286, 81, 16));
			profak_jLabel8.setText("");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(62, 286, 188, 16));
			jLabel7.setText("Pokrivenost profakturama.............");
			rokOtplatejLabel7 = new JLabel();
			rokOtplatejLabel7.setBounds(new Rectangle(257, 256, 121, 16));
			rokOtplatejLabel7.setText("");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(62, 257, 188, 16));
			jLabel6.setText("Rok otplate.............................................");
			valuta_jLabel6 = new JLabel();
			valuta_jLabel6.setBounds(new Rectangle(257, 196, 121, 16));
			valuta_jLabel6.setText("");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(62, 197, 188, 16));
			jLabel5.setText("Valuta................................................... ");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(59, 135, 188, 16));
			jLabel4.setText("Iznos....................................................");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(16, 45, 46, 16));
			jLabel3.setText("Stanje");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(62, 227, 188, 16));
			jLabel2.setText("Maticni broj vlasnika..............................");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(60, 105, 188, 16));
			jLabel1.setText("Vrsta kredita.......................................");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(16, 16, 81, 16));
			jLabel.setText("ZahtevID");
			zahtevID_jLabel = new JLabel();
			zahtevID_jLabel.setBounds(new Rectangle(120, 15, 65, 16));
			zahtevID_jLabel.setText("");
			iznos_jLabel = new JLabel();
			iznos_jLabel.setBounds(new Rectangle(254, 136, 84, 16));
			iznos_jLabel.setText("");
			stanje_jLabel = new JLabel();
			stanje_jLabel.setBounds(new Rectangle(120, 44, 98, 16));
			stanje_jLabel.setForeground(Color.blue);
			stanje_jLabel.setText("");
			sifVlasnika_jLabel = new JLabel();
			sifVlasnika_jLabel.setBounds(new Rectangle(257, 227, 121, 16));
			sifVlasnika_jLabel.setText("");
			vrstaKred_jLabel = new JLabel();
			vrstaKred_jLabel.setBounds(new Rectangle(255, 102, 121, 16));
			vrstaKred_jLabel.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(vrstaKred_jLabel, null);
			jContentPane.add(sifVlasnika_jLabel, null);
			jContentPane.add(stanje_jLabel, null);
			jContentPane.add(iznos_jLabel, null);
			jContentPane.add(getOkjButton(), null);
			jContentPane.add(zahtevID_jLabel, null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(valuta_jLabel6, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(rokOtplatejLabel7, null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(profak_jLabel8, null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(depozit_jLabel9, null);
			jContentPane.add(jLabel9, null);
			jContentPane.add(osigNKOSKjLabel10, null);
			jContentPane.add(jLabel10, null);
			jContentPane.add(grejs_jLabel11, null);
			jContentPane.add(jLabel11, null);
			jContentPane.add(zirant_jLabel12, null);
			jContentPane.add(jLabel12, null);
			jContentPane.add(hipo_jLabel13, null);
			jContentPane.add(jLabel13, null);
			jContentPane.add(jLabel14, null);
			jContentPane.add(jLabel15, null);
			jContentPane.add(logojLabel16, null);
			jContentPane.add(iznosDin_jLabel16, null);
			jContentPane.add(mesRata_jLabel16, null);
			jContentPane.add(iznosDinMR_jLabel161, null);
			jContentPane.add(mesecnaRataIznos_jLabel16, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes okjButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getOkjButton() {
		if (okjButton == null) {
			okjButton = new JButton();
			okjButton.setBounds(new Rectangle(264, 508, 76, 25));
			okjButton.setText("OK");
			okjButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					mouseCl(e);
				}
			});
		}
		return okjButton;
	}
	
	private void mouseCl(java.awt.event.MouseEvent e){
		if(okjButton.isEnabled()){
		KontrolerKI ki = new KontrolerKI();
		ki.sacuvajKredit(this);
		}
	}

	public JLabel getVrstaKred_jLabel() {
		return vrstaKred_jLabel;
	}

	public JLabel getSifVlasnika_jLabel() {
		return sifVlasnika_jLabel;
	}

	public JLabel getStanje_jLabel() {
		return stanje_jLabel;
	}

	public JLabel getIznos_jLabel() {
		return iznos_jLabel;
	}
	public JLabel getMesecnaRataIznos(){
		return mesecnaRataIznos_jLabel16;
	}
	public void setMesecnaRata(String iznos){
		mesecnaRataIznos_jLabel16.setText(iznos);
	}
	
	public JLabel getZahtevID_jLabel() {
		return zahtevID_jLabel;
	}

	public JLabel getValuta_jLabel6() {
		return valuta_jLabel6;
	}

	public JLabel getRokOtplatejLabel7() {
		return rokOtplatejLabel7;
	}

	public JLabel getProfak_jLabel8() {
		return profak_jLabel8;
	}

	public JLabel getDepozit_jLabel9() {
		return depozit_jLabel9;
	}

	public JLabel getOsigNKOSKjLabel10() {
		return osigNKOSKjLabel10;
	}

	public JLabel getGrejs_jLabel11() {
		return grejs_jLabel11;
	}

	public JLabel getZirant_jLabel12() {
		return zirant_jLabel12;
	}

	public JLabel getHipo_jLabel13() {
		return hipo_jLabel13;
	}

	

}  //  @jve:decl-index=0:visual-constraint="1,11"
