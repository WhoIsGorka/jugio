package proiektua;

public class BotaGuztiak implements BotaPortaera{
	public BotaGuztiak(){
	}
	
	public void bota(String pS) {
		Tableroa.getTableroa().getMahaiKartak().ezabatuGuztiak(pS);
	}
}
