package Interface;

import java.awt.event.KeyEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.Event;
//import java.awt.BorderLayout;
//import javax.swing.SwingConstants;
//import javax.swing.KeyStroke;
import java.awt.Point;
import Kontroleri.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JMenuItem;
//import javax.swing.JMenuBar;
//import javax.swing.JMenu;
import javax.swing.JFrame;
//import javax.swing.JDialog;
import javax.swing.WindowConstants;

import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class FizickoLice_FRM {
	KontrolerKI ki;
	
	public FizickoLice_FRM(KontrolerKI ki){
		this.ki = ki;
		
	}
	

	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="10,10"
	private JPanel jContentPane = null;  //  @jve:decl-index=0:visual-constraint="433,54"
	//private JDialog aboutDialog = null;  //  @jve:decl-index=0:visual-constraint="869,209"
	//private JPanel aboutContentPane = null;
	//private JLabel aboutVersionLabel = null;
	private JPanel podaciOPodnosiocu_jPanel = null;
		private JLabel brClanovaDom_jLabel = null;
	private JLabel brZaposlenih_jLabel = null;
	private JTextField brZaposlenih_jTextField = null;
	private JPanel finansijskiPodaci_jPanel = null;
	private JLabel zaposleniDom_jLabel = null;
	private JLabel prviClan_jLabel = null;
	private JTextField PrviImePrezime_jTextField = null;
	private JLabel PrviMesPrihod_jLabel = null;
	private JTextField prviMesPrihod_jTextField = null;
	private JLabel Prvidin_jLabel = null;
	private JLabel drugizaposleni_jLabel = null;
	private JTextField drugiImePrez_jTextField = null;
	private JLabel drugiMesPri_jLabel = null;
	private JTextField drugiMesPrihod_jTextField = null;
	private JLabel drDin_jLabel = null;
	private JLabel racUBanci_jLabel = null;
	private JRadioButton da_jRadioButton = null;
	private JRadioButton ne_jRadioButton = null;
	private ButtonGroup klijentBanke_JButtonGroup;  //  @jve:decl-index=0:
	private ButtonGroup kreditnaZaduzenost_buttonGroup; 	 
	private ButtonGroup osiguranje_ButtonGroup;  //  @jve:decl-index=0:
	private ButtonGroup drzavljanstvo_ButtonGroup;  //  @jve:decl-index=0:
	
	private JLabel kredZad_jLabel = null;
	private JLabel obavezeKredit_jLabel = null;
	private JRadioButton daKred_jRadioButton = null;
	private JRadioButton neKred_jRadioButton = null;
	private JLabel ubancijLabel = null;
	private JTextField nazivBanke_jTextField = null;
	private JLabel mesRata_jLabel = null;
	private JTextField mesecnaRata_jTextField = null;
	private JLabel vrsta_jLabel = null;
	private JComboBox vrstaKredita_jComboBox = null;
	private JLabel iznosKredita_jLabel = null;
	private JTextField iznosKredita_jTextField = null;
	private JComboBox valuta_jComboBox = null;
	private JLabel rokOtplate_jLabel = null;
	private JTextField rokOtplate_jTextField = null;
	private JLabel rokGod__jLabel = null;
	private JLabel osiguranje_jLabel = null;
	private JRadioButton daOsig_jRadioButton = null;
	private JRadioButton neOsig_jRadioButton = null;
	private JComboBox valutaDrugiKr_jComboBox1 = null;
	private JButton pokreni_jButton = null;
	private JLabel imePrezime_jLabel = null;
	private JTextField brClanovaDom_jTextField = null;
	private JLabel jLabel = null;
	private JLabel mesPrihod_jLabel1 = null;
	private JLabel jLabel1 = null;
	private JTextField pokrivenostProFak_jTextField = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel zanimanje_jLabel5 = null;
	private JLabel datRodjenja_jLabel5 = null;
	private JLabel datRodjenjajLabel5 = null;
	private JLabel jLabel5 = null;
	private JLabel jmbg_jLabel6 = null;
	private JLabel jLabel6 = null;
	private JLabel adresa_jLabel7 = null;
	private JLabel jLabel7 = null;
	private JLabel logojLabel8 = null;
	/**
	 * This method initializes jFrame
	 * 
	 * @return javax.swing.JFrame
	 */
	public JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			jFrame.setPreferredSize(new Dimension(200, 58));
			jFrame.setResizable(false);
			jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loptaVelika.JPG")));
			jFrame.setBounds(new Rectangle(20, 20, 816, 699));
			jFrame.setContentPane(getJContentPane());
			jFrame.setTitle("Zahtev za kredit : Fizicko lice");
			
		}
		return jFrame;
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	public JPanel getJContentPane() {
		if (jContentPane == null) {
			
			logojLabel8 = new JLabel();
			logojLabel8.setBounds(new Rectangle(53, 68, 363, 302));
			logojLabel8.setIcon(new ImageIcon(getClass().getResource("/loptaOriginal3.jpg")));
			logojLabel8.setText("");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(139, 241, 110, 16));
			jLabel7.setText("PODACI O KREDITU");
			adresa_jLabel7 = new JLabel();
			adresa_jLabel7.setBounds(new Rectangle(210, 195, 140, 16));
			adresa_jLabel7.setText("");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(30, 196, 67, 16));
			jLabel6.setText("Adresa");
			jmbg_jLabel6 = new JLabel();
			jmbg_jLabel6.setBounds(new Rectangle(210, 75, 140, 16));
			jmbg_jLabel6.setText("");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(30, 75, 141, 16));
			jLabel5.setText("Jedinstveni maticni broj");
			datRodjenjajLabel5 = new JLabel();
			datRodjenjajLabel5.setBounds(new Rectangle(210, 167, 140, 16));
			datRodjenjajLabel5.setText("");
			datRodjenja_jLabel5 = new JLabel();
			datRodjenja_jLabel5.setBounds(new Rectangle(30, 166, 107, 16));
			datRodjenja_jLabel5.setText("Datum rodjenja");
			zanimanje_jLabel5 = new JLabel();
			zanimanje_jLabel5.setBounds(new Rectangle(210, 106, 140, 16));
			zanimanje_jLabel5.setText("");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(31, 106, 74, 16));
			jLabel4.setText("Zanimanje");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(31, 46, 101, 16));
			jLabel3.setText("Ime i Prezime");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(334, 410, 18, 16));
			jLabel2.setText("%");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(44, 410, 199, 16));
			jLabel1.setText("Pokrivenost radova profakturama ");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(30, 137, 103, 16));
			jLabel.setText("Mesecni prihod ");
			if(imePrezime_jLabel==null){			
			imePrezime_jLabel = new JLabel();
			imePrezime_jLabel.setBounds(new Rectangle(210, 46, 140, 16));
			imePrezime_jLabel.setText("");
			}
			if(mesPrihod_jLabel1==null){
			mesPrihod_jLabel1 = new JLabel();
			mesPrihod_jLabel1.setBounds(new Rectangle(210, 138, 70, 16));
			mesPrihod_jLabel1.setText("");
			}
			osiguranje_jLabel = new JLabel();
			osiguranje_jLabel.setBounds(new Rectangle(45, 378, 186, 16));
			osiguranje_jLabel.setText("Zelite li osiguranje kod NKOSK :: ");
			rokGod__jLabel = new JLabel();
			rokGod__jLabel.setBounds(new Rectangle(288, 349, 25, 16));
			rokGod__jLabel.setText("god");
			rokOtplate_jLabel = new JLabel();
			rokOtplate_jLabel.setBounds(new Rectangle(45, 348, 98, 16));
			rokOtplate_jLabel.setText("Rok otplate :: ");
			iznosKredita_jLabel = new JLabel();
			iznosKredita_jLabel.setBounds(new Rectangle(45, 317, 100, 16));
			iznosKredita_jLabel.setText("Iznos kredita :: ");
			vrsta_jLabel = new JLabel();
			vrsta_jLabel.setBounds(new Rectangle(45, 285, 100, 16));
			vrsta_jLabel.setText("Vrsta kredita :: ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setFont(new Font("Dialog", Font.BOLD, 12));
			jContentPane.setBackground(Color.white);
			jContentPane.add(getPodaciOPodnosiocu_jPanel(), null);
			jContentPane.add(getFinansijskiPodaci_jPanel(), null);
			jContentPane.add(vrsta_jLabel, null);
			jContentPane.add(getVrstaKredita_jComboBox(), null);
			jContentPane.add(iznosKredita_jLabel, null);
			jContentPane.add(getIznosKredita_jTextField(), null);
			jContentPane.add(getValuta_jComboBox(), null);
			jContentPane.add(rokOtplate_jLabel, null);
			jContentPane.add(getRokOtplate_jTextField(), null);
			jContentPane.add(rokGod__jLabel, null);
			jContentPane.add(osiguranje_jLabel, null);
			jContentPane.add(getDaOsig_jRadioButton(), null);
			jContentPane.add(getNeOsig_jRadioButton(), null);
			jContentPane.add(getPokreni_jButton(), null);
			jContentPane.add(imePrezime_jLabel, null);
			jContentPane.add(jLabel, null);
			jContentPane.add(mesPrihod_jLabel1, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getPokrivenostProFak_jTextField(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(zanimanje_jLabel5, null);
			jContentPane.add(datRodjenja_jLabel5, null);
			jContentPane.add(datRodjenjajLabel5, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jmbg_jLabel6, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(adresa_jLabel7, null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(logojLabel8, null);
			
			osiguranje_ButtonGroup = getOsiguranje_ButtonGroup();
			getDaOsig_jRadioButton().setEnabled(false);
			getNeOsig_jRadioButton().setEnabled(false);
			
			drzavljanstvo_ButtonGroup = getdrzavljanstvo_ButtonGroup();
					
		}
		return jContentPane;
	}

	/**
	 * This method initializes aboutDialog	
	 * 	
	 * @return javax.swing.JDialog
	 */
	/*private JDialog getAboutDialog() {
		if (aboutDialog == null) {
			aboutDialog = new JDialog(getJFrame(), true);
			aboutDialog.setTitle("About");
			aboutDialog.setContentPane(getAboutContentPane());
		}
		return aboutDialog;
	}*/

	/**
	 * This method initializes aboutContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	/*private JPanel getAboutContentPane() {
		if (aboutContentPane == null) {
			aboutContentPane = new JPanel();
			aboutContentPane.setLayout(new BorderLayout());
			aboutContentPane.add(getAboutVersionLabel(), BorderLayout.CENTER);
		}
		return aboutContentPane;
	}*/

	/**
	 * This method initializes aboutVersionLabel	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	/*private JLabel getAboutVersionLabel() {
		if (aboutVersionLabel == null) {
			aboutVersionLabel = new JLabel();
			aboutVersionLabel.setText("Version 1.0");
			aboutVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return aboutVersionLabel;
	}*/

	/**
	 * This method initializes podaciOPodnosiocu_jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPodaciOPodnosiocu_jPanel() {
		if (podaciOPodnosiocu_jPanel == null) {
			
			
			
			
			brZaposlenih_jLabel = new JLabel();
			brZaposlenih_jLabel.setBounds(new Rectangle(32, 88, 161, 16));
			brZaposlenih_jLabel.setText("Broj zaposlenih clanova ::");
			brClanovaDom_jLabel = new JLabel();
			brClanovaDom_jLabel.setText("Broj clanova domacinstva :: ");
			brClanovaDom_jLabel.setLocation(new Point(32, 59));
			brClanovaDom_jLabel.setSize(new Dimension(162, 16));
			podaciOPodnosiocu_jPanel = new JPanel();
			podaciOPodnosiocu_jPanel.setLayout(null);
			podaciOPodnosiocu_jPanel.setBorder(BorderFactory.createTitledBorder(null, "OSNOVNE INFORMACIJE O PODNOSIOCU ZAHTEVA", TitledBorder.CENTER, TitledBorder.TOP, new Font("Courier New", Font.BOLD, 12), new Color(51, 51, 51)));
			podaciOPodnosiocu_jPanel.setBounds(new Rectangle(27, 463, 372, 140));
			podaciOPodnosiocu_jPanel.setBackground(Color.white);
			podaciOPodnosiocu_jPanel.add(brClanovaDom_jLabel, null);
			
			podaciOPodnosiocu_jPanel.add(brZaposlenih_jLabel, null);
			podaciOPodnosiocu_jPanel.add(getBrZaposlenih_jTextField(), null);
			podaciOPodnosiocu_jPanel.add(getBrClanovaDom_jTextField(), null);
			
			
		}
		return podaciOPodnosiocu_jPanel;
	}

	/**
	 * This method initializes brZaposlenih_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getBrZaposlenih_jTextField() {
		if (brZaposlenih_jTextField == null) {
			brZaposlenih_jTextField = new JTextField();
			brZaposlenih_jTextField.setBounds(new Rectangle(227, 88, 119, 20));
			brZaposlenih_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
				@Override
				public void focusLost(java.awt.event.FocusEvent e) {
					 // TODO Auto-generated Event stub focusLost()
					brZaposlenih_jTextField_FocusLost(e);
				}
			});
			
			
		}
		return brZaposlenih_jTextField;
	}

	public void brZaposlenih_jTextField_FocusLost(java.awt.event.FocusEvent e){
		int brZapos = 0;
		int brClanova = 0;
		try{
			brZapos = Integer.parseInt(brZaposlenih_jTextField.getText());
			brClanova = Integer.parseInt(brClanovaDom_jTextField.getText());
		}catch(NumberFormatException n){
			
		}
		
			if(brZapos < 0 || brZapos > brClanova){
				JOptionPane.showMessageDialog(this.getJFrame(), "Nekorektan podatak :: Podaci o clanovima", "GRESKA", JOptionPane.ERROR_MESSAGE);
				return;				
			}
		
		
		if(brZapos == 1){
			//System.out.println(" == 1");
			PrviImePrezime_jTextField.setEnabled(true);
			prviMesPrihod_jTextField.setEnabled(true);
			
			drugiMesPrihod_jTextField.setEnabled(false);
			drugiImePrez_jTextField.setEnabled(false);
		}
		if(brZapos > 1){
			PrviImePrezime_jTextField.setEnabled(true);
			prviMesPrihod_jTextField.setEnabled(true);
			
			drugiMesPrihod_jTextField.setEnabled(true);
			drugiImePrez_jTextField.setEnabled(true);
		}
		if(brZapos == 0){
			PrviImePrezime_jTextField.setEnabled(false);
			prviMesPrihod_jTextField.setEnabled(false);
			
			drugiMesPrihod_jTextField.setEnabled(false);
			drugiImePrez_jTextField.setEnabled(false);
			
		}
	}
	/**
	 * This method initializes finansijskiPodaci_jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getFinansijskiPodaci_jPanel() {
		if (finansijskiPodaci_jPanel == null) {
			mesRata_jLabel = new JLabel();
			mesRata_jLabel.setBounds(new Rectangle(105, 393, 98, 16));
			mesRata_jLabel.setText("Mesecna rata :: ");
			ubancijLabel = new JLabel();
			ubancijLabel.setBounds(new Rectangle(105, 366, 103, 16));
			ubancijLabel.setText("Naziv banke :: ");
			obavezeKredit_jLabel = new JLabel();
			obavezeKredit_jLabel.setBounds(new Rectangle(32, 304, 309, 16));
			obavezeKredit_jLabel.setText("Da li imate obaveze po kreditima u drugim bankama:: ");
			kredZad_jLabel = new JLabel();
			kredZad_jLabel.setBounds(new Rectangle(132, 268, 138, 16));
			kredZad_jLabel.setText("KREDITNA ZADUZENOST");
			racUBanci_jLabel = new JLabel();
			racUBanci_jLabel.setBounds(new Rectangle(34, 198, 195, 16));
			racUBanci_jLabel.setText("Da lli imate racun u nasoj banci :: ");
			drDin_jLabel = new JLabel();
			drDin_jLabel.setBounds(new Rectangle(323, 156, 19, 16));
			drDin_jLabel.setText("din");
			drugiMesPri_jLabel = new JLabel();
			drugiMesPri_jLabel.setBounds(new Rectangle(41, 154, 99, 16));
			drugiMesPri_jLabel.setText("Mesecni prihod :: ");
			drugizaposleni_jLabel = new JLabel();
			drugizaposleni_jLabel.setBounds(new Rectangle(29, 131, 113, 16));
			drugizaposleni_jLabel.setText("2. Ime i prezime :: ");
			Prvidin_jLabel = new JLabel();
			Prvidin_jLabel.setBounds(new Rectangle(323, 98, 18, 16));
			Prvidin_jLabel.setText("din");
			PrviMesPrihod_jLabel = new JLabel();
			PrviMesPrihod_jLabel.setBounds(new Rectangle(41, 93, 101, 16));
			PrviMesPrihod_jLabel.setText("Mesecni prihod :: ");
			prviClan_jLabel = new JLabel();
			prviClan_jLabel.setBounds(new Rectangle(29, 70, 113, 16));
			prviClan_jLabel.setText("1. Ime i prezime :: ");
			zaposleniDom_jLabel = new JLabel();
			zaposleniDom_jLabel.setBounds(new Rectangle(47, 32, 297, 16));
			zaposleniDom_jLabel.setText("PODACI O ZAPOSLENIM CLANOVIMA DOMACINSTVA");
			
			
			finansijskiPodaci_jPanel = new JPanel();
			finansijskiPodaci_jPanel.setLayout(null);
			finansijskiPodaci_jPanel.setBounds(new Rectangle(422, 22, 372, 583));
			finansijskiPodaci_jPanel.setBorder(BorderFactory.createTitledBorder(null, "FINANSIJSKI PODACI", TitledBorder.CENTER, TitledBorder.TOP, new Font("Courier New", Font.BOLD, 12), new Color(51, 51, 51)));
			finansijskiPodaci_jPanel.setBackground(Color.white);
			finansijskiPodaci_jPanel.add(zaposleniDom_jLabel, null);
			finansijskiPodaci_jPanel.add(prviClan_jLabel, null);
			finansijskiPodaci_jPanel.add(getPrviImePrezime_jTextField(), null);
			finansijskiPodaci_jPanel.add(PrviMesPrihod_jLabel, null);
			finansijskiPodaci_jPanel.add(getPrviMesPrihod_jTextField(), null);
			finansijskiPodaci_jPanel.add(Prvidin_jLabel, null);
			finansijskiPodaci_jPanel.add(drugizaposleni_jLabel, null);
			finansijskiPodaci_jPanel.add(getDrugiImePrez_jTextField(), null);
			finansijskiPodaci_jPanel.add(drugiMesPri_jLabel, null);
			finansijskiPodaci_jPanel.add(getDrugiMesPrihod_jTextField(), null);
			finansijskiPodaci_jPanel.add(drDin_jLabel, null);
			finansijskiPodaci_jPanel.add(racUBanci_jLabel, null);
			finansijskiPodaci_jPanel.add(getDa_jRadioButton(), null);
			finansijskiPodaci_jPanel.add(getNe_jRadioButton(), null);
			finansijskiPodaci_jPanel.add(kredZad_jLabel, null);
			finansijskiPodaci_jPanel.add(obavezeKredit_jLabel, null);
			finansijskiPodaci_jPanel.add(getDaKred_jRadioButton(), null);
			finansijskiPodaci_jPanel.add(getNeKred_jRadioButton(), null);
			finansijskiPodaci_jPanel.add(ubancijLabel, null);
			finansijskiPodaci_jPanel.add(getNazivBanke_jTextField(), null);
			finansijskiPodaci_jPanel.add(mesRata_jLabel, null);
			finansijskiPodaci_jPanel.add(getMesecnaRata_jTextField(), null);
			finansijskiPodaci_jPanel.add(getValutaDrugiKr_jComboBox1(), null);
			
			
			klijentBanke_JButtonGroup = getKlijentBanke_ButtonGroup();
			kreditnaZaduzenost_buttonGroup = getKreditnaZaduzenost_buttonGroup();
			
			
			//pocetakPoslovanjaDan_jTextField1.setEnabled(false);
			//pocetakposlovanjaGod_jTextField1.setEnabled(false);
			//pocetakPoslovanjaMes_jTextField1.setEnabled(false);
			//finansijskiPodaci_jPanel.add(getKlijentBanke_ButtonGroup(),null);
		
			//CLANOVI DOMACINSTVA :(
			PrviImePrezime_jTextField.setEnabled(false);
			prviMesPrihod_jTextField.setEnabled(false);
			drugiImePrez_jTextField.setEnabled(false);
			drugiMesPrihod_jTextField.setEnabled(false);
			
			this.getNazivBanke_jTextField().setEnabled(false);
			this.getMesecnaRata_jTextField().setEnabled(false);
			this.getValutaDrugiKr_jComboBox1().setEnabled(false);
			
			
		}
		return finansijskiPodaci_jPanel;
	}

	public void zanimanje_jComboBoxItemStateChanged(java.awt.event.ItemEvent e){
			/*if(zanimanje_jComboBox.getSelectedItem().toString().equals("PREDUZETNIK")){
				zaposlenOdDan_jTextField.setEnabled(false);
				zaposlenOdGod_jTextField.setEnabled(false);
				zaposlenOdMesec_jTextField1.setEnabled(false);
				
				pocetakPoslovanjaDan_jTextField1.setEnabled(true);
				pocetakposlovanjaGod_jTextField1.setEnabled(true);
				pocetakPoslovanjaMes_jTextField1.setEnabled(true);
			}
			if(zanimanje_jComboBox.getSelectedItem().toString().equals("POLJOPRIVREDNIK")){
				zaposlenOdDan_jTextField.setEnabled(false);
				zaposlenOdGod_jTextField.setEnabled(false);
				zaposlenOdMesec_jTextField1.setEnabled(false);
				
				pocetakPoslovanjaDan_jTextField1.setEnabled(true);
				pocetakposlovanjaGod_jTextField1.setEnabled(true);
				pocetakPoslovanjaMes_jTextField1.setEnabled(true);
			}
			if(zanimanje_jComboBox.getSelectedItem().toString().equals("PENZIONER")){
				zaposlenOdDan_jTextField.setEnabled(false);
				zaposlenOdGod_jTextField.setEnabled(false);
				zaposlenOdMesec_jTextField1.setEnabled(false);
				
				pocetakPoslovanjaDan_jTextField1.setEnabled(false);
				pocetakposlovanjaGod_jTextField1.setEnabled(false);
				pocetakPoslovanjaMes_jTextField1.setEnabled(false);
			}
			if(zanimanje_jComboBox.getSelectedItem().toString().equals("ZAPOSLEN")){
				zaposlenOdDan_jTextField.setEnabled(true);
				zaposlenOdGod_jTextField.setEnabled(true);
				zaposlenOdMesec_jTextField1.setEnabled(true);
				
				pocetakPoslovanjaDan_jTextField1.setEnabled(false);
				pocetakposlovanjaGod_jTextField1.setEnabled(false);
				pocetakPoslovanjaMes_jTextField1.setEnabled(false);
			}*/
	}

	/**
	 * This method initializes PrviImePrezime_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getPrviImePrezime_jTextField() {
		if (PrviImePrezime_jTextField == null) {
			PrviImePrezime_jTextField = new JTextField();
			PrviImePrezime_jTextField.setBounds(new Rectangle(160, 70, 184, 20));
		}
		return PrviImePrezime_jTextField;
	}

	/**
	 * This method initializes prviMesPrihod_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getPrviMesPrihod_jTextField() {
		if (prviMesPrihod_jTextField == null) {
			prviMesPrihod_jTextField = new JTextField();
			prviMesPrihod_jTextField.setBounds(new Rectangle(252, 97, 55, 20));
		}
		return prviMesPrihod_jTextField;
	}

	/**
	 * This method initializes drugiImePrez_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getDrugiImePrez_jTextField() {
		if (drugiImePrez_jTextField == null) {
			drugiImePrez_jTextField = new JTextField();
			drugiImePrez_jTextField.setBounds(new Rectangle(160, 131, 181, 20));
		}
		return drugiImePrez_jTextField;
	}

	/**
	 * This method initializes drugiMesPrihod_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getDrugiMesPrihod_jTextField() {
		if (drugiMesPrihod_jTextField == null) {
			drugiMesPrihod_jTextField = new JTextField();
			drugiMesPrihod_jTextField.setBounds(new Rectangle(252, 154, 55, 20));
		}
		return drugiMesPrihod_jTextField;
	}

	/**
	 * This method initializes da_jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getDa_jRadioButton() {
		if (da_jRadioButton == null) {
			da_jRadioButton = new JRadioButton();
			da_jRadioButton.setBounds(new Rectangle(249, 195, 43, 21));
			da_jRadioButton.setText("da");
		}
		return da_jRadioButton;
	}
	// This method initializes klijentBanke_jButtonGroup
	
	private ButtonGroup getKlijentBanke_ButtonGroup(){
		if(klijentBanke_JButtonGroup == null){
			klijentBanke_JButtonGroup = new ButtonGroup();
			klijentBanke_JButtonGroup.add(da_jRadioButton);
			klijentBanke_JButtonGroup.add(ne_jRadioButton);
			
		}
		return klijentBanke_JButtonGroup;
	}
	/**
	 * This method initializes ne_jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getNe_jRadioButton() {
		if (ne_jRadioButton == null) {
			ne_jRadioButton = new JRadioButton();
			ne_jRadioButton.setBounds(new Rectangle(302, 195, 43, 21));
			ne_jRadioButton.setText("ne");
			ne_jRadioButton.setMnemonic(KeyEvent.VK_UNDEFINED);
		}
		return ne_jRadioButton;
	}

	/**
	 * This method initializes daKred_jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getDaKred_jRadioButton() {
		if (daKred_jRadioButton == null) {
			daKred_jRadioButton = new JRadioButton();
			daKred_jRadioButton.setBounds(new Rectangle(249, 331, 41, 21));
			daKred_jRadioButton.setText("da");
			daKred_jRadioButton.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					
					daKred_ItemStateChanged(e);
				}
			});
		}
		return daKred_jRadioButton;
	}
	
	public void daKred_ItemStateChanged(java.awt.event.ItemEvent e){
		if(daKred_jRadioButton.isSelected()){
			this.getNazivBanke_jTextField().setEnabled(true);
			this.getMesecnaRata_jTextField().setEnabled(true);
			this.getValutaDrugiKr_jComboBox1().setEnabled(true);
		}else{
			this.getNazivBanke_jTextField().setEnabled(false);
			this.getMesecnaRata_jTextField().setEnabled(false);
			this.getValutaDrugiKr_jComboBox1().setEnabled(false);
		}
		
	}

	/**
	 * This method initializes neKred_jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getNeKred_jRadioButton() {
		if (neKred_jRadioButton == null) {
			neKred_jRadioButton = new JRadioButton();
			neKred_jRadioButton.setBounds(new Rectangle(302, 331, 44, 21));
			neKred_jRadioButton.setText("ne");
		}
		return neKred_jRadioButton;
	}

	/**
	 * This method initializes nazivBanke_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getNazivBanke_jTextField() {
		if (nazivBanke_jTextField == null) {
			nazivBanke_jTextField = new JTextField();
			nazivBanke_jTextField.setBounds(new Rectangle(222, 364, 127, 20));
		}
		return nazivBanke_jTextField;
	}

	/**
	 * This method initializes mesecnaRata_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getMesecnaRata_jTextField() {
		if (mesecnaRata_jTextField == null) {
			mesecnaRata_jTextField = new JTextField();
			mesecnaRata_jTextField.setBounds(new Rectangle(222, 391, 65, 20));
		}
		return mesecnaRata_jTextField;
	}

	
	
	/**
	 * This method initializes vrstaKredita_jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getVrstaKredita_jComboBox() {
		if (vrstaKredita_jComboBox == null) {
			vrstaKredita_jComboBox = new JComboBox();
			vrstaKredita_jComboBox.setBounds(new Rectangle(192, 283, 153, 18));
			vrstaKredita_jComboBox.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					vrstaKredita_ItemStateChanged(e);
				}
			});
			
			vrstaKredita_jComboBox.addItem("POTROSACKI");
			vrstaKredita_jComboBox.addItem("STAMBENI");
			vrstaKredita_jComboBox.addItem("ADAPTACIJA I REKONSTRUKCIJA");
			
			
		}
		return vrstaKredita_jComboBox;
	}
	
	public void vrstaKredita_ItemStateChanged(java.awt.event.ItemEvent e){
		String s = (String)getVrstaKredita_jComboBox().getSelectedItem();
			if(s.equals("STAMBENI") || s.equals("ADAPTACIJA I REKONSTRUKCIJA")){
				getDaOsig_jRadioButton().setEnabled(true);
				getNeOsig_jRadioButton().setEnabled(true);
				
			}else{
				getDaOsig_jRadioButton().setEnabled(false);
				getNeOsig_jRadioButton().setEnabled(false);
				
			}
			
			
	}

	/**
	 * This method initializes iznosKredita_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getIznosKredita_jTextField() {
		if (iznosKredita_jTextField == null) {
			iznosKredita_jTextField = new JTextField();
			iznosKredita_jTextField.setBounds(new Rectangle(192, 315, 87, 20));
		}
		return iznosKredita_jTextField;
	}

	/**
	 * This method initializes valuta_jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getValuta_jComboBox() {
		if (valuta_jComboBox == null) {
			valuta_jComboBox = new JComboBox();
			valuta_jComboBox.setBounds(new Rectangle(285, 315, 59, 18));
			valuta_jComboBox.addItem("RSD");
			valuta_jComboBox.addItem("EUR");
		}
		return valuta_jComboBox;
	}

	/**
	 * This method initializes rokOtplate_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getRokOtplate_jTextField() {
		if (rokOtplate_jTextField == null) {
			rokOtplate_jTextField = new JTextField();
			rokOtplate_jTextField.setBounds(new Rectangle(192, 346, 87, 20));
		}
		return rokOtplate_jTextField;
	}

	/**
	 * This method initializes daOsig_jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getDaOsig_jRadioButton() {
		if (daOsig_jRadioButton == null) {
			daOsig_jRadioButton = new JRadioButton();
			daOsig_jRadioButton.setBounds(new Rectangle(265, 377, 45, 21));
			daOsig_jRadioButton.setText("da");
			
		}
		return daOsig_jRadioButton;
	}

	/**
	 * This method initializes neOsig_jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getNeOsig_jRadioButton() {
		if (neOsig_jRadioButton == null) {
			neOsig_jRadioButton = new JRadioButton();
			neOsig_jRadioButton.setBounds(new Rectangle(318, 377, 42, 21));
			neOsig_jRadioButton.setText("ne");
			
		}
		return neOsig_jRadioButton;
	}

	/**
	 * This method initializes valutaDrugiKr_jComboBox1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getValutaDrugiKr_jComboBox1() {
		if (valutaDrugiKr_jComboBox1 == null) {
			valutaDrugiKr_jComboBox1 = new JComboBox();
			valutaDrugiKr_jComboBox1.setBounds(new Rectangle(291, 391, 57, 20));
			valutaDrugiKr_jComboBox1.addItem("EUR");
			valutaDrugiKr_jComboBox1.addItem("RSD");
		}
		return valutaDrugiKr_jComboBox1;
	}

	/**
	 * This method initializes pokreni_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	
	
	private JButton getPokreni_jButton() {
		if (pokreni_jButton == null) {
			pokreni_jButton = new JButton();
			pokreni_jButton.setBounds(new Rectangle(692, 610, 97, 23));
			pokreni_jButton.setText("POKRENI");
			pokreni_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					 // TODO Auto-generated Event stub mouseClicked()
					
					pokreniMouseClicked(e);
					//
				}
			});
			
			
		}
		return pokreni_jButton;
	}
	public void pokreniMouseClicked(java.awt.event.MouseEvent e){		
		ki.proveraFizickogLica(this);
		//JOptionPane.showMessageDialog(this.getJFrame(),  r.getPoruka(),"IZVESTAJ", JOptionPane.INFORMATION_MESSAGE);
		}
	
	/**
	 * Launches this application
	 */
	/*public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FizickoLice_FRM application = new FizickoLice_FRM();
				application.getJFrame().setVisible(true);
			}
		});
	}*/

	public ButtonGroup getKreditnaZaduzenost_buttonGroup() {
				if(kreditnaZaduzenost_buttonGroup == null){
					kreditnaZaduzenost_buttonGroup = new ButtonGroup();
					kreditnaZaduzenost_buttonGroup.add(daKred_jRadioButton);
					kreditnaZaduzenost_buttonGroup.add(neKred_jRadioButton);
				}
		
		return kreditnaZaduzenost_buttonGroup;
	}

	

	public ButtonGroup getOsiguranje_ButtonGroup() {
				if(osiguranje_ButtonGroup == null){
					osiguranje_ButtonGroup = new ButtonGroup();
					osiguranje_ButtonGroup.add(daOsig_jRadioButton);
					osiguranje_ButtonGroup.add(neOsig_jRadioButton);
					
				}
		
		return osiguranje_ButtonGroup;
	}
	
	public ButtonGroup getdrzavljanstvo_ButtonGroup(){
		if(drzavljanstvo_ButtonGroup == null){
			drzavljanstvo_ButtonGroup = new ButtonGroup();
			
		}
		return drzavljanstvo_ButtonGroup;
	}

	/**
	 * This method initializes daDrzavljanin_jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	

	/**
	 * This method initializes brClanovaDom_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getBrClanovaDom_jTextField() {
		if (brClanovaDom_jTextField == null) {
			brClanovaDom_jTextField = new JTextField();
			brClanovaDom_jTextField.setBounds(new Rectangle(227, 58, 119, 20));
		}
		return brClanovaDom_jTextField;
	}

	/**
	 * This method initializes pokrivenostProFak_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getPokrivenostProFak_jTextField() {
		if (pokrivenostProFak_jTextField == null) {
			pokrivenostProFak_jTextField = new JTextField();
			pokrivenostProFak_jTextField.setBounds(new Rectangle(268, 410, 63, 20));
		}
		return pokrivenostProFak_jTextField;
	}

	public JLabel getOsiguranje_jLabel() {
		return osiguranje_jLabel;
	}

	public JLabel getMesPrihod_jLabel1() {
		return mesPrihod_jLabel1;
	}

	public JLabel getZanimanje_jLabel5() {
		return zanimanje_jLabel5;
	}

	public JLabel getJmbg_jLabel6() {
		return jmbg_jLabel6;
	}

	public JLabel getDatRodjenjajLabel5() {
		return datRodjenjajLabel5;
	}

	public JLabel getAdresa_jLabel7() {
		return adresa_jLabel7;
	}
	public JLabel getImePrezime_JLabel(){
		if(this.imePrezime_jLabel== null){
			this.imePrezime_jLabel = new JLabel();
			imePrezime_jLabel.setBounds(new Rectangle(210, 46, 140, 16));
			imePrezime_jLabel.setText("");
		}
		return this.imePrezime_jLabel;
	}
}
