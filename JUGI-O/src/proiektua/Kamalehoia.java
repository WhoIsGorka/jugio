package proiektua;

import javax.swing.JOptionPane;



public class Kamalehoia extends Karta {

	public Kamalehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
	}
	public void animaladaEgin(){
		MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
		String kolorea;
		if(this.getKolorea()=="Urdina"){
			kolorea= "Urdina";
		}else{
			kolorea="Berdea";
		}
		int zenb =  Integer.parseInt(JOptionPane.showInputDialog(null, "Aukeratu mahiko animali bat (0-4): "));
		Karta animaliKopia= mk.getKarta(zenb);
		animaliKopia.setKolorea(kolorea);
		
		
		int pos = mk.getPosizioa(this.getIzena(),this.getKolorea());
		mk.ordezkatuKarta(pos, animaliKopia);
		
		
		animaliKopia.animaladaEgin();
		pos = mk.getPosizioa(animaliKopia.getIzena(),animaliKopia.getKolorea());
		
		mk.ordezkatuKarta(pos, this);
	}
}
