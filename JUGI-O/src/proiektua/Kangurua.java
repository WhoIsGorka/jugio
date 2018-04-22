package proiektua;

import java.util.Scanner;

public class Kangurua extends Karta {

	public Kangurua(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		aPortaera=new AurreratuSinple();
	}
	public void animaladaEgin(){
		Scanner sc = new Scanner(System.in);
		int pos = Tableroa.getTableroa().getMahaiKartak().getPosizioa(this.getIzena(),this.getKolorea());
		int zenb;
		System.out.println("Zenbat salto egin nahi dituzu, 1 edo 2?\n\r");
		zenb = sc.nextInt();
		if (zenb==1) {
			aPortaera.aurreratu(pos-1, pos);
		}else if (zenb==2) {
			aPortaera.aurreratu(pos-2, pos);
		}
	}
}
