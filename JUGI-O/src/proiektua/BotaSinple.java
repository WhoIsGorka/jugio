package proiektua;

public class BotaSinple implements BotaPortaera {
	public BotaSinple(){
	}
	
	public void bota(String pS) {
		Tableroa.getTableroa().getMahaiKartak().kenduKarta(pS);
	}
}
