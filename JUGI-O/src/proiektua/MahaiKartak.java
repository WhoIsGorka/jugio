package proiektua;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class MahaiKartak {
	private ArrayList<Karta> lista;
	
	public MahaiKartak() {			
		this.lista = new ArrayList<Karta>();
	}
	
	public ArrayList<Karta> getLista() {	
		return this.lista;
	}
	
//	public int getTamaina() {
//		return this.lista.size();
//	}
	
	public Karta getKarta(int i) {
		return this.lista.get(i);
	}
	
//	public void aurreraJoan(Karta pKarta) {
//		int i = this.getPosizioa(pKarta.getIzena());
//		Karta aux = this.kenduKarta(pKarta);
//		this.gehituKartaPos(aux, i-1);
//	}
	
	public int getPosizioa(String pI, String pK) {				// *Devuelve la posición de esa carta, y si no esta -1												
		Iterator<Karta> itr = this.getIterator();
		boolean aurkituta=false;
		Karta aux=null;
		int i=-1;
		while(!aurkituta && itr.hasNext()) {
			if ((aux.getClass().getName().equals(pI))&&(aux.getKolorea().equals(pK))) {
				aurkituta=true;
			}
			aux=itr.next();
			i++;
		}
		if(aurkituta) {
			return i;
		}else {
			return -1;
		}
		
	}
	
	public int zenbatEspezieBera(String pS) { 						
		Iterator<Karta> itr = this.getIterator();
		Karta aux=null;
		int kont=0;
		while(itr.hasNext()) {
			if (aux.getClass().getName().equals(pS)) {
				kont++;
			}
			aux=itr.next();	
		}
		return kont;
		
	}
//	public boolean hutsaDa() {
//		return this.lista.isEmpty();
//	}
	
//	public void gehituKarta(Karta pKarta) {
//		this.lista.add(pKarta);
//	}
//	
//	public void gehituHasieran(Karta pKarta) {
//		this.lista.add(0, pKarta);
//	}
//	
//	public void gehituKartaPos(Karta pKarta, int i) {
//		this.lista.add(i, pKarta);
//	}
//	public Karta kenduKartaPos(int i) {					//*
//		return this.lista.remove(i);
//	}

	 
	public void bueltaEman() {
		Collections.reverse(lista);
	}
	
	
	public void ezabatuBat(String pI, String pK){		   	//*			
		int pos = this.getPosizioa(pI, pK);
		lista.remove(pos);
	}
	
		
	public void ezabatuGuztiak(String pS){                 	//*               
		Iterator<Karta> itr = this.getIterator();
		Karta aux=null;
		int pos = -1;
		while(itr.hasNext()) {
			pos++;
			if (aux.getClass().getName().equals(pS)) {
				lista.remove(pos);
			}
			aux=itr.next();		
		}
	}

	

	
	private Iterator<Karta> getIterator(){
		return this.lista.iterator();
	}
	
	/*
	public int bilatu(String pI, String pK) {									
		Iterator<Karta> itr = this.getIterator();
		boolean aurkituta=false;
		int pos = -1;
		Karta aux=null;
		while(!aurkituta && itr.hasNext()) {
			pos++;
			if ((aux.getClass().getName().equals(pI))&&(aux.getKolorea().equals(pK))) {
				aurkituta=true;
			}
			aux=itr.next();
		}
		return pos;
	}
	*/
	public Karta idMax() {
		int max = 0;	
		Iterator<Karta> itr = this.getIterator();
		Karta aux=null;
		Karta kMax = null;

		while(itr.hasNext()) {
	
			if (aux.getId()>max && aux.getIzena()!="Mofeta"){
				max = aux.getId();
				kMax=aux;
			}
			aux=itr.next();		
		}
		
		return kMax;
	}
	
	public Karta idMax2(int max1) {

		int max2 = 0;			
		Iterator<Karta> itr = this.getIterator();
		Karta aux=null;
		Karta kMax2 = null;

		while(itr.hasNext()) {
	
			if (aux.getId()>max2 && aux.getId()<max1 && aux.getIzena()!="Mofeta"){
				max2 = aux.getId();
				kMax2=aux;
			}
			aux=itr.next();		
		}
		
		return kMax2;
	}

}