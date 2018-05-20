package proiektua;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MenuNagusiaAdmin extends JFrame{

	private JPanel contentPane;
	private String email;
	private PuntuazioInterfazea puntuazioInterfazea;
	private JComboBox jComboBox1;
	private JFrame frame;
	
	public MenuNagusiaAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 500, 500);
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
		
		JButton btnJolastu = new JButton("JOKALARI ONENAK");
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
		
		JButton btnEgunekoPuntuazioOnenak = new JButton("GAURKO PUNTUAZIO ONENAK");
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
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnBaimenakEman = new JButton("BAIMENAK EMAN");
		panel_5.add(btnBaimenakEman);
		btnBaimenakEman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel elementuak = new DefaultComboBoxModel ();
				JPanel jPanel1 = new JPanel();
				ResultSet rs;
				try {
					rs = Mysql.getMysql().getJokalariak("Erabiltzaile");
					while(rs.next()){
						elementuak.addElement(rs.getString("Email"));
					}
					jComboBox1 = new JComboBox(elementuak);
					jPanel1.add(jComboBox1, null);
					
					frame = new JFrame();
					frame.getContentPane().add(jPanel1, null);
					
					JButton btnAdos = new JButton("ADOS");
					btnAdos.setFont(new Font("Tahoma", Font.PLAIN, 18));
					
					btnAdos.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0) {
							String pEmail=(String)jComboBox1.getSelectedItem();
							try {
								Mysql.getMysql().baimenakEman(pEmail);
								frame.dispose();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
					});
					jPanel1.add(btnAdos);
					JButton btnAtzera = new JButton("ATZERA");
					btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 18));
					btnAtzera.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0) {
							frame.dispose();
						}
					});
					
					jPanel1.add(btnAtzera);
					frame.setBounds(500, 200, 200, 150);
					frame.setVisible(true);
	
					
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		
		JButton btnNewButton_1 = new JButton("BAIMENAK KENDU");
		btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DefaultComboBoxModel elementuak = new DefaultComboBoxModel ();
			JPanel jPanel1 = new JPanel();
			ResultSet rs;
			try {
				rs = Mysql.getMysql().getJokalariak("Administratzaile");
				while(rs.next()){
					elementuak.addElement(rs.getString("Email"));
				}
				jComboBox1 = new JComboBox(elementuak);
				jPanel1.add(jComboBox1, null);
				
				frame = new JFrame();
				frame.getContentPane().add(jPanel1, null);
				
				JButton btnAdos = new JButton("ADOS");
				btnAdos.setFont(new Font("Tahoma", Font.PLAIN, 18));
				
				btnAdos.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						String pEmail=(String)jComboBox1.getSelectedItem();
						try {
							Mysql.getMysql().baimenakKendu(pEmail);
							frame.dispose();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				});
				jPanel1.add(btnAdos);
				
				JButton btnAtzera = new JButton("ATZERA");
				btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 18));
				btnAtzera.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0) {
						frame.dispose();
					}
				});
				
				jPanel1.add(btnAtzera);
				frame.setBounds(500, 200, 200, 150);
				frame.setVisible(true);

				
				
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	});
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		panel_6.add(btnNewButton_1);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnAnimaliakSartu = new JButton("ANIMALIAK SARTU");
		panel_7.add(btnAnimaliakSartu);
		btnAnimaliakSartu.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			AnimaliakSartu as = new AnimaliakSartu();
			as.setVisible(true);
		}
	});
		
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
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
}
