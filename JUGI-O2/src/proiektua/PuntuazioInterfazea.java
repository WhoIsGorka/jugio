package proiektua;

import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class PuntuazioInterfazea extends JFrame {
	private JPanel contentPane;
	private JTextArea textArea;
	public PuntuazioInterfazea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 399, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		textArea = new JTextArea();
		contentPane.add(textArea);
		textArea.setBounds(59, 11, 262, 172);
		textArea.setEditable(false);
	}
	public void displayJokalariOnenak(ArrayList<String> pString){		
		for(int i=0;i<pString.size();i++){
			textArea.setText(textArea.getText()+pString.get(i)+"\n\n");
		}
		
	}
}

//mysql nuevo metodo:

