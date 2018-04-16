package proiektua;
 
import java.util.LinkedList;
import java.util.Iterator;
import java.util.NoSuchElementException;

 
public class MahaiKartak {
	private LinkedList<Karta> lista;
	
	public MahaiKartak() {
		this.lista = new LinkedList<Karta>();
	}
	
	public LinkedList<Karta> getMahaiKartak() {
		return this.lista;
	}
	
	public boolean hutsaDa() {
		return this.lista.isEmpty();
	}
	
	public void gehituHasieran(Karta pKarta) {
		this.lista.addFirst(pKarta);
	}
	
	public void gehituKarta(Karta pKarta) {
		this.lista.addLast(pKarta);
	}
	
	public Karta kenduKarta(int id) {
		return this.lista.remove(id);
	}
	
	public Karta kenduHasierakoa() {
		return this.lista.removeFirst();
	}
	
	public Karta kenduAmaierakoa() {
		return this.lista.removeLast();
	}
	
	private Iterator<Karta> getIterator(){
		return this.lista.iterator();
	}
	
	public boolean badago(Karta pKarta) {
		Iterator<Karta> itr = this.getIterator();
		boolean aurkituta=false;
		Karta aux=null;
		while(!aurkituta && itr.hasNext()) {
			aux=itr.next();
			if (aux.getClass().getName().equals(pKarta.getClass().getName())) {
				aurkituta=true;
			}
		}
		return aurkituta;
	}
}