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


public class MenuNagusiaErab extends JFrame{

	private JPanel contentPane;
	private boolean hasi = false;
	
	public MenuNagusiaErab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 512, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 0, 0, 0));
		
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
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnIrten = new JButton("IRTEN");
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		panel_5.add(btnIrten);
		
		
	}
	public void leihoaItxi(){
		this.dispose();
	}
	public void interfazAbiarazi(){
		Tableroa.getTableroa().hasieraketak();
		Interfazea frame = new Interfazea();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
}
