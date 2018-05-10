package proiektua;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

import java.awt.TextField;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

import java.awt.Color;

public class Login extends JFrame {
	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textPasahitza;
	
	private String email;
	private String pasahitza; 
	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 353, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3,0,0,0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblEmail);
		
		textEmail = new JTextField();
		panel_1.add(textEmail);
		textEmail.setColumns(10);
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblPasahitza = new JLabel("PASAHITZA:");
		lblPasahitza.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblPasahitza);
		
		textPasahitza = new JTextField();
		panel_2.add(textPasahitza);
		textPasahitza.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnAtzera = new JButton("ATZERA");
		panel_3.add(btnAtzera);
		btnAtzera.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			leihoaItxi();
			MenuLogin frame1 = new MenuLogin();
			frame1.setVisible(true);
			
			
		}
	});
		
		JButton btnLogin = new JButton("LOGIN");
		panel_3.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				email=textEmail.getText();
				pasahitza=textPasahitza.getText();
				if((email.equals("") || pasahitza.equals("") )){
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,"Zerbait ez dozu idatzi. Errepikatu, mesedez.");
					
				}else {

					try {
						if(Mysql.getMysql().erabiltzaileEdoAdmin(email).equals("EZ")) {
							JFrame frame = new JFrame();
							JOptionPane.showMessageDialog(frame,"Email-a ez dago logeatuta.");
						}else if(Mysql.getMysql().pasahitzaEgokia(email, pasahitza)) {
							leihoaItxi();
							JFrame frame = new JFrame();
							System.out.println("logged");
							if(Mysql.getMysql().erabiltzaileEdoAdmin(email).equals("Erabiltzaile")) {
								leihoaItxi();
								MenuNagusiaErab mn = new MenuNagusiaErab();
								mn.setVisible(true);
							}else if(Mysql.getMysql().erabiltzaileEdoAdmin(email).equals("Administratzaile")) {
								leihoaItxi();
								MenuNagusiaAdmin mn = new MenuNagusiaAdmin();
								mn.setVisible(true);
							}
						}
						else if((Mysql.getMysql().pasahitzaEgokia(email, pasahitza)==false)){
							JFrame frame = new JFrame();
							JOptionPane.showMessageDialog(frame,"Pasahitza txarto idatzi dozu!.");
						}
							
					}
					
				  catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
				}
				
			}
		});
	}

	public void leihoaItxi(){
		this.dispose();
	}

}
