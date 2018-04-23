package proiektua;

public class Ni extends Jokalaria {

	public Ni(int pId, String pIzena, EskuKartak pEskuKartak, MazoKartak pMazoKartak, int pPuntuazioa) {
		super();
	}
	
	public void txandaEgin(int p) {
		
		Karta k = super.getEskuKartak().kenduKarta(p);
		
		Tableroa.getTableroa().getMahaiKartak().getLista().add(k);
		
		Tableroa.getTableroa().getMahaiKartak().getLista().get(Tableroa.getTableroa().getMahaiKartak().getLista().size()-1).animaladaEgin();
		
	
		
	}
}
