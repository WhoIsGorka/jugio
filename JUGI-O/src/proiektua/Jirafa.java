package proiektua;

public class Jirafa extends Karta {

	public Jirafa(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pKolorea);
	
	}
	public void animaladaEgin(){
		int pos = Tableroa.getTableroa().getMahaiKartak().getPosizioa(this.getIzena());
		if(pos!=0){
			aPortaera = new aurreratuSinple(this);
		}
	}
}
