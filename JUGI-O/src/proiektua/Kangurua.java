package proiektua;

import javax.swing.JOptionPane;

public class Kangurua extends Karta {

	public Kangurua(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		aPortaera=new AurreratuSinple();
	}
	public void animaladaEgin(){

		int pos = Tableroa.getTableroa().getMahaiKartak().getPosizioa(this.getIzena(),this.getKolorea());
	
		int zenb =  Integer.parseInt(JOptionPane.showInputDialog(null, "Zenbat salto egin nahi dituzu, 1 edo 2?"));

		if (((zenb==1)&&(pos>0))||((zenb==2)&&(pos==1))) {
			aPortaera.aurreratu(pos-1, pos);
		}else if ((zenb==2)&&(pos>1)){	
			aPortaera.aurreratu(pos-2, pos);
		}
	}
}
	
		

