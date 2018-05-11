package proiektua;

import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class PuntuazioInterfazea extends JFrame {
	private JTextArea textArea;
	public PuntuazioInterfazea() {
		getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 335, 323);
		textArea.setEditable(false);
		getContentPane().add(textArea);
	}
	public void displayJokalariOnenak(ArrayList<String> pString){		
		for(int i=0;i<pString.size();i++){
			textArea.setText(textArea.getText()+pString.get(i)+"\n\n");
		}
		
	}
}

//mysql nuevo metodo:

