package proiektua;

public class BotaGuztiak implements BotaPortaera{
	public BotaGuztiak(){
	}
	
	public void bota(String pIzena, String pKolore) {
		Tableroa.getTableroa().getMahaiKartak().ezabatuGuztiak(pIzena);
	}
}
