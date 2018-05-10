package proiektua;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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



public class Erregistratu extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblIzena;
	private JTextField textField;
	private JLabel lblPasahitza;
	private JLabel lblJaiotzedata;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	
	public Erregistratu() {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 403, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(7,0,0,0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblIzena_1 = new JLabel("IZENA:");
		lblIzena_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblIzena_1);
		
		textField_4 = new JTextField();
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblAbizena = new JLabel("ABIZENA:");
		lblAbizena.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblAbizena);
		
		textField_5 = new JTextField();
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblPasahitza_1 = new JLabel("PASAHITZA:");
		lblPasahitza_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblPasahitza_1);
		
		textField_6 = new JTextField();
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblJaiotzedata_1 = new JLabel("JAIOTZE-DATA:");
		lblJaiotzedata_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblJaiotzedata_1);
		
		textField_7 = new JTextField();
		panel_4.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblEmail);
		
		textField_10 = new JTextField();
		panel_5.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JRadioButton rdbtnErabiltzaile = new JRadioButton("ERABILTZAILE");
		rdbtnErabiltzaile.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(rdbtnErabiltzaile);
		
		JRadioButton rdbtnAdministratzaile = new JRadioButton("ADMINISTRATZAILE");
		rdbtnAdministratzaile.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(rdbtnAdministratzaile);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnAtzera = new JButton("ATZERA");
		panel_7.add(btnAtzera);
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				leihoaItxi();
				MenuLogin frame1 = new MenuLogin();
				frame1.setVisible(true);
			}
		});
		
		JButton btnErregistratu = new JButton("ERREGISTRATU");
		panel_7.add(btnErregistratu);
		
	
		
	}
	public void leihoaItxi(){
		this.dispose();
	}
	
}
