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
		int max2 = 0;
		int i = 0;
		

		Iterator<Karta> itr = lista.getIterator();
		Karta aux = null;
		Karta kMax = null;
		Karta kMax2 = null;

		while(itr.hasNext()) {
			
			aux=itr.next();		
			
			if(aux.getIzena()!="Mofeta") {
				if (aux.getId()>max){
					i++;
					kMax2 = kMax;
					max2 = max;
					max = aux.getId();
					kMax=aux;
				}else if(aux.getId()>max2){	
					i++;
					max2 = aux.getId();
					kMax2 = aux;				
				}			
			}
		}
		if (i==1) {
			bPortaera.bota(kMax.getIzena(), null);
		}else if(i>1) {
			bPortaera.bota(kMax.getIzena(), null);
			bPortaera.bota(kMax2.getIzena(), null);
		}
			
	}	
}


