package proiektua;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class MahaiKartak {
	private ArrayList<Karta> lista;
	
	public MahaiKartak() {
		this.lista = new ArrayList<Karta>();
	}
	
	public ArrayList<Karta> getMahaiKartak() {
		return this.lista;
	}
	
	public int getTamania() {
		return this.lista.size();
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
	
	public Karta kenduKarta(Karta pKarta) {
		return this.lista.remove(bilatu(pKarta));
	}
	
	public void bueltaEman() {
		Collections.reverse(lista);
	}
	
	private Iterator<Karta> getIterator(){
		return this.lista.iterator();
	}
	
	public boolean badago(String pS) {
		Iterator<Karta> itr = this.getIterator();
		boolean aurkituta=false;
		Karta aux=null;
		while(!aurkituta && itr.hasNext()) {
			aux=itr.next();
			if (aux.getClass().getName().equals(pS)) {
				aurkituta=true;
			}
		}
		return aurkituta;
	}
	
	public int bilatu(Karta pKarta) {
		return (badago(pKarta.getIzena()))? pKarta.getId(): null; 
	}
}