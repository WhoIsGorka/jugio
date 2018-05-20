package proiektua;

import java.util.ArrayList;
import java.util.Observable;



public class EskuKartak extends Observable{
	private ArrayList<Karta> eskua;
	private ArrayList<String> paths;
	
	public EskuKartak(){
		this.eskua= new ArrayList<Karta>();
		this.paths= new ArrayList<String>();
	}
	public ArrayList<String> getPaths(){
		return this.paths;
	}
	public void gehituKarta(Karta pKarta){
		this.eskua.add(pKarta);
		this.paths.add(pKarta.getIrudia());
	}
	public Karta kenduKarta(int num){
		this.paths.remove(num);		
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
	public void notifikatuInterfazea(){
		setChanged();
		notifyObservers(this.paths);
		
	}
}
