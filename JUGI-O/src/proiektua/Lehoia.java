package proiektua;

public class Lehoia extends Karta {

	public Lehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		aPortaera=new LehenaJarri();
		
	}
	public void animaladaEgin(){
		if (Tableroa.getTableroa().getMahaiKartak().zenbatEspezieBera("Lehoia")==1) {
			
			bPortaera=new BotaGuztiak();		         // lo pongo aqui porque segun en que parte del IF entre la portaera es dintinta	
			bPortaera.bota("Tximinoa",null);
			
			Karta k = Tableroa.getTableroa().getMahaiKartak().kenduKarta(this.getIzena());		
			aPortaera.aurreratu(0, k);				 //0 posizioan jartzeko, hau da, lehena
		
		}else {
			bPortaera=new BotaBat();					// Same a lo de arriba
			bPortaera.bota(this.getIzena(),this.getKolorea());
		}
	}
}