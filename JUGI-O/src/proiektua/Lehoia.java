package proiektua;

public class Lehoia extends Karta {

	public Lehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pKolorea);
		
	}
	public void animaladaEgin(){
		if (Tableroa.getTableroa().getMahaiKartak().badago("Tximinoa")) {
			aPortaera=new LehenaJarri(this);
		}
	}
}
