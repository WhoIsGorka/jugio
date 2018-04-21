package proiektua;

public class Hipopotamoa extends Karta {

	public Hipopotamoa(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		aPortaera=new AurreratuSinple();
	}
	public void animaladaEgin(){
		MahaiKartak mk =  Tableroa.getTableroa().getMahaiKartak();
		int id = this.getId();
		int pos = Tableroa.getTableroa().getMahaiKartak().getPosizioa(this.getIzena(),this.getKolorea());
		while((pos != 0) &&  (mk.getKarta(pos-1).getId()<id) && (mk.getKarta(pos-1).getIzena()!="Zebra")){
			aPortaera.aurreratu(pos-1,pos);
			pos--;
			
		}
	}
}
