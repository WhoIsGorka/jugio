package proiektua;

public class BotaBat implements BotaPortaera{
	public BotaBat(){
	}
	
	public void bota(String pIzena, String pKolore) {
		Tableroa.getTableroa().getMahaiKartak().ezabatuBat(pIzena,pKolore);
	}
}