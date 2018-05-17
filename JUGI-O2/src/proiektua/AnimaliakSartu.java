package proiektua;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AnimaliakSartu extends JFrame{
	
	private JPanel contentPane;
	
	private MenuNagusiaAdmin mn = new MenuNagusiaAdmin();
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private JTextField izenaSartu;
	private JTextField zenbakiaSartu;
	private JTextField animaladaSartu;
	private JTextField puntuakSartu;


	
	public AnimaliakSartu(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 403, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5,0,0,0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblIzena = new JLabel("IZENA:");
		lblIzena.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblIzena);
		
		izenaSartu = new JTextField();
		panel_1.add(izenaSartu);
		izenaSartu.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblZenbakia = new JLabel("ZENBAKIA:");
		lblZenbakia.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblZenbakia);
		
		zenbakiaSartu = new JTextField();
		panel_2.add(zenbakiaSartu);
		zenbakiaSartu.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblAnimalada = new JLabel("ANIMALADA:");
		lblAnimalada.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblAnimalada);
		
		animaladaSartu = new JTextField();
		panel_3.add(animaladaSartu);
		animaladaSartu.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblPuntuak = new JLabel("PUNTUAK:");
		lblPuntuak.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblPuntuak);
		
		puntuakSartu = new JTextField();
		panel_4.add(puntuakSartu);
		puntuakSartu.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnAtzera = new JButton("ATZERA");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				leihoaItxi();
				
			}
		});
		panel_5.add(btnAtzera);
		
		JButton btnGorde = new JButton("GORDE");
		panel_5.add(btnGorde);
		btnGorde.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String izena=izenaSartu.getText();
			int zenbakia=Integer.parseInt(zenbakiaSartu.getText());
			String animalada=animaladaSartu.getText();
			int puntuak=Integer.parseInt(puntuakSartu.getText());
			
			if((izena.equals("") || zenbakia<=0 || animalada.equals("") || puntuak<0 )){
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame,"Zerbait ez dozu idatzi edo zenbakia negatiboa da. Errepikatu, mesedez.");
			}else{
				
				String originala=("EZ");
				try {
					Mysql.getMysql().erregistratuAnimalia(izena, zenbakia, animalada, puntuak, originala);
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				leihoaItxi();
				
			}
				
		}
			
		
	});
	}	
	public void leihoaItxi(){
		this.dispose();
	}
}
