package Interface;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JButton;

import Kontroleri.KontrolerKI;
import Rezultat.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
public class ZahtevID_FRM extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JTextField zahtevID_jTextField = null;
	private JButton ok_jButton = null;
	private JLabel logojLabel1 = null;

	/**
	 * This is the default constructor
	 */
	public ZahtevID_FRM() {
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
		this.setBounds(new Rectangle(220, 220, 286, 214));
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
			logojLabel1.setBounds(new Rectangle(130, 2, 146, 182));
			logojLabel1.setIcon(new ImageIcon(getClass().getResource("/loptaMala.jpg")));
			logojLabel1.setText("");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(83, 46, 117, 16));
			jLabel.setText("Unesite ID zahteva");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabel, null);
			jContentPane.add(getZahtevID_jTextField(), null);
			jContentPane.add(getOk_jButton(), null);
			jContentPane.add(logojLabel1, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes zahtevID_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getZahtevID_jTextField() {
		if (zahtevID_jTextField == null) {
			zahtevID_jTextField = new JTextField();
			zahtevID_jTextField.setBounds(new Rectangle(77, 77, 130, 20));
		}
		return zahtevID_jTextField;
	}

	/**
	 * This method initializes ok_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOk_jButton() {
		if (ok_jButton == null) {
			ok_jButton = new JButton();
			ok_jButton.setBounds(new Rectangle(107, 118, 68, 20));
			ok_jButton.setText("OK");
			ok_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					mouseCl(e);
				}
			});
		}
		return ok_jButton;
	}
	private void mouseCl(java.awt.event.MouseEvent e){
		KontrolerKI ki = new KontrolerKI();
		String ids = zahtevID_jTextField.getText();
		if(ids.equals("")){ 
			JOptionPane.showMessageDialog(this, "Obavezan unos : zahtevID","GRESKA", JOptionPane.ERROR_MESSAGE);
			zahtevID_jTextField.setText("");
			return;
		}
		int id = 0;
		try{
			id = Integer.parseInt(ids);
		}catch(NumberFormatException n){
			JOptionPane.showMessageDialog(this, "Niste uneli broj","GRESKA", JOptionPane.ERROR_MESSAGE);
			zahtevID_jTextField.setText("");
			return;
		}
			
		Rezultat r = ki.pronadjiZahtev(id);
		if(r.isOk()){
			//JOptionPane.showMessageDialog(this, "Transakcija uspesna", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
			this.setVisible(false);
		}else{
			JOptionPane.showMessageDialog(this, r.getPoruka(), "Greska", JOptionPane.ERROR_MESSAGE);
			zahtevID_jTextField.setText("");
		}
	}
}  //  @jve:decl-index=0:visual-constraint="51,35"
