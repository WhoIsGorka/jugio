package proiektua;

public class AurreratuSinple implements AurreratuPortaera{

	public AurreratuSinple() {
	}
	public void aurreratu(int b, int h) {			// b : posicion donde termina, h : posicion donde esta ahora
		Karta k = Tableroa.getTableroa().getMahaiKartak().kenduKartaPos(h);
		Tableroa.getTableroa().getMahaiKartak().gehituKartaPos(k, b);
	}
}
