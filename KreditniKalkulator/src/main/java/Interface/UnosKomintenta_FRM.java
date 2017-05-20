package Interface;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import Kontroleri.KontrolerKI;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class UnosKomintenta_FRM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jmbg_jLabel = null;
	private JLabel JMBG_jLabel = null;
	private JLabel ime_jLabel = null;
	private JTextField ime_jTextField = null;
	private JLabel prez_jLabel = null;
	private JTextField prezime_jTextField = null;
	private JLabel datRodj_jLabel = null;
	private JTextField datumRodjDan_jTextField = null;
	private JTextField datRodjMesec_jTextField = null;
	private JTextField datumRodjGod_jTextField = null;
	private JLabel adresa_jLabel = null;
	private JTextField adresaPreb_jTextField = null;
	private JLabel zan_jLabel = null;
	private JComboBox zanimanje_jComboBox = null;
	private JLabel mp_jLabel = null;
	private JTextField mesecniPrihod_jTextField = null;
	private JLabel zaposOd_jLabel = null;
	private JTextField zaposlenOdDan_jTextField = null;
	private JTextField zaposlenOdMesec_jTextField = null;
	private JTextField zaposlenOdGod_jTextField = null;
	private JLabel fo_jLabel = null;
	private JTextField pocetakPoslovanjaDan_jTextField = null;
	private JTextField pocetakPoslovanjaMes_jTextField = null;
	private JTextField pocetakPoslovanjaGod_jTextField = null;
	private JLabel jLabel = null;
	private JTextField dan_jTextField = null;
	private JTextField mesec_jTextField = null;
	private JTextField god_jTextField = null;
	private JButton sacuvaj_jButton = null;
	private JLabel drz_jLabel1 = null;
	
	public ButtonGroup grupa = new ButtonGroup();
	private JRadioButton da_jRadioButton = null;
	private JRadioButton ne_jRadioButton = null;
	private JLabel logojLabel1 = null;
	/**
	 * This is the default constructor
	 */
	public UnosKomintenta_FRM() {
		super();
		initialize();
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(347, 495);
		this.setBounds(200, 100, 347,495);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loptaVelika.JPG")));
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Unos komintenta");
		
		this.zaposlenOdDan_jTextField.setEnabled(true);
		this.zaposlenOdMesec_jTextField.setEnabled(true);
		this.zaposlenOdGod_jTextField.setEnabled(true);
		
		this.pocetakPoslovanjaDan_jTextField.setEnabled(false);
		this.pocetakPoslovanjaMes_jTextField.setEnabled(false);
		this.pocetakPoslovanjaGod_jTextField.setEnabled(false);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	public JPanel getJContentPane() {
		if (jContentPane == null) {
			logojLabel1 = new JLabel();
			logojLabel1.setBounds(new Rectangle(3, 3, 335, 321));
			logojLabel1.setIcon(new ImageIcon(getClass().getResource("/loptaOriginal3.jpg")));
			logojLabel1.setText("");
			drz_jLabel1 = new JLabel();
			drz_jLabel1.setBounds(new Rectangle(29, 372, 101, 16));
			drz_jLabel1.setText("Drzavljanstvo ");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(29, 330, 160, 16));
			jLabel.setText("Na ovoj adresi stanujem od");
			fo_jLabel = new JLabel();
			fo_jLabel.setBounds(new Rectangle(29, 257, 98, 16));
			fo_jLabel.setText("Firma osnovana");
			zaposOd_jLabel = new JLabel();
			zaposOd_jLabel.setBounds(new Rectangle(29, 232, 107, 16));
			zaposOd_jLabel.setText("Zaposlen od");
			mp_jLabel = new JLabel();
			mp_jLabel.setBounds(new Rectangle(29, 203, 113, 16));
			mp_jLabel.setText("Mesecni prihod");
			zan_jLabel = new JLabel();
			zan_jLabel.setBounds(new Rectangle(29, 174, 79, 16));
			zan_jLabel.setText("Zanimanje");
			adresa_jLabel = new JLabel();
			adresa_jLabel.setBounds(new Rectangle(29, 295, 61, 16));
			adresa_jLabel.setText("Adresa");
			datRodj_jLabel = new JLabel();
			datRodj_jLabel.setBounds(new Rectangle(29, 120, 94, 16));
			datRodj_jLabel.setText("Datum rodjenja");
			prez_jLabel = new JLabel();
			prez_jLabel.setBounds(new Rectangle(29, 94, 61, 16));
			prez_jLabel.setText("Prezime");
			ime_jLabel = new JLabel();
			ime_jLabel.setBounds(new Rectangle(29, 69, 38, 16));
			ime_jLabel.setText("Ime ");
			JMBG_jLabel = new JLabel();
			JMBG_jLabel.setBounds(new Rectangle(107, 29, 200, 16));
			JMBG_jLabel.setText("");
			jmbg_jLabel = new JLabel();
			jmbg_jLabel.setBounds(new Rectangle(29, 28, 63, 16));
			jmbg_jLabel.setText("JMBG ::");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.setBounds(new Rectangle(-1, 1, 341, 463));
			jContentPane.add(jmbg_jLabel, null);
			jContentPane.add(JMBG_jLabel, null);
			jContentPane.add(ime_jLabel, null);
			jContentPane.add(getIme_jTextField(), null);
			jContentPane.add(prez_jLabel, null);
			jContentPane.add(getPrezime_jTextField(), null);
			jContentPane.add(datRodj_jLabel, null);
			jContentPane.add(getDatumRodjDan_jTextField(), null);
			jContentPane.add(getDatRodjMesec_jTextField(), null);
			jContentPane.add(getDatumRodjGod_jTextField(), null);
			jContentPane.add(adresa_jLabel, null);
			jContentPane.add(getAdresaPreb_jTextField(), null);
			jContentPane.add(zan_jLabel, null);
			jContentPane.add(getZanimanje_jComboBox(), null);
			jContentPane.add(mp_jLabel, null);
			jContentPane.add(getMesecniPrihod_jTextField(), null);
			jContentPane.add(zaposOd_jLabel, null);
			jContentPane.add(getZaposlenOdDan_jTextField(), null);
			jContentPane.add(getZaposlenOdMesec_jTextField(), null);
			jContentPane.add(getZaposlenOdGod_jTextField(), null);
			jContentPane.add(fo_jLabel, null);
			jContentPane.add(getPocetakPoslovanjaDan_jTextField(), null);
			jContentPane.add(getPocetakPoslovanjaMes_jTextField(), null);
			jContentPane.add(getPocetakPoslovanjaGod_jTextField(), null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getDan_jTextField(), null);
			jContentPane.add(getMesec_jTextField(), null);
			jContentPane.add(getGod_jTextField(), null);
			jContentPane.add(getSacuvaj_jButton(), null);
			jContentPane.add(drz_jLabel1, null);
			jContentPane.add(getDa_jRadioButton(), null);
			jContentPane.add(getNe_jRadioButton(), null);
			jContentPane.add(logojLabel1, null);
			//jContentPane.add(jContentPane, null);
			grupa.add(getDa_jRadioButton());
			grupa.add(getNe_jRadioButton());
		}
		return jContentPane;
	}

	/**
	 * This method initializes ime_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getIme_jTextField() {
		if (ime_jTextField == null) {
			ime_jTextField = new JTextField();
			ime_jTextField.setBounds(new Rectangle(195, 69, 120, 20));
		}
		return ime_jTextField;
	}

	/**
	 * This method initializes prezime_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getPrezime_jTextField() {
		if (prezime_jTextField == null) {
			prezime_jTextField = new JTextField();
			prezime_jTextField.setBounds(new Rectangle(195, 95, 120, 20));
		}
		return prezime_jTextField;
	}

	/**
	 * This method initializes datumRodjDan_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getDatumRodjDan_jTextField() {
		if (datumRodjDan_jTextField == null) {
			datumRodjDan_jTextField = new JTextField();
			datumRodjDan_jTextField.setBounds(new Rectangle(195, 120, 20, 20));
		}
		return datumRodjDan_jTextField;
	}

	/**
	 * This method initializes datRodjMesec_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getDatRodjMesec_jTextField() {
		if (datRodjMesec_jTextField == null) {
			datRodjMesec_jTextField = new JTextField();
			datRodjMesec_jTextField.setBounds(new Rectangle(219, 120, 20, 20));
		}
		return datRodjMesec_jTextField;
	}

	/**
	 * This method initializes datumRodjGod_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getDatumRodjGod_jTextField() {
		if (datumRodjGod_jTextField == null) {
			datumRodjGod_jTextField = new JTextField();
			datumRodjGod_jTextField.setBounds(new Rectangle(243, 120, 45, 20));
		}
		return datumRodjGod_jTextField;
	}

	/**
	 * This method initializes adresaPreb_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getAdresaPreb_jTextField() {
		if (adresaPreb_jTextField == null) {
			adresaPreb_jTextField = new JTextField();
			adresaPreb_jTextField.setBounds(new Rectangle(197, 294, 121, 20));
		}
		return adresaPreb_jTextField;
	}

	/**
	 * This method initializes zanimanje_jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getZanimanje_jComboBox() {
		if (zanimanje_jComboBox == null) {
			zanimanje_jComboBox = new JComboBox();
			zanimanje_jComboBox.setBounds(new Rectangle(195, 179, 120, 20));
			zanimanje_jComboBox.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					itemStateCh(e);
					}
			});
			
			zanimanje_jComboBox.addItem("ZAPOSLEN");
			zanimanje_jComboBox.addItem("PENZIONER");
			zanimanje_jComboBox.addItem("PREDUZETNIK");
			zanimanje_jComboBox.addItem("POLJOPRIVREDNIK");
		}
		return zanimanje_jComboBox;
	}
	
	private void itemStateCh(java.awt.event.ItemEvent e){
		if(zanimanje_jComboBox.getSelectedItem().toString().equals("PREDUZETNIK")){
			zaposlenOdDan_jTextField.setEnabled(false);
			zaposlenOdGod_jTextField.setEnabled(false);
			zaposlenOdMesec_jTextField.setEnabled(false);
			
			pocetakPoslovanjaDan_jTextField.setEnabled(true);
			pocetakPoslovanjaGod_jTextField.setEnabled(true);
			pocetakPoslovanjaMes_jTextField.setEnabled(true);
		}
		if(zanimanje_jComboBox.getSelectedItem().toString().equals("POLJOPRIVREDNIK")){
			zaposlenOdDan_jTextField.setEnabled(false);
			zaposlenOdGod_jTextField.setEnabled(false);
			zaposlenOdMesec_jTextField.setEnabled(false);
			
			pocetakPoslovanjaDan_jTextField.setEnabled(true);
			pocetakPoslovanjaGod_jTextField.setEnabled(true);
			pocetakPoslovanjaMes_jTextField.setEnabled(true);
		}
		if(zanimanje_jComboBox.getSelectedItem().toString().equals("PENZIONER")){
			zaposlenOdDan_jTextField.setEnabled(false);
			zaposlenOdGod_jTextField.setEnabled(false);
			zaposlenOdMesec_jTextField.setEnabled(false);
			
			pocetakPoslovanjaDan_jTextField.setEnabled(false);
			pocetakPoslovanjaGod_jTextField.setEnabled(false);
			pocetakPoslovanjaMes_jTextField.setEnabled(false);
		}
		if(zanimanje_jComboBox.getSelectedItem().toString().equals("ZAPOSLEN")){
			getZaposlenOdDan_jTextField().setEnabled(true);
			getZaposlenOdMesec_jTextField().setEnabled(true);
			getZaposlenOdGod_jTextField().setEnabled(true);
			
			getPocetakPoslovanjaDan_jTextField().setEnabled(false);
			getPocetakPoslovanjaMes_jTextField().setEnabled(false);
			getPocetakPoslovanjaGod_jTextField().setEnabled(false);
		
		}
		
	}

	/**
	 * This method initializes mesecniPrihod_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getMesecniPrihod_jTextField() {
		if (mesecniPrihod_jTextField == null) {
			mesecniPrihod_jTextField = new JTextField();
			mesecniPrihod_jTextField.setBounds(new Rectangle(195, 203, 120, 20));
		}
		return mesecniPrihod_jTextField;
	}

	/**
	 * This method initializes zaposlenOdDan_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getZaposlenOdDan_jTextField() {
		if (zaposlenOdDan_jTextField == null) {
			zaposlenOdDan_jTextField = new JTextField();
			zaposlenOdDan_jTextField.setBounds(new Rectangle(195, 232, 20, 20));
		}
		return zaposlenOdDan_jTextField;
	}

	/**
	 * This method initializes zaposlenOdMesec_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getZaposlenOdMesec_jTextField() {
		if (zaposlenOdMesec_jTextField == null) {
			zaposlenOdMesec_jTextField = new JTextField();
			zaposlenOdMesec_jTextField.setBounds(new Rectangle(220, 232, 20, 20));
		}
		return zaposlenOdMesec_jTextField;
	}

	/**
	 * This method initializes zaposlenOdGod_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getZaposlenOdGod_jTextField() {
		if (zaposlenOdGod_jTextField == null) {
			zaposlenOdGod_jTextField = new JTextField();
			zaposlenOdGod_jTextField.setBounds(new Rectangle(246, 232, 45, 20));
		}
		return zaposlenOdGod_jTextField;
	}

	/**
	 * This method initializes pocetakPoslovanjaDan_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getPocetakPoslovanjaDan_jTextField() {
		if (pocetakPoslovanjaDan_jTextField == null) {
			pocetakPoslovanjaDan_jTextField = new JTextField();
			pocetakPoslovanjaDan_jTextField.setBounds(new Rectangle(195, 256, 20, 20));
		}
		return pocetakPoslovanjaDan_jTextField;
	}

	/**
	 * This method initializes pocetakPoslovanjaMes_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getPocetakPoslovanjaMes_jTextField() {
		if (pocetakPoslovanjaMes_jTextField == null) {
			pocetakPoslovanjaMes_jTextField = new JTextField();
			pocetakPoslovanjaMes_jTextField.setBounds(new Rectangle(220, 256, 20, 20));
		}
		return pocetakPoslovanjaMes_jTextField;
	}

	/**
	 * This method initializes pocetakPoslovanjaGod_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getPocetakPoslovanjaGod_jTextField() {
		if (pocetakPoslovanjaGod_jTextField == null) {
			pocetakPoslovanjaGod_jTextField = new JTextField();
			pocetakPoslovanjaGod_jTextField.setBounds(new Rectangle(246, 256, 45, 20));
		}
		return pocetakPoslovanjaGod_jTextField;
	}

	/**
	 * This method initializes dan_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getDan_jTextField() {
		if (dan_jTextField == null) {
			dan_jTextField = new JTextField();
			dan_jTextField.setBounds(new Rectangle(195, 328, 20, 20));
		}
		return dan_jTextField;
	}

	/**
	 * This method initializes mesec_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getMesec_jTextField() {
		if (mesec_jTextField == null) {
			mesec_jTextField = new JTextField();
			mesec_jTextField.setBounds(new Rectangle(220, 328, 20, 20));
		}
		return mesec_jTextField;
	}

	/**
	 * This method initializes god_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getGod_jTextField() {
		if (god_jTextField == null) {
			god_jTextField = new JTextField();
			god_jTextField.setBounds(new Rectangle(246, 328, 45, 20));
		}
		return god_jTextField;
	}

	/**
	 * This method initializes sacuvaj_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSacuvaj_jButton() {
		if (sacuvaj_jButton == null) {
			sacuvaj_jButton = new JButton();
			sacuvaj_jButton.setBounds(new Rectangle(206, 413, 108, 22));
			sacuvaj_jButton.setText("SACUVAJ");
			sacuvaj_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
				sacuvajBTN_mouseClicked(e);
				}
			});
		}
		return sacuvaj_jButton;
	}
	
	private void sacuvajBTN_mouseClicked(java.awt.event.MouseEvent e){
		KontrolerKI ki = new KontrolerKI();
		ki.unesiKomitenta(this);
	}

	public JLabel getJMBG_jLabel() {
		return JMBG_jLabel;
	}

	/**
	 * This method initializes da_jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getDa_jRadioButton() {
		if (da_jRadioButton == null) {
			da_jRadioButton = new JRadioButton();
			da_jRadioButton.setBounds(new Rectangle(201, 369, 42, 21));
			da_jRadioButton.setText("da");
		}
		return da_jRadioButton;
	}

	/**
	 * This method initializes ne_jRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getNe_jRadioButton() {
		if (ne_jRadioButton == null) {
			ne_jRadioButton = new JRadioButton();
			ne_jRadioButton.setBounds(new Rectangle(263, 368, 44, 21));
			ne_jRadioButton.setText("ne");
		}
		return ne_jRadioButton;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
