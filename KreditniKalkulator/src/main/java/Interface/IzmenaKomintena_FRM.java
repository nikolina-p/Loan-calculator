package Interface;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import Kontroleri.KontrolerKI;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class IzmenaKomintena_FRM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel JMBG_jLabel1 = null;
	private JLabel jLabel1 = null;
	private JTextField ime_jTextField = null;
	private JLabel jLabel3 = null;
	private JLabel datRodj_jLabel4 = null;
	private JLabel jLabel4 = null;
	private JComboBox zanimanje_jComboBox = null;
	private JLabel jLabel5 = null;
	private JTextField mesPrihod_jTextField = null;
	private JLabel jLabel6 = null;
	private JTextField damZapos_jTextField = null;
	private JTextField mesZapos_jTextField = null;
	private JTextField godZapos_jTextField = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JTextField danFrmOsn_jTextField = null;
	private JTextField mesFrmOsn_jTextField = null;
	private JTextField godFrmOsn_jTextField = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JTextField adresa_jTextField = null;
	private JLabel jLabel11 = null;
	private JTextField danAdres_jTextField = null;
	private JTextField mesAdresa_jTextField = null;
	private JTextField godAdresa_jTextField = null;
	private JLabel jLabel12 = null;
	private JRadioButton dajRadioButton = null;
	private JRadioButton nejRadioButton = null;
	private JButton ok_jButton = null;
	private JLabel logojLabel2 = null;

	/**
	 * This is the default constructor
	 */
	public IzmenaKomintena_FRM() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loptaVelika.JPG")));
		this.setBounds(new Rectangle(100, 100, 339, 456));
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("ProCredit Bank");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	public JPanel getJContentPane() {
		if (jContentPane == null) {
			logojLabel2 = new JLabel();
			logojLabel2.setBounds(new Rectangle(2, 3, 324, 296));
			logojLabel2.setIcon(new ImageIcon(getClass().getResource("/loptaOriginal3.jpg")));
			logojLabel2.setText("");
			jLabel12 = new JLabel();
			jLabel12.setBounds(new Rectangle(13, 303, 100, 16));
			jLabel12.setText("Drzavljanstvo");
			jLabel11 = new JLabel();
			jLabel11.setBounds(new Rectangle(13, 271, 156, 16));
			jLabel11.setText("Na ovoj adresi stanujem od");
			jLabel10 = new JLabel();
			jLabel10.setBounds(new Rectangle(13, 242, 66, 16));
			jLabel10.setText("Adresa");
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(261, 214, 29, 16));
			jLabel9.setText("god");
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(13, 212, 103, 16));
			jLabel8.setText("Firma osnovana");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(261, 186, 26, 16));
			jLabel7.setText("god");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(13, 181, 101, 16));
			jLabel6.setText("Zaposlen od");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(13, 153, 102, 16));
			jLabel5.setText("Mesecni prihod");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(13, 123, 73, 16));
			jLabel4.setText("Zanimanje");
			datRodj_jLabel4 = new JLabel();
			datRodj_jLabel4.setBounds(new Rectangle(150, 93, 163, 16));
			datRodj_jLabel4.setText("");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(13, 93, 88, 16));
			jLabel3.setText("Datum rodjenja");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(13, 62, 97, 16));
			jLabel1.setText("Ime i prezime");
			JMBG_jLabel1 = new JLabel();
			JMBG_jLabel1.setBounds(new Rectangle(150, 31, 164, 16));
			JMBG_jLabel1.setText("");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(13, 31, 38, 16));
			jLabel.setText("JMBG ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabel, null);
			jContentPane.add(JMBG_jLabel1, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getIme_jTextField(), null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(datRodj_jLabel4, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(getZanimanje_jComboBox(), null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(getMesPrihod_jTextField(), null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(getDamZapos_jTextField(), null);
			jContentPane.add(getMesZapos_jTextField(), null);
			jContentPane.add(getGodZapos_jTextField(), null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(getDanFrmOsn_jTextField(), null);
			jContentPane.add(getMesFrmOsn_jTextField(), null);
			jContentPane.add(getGodFrmOsn_jTextField(), null);
			jContentPane.add(jLabel9, null);
			jContentPane.add(jLabel10, null);
			jContentPane.add(getAdresa_jTextField(), null);
			jContentPane.add(jLabel11, null);
			jContentPane.add(getDanAdres_jTextField(), null);
			jContentPane.add(getMesAdresa_jTextField(), null);
			jContentPane.add(getGodAdresa_jTextField(), null);
			jContentPane.add(jLabel12, null);
			jContentPane.add(getDajRadioButton(), null);
			jContentPane.add(getNejRadioButton(), null);
			jContentPane.add(getOk_jButton(), null);
			jContentPane.add(logojLabel2, null);
			
			ButtonGroup grupa = new ButtonGroup();
			grupa.add(getDajRadioButton());
			grupa.add(getNejRadioButton());
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
			ime_jTextField.setBounds(new Rectangle(150, 60, 165, 20));
		}
		return ime_jTextField;
	}

	/**
	 * This method initializes zanimanje_jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	public JComboBox getZanimanje_jComboBox() {
		if (zanimanje_jComboBox == null) {
			zanimanje_jComboBox = new JComboBox();
			zanimanje_jComboBox.setBounds(new Rectangle(150, 121, 164, 19));
			zanimanje_jComboBox.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					eventChanged(e);
				}
			});
			zanimanje_jComboBox.addItem("ZAPOSLEN");
			zanimanje_jComboBox.addItem("PENZIONER");
			zanimanje_jComboBox.addItem("PREDUZETNIK");
			zanimanje_jComboBox.addItem("POLJOPRIVREDNIK");
		}
		return zanimanje_jComboBox;
	}
	public void eventChanged(java.awt.event.ItemEvent e){
		if(zanimanje_jComboBox.getSelectedItem().toString().equals("PREDUZETNIK")){
			getDamZapos_jTextField().setEnabled(false);			
			getGodZapos_jTextField().setEnabled(false);
			getMesZapos_jTextField().setEnabled(false);
			
			getDanFrmOsn_jTextField().setEnabled(true);
			getMesFrmOsn_jTextField().setEnabled(true);
			getGodFrmOsn_jTextField().setEnabled(true);
		}
		if(zanimanje_jComboBox.getSelectedItem().toString().equals("POLJOPRIVREDNIK")){
			getDamZapos_jTextField().setEnabled(false);			
			getGodZapos_jTextField().setEnabled(false);
			getMesZapos_jTextField().setEnabled(false);
			
			getDanFrmOsn_jTextField().setEnabled(true);
			getMesFrmOsn_jTextField().setEnabled(true);
			getGodFrmOsn_jTextField().setEnabled(true);
		}
		if(zanimanje_jComboBox.getSelectedItem().toString().equals("PENZIONER")){
			getDamZapos_jTextField().setEnabled(false);			
			getGodZapos_jTextField().setEnabled(false);
			getMesZapos_jTextField().setEnabled(false);
			
			getDanFrmOsn_jTextField().setEnabled(false);
			getMesFrmOsn_jTextField().setEnabled(false);
			getGodFrmOsn_jTextField().setEnabled(false);
		}
		if(zanimanje_jComboBox.getSelectedItem().toString().equals("ZAPOSLEN")){
			getDamZapos_jTextField().setEnabled(true);			
			getGodZapos_jTextField().setEnabled(true);
			getMesZapos_jTextField().setEnabled(true);
			
			getDanFrmOsn_jTextField().setEnabled(false);
			getMesFrmOsn_jTextField().setEnabled(false);
			getGodFrmOsn_jTextField().setEnabled(false);
		
		}
		
		
	}
	/**
	 * This method initializes mesPrihod_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getMesPrihod_jTextField() {
		if (mesPrihod_jTextField == null) {
			mesPrihod_jTextField = new JTextField();
			mesPrihod_jTextField.setBounds(new Rectangle(150, 153, 166, 20));
		}
		return mesPrihod_jTextField;
	}

	/**
	 * This method initializes damZapos_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getDamZapos_jTextField() {
		if (damZapos_jTextField == null) {
			damZapos_jTextField = new JTextField();
			damZapos_jTextField.setBounds(new Rectangle(150, 184, 20, 20));
		}
		return damZapos_jTextField;
	}

	/**
	 * This method initializes mesZapos_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getMesZapos_jTextField() {
		if (mesZapos_jTextField == null) {
			mesZapos_jTextField = new JTextField();
			mesZapos_jTextField.setBounds(new Rectangle(180, 184, 20, 20));
		}
		return mesZapos_jTextField;
	}

	/**
	 * This method initializes godZapos_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getGodZapos_jTextField() {
		if (godZapos_jTextField == null) {
			godZapos_jTextField = new JTextField();
			godZapos_jTextField.setBounds(new Rectangle(208, 184, 45, 20));
		}
		return godZapos_jTextField;
	}

	/**
	 * This method initializes danFrmOsn_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getDanFrmOsn_jTextField() {
		if (danFrmOsn_jTextField == null) {
			danFrmOsn_jTextField = new JTextField();
			danFrmOsn_jTextField.setBounds(new Rectangle(150, 211, 20, 20));
		}
		return danFrmOsn_jTextField;
	}

	/**
	 * This method initializes mesFrmOsn_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getMesFrmOsn_jTextField() {
		if (mesFrmOsn_jTextField == null) {
			mesFrmOsn_jTextField = new JTextField();
			mesFrmOsn_jTextField.setBounds(new Rectangle(180, 212, 20, 20));
		}
		return mesFrmOsn_jTextField;
	}

	/**
	 * This method initializes godFrmOsn_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getGodFrmOsn_jTextField() {
		if (godFrmOsn_jTextField == null) {
			godFrmOsn_jTextField = new JTextField();
			godFrmOsn_jTextField.setBounds(new Rectangle(208, 212, 45, 20));
		}
		return godFrmOsn_jTextField;
	}

	/**
	 * This method initializes adresa_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getAdresa_jTextField() {
		if (adresa_jTextField == null) {
			adresa_jTextField = new JTextField();
			adresa_jTextField.setBounds(new Rectangle(150, 242, 165, 20));
		}
		return adresa_jTextField;
	}

	/**
	 * This method initializes danAdres_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getDanAdres_jTextField() {
		if (danAdres_jTextField == null) {
			danAdres_jTextField = new JTextField();
			danAdres_jTextField.setBounds(new Rectangle(183, 271, 20, 20));
		}
		return danAdres_jTextField;
	}

	/**
	 * This method initializes mesAdresa_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getMesAdresa_jTextField() {
		if (mesAdresa_jTextField == null) {
			mesAdresa_jTextField = new JTextField();
			mesAdresa_jTextField.setBounds(new Rectangle(211, 271, 20, 20));
		}
		return mesAdresa_jTextField;
	}

	/**
	 * This method initializes godAdresa_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getGodAdresa_jTextField() {
		if (godAdresa_jTextField == null) {
			godAdresa_jTextField = new JTextField();
			godAdresa_jTextField.setBounds(new Rectangle(241, 271, 45, 20));
		}
		return godAdresa_jTextField;
	}

	/**
	 * This method initializes dajRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getDajRadioButton() {
		if (dajRadioButton == null) {
			dajRadioButton = new JRadioButton();
			dajRadioButton.setBounds(new Rectangle(163, 302, 53, 21));
			dajRadioButton.setText("da");
		}
		return dajRadioButton;
	}

	/**
	 * This method initializes nejRadioButton	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	public JRadioButton getNejRadioButton() {
		if (nejRadioButton == null) {
			nejRadioButton = new JRadioButton();
			nejRadioButton.setBounds(new Rectangle(223, 302, 55, 21));
			nejRadioButton.setText("ne");
		}
		return nejRadioButton;
	}

	/**
	 * This method initializes ok_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getOk_jButton() {
		if (ok_jButton == null) {
			ok_jButton = new JButton();
			ok_jButton.setBounds(new Rectangle(230, 371, 81, 25));
			ok_jButton.setText("OK");
			ok_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
				mouseClc(e);	
				}
			});
		}
		return ok_jButton;
	}
 public void mouseClc(java.awt.event.MouseEvent e){
	 KontrolerKI ki = new KontrolerKI();
	 ki.izmenaKomitenta(this);
	 
 }
	public JLabel getJMBG_jLabel1() {
		return JMBG_jLabel1;
	}

	public JLabel getDatRodj_jLabel4() {
		return datRodj_jLabel4;
	}

}  //  @jve:decl-index=0:visual-constraint="10,5"
