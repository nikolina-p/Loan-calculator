package Interface;

//import java.awt.event.KeyEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.Event;
//import javax.swing.KeyStroke;
//import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JMenuItem;
//import javax.swing.JMenuBar;
//import javax.swing.JMenu;
import javax.swing.JFrame;
//import javax.swing.JDialog;
import javax.swing.WindowConstants;

//import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Izvestaj_FRM {

	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="36,8"
	private JPanel jContentPane = null;
	//private JDialog aboutDialog = null;  //  @jve:decl-index=0:visual-constraint="608,347"
	//private JPanel aboutContentPane = null;
	private JPanel kredit_jPanel = null;
	private JLabel labela1_jLabel = null;
	private JPanel kljucniNedostaci_jPanel = null;
	private JTextArea kljucniNedostaci_jTextArea = null;
	private JPanel Komentari_jPanel = null;
	private JTextArea komentari_jTextArea = null;
	private JTextArea jTextArea = null;
	private JLabel zahID_jLabel = null;
	private JLabel ID_jLabel = null;
	private JTextField ID_jTextField = null;
	private JScrollPane stanje_jScrollPane = null;
	private JScrollPane ogranicavajuci_jScrollPane = null;
	private JScrollPane komentari_jScrollPane = null;
	private JLabel logojLabel = null;
	private JLabel logo1jLabel = null;
	public JLabel stanjeKredita_jLabel = null;
	/**
	 * This method initializes jFrame
	 * 
	 * @return javax.swing.JFrame
	 */
	public JFrame getJFrame() {
		if (jFrame == null) { 
			jFrame = new JFrame();
			jFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			jFrame.setResizable(false);
			jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loptaVelika.JPG")));
			jFrame.setBounds(new Rectangle(250, 150, 535, 659));
			jFrame.setContentPane(getJContentPane());
			jFrame.setTitle("Izvestaj");
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
			logo1jLabel = new JLabel();
			logo1jLabel.setBounds(new Rectangle(185, 343, 331, 283));
			logo1jLabel.setIcon(new ImageIcon(getClass().getResource("/loptaOriginal1.jpg")));
			logo1jLabel.setText("");
			logojLabel = new JLabel();
			logojLabel.setBounds(new Rectangle(6, 3, 341, 300));
			logojLabel.setIcon(new ImageIcon(getClass().getResource("/loptaOriginal3.jpg")));
			logojLabel.setText("");
			zahID_jLabel = new JLabel();
			zahID_jLabel.setBounds(new Rectangle(15, 29, 92, 16));
			zahID_jLabel.setText("Zahtev ID ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(getKredit_jPanel(), null);
			jContentPane.add(getKljucniNedostaci_jPanel(), null);
			jContentPane.add(getKomentari_jPanel(), null);
			jContentPane.add(zahID_jLabel, null);
			//jContentPane.add(ID_jLabel, null);
			jContentPane.add(getID_jTextField(), null);
			jContentPane.add(logojLabel, null);
			jContentPane.add(logo1jLabel, null);
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
			aboutDialog.setSize(new Dimension(185, 112));
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
			aboutContentPane.setLayout(null);
		}
		return aboutContentPane;
	}*/

	/**
	 * This method initializes kredit_jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getKredit_jPanel() {
		if (kredit_jPanel == null) {
			
			labela1_jLabel = new JLabel();
			labela1_jLabel.setText("Stanje kredita");
			labela1_jLabel.setBounds(new Rectangle(14, 9, 100, 16));
			kredit_jPanel = new JPanel();
			kredit_jPanel.setLayout(null);
			kredit_jPanel.setBounds(new Rectangle(14, 66, 496, 155));
			kredit_jPanel.setBackground(Color.white);
			kredit_jPanel.add(labela1_jLabel, null);
			kredit_jPanel.add(getStanjeKredita_jLabel(), null);
			kredit_jPanel.add(getStanje_jScrollPane(), null);
			//kredit_jPanel.add(getStanjeKredita_jLabel(), null);
		}
		return kredit_jPanel;
	}

	/**
	 * This method initializes kljucniNedostaci_jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getKljucniNedostaci_jPanel() {
		if (kljucniNedostaci_jPanel == null) {
			kljucniNedostaci_jPanel = new JPanel();
			kljucniNedostaci_jPanel.setLayout(null);
			kljucniNedostaci_jPanel.setBounds(new Rectangle(15, 240, 495, 168));
			kljucniNedostaci_jPanel.setBorder(BorderFactory.createTitledBorder(null, "Ogranicavajuci uslovi", TitledBorder.CENTER, TitledBorder.TOP, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			kljucniNedostaci_jPanel.setBackground(Color.white);
			kljucniNedostaci_jPanel.add(getOgranicavajuci_jScrollPane(), null);
		}
		return kljucniNedostaci_jPanel;
	}

	/**
	 * This method initializes kljucniNedostaci_jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	public JTextArea getKljucniNedostaci_jTextArea() {
		if (kljucniNedostaci_jTextArea == null) {
			kljucniNedostaci_jTextArea = new JTextArea();
			kljucniNedostaci_jTextArea.setLineWrap(true);
		}
		return kljucniNedostaci_jTextArea;
	}
	
	public JLabel getStanjeKredita_jLabel() {
		if (stanjeKredita_jLabel == null) {
			stanjeKredita_jLabel = new JLabel();
			stanjeKredita_jLabel.setBounds(new Rectangle(125, 9, 120, 14));
			
		}
		return stanjeKredita_jLabel;
	}

	/**
	 * This method initializes Komentari_jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getKomentari_jPanel() {
		if (Komentari_jPanel == null) {
			Komentari_jPanel = new JPanel();
			Komentari_jPanel.setLayout(null);
			Komentari_jPanel.setBounds(new Rectangle(15, 427, 495, 159));
			Komentari_jPanel.setBorder(BorderFactory.createTitledBorder(null, "Komentari", TitledBorder.CENTER, TitledBorder.TOP, new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			Komentari_jPanel.setBackground(Color.white);
			Komentari_jPanel.add(getKomentari_jScrollPane(), null);
		}
		return Komentari_jPanel;
	}

	/**
	 * This method initializes komentari_jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	public JTextArea getKomentari_jTextArea() {
		if (komentari_jTextArea == null) {
			komentari_jTextArea = new JTextArea();
		}
		return komentari_jTextArea;
	}

	public JLabel getLabela1_jLabel() {
		return labela1_jLabel;
	}

	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	public JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
		}
		return jTextArea;
	}

	public JLabel getID_jLabel() {
		return ID_jLabel;
	}

	public void setID_jLabel(JLabel label) {
		
		ID_jLabel.setBounds(new Rectangle(303, 13, 45, 32));
	}

	/**
	 * This method initializes ID_jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	public JTextField getID_jTextField() {
		if (ID_jTextField == null) {
			ID_jTextField = new JTextField();
			ID_jTextField.setBounds(new Rectangle(115, 29, 62, 16));
		}
		return ID_jTextField;
	}

	/**
	 * This method initializes stanje_jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	public JScrollPane getStanje_jScrollPane() {
		if (stanje_jScrollPane == null) {
			stanje_jScrollPane = new JScrollPane();
			stanje_jScrollPane.setBounds(new Rectangle(15, 31, 467, 113));
			stanje_jScrollPane.setViewportView(getJTextArea());
		}
		return stanje_jScrollPane;
	}

	/**
	 * This method initializes ogranicavajuci_jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getOgranicavajuci_jScrollPane() {
		if (ogranicavajuci_jScrollPane == null) {
			ogranicavajuci_jScrollPane = new JScrollPane();
			ogranicavajuci_jScrollPane.setBounds(new Rectangle(14, 22, 460, 126));
			ogranicavajuci_jScrollPane.setViewportView(getKljucniNedostaci_jTextArea());
		}
		return ogranicavajuci_jScrollPane;
	}

	/**
	 * This method initializes komentari_jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getKomentari_jScrollPane() {
		if (komentari_jScrollPane == null) {
			komentari_jScrollPane = new JScrollPane();
			komentari_jScrollPane.setBounds(new Rectangle(15, 18, 467, 126));
			komentari_jScrollPane.setViewportView(getKomentari_jTextArea());
		}
		return komentari_jScrollPane;
	}

}
