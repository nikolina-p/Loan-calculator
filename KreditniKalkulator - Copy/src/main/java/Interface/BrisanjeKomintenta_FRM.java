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

public class BrisanjeKomintenta_FRM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jmbg_jLabel1 = null;
	private JLabel jLabel1 = null;
	private JLabel imePrezime_jLabel2 = null;
	private JButton ok_jButton = null;
	private JButton ne_jButton = null;
	private JLabel logojLabel2 = null;
	/**
	 * This is the default constructor
	 */
	public BrisanjeKomintenta_FRM() {
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
		this.setBounds(new Rectangle(220, 220, 349, 228));
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Brisanje komintenta");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			logojLabel2 = new JLabel();
			logojLabel2.setBounds(new Rectangle(4, 4, 334, 190));
			logojLabel2.setIcon(new ImageIcon(getClass().getResource("/loptaOriginal3.jpg")));
			logojLabel2.setText("");
			imePrezime_jLabel2 = new JLabel();
			imePrezime_jLabel2.setBounds(new Rectangle(154, 66, 167, 16));
			imePrezime_jLabel2.setText("");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(45, 66, 103, 16));
			jLabel1.setText("Ime i prezime.........");
			jmbg_jLabel1 = new JLabel();
			jmbg_jLabel1.setBounds(new Rectangle(154, 36, 169, 16));
			jmbg_jLabel1.setText("");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(46, 36, 103, 16));
			jLabel.setText("JMBG........................");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabel, null);
			jContentPane.add(jmbg_jLabel1, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(imePrezime_jLabel2, null);
			jContentPane.add(getOk_jButton(), null);
			jContentPane.add(getNe_jButton(), null);
			jContentPane.add(logojLabel2, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes ok_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOk_jButton() {
		if (ok_jButton == null) {
			ok_jButton = new JButton();
			ok_jButton.setBounds(new Rectangle(183, 139, 73, 23));
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
	private void mouseClc(java.awt.event.MouseEvent e){
		KontrolerKI ki = new KontrolerKI();
		ki.brisanjeKomitenta(this);
	}
	/**
	 * This method initializes ne_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNe_jButton() {
		if (ne_jButton == null) {
			ne_jButton = new JButton();
			ne_jButton.setBounds(new Rectangle(60, 139, 87, 23));
			ne_jButton.setText("CANCEL");
			ne_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					mouseClck(e);
				}
			});
		}
		return ne_jButton;
	}
	public void mouseClck(java.awt.event.MouseEvent e){
		this.setVisible(false);
	}
	public JLabel getJmbg_jLabel1() {
		return jmbg_jLabel1;
	}

	public JLabel getImePrezime_jLabel2() {
		return imePrezime_jLabel2;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
