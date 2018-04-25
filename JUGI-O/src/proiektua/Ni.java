package proiektua;


public class Ni extends Jokalaria {

	public Ni(int pId, String pIzena, EskuKartak pEskuKartak, MazoKartak pMazoKartak, int pPuntuazioa) {
		super();
	}
	
	public void txandaEgin(int p) {
		
		Karta k = this.getEskuKartak().kenduKarta(p);
		
		Tableroa.getTableroa().getMahaiKartak().gehituKarta(k);
		
		Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();
		//ANIMALADA EGIN 5 SEGUNDU ITXARON ONDOREN
		//Tableroa.getTableroa().getMahaiKartak().getKarta(Tableroa.getTableroa().getMahaiKartak().getTamaina()-1).animaladaEgin();
		
	
		//Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();
	}
}
