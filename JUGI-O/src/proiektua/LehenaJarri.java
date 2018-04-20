package proiektua;

public class LehenaJarri implements AurreratuPortaera {
	public LehenaJarri(){
	}
	
	public void aurreratu(int i, Karta pKarta) {
		Tableroa.getTableroa().getMahaiKartak().getLista().add(0, pKarta);
	}
}
