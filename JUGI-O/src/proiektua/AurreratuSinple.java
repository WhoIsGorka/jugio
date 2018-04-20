package proiektua;

public class AurreratuSinple implements AurreratuPortaera{

	public AurreratuSinple() {
	}
	public void aurreratu(int i, Karta pKarta) {
		
	
		Tableroa.getTableroa().getMahaiKartak().gehituKartaPos(pKarta, i);
		
		
	}
}
