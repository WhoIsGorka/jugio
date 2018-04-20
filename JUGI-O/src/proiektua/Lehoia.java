package proiektua;

public class Lehoia extends Karta {

	public Lehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pKolorea);
		aPortaera=new LehenaJarri();
		
	}
	public void animaladaEgin(){
		if (Tableroa.getTableroa().getMahaiKartak().getPosizioa("Lehoia")==-1) {
			aPortaera.aurreratu(0, this);				 				//0 posizioan jartzeko, hau da, lehena
			bPortaera=new BotaGuztiak();		         // lo pongo aqui porque segun en que parte del IF entre la portaera es dintinta	
			bPortaera.bota("Tximinoa");
		}else {
			bPortaera=new BotaBigarrena();					// Same a lo de arriba
			bPortaera.bota(this.getIzena());
		}
	}
}