package proiektua;


import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class Pc extends Jokalaria {

	public Pc() {
		super();
		super.izena = "Ordenagailua";
		super.id = 0;
	}
	
	public void txandaEgin(int kartazenb){
		int randomNum = ThreadLocalRandom.current().nextInt(0,this.getEskuKartak().luzera());
		Tableroa.getTableroa().getMahaiKartak().gehituKarta(this.getEskuKartak().kenduKarta(randomNum));
	
	
		Tableroa.getTableroa().notifikatuInterfazea();
	
		int tamaina = Tableroa.getTableroa().getMahaiKartak().getTamaina();
		if(tamaina!=1){
			Tableroa.getTableroa().getMahaiKartak().getKarta(tamaina-1).animaladaEgin();
			Tableroa.getTableroa().notifikatuInterfazea();
		}
		
		Tableroa.getTableroa().getMahaiKartak().errekurtsiboakEgin();
		
		if(Tableroa.getTableroa().getMahaiKartak().getTamaina()==5){
			Tableroa.getTableroa().getMahaiKartak().tabernanSartu();
		}
		if (this.getEskuKartak().luzera()==0){
			JOptionPane.showMessageDialog(null, 
					Tableroa.getTableroa().norkIrabaziDu(), 
                    "AMAIERA", 
                    JOptionPane.DEFAULT_OPTION); 
			int result = JOptionPane.showConfirmDialog(null, "IRTEN?", "JOKOA AMAITU DA",
                    JOptionPane.OK_OPTION);
            if (result == JOptionPane.OK_OPTION)
                System.exit(0);		}
		
		this.hartuKarta();
		
	}
}
