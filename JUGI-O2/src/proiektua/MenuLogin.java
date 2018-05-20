package proiektua;



import java.awt.Image;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuLogin extends JFrame {

	private JPanel contentPane;

	private Login login = new Login();

	public MenuLogin() {
		setTitle("                                                                                                BAR BESTIAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 718, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JButton btnIrten = new JButton("IRTEN");
		btnIrten.setForeground(new Color(0, 0, 0));
		btnIrten.setBackground(new Color(153, 102, 102));
		btnIrten.setBounds(466, 551, 232, 79);
		contentPane.add(btnIrten);
		btnIrten.setFont(new Font("Tahoma", Font.BOLD, 24));
		
	
		
		
		
		JButton btnErregistratu = new JButton("ERREGISTRATU");
		btnErregistratu.setForeground(new Color(0, 0, 0));
		btnErregistratu.setBackground(new Color(0, 153, 204));
		btnErregistratu.setBounds(224, 550, 232, 80);
		contentPane.add(btnErregistratu);
		btnErregistratu.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(new Color(0, 153, 102));
		btnLogin.setBounds(10, 551, 204, 79);
		contentPane.add(btnLogin);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JButton fotoBarDiegal = new JButton("");
		fotoBarDiegal.setBounds(0, 0, 698, 540);
		contentPane.add(fotoBarDiegal);
		fotoBarDiegal.setBackground(new Color(255, 255, 255));
		fotoBarDiegal.setIcon(resizeIcon(new ImageIcon(getClass().getResource("bar.png")),fotoBarDiegal.getWidth(),fotoBarDiegal.getHeight()));
		btnLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				leihoaItxi();
				login.setVisible(true);
				
				
			}
		});
		btnErregistratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				leihoaItxi();
				Erregistratu frame1 = new Erregistratu();
				frame1.setVisible(true);
				
				
			}
		});
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
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
