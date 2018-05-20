package proiektua;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.awt.Font;
import java.awt.Color;


public class MenuNagusiaErab extends JFrame{

	private JPanel contentPane;
	private PuntuazioInterfazea puntuazioInterfazea;
	private String email;
	
	public MenuNagusiaErab() {
		setTitle("            MENU ERABILTZAILEA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 689, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("JOLASTU");
		btnNewButton.setBackground(new Color(204, 255, 204));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
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
		
		JButton btnJolastu = new JButton("JOKALARI ONENAK");
		btnJolastu.setBackground(new Color(204, 255, 255));
		btnJolastu.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnJolastu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {	
					puntuazioInterfazea= new PuntuazioInterfazea();
					puntuazioInterfazea.displayJokalariOnenak(Mysql.getMysql().jokalariOnenak());
					puntuazioInterfazea.setVisible(true);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(btnJolastu);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnPartidaOnenak = new JButton("PARTIDA ONENAK");
		btnPartidaOnenak.setBackground(new Color(204, 255, 255));
		btnPartidaOnenak.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(btnPartidaOnenak);
		btnPartidaOnenak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					puntuazioInterfazea= new PuntuazioInterfazea();
					puntuazioInterfazea.displayPartidaOnenak(Mysql.getMysql().partidaOnenak());
					puntuazioInterfazea.setVisible(true);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnEgunekoPuntuazioOnenak = new JButton("EGUNEKO PUNTUAZIO ONENAK");
		btnEgunekoPuntuazioOnenak.setBackground(new Color(204, 255, 255));
		btnEgunekoPuntuazioOnenak.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_3.add(btnEgunekoPuntuazioOnenak);
		btnEgunekoPuntuazioOnenak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					puntuazioInterfazea= new PuntuazioInterfazea();
					puntuazioInterfazea.displayGaurkoPartidaOnenak(Mysql.getMysql().gaurkoPartidaOnenak());
					puntuazioInterfazea.setVisible(true);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JButton btnBetikoPuntuazioOnenak = new JButton("BETIKO PUNTUAZIO ONENAK");
		btnBetikoPuntuazioOnenak.setBackground(new Color(204, 255, 255));
		btnBetikoPuntuazioOnenak.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBetikoPuntuazioOnenak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					puntuazioInterfazea= new PuntuazioInterfazea();
					puntuazioInterfazea.displayPuntuazioOnenak(Mysql.getMysql().puntuazioOnenak());
					puntuazioInterfazea.setVisible(true);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		panel_4.add(btnBetikoPuntuazioOnenak);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnIrten = new JButton("IRTEN");
		btnIrten.setBackground(new Color(255, 153, 153));
		btnIrten.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuLogin menua = new MenuLogin();
				menua.setVisible(true);
				leihoaItxi();
			}
		});
		panel_5.add(btnIrten);
		
		
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
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
}
