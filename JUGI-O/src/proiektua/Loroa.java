package proiektua;

import java.util.Scanner;

public class Loroa extends Karta {

	public Loroa(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		bPortaera=new BotaBat();
	}
	public void animaladaEgin(){
		Scanner sc = new Scanner(System.in);
		String izena;
		String kolorea;
		System.out.println("Sartu kalera bota nahi duzun kartaren izena\n\r");
		izena = sc.next();
		System.out.println("Sartu kalera bota nahi duzun kartaren kolorea\n\r");
		kolorea = sc.next();
		bPortaera.bota(izena, kolorea);
	}
}
