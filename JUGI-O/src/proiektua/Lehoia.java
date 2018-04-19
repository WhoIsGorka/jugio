package proiektua;

public class Lehoia extends Karta {

	public Lehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pKolorea);
		aPortaera=new LehenaJarri();
		bPortaera=new BotaSinple();
	}
	public void animaladaEgin(){
		if (Tableroa.getTableroa().getMahaiKartak().getPosizioa("Lehoia")==-1) {
			aPortaera.aurreratu(0, this); //0 posizioan jartzeko, hau da, lehena
			bPortaera.bota("Tximinoa");
		}else {
			bPortaera.bota(this.getIzena());
		}
	}
}