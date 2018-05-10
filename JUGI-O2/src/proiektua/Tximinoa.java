package proiektua;

public class Tximinoa extends Karta {

	public Tximinoa(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		bPortaera = new BotaGuztiak();
		aPortaera = new LehenaJarri();
	}
	public void animaladaEgin() {
		int zenbat = Tableroa.getTableroa().getMahaiKartak().zenbatEspezieBera("Tximinoa");
		if (zenbat == 2) {
			bPortaera.bota("Kokodriloa", null);
			bPortaera.bota("Hipopotamoa", null);
			
			String kol = null;
		
			if (this.getKolorea().equals("Urdina")) {
				kol = "Berdea";
			}else {
				kol = "Urdina";
			}
				
			int i = Tableroa.getTableroa().getMahaiKartak().getPosizioa("Tximinoa", kol);		
			aPortaera.aurreratu(0, i);
			
			i = Tableroa.getTableroa().getMahaiKartak().getPosizioa("Tximinoa", this.getKolorea());	
			aPortaera.aurreratu(0,i);
			
		}else if(zenbat == 3) {
			bPortaera.bota("Kokodriloa", null);
			bPortaera.bota("Hipopotamoa", null);
			
			int i = Tableroa.getTableroa().getMahaiKartak().getPosizioa("Tximinoa", "Urdina");		
			aPortaera.aurreratu(0, i);
			
			i = Tableroa.getTableroa().getMahaiKartak().getPosizioa("Tximinoa", "Berdea");		
			aPortaera.aurreratu(0, i);
			
			i = Tableroa.getTableroa().getMahaiKartak().getPosizioa("Tximinoa", this.getKolorea());		
			aPortaera.aurreratu(0, i);
			
		}
	}
}
