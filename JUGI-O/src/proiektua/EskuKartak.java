package proiektua;

import java.util.ArrayList;

public class EskuKartak {
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

}
