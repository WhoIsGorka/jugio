package proiektua;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;


public class Login extends JFrame {
	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textPasahitza;
	
	private String email;
	private String pasahitza; 
	
	private MenuNagusiaErab mnE;
	private MenuNagusiaAdmin mnA;
	
	public Login() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("          LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 645, 110);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(23, 21, 53, 14);
		contentPane.add(lblEmail);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		
		textEmail = new JTextField();
		textEmail.setBounds(72, 20, 114, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblPasahitza = new JLabel("PASAHITZA:");
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPasahitza.setBounds(196, 21, 81, 14);
		contentPane.add(lblPasahitza);
		lblPasahitza.setHorizontalAlignment(SwingConstants.CENTER);
		
		textPasahitza = new JPasswordField();
		textPasahitza.setBounds(287, 20, 100, 20);
		contentPane.add(textPasahitza);
		textPasahitza.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(397, 11, 94, 39);
		contentPane.add(btnLogin);
		
		JButton btnAtzera = new JButton("ATZERA");
		btnAtzera.setBounds(501, 11, 86, 39);
		contentPane.add(btnAtzera);
		btnAtzera.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			leihoaItxi();
			MenuLogin frame1 = new MenuLogin();
			frame1.setVisible(true);
			
			
		}
	});
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
							
							System.out.println("logged");
							if(Mysql.getMysql().erabiltzaileEdoAdmin(email).equals("Erabiltzaile")) {
								leihoaItxi();
								mnE = new MenuNagusiaErab();
								mnE.setEmail(email);
								mnE.setVisible(true);
							}else if(Mysql.getMysql().erabiltzaileEdoAdmin(email).equals("Administratzaile")) {
								leihoaItxi();
								mnA = new MenuNagusiaAdmin();
								mnA.setEmail(email);
								mnA.setVisible(true);
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