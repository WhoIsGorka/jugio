package proiektua;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class Ni extends Jokalaria {

	public Ni(int pId, String pIzena, EskuKartak pEskuKartak, MazoKartak pMazoKartak, int pPuntuazioa) {
		super();
	}
	
	public int txandaEgin(int kartazenb) {
		
		Tableroa.getTableroa().getMahaiKartak().gehituKarta(this.getEskuKartak().kenduKarta(kartazenb));
		if (this.getEskuKartak().luzera()==0){
			int result = JOptionPane.showConfirmDialog(null, "MAS VIDA", "QUE MI TIO QUE TOCABA UN POCO LA GAITA",
                    JOptionPane.OK_OPTION);
            if (result == JOptionPane.OK_OPTION)
                System.exit(0);		
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
