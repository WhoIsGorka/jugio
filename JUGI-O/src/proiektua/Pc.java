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
	
	public int txandaEgin(int kartazenb){
		System.out.println("hasiera");
		if (this.getEskuKartak().luzera()==0){
			int result = JOptionPane.showConfirmDialog(null, "MAS VIDA", "QUE MI TIO QUE TOCABA UN POCO LA GAITA",
                    JOptionPane.OK_OPTION);
            if (result == JOptionPane.OK_OPTION)
                System.exit(0);		}
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
		
		this.hartuKarta();
		return this.getPuntuazioa();
	}
}
