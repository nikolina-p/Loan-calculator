package Interface;

//import java.awt.event.KeyEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.Event;
//import java.awt.BorderLayout;
//import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
//import javax.swing.KeyStroke;
//import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JMenuItem;
//import javax.swing.JMenuBar;
//import javax.swing.JMenu;
import javax.swing.JFrame;
//import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Dimension;


public class KreditnoPoslovanje_FRM {

	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="16,188"
	private JPanel jContentPane = null;
	//private JDialog aboutDialog = null;  //  @jve:decl-index=0:visual-constraint="568,131"
	//private JPanel aboutContentPane = null;
	//private JLabel aboutVersionLabel = null;
	private JButton fizickaLica_jButton = null;
	private JButton komitenti_jButton = null;
	private JButton odobravanje_jButton = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	/**
	 * This method initializes jFrame
	 * 
	 * @return javax.swing.JFrame
	 */
	public JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
			jFrame.setResizable(false);
			jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loptaVelika.JPG")));
			jFrame.setForeground(new Color(204, 0, 0));
			jFrame.setBounds(new Rectangle(150, 150, 514, 321));
			jFrame.setContentPane(getJContentPane());
			jFrame.setTitle("ProCredit Bank");
		}
		return jFrame;
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(138, 93, 202, 51));
			jLabel1.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
			jLabel1.setIcon(new ImageIcon(getClass().getResource("/logo-s.gif")));
			jLabel1.setText("");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(132, 75, 220, 16));
			jLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));
			jLabel.setForeground(new Color(217, 8, 8));
			jLabel.setText("Dobro dosli u kreditni sektor");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
			jContentPane.setBackground(Color.white);
			jContentPane.setForeground(new Color(204, 0, 0));
			jContentPane.add(getFizickaLica_jButton(), null);
			jContentPane.add(getKomitenti_jButton(), null);
			jContentPane.add(getOdobravanje_jButton(), null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
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
	 * This method initializes fizickaLica_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getFizickaLica_jButton() {
		if (fizickaLica_jButton == null) {
			fizickaLica_jButton = new JButton();
			fizickaLica_jButton.setBounds(new Rectangle(180, 232, 148, 24));
			fizickaLica_jButton.setFont(new Font("Dialog", Font.BOLD, 18));
			fizickaLica_jButton.setText("Kalkulator");
			fizickaLica_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					fl_MouseClicked(e);
					//getJFrame().setVisible(false);
				}
			});
		}
		return fizickaLica_jButton;
	}
	
	public void fl_MouseClicked(java.awt.event.MouseEvent e){
		Provera_FRM p = new Provera_FRM();
		p.setVisible(true);
		//p.setSize(new Dimension(123, 35));
		
	}

	/**
	 * This method initializes komitenti_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getKomitenti_jButton() {
		if (komitenti_jButton == null) {
			komitenti_jButton = new JButton();
			komitenti_jButton.setBounds(new Rectangle(27, 232, 148, 24));
			komitenti_jButton.setFont(new Font("Dialog", Font.BOLD, 18));
			komitenti_jButton.setText("Komintenti");
			komitenti_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					komitentiBtn_mouseClicked(e);
				}
			});
		}
		return komitenti_jButton;
	}
	private void komitentiBtn_mouseClicked(java.awt.event.MouseEvent e){
		Komintent_FRM kf = new Komintent_FRM();
		kf.setVisible(true);
		
	}

	/**
	 * This method initializes odobravanje_jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOdobravanje_jButton() {
		if (odobravanje_jButton == null) {
			odobravanje_jButton = new JButton();
			odobravanje_jButton.setBounds(new Rectangle(333, 232, 148, 24));
			odobravanje_jButton.setFont(new Font("Dialog", Font.BOLD, 18));
			odobravanje_jButton.setText("Odobravanje");
			odobravanje_jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					mouseClicked3(e);
				}
			});
		}
		return odobravanje_jButton;
	}
	private void mouseClicked3(java.awt.event.MouseEvent e){
		ZahtevID_FRM z = new ZahtevID_FRM();
		z.setVisible(true);
		//z.setSize(new Dimension(131, 35));
		z.setSize(new Dimension(285, 194));
	}
	/**
	 * Launches this application
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				KreditnoPoslovanje_FRM application = new KreditnoPoslovanje_FRM();
				application.getJFrame().setVisible(true);
			}
		});
	}

}
