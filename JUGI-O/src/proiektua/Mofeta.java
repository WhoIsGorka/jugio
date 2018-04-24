package proiektua;

import java.util.ArrayList;
import java.util.Iterator;



public class Mofeta extends Karta{

	public Mofeta(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		bPortaera = new BotaGuztiak();
	}
	public void animaladaEgin(){
		
		MahaiKartak lista = Tableroa.getTableroa().getMahaiKartak();
		
		int max = 0;

		Iterator<Karta> itr = lista.getIterator();
		Karta aux = null;
		Karta kMax = null;
		Karta kMax2 = null;

		while(itr.hasNext()) {
			
			if (aux.getId()>max && aux.getIzena()!="Mofeta"){

				kMax2 = kMax;
				max = aux.getId();
				kMax=aux;
			}
			aux=itr.next();		
		}
		
		bPortaera.bota(kMax.getIzena(), null);
		bPortaera.bota(kMax2.getIzena(), null);
		
	}
}


