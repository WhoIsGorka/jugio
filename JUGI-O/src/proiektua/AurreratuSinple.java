package proiektua;

public class AurreratuSinple implements AurreratuPortaera{

	public AurreratuSinple(Karta pKarta) {
		aurreratu(pKarta);
	}
	public void aurreratu(Karta pKarta) {
		Tableroa.getTableroa().getMahaiKartak().aurreraJoan(pKarta);
	}
}
