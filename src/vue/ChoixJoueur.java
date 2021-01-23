package vue;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
//import java.awt.BorderLayout;
import java.awt.Dimension;
//import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.border.EmptyBorder;

public class ChoixJoueur extends JFrame {

	private JPanel contentPane;
	private JTextField txtPseudo;

	/**
	 * Clic sur la flèche "précédent" pour afficher le personnage précédent
	 */
	private void lblPrecedent_clic() {
		System.out.println("Clic sur precedent");
	}
	
	/**
	 * Clic sur la flèche "suivant" pour afficher le personnage suivant
	 */
	private void lblSuivant_clic() {
		System.out.println("Clic sur suivant");
	}
	
	/**
	 * Clic sur GO pour envoyer les informations
	 */
	private void lblGo_clic() {
		(new Arene()).setVisible(true);
		this.dispose();
	}
	/**
	 * Create the frame.
	 */
	
	public ChoixJoueur() {
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		this.setResizable(false);
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JLabel lblPrecedent = new JLabel("");
		lblPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblPrecedent_clic();
			}
		});
		
		JLabel lblSuivant = new JLabel("");
		lblSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblSuivant_clic();
			}
		});
		
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblGo_clic();
			}
		});
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(142, 245, 120, 20);
		contentPane.add(txtPseudo);
		txtPseudo.setColumns(10);
		
		lblGo.setBounds(311, 202, 65, 61);
		contentPane.add(lblGo);
		lblSuivant.setBounds(301, 145, 25, 46);
		contentPane.add(lblSuivant);
		lblPrecedent.setBounds(65, 146, 31, 45);
		contentPane.add(lblPrecedent);
		
		String chemin = "fonds/fondchoix.jpg";
		URL resource = getClass().getClassLoader().getResource(chemin);
		JLabel lblFond = new JLabel("");
		lblFond.setBounds(0, 0, 400, 275);
		lblFond.setIcon(new ImageIcon(resource));
		contentPane.add(lblFond);
		
		// positionnement sur la zone de saisie
		txtPseudo.requestFocus();
	}

}
