package proiektua;

public class Lehoia extends Karta {

	public Lehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		aPortaera=new LehenaJarri();
		
	}
	public void animaladaEgin(){
		if (Tableroa.getTableroa().getMahaiKartak().zenbatEspezieBera("Lehoia")==1) {
			
			bPortaera=new BotaGuztiak();		         	
			bPortaera.bota("Tximinoa",null);
			
			int pos = Tableroa.getTableroa().getMahaiKartak().getPosizioa("Lehoia", this.getKolorea());
			aPortaera.aurreratu(0, pos);				 				//0 posizioan jartzeko, hau da, lehena
		
		}else {
			bPortaera=new BotaBat();					
			bPortaera.bota(this.getIzena(),this.getKolorea());
		}
	}
}





