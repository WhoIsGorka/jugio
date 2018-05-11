package proiektua;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuLogin extends JFrame {

	private JPanel contentPane;

	private Login login = new Login();

	public MenuLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				leihoaItxi();
				login.setVisible(true);
				
				
			}
		});
		panel_1.setLayout(new GridLayout(3, 0, 0, 0));
		panel_1.add(btnLogin);
		
	
		
		
		
		JButton btnErregistratu = new JButton("Erregistratu");
		btnErregistratu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnErregistratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				leihoaItxi();
				Erregistratu frame1 = new Erregistratu();
				frame1.setVisible(true);
				
				
			}
		});
		panel_1.add(btnErregistratu);
		

		
		JButton btnIrten = new JButton("Irten");
		btnIrten.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panel_1.add(btnIrten);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton fotoBarDiegal = new JButton("");
		fotoBarDiegal.setBackground(new Color(255, 255, 255));
		fotoBarDiegal.setBounds(10, 11, 200, 200);
		fotoBarDiegal.setIcon(resizeIcon(new ImageIcon(getClass().getResource("barDiegal.PNG")),fotoBarDiegal.getWidth(),fotoBarDiegal.getHeight()));
		panel_2.add(fotoBarDiegal);
	}

	public void leihoaItxi(){
		this.dispose();
	}
	private Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
		 Image img = icon.getImage();
		 Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_DEFAULT);  
		 return new ImageIcon(resizedImage);
	}
	public static void main(String[] args) {
		MenuLogin frame = new MenuLogin();
		frame.setVisible(true);
	}
}
