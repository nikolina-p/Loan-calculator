package Interface;
import Rezultat.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JButton;

import Kontroleri.KontrolerKI;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Provera_FRM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JTextField jmbg_jTextField = null;
	private JButton ok_jButton = null;
	private JLabel logojLabel1 = null;

	/**	 * This is the default constructor
	 */
	public Provera_FRM() {
		super();
		initialize();
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setBounds(200, 100, 300, 200);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loptaVelika.JPG")));
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("ProCredit Bank");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			logojLabel1 = new JLabel();
			logojLabel1.setBounds(new Rectangle(27, 4, 229, 161));
			logojLabel1.setIcon(new ImageIcon(getClass().getResource("/loptaMala.jpg")));
			logojLabel1.setText("");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(70, 31, 152, 16));
			jLabel.setText("Unesite JMBG komintenta");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJmbg_jTextField(), null);
			jContentPane.add(getOk_jButton(), null);
			jContentPane.add(logojLabel1, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jmbg_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJmbg_jTextField() {
		if (jmbg_jTextField == null) {
			jmbg_jTextField = new JTextField();
			jmbg_jTextField.setBounds(new Rectangle(56, 64, 176, 20));
		}
		return jmbg_jTextField;
	}

	/**
	 * This method initializes ok_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOk_jButton() {
		if (ok_jButton == null) {
			ok_jButton = new JButton();
			ok_jButton.setBounds(new Rectangle(108, 115, 65, 21));
			ok_jButton.setText("OK");
			ok_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					
					mouseCLC(e);
				}
			});
		}
		return ok_jButton;
	}
	
	private void mouseCLC(java.awt.event.MouseEvent e){
		String s = jmbg_jTextField.getText();
		KontrolerKI ki = new KontrolerKI();
		Rezultat r = ki.pronadjiKomitenta(this, s);
		
		if(!r.isOk()){
			JOptionPane.showMessageDialog(this, r.getPoruka(), "GRESKA", JOptionPane.ERROR_MESSAGE);
		
		}
	}
	

}  //  @jve:decl-index=0:visual-constraint="61,41"
