package proiektua;

public class LehenaJarri implements AurreratuPortaera {
	public LehenaJarri(Karta pKarta){
		aurreratu(pKarta);
	}
	
	public void aurreratu(Karta pKarta) {
		Tableroa.getTableroa().getMahaiKartak().addFirst(pKarta);
	}
}
