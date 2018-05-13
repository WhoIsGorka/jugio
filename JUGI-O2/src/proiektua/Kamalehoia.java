package proiektua;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;



public class Kamalehoia extends Karta {

	public Kamalehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
	}
	public void animaladaEgin(){
		MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
		String kolorea;
		int zenb = 0;
		if(this.getKolorea()=="Urdina"){
			kolorea= "Urdina";
		}else{
			kolorea="Berdea";
		}	
		if (kolorea=="Urdina"){
			int aukeragarriZenbMaximoa=mk.getTamaina()-1;
 			zenb =  Integer.parseInt(JOptionPane.showInputDialog(null, "Aukeratu mahiko animali bat (1-"+aukeragarriZenbMaximoa+"):"));
			Karta animaliKopia= mk.getKarta(zenb-1);
			animaliKopia.setKolorea(kolorea);
			int pos = mk.getPosizioa(this.getIzena(),this.getKolorea());
    		mk.ordezkatuKarta(pos, animaliKopia);
			animaliKopia.animaladaEgin();
			pos = mk.getPosizioa(animaliKopia.getIzena(),animaliKopia.getKolorea());		
			mk.ordezkatuKarta(pos, this);
		}else if(kolorea=="Berdea"){
			zenb = ThreadLocalRandom.current().nextInt(1,mk.getTamaina()+1);
	 		Karta animaliKopia= mk.getKarta(zenb-1);
	 		animaliKopia.setKolorea(kolorea);
			
	 		int pos = mk.getPosizioa(this.getIzena(),this.getKolorea());
	 		mk.ordezkatuKarta(pos, animaliKopia);
			
	 		animaliKopia.animaladaEgin();
			pos = mk.getPosizioa(animaliKopia.getIzena(),animaliKopia.getKolorea());
			
			mk.ordezkatuKarta(pos, this);
			pos = mk.getPosizioa(animaliKopia.getIzena(),animaliKopia.getKolorea());		
		}
						
	}
}