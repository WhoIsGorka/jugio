package proiektua;

public class BotaLehenengoa implements BotaPortaera {
	public BotaLehenengoa(){
	}
	
	public void bota(String pS) {
		Tableroa.getTableroa().getMahaiKartak().ezabatuBat(1, pS);	
		
	}

	
}
