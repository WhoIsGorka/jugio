package proiektua;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;

import javax.swing.ButtonGroup;
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
	private JTextField izenaSartu;
	private JTextField abizenaSartu;
	private JTextField pasahitzaSartu;
	private JTextField dataSartu;
	private JTextField emailSartu;
	private String izena;
	private String abizena;
	private String email;
	private String pasahitza;
	private String jaiotzeData;
	
	private MenuLogin mn = new MenuLogin();
	
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
		
		izenaSartu = new JTextField();
		panel_1.add(izenaSartu);
		izenaSartu.setColumns(10);
		izena=izenaSartu.getText();
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblAbizena = new JLabel("ABIZENA:");
		lblAbizena.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblAbizena);
		
		abizenaSartu = new JTextField();
		panel_2.add(abizenaSartu);
		abizenaSartu.setColumns(10);
		abizena=abizenaSartu.getText();
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblPasahitza_1 = new JLabel("PASAHITZA:");
		lblPasahitza_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblPasahitza_1);
		
		pasahitzaSartu = new JTextField();
		panel_3.add(pasahitzaSartu);
		pasahitzaSartu.setColumns(10);
		pasahitza=pasahitzaSartu.getText();
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblJaiotzedata_1 = new JLabel("JAIOTZE-DATA:");
		lblJaiotzedata_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblJaiotzedata_1);
		
		dataSartu = new JTextField();
		panel_4.add(dataSartu);
		dataSartu.setColumns(10);
		jaiotzeData=dataSartu.getText();
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblEmail);
		
		emailSartu = new JTextField();
		panel_5.add(emailSartu);
		emailSartu.setColumns(10);
		email=emailSartu.getText();
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		final JRadioButton rdbtnErabiltzaile = new JRadioButton("ERABILTZAILE");
		rdbtnErabiltzaile.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(rdbtnErabiltzaile);
		
		final JRadioButton rdbtnAdministratzaile = new JRadioButton("ADMINISTRATZAILE");
		rdbtnAdministratzaile.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(rdbtnAdministratzaile);
		
		rdbtnErabiltzaile.setSelected(true);
		rdbtnAdministratzaile.setSelected(false);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnErabiltzaile);
		group.add(rdbtnAdministratzaile);
		
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
		btnErregistratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				izena=izenaSartu.getText();
				abizena=abizenaSartu.getText();
				email=emailSartu.getText();
				pasahitza=pasahitzaSartu.getText();
				jaiotzeData=dataSartu.getText();
				if((izena.equals("") || abizena.equals("") || email.equals("") || jaiotzeData.equals("") || pasahitza.equals(""))){
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame,"Zerbait ez dozu idatzi. Errepikatu, mesedez.");
					
				}
				else{
					java.util.Date todayDate = Calendar.getInstance().getTime();
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
					String erregistroData = formatter.format(todayDate);
					String mota=("");
					if (rdbtnAdministratzaile.isSelected()){
						mota= ("Administratzaile");
					}
					else if(rdbtnErabiltzaile.isSelected()){
						mota=("Erabiltzaile");					
					}
					try {
						Mysql.getMysql().erregistratuJokalari(izena, abizena, email, pasahitza, jaiotzeData, erregistroData, mota);
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					leihoaItxi();
					mn.setVisible(true);
				}
					
			}
		});
	
	}
	public void leihoaItxi(){
		this.dispose();
	}
	
	
}
