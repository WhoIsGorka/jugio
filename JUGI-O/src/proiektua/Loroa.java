package proiektua;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Loroa extends Karta {

	public Loroa(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		bPortaera=new BotaBat();
	}
	public void animaladaEgin(){
	
		int zenb =  Integer.parseInt(JOptionPane.showInputDialog(null, "Sartu kalera bota nahi duzun kartaren posizioa"));
		Karta animaliKopia= Tableroa.getTableroa().getMahaiKartak().getKarta(zenb);
			
		bPortaera.bota(animaliKopia.getIzena(), animaliKopia.getKolorea());
	}
}
