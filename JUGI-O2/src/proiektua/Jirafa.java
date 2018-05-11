package proiektua;

public class Jirafa extends Karta {

	public Jirafa(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		aPortaera = new AurreratuSinple();
	}
	public void animaladaEgin(){
		MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak(); 
		int pos = mk.getPosizioa(this.getIzena(),this.getKolorea());
		if(pos!=0) {
			if(mk.getKarta(pos).getId()>mk.getKarta(pos-1).getId()) {
				
				aPortaera.aurreratu(pos-1,pos);
				
			}
		}
	}
}
