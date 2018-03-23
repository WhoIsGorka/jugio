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
	public void kenduKarta(int num){
		this.eskua.remove(num);
	}
	public void kenduKartaGuztiak() {
		int kont=0;
		while(!eskua.isEmpty()) {
			eskua.remove(kont);
			kont++;
		}
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
	public void erakutsiKartak(){
		System.out.println(this.eskua.get(0).getIzena());
		System.out.println(this.eskua.get(1).getIzena());
		System.out.println(this.eskua.get(2).getIzena());
		System.out.println(this.eskua.get(3).getIzena());
	}
}
