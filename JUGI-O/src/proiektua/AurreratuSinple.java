package proiektua;

public class AurreratuSinple implements AurreratuPortaera{

	public AurreratuSinple(Karta pKarta) {
		aurreratu(pKarta);
	}
	public void aurreratu(Karta pKarta) {
		int i = Tableroa.getTableroa().getMahaiKartak().getPosizioa(pKarta.getIzena());
		Karta k = Tableroa.getTableroa().getMahaiKartak().kenduKarta(pKarta);
		Tableroa.getTableroa().getMahaiKartak().gehituKartaPos(k, i-1);
	}
}
