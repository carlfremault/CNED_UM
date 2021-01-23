package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private JTextField txtIP;

	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setResizable(false);
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea lblStartAServer = new JTextArea();
		lblStartAServer.setFont(new Font("Arial", Font.PLAIN, 15));
		lblStartAServer.setBackground(new Color(240, 240, 240));
		lblStartAServer.setText("Start a server :");
		lblStartAServer.setBounds(10, 11, 179, 22);
		contentPane.add(lblStartAServer);
		
		JTextArea lblConnectToAn = new JTextArea();
		lblConnectToAn.setText("Connect to an existing server :");
		lblConnectToAn.setFont(new Font("Arial", Font.PLAIN, 15));
		lblConnectToAn.setBackground(SystemColor.menu);
		lblConnectToAn.setBounds(10, 44, 209, 22);
		contentPane.add(lblConnectToAn);
		
		JTextArea lblIpServer = new JTextArea();
		lblIpServer.setText("IP Server :");
		lblIpServer.setFont(new Font("Arial", Font.PLAIN, 15));
		lblIpServer.setBackground(SystemColor.menu);
		lblIpServer.setBounds(10, 77, 76, 22);
		contentPane.add(lblIpServer);
		
		txtIP = new JTextField();
		txtIP.setFont(new Font("Arial", Font.PLAIN, 15));
		txtIP.setText("127.0.0.1");
		txtIP.setBounds(84, 72, 126, 32);
		contentPane.add(txtIP);
		txtIP.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_clic();
			}
		});
		btnStart.setFont(new Font("Arial", Font.PLAIN, 15));
		btnStart.setBounds(228, 11, 109, 23);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_clic();
			}
		});
		btnConnect.setFont(new Font("Arial", Font.PLAIN, 15));
		btnConnect.setBounds(228, 77, 109, 23);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_clic();
			}
		});
		btnExit.setFont(new Font("Arial", Font.PLAIN, 15));
		btnExit.setBounds(228, 128, 109, 23);
		contentPane.add(btnExit);
	}
	
	private void btnStart_clic() {
		(new Arene()).setVisible(true);
		this.dispose();
	}
	
	private void btnConnect_clic() {
		(new ChoixJoueur()).setVisible(true);
		this.dispose();
	}
	
	private void btnExit_clic() {
		System.exit(0);
	}
}
