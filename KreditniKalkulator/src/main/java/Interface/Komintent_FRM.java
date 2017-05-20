package Interface;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Kontroleri.KontrolerKI;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Komintent_FRM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton unos_jButton = null;
	private JButton izmena_jButton = null;
	private JButton brisanje_jButton = null;
	private JLabel jmbg_jLabel = null;
	private JTextField JMBG_jTextField = null;
	private JLabel logo_jLabel = null;

	/**
	 * This is the default constructor
	 */
	public Komintent_FRM() {
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
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loptaVelika.JPG")));
		this.setBounds(new Rectangle(220, 220, 458, 164));
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
			logo_jLabel = new JLabel();
			logo_jLabel.setBounds(new Rectangle(1, 3, 336, 127));
			logo_jLabel.setIcon(new ImageIcon(getClass().getResource("/loptaOriginal3.jpg")));
			logo_jLabel.setText("");
			jmbg_jLabel = new JLabel();
			jmbg_jLabel.setBounds(new Rectangle(61, 45, 172, 16));
			jmbg_jLabel.setForeground(Color.black);
			jmbg_jLabel.setText("Unesite JMBG komintenta :: ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.setBounds(new Rectangle(0, 1, 452, 132));
			jContentPane.add(getUnos_jButton(), null);
			jContentPane.add(getIzmena_jButton(), null);
			jContentPane.add(getBrisanje_jButton(), null);
			jContentPane.add(jmbg_jLabel, null);
			jContentPane.add(getJMBG_jTextField(), null);
			jContentPane.add(logo_jLabel, null);
			//jContentPane.add(jContentPane, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes unos_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getUnos_jButton() {
		if (unos_jButton == null) {
			unos_jButton = new JButton();
			unos_jButton.setBounds(new Rectangle(271, 23, 169, 27));
			unos_jButton.setForeground(Color.black);
			unos_jButton.setText("NOVI KOMINTENT");
			unos_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					//provera da li komitent vec postoji u bazi....
					noviKomitentBtn_mouseClicked(e);
				}
			});
			unos_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
				
				}
			});
		}
		return unos_jButton;
	}
	
	
	private void noviKomitentBtn_mouseClicked(java.awt.event.MouseEvent e){
		
		if(this.JMBG_jTextField.getText().equals("")){
			JOptionPane.showMessageDialog(this, "Uneti JMBG!", "Greska", JOptionPane.ERROR_MESSAGE);
			return;
		}
		KontrolerKI ki = new KontrolerKI();		
	
		UnosKomintenta_FRM uk = new UnosKomintenta_FRM();
		ki.pronadjiKomintenta(this,uk,this.getJMBG_jTextField());
				
	}

	/**
	 * This method initializes izmena_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getIzmena_jButton() {
		if (izmena_jButton == null) {
			izmena_jButton = new JButton();
			izmena_jButton.setBounds(new Rectangle(271, 57, 169, 27));
			izmena_jButton.setForeground(Color.black);
			izmena_jButton.setText("IZMENA PODATAKA");
			izmena_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					mouseClck(e);
				}
			});
		}
		return izmena_jButton;
	}
	
	private void mouseClck(java.awt.event.MouseEvent e){
		if(this.JMBG_jTextField.getText().equals("")){
			JOptionPane.showMessageDialog(this, "Uneti JMBG!", "Greska", JOptionPane.ERROR_MESSAGE);
			return;
		}
		KontrolerKI ki = new KontrolerKI();
		IzmenaKomintena_FRM ik = new IzmenaKomintena_FRM();
		ki.pronadjiKomitenta(this, ik, JMBG_jTextField);
	}

	/**
	 * This method initializes brisanje_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBrisanje_jButton() {
		if (brisanje_jButton == null) {
			brisanje_jButton = new JButton();
			brisanje_jButton.setBounds(new Rectangle(271, 93, 169, 27));
			brisanje_jButton.setForeground(Color.black);
			brisanje_jButton.setText("BRISANJE KOMINTENTA");
			brisanje_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					mouseClc(e);
				}
			});
		}
		return brisanje_jButton;
	}
	private void mouseClc(java.awt.event.MouseEvent e){
		if(this.JMBG_jTextField.getText().equals("")){
			JOptionPane.showMessageDialog(this, "Uneti JMBG!", "Greska", JOptionPane.ERROR_MESSAGE);
			return;
		}
		KontrolerKI ki = new KontrolerKI();
		ki.pronadjiKomitenta(this);
	}
	/**
	 * This method initializes JMBG_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getJMBG_jTextField() {
		if (JMBG_jTextField == null) {
			JMBG_jTextField = new JTextField();
			JMBG_jTextField.setBounds(new Rectangle(57, 68, 175, 20));
		}
		return JMBG_jTextField;
	}

}  //  @jve:decl-index=0:visual-constraint="30,93"
