package proiektua;

import java.util.concurrent.TimeUnit;

public class Ni extends Jokalaria {

	public Ni(int pId, String pIzena, EskuKartak pEskuKartak, MazoKartak pMazoKartak, int pPuntuazioa) {
		super();
	}
	
	public void txandaEgin(int kartazenb) {
		Tableroa.getTableroa().getMahaiKartak().gehituKarta(this.getEskuKartak().kenduKarta(kartazenb));
		Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();
		Tableroa.getTableroa().getMahaiKartak().getKarta(Tableroa.getTableroa().getMahaiKartak().getTamaina()-1).animaladaEgin();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();
		Tableroa.getTableroa().getMahaiKartak().errekurtsiboakEgin();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();		
		//ANIMALADA EGIN 5 SEGUNDU ITXARON ONDOREN
		//Tableroa.getTableroa().getMahaiKartak().getKarta(Tableroa.getTableroa().getMahaiKartak().getTamaina()-1).animaladaEgin();
		
	
		//Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();
	}}
