package proiektua;

public class LehenaJarri implements AurreratuPortaera {
	public LehenaJarri(){
	}
	
	public void aurreratu(int b, int h) {			// b : posicion donde termina, h : posicion donde esta ahora
		Karta k = Tableroa.getTableroa().getMahaiKartak().kenduKartaPos(h);	
		Tableroa.getTableroa().getMahaiKartak().getLista().add(0, k);	
	}
}




