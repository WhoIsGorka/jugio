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
	
	public int getTamaina() {
		return this.lista.size();
	}
	
	public Karta getKarta(int i) {
		return this.lista.get(i);
	}
	
//	public void aurreraJoan(Karta pKarta) {
//		int i = this.getPosizioa(pKarta.getIzena());
//		Karta aux = this.kenduKarta(pKarta);
//		this.gehituKartaPos(aux, i-1);
//	}
	
	public int getPosizioa(String pS) {
		Iterator<Karta> itr = this.getIterator();
		boolean aurkituta=false;
		Karta aux=null;
		int i=-1;
		while(!aurkituta && itr.hasNext()) {
			if (aux.getClass().getName().equals(pS)) {
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
	
	public int zenbatEspezieBera(String pS) { 						// este metodo esta para mas adelante 
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
	public boolean hutsaDa() {
		return this.lista.isEmpty();
	}
	
	public void gehituKarta(Karta pKarta) {
		this.lista.add(pKarta);
	}
	
	public void gehituHasieran(Karta pKarta) {
		this.lista.add(0, pKarta);
	}
	
	public void gehituKartaPos(Karta pKarta, int i) {
		this.lista.add(i, pKarta);
	}
	public void kenduKartaPos(int i) {
		this.lista.remove(i);
	}

	public Karta kenduKarta(String pS) {
		return this.lista.remove(bilatu(pS));
	}
	 
	public void bueltaEman() {
		Collections.reverse(lista);
	}
	
	public void ezabatuBat(int i, String pS){					// i --> Significa la posicion del primer o segundo animal 
		Iterator<Karta> itr = this.getIterator();				// e --> Significa cuantos animales de esa especie ha recorrido hasta el mo
		Karta aux=null;											// pos --> Recorre la lista hasta encontrar la primera/segunda especie, para luego borrar esa
		int e = 0;
		int pos = -1;
		while(itr.hasNext() && e <i) {
			pos++;
			if (aux.getClass().getName().equals(pS)){
				e = e + 1;
				if(i==e){
					this.kenduKartaPos(pos);						
				}
			}
			aux=itr.next();		
		}
	}
		
	public void ezabatuGuztiak(String pS){
		Iterator<Karta> itr = this.getIterator();
		Karta aux=null;
		while(itr.hasNext()) {
			if (aux.getClass().getName().equals(pS)) {
				this.kenduKarta(aux.getIzena());
			}
			aux=itr.next();		
		}
	}
//	
//	public void ordenatuHandienetikTxikienera() {
//		Iterator<Karta> itr = this.getIterator();
//		Karta current = null;
//		Karta prev = null;
//		Karta aux = null;
//		current=itr.next();
//		int aux;
//		for (int i=0; i<lista.size(); i++) {
//			for (int j=0; j)
//		}
//	}
	
	private Iterator<Karta> getIterator(){
		return this.lista.iterator();
	}
	
	/*
	public boolean badago(String pS) {
		Iterator<Karta> itr = this.getIterator();
		boolean aurkituta=false;
		Karta aux=null;
		while(!aurkituta && itr.hasNext()) {
			if (aux.getClass().getName().equals(pS)) {
				aurkituta=true;
			}
			aux=itr.next();
		}
		return aurkituta;
	}
	*/
	
	public int bilatu(String pS) {
		Iterator<Karta> itr = this.getIterator();
		boolean aurkituta=false;
		Karta aux=null;
		while(!aurkituta && itr.hasNext()) {
			if (aux.getClass().getName().equals(pS)) {
				aurkituta=true;
			}
			aux=itr.next();
		}
		return aux.getId();
	}

}