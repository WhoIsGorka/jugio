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
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
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
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tableroa.getTableroa().getMahaiKartak().getKarta(Tableroa.getTableroa().getMahaiKartak().getTamaina()-1).animaladaEgin();
		Tableroa.getTableroa().getMahaiKartak().notifikatuInterfazea();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tableroa.getTableroa().getMahaiKartak().errekurtsiboakEgin();
		
		this.hartuKarta();
	}
}
