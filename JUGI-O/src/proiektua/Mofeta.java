package proiektua;

public class Mofeta extends Karta{

	public Mofeta(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		bPortaera = new BotaGuztiak();
	}
	public void animaladaEgin(){
		
		Karta max1 = Tableroa.getTableroa().getMahaiKartak().idMax();
		Karta max2 = Tableroa.getTableroa().getMahaiKartak().idMax2(max1.getId());
	
		bPortaera.bota(max1.getIzena(), null);
		bPortaera.bota(max2.getIzena(), null);
		
	}
}
