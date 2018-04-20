package proiektua;

public class BotaBigarrena implements BotaPortaera {
	public BotaBigarrena(){
	}
	
	public void bota(String pS) {
		Tableroa.getTableroa().getMahaiKartak().ezabatuBat(2, pS);	
	}

	
}
