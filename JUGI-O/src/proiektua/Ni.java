package proiektua;

import java.util.concurrent.TimeUnit;

public class Ni extends Jokalaria {

	public Ni(int pId, String pIzena, EskuKartak pEskuKartak, MazoKartak pMazoKartak, int pPuntuazioa) {
		super();
	}
	
	public int txandaEgin(int kartazenb) {
		
		Tableroa.getTableroa().getMahaiKartak().gehituKarta(this.getEskuKartak().kenduKarta(kartazenb));
		
		
	
		int tamaina = Tableroa.getTableroa().getMahaiKartak().getTamaina();
		if(tamaina!=1){
			Tableroa.getTableroa().getMahaiKartak().getKarta(tamaina-1).animaladaEgin();
			Tableroa.getTableroa().notifikatuInterfazea();
		}
	
		
		//Tableroa.getTableroa().getMahaiKartak().errekurtsiboakEgin();
		//Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();		
		
		if(Tableroa.getTableroa().getMahaiKartak().getTamaina()==5){
			Tableroa.getTableroa().getMahaiKartak().tabernanSartu();
		}
		
		return this.getPuntuazioa();
	}
}
