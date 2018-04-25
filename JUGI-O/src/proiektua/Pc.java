package proiektua;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Pc extends Jokalaria {

	public Pc() {
		super();
		super.izena = "Ordenagailua";
		super.id = 0;
	}
	
	public void txandaEgin(int kartazenb) {
		System.out.println("hasiera");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int randomNum = ThreadLocalRandom.current().nextInt(0,this.getEskuKartak().luzera());
		Tableroa.getTableroa().getMahaiKartak().gehituKarta(this.getEskuKartak().kenduKarta(randomNum));
		System.out.println(randomNum);
		System.out.println(Tableroa.getTableroa().getPc().getEskuKartak().getKarta(0).getIzena());
		System.out.println(Tableroa.getTableroa().getPc().getEskuKartak().getKarta(1).getIzena());
		System.out.println(Tableroa.getTableroa().getPc().getEskuKartak().getKarta(2).getIzena());
		System.out.println(Tableroa.getTableroa().getPc().getEskuKartak().getKarta(3).getIzena());
		Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int tamaina = Tableroa.getTableroa().getMahaiKartak().getTamaina();
		if(tamaina!=1){
			Tableroa.getTableroa().getMahaiKartak().getKarta(tamaina-1).animaladaEgin();
			Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Tableroa.getTableroa().getMahaiKartak().errekurtsiboakEgin();
		
		this.hartuKarta();
	}
}
