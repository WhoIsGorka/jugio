package proiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;



public class EskuKartak extends Observable{
	private ArrayList<Karta> eskua;
	
	public EskuKartak(){
		this.eskua= new ArrayList<Karta>();
	}
	public void gehituKarta(Karta pKarta){
		this.eskua.add(pKarta);
	}
	public Karta kenduKarta(int num){
		return this.eskua.remove(num);
	}
	public boolean hutsaDa(){
		return this.eskua.isEmpty();
	}
	public Karta getKarta(int num){
		return this.eskua.get(num);
	}
	public int luzera(){
		return this.eskua.size();
	}
	private Iterator<Karta> getIterator(){
		return this.eskua.iterator();
	}
	public void listaPathSortu(){
		Iterator<Karta> itr = this.getIterator();
		ArrayList<String> lista = new ArrayList<String>();
		Karta aux=null;
		while(itr.hasNext()) {
			aux=itr.next();	
			lista.add(aux.getIrudia());
		}
		setChanged();
		notifyObservers(lista);
	}
	@Override
	public void notifyObservers(){
		setChanged();
		super.notifyObservers();
	}

}
