package proiektua;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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


public class MenuNagusiaAdmin extends JFrame{

	private JPanel contentPane;
	private String email;
	
	
	public MenuNagusiaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 500, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(9, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("JOLASTU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				leihoaItxi();
				interfazAbiarazi();
			}
		});
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		panel_1.add(btnNewButton);
	
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton btnJolastu = new JButton("JOKALARIRIK ONENAK");
		btnJolastu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(btnJolastu);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnPartidaOnenak = new JButton("PARTIDA ONENAK");
		panel_2.add(btnPartidaOnenak);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnEgunekoPuntuazioOnenak = new JButton("EGUNEKO PUNTUAZIO ONENAK");
		panel_3.add(btnEgunekoPuntuazioOnenak);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JButton btnBetikoPuntuazioOnenak = new JButton("BETIKO PUNTUAZIO ONENAK");
		btnBetikoPuntuazioOnenak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		panel_4.add(btnBetikoPuntuazioOnenak);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnBaimenakEman = new JButton("BAIMENAK EMAN");
		panel_5.add(btnBaimenakEman);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		
		JButton btnNewButton_1 = new JButton("BAIMENAK KENDU");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		panel_6.add(btnNewButton_1);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnAnimaliakSartu = new JButton("ANIMALIAK SARTU");
		panel_7.add(btnAnimaliakSartu);
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnIrten = new JButton("IRTEN");
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panel_8.add(btnIrten);
		
	}
	public void leihoaItxi(){
		this.dispose();
	}
	public void setEmail(String pEmail){
		this.email = pEmail;
	}
	public void interfazAbiarazi(){
		Tableroa.getTableroa().hasieraketak();
		Tableroa.getTableroa().setEmail(email);
		Interfazea frame = new Interfazea();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
}
