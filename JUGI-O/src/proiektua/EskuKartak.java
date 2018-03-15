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
	public void kenduKarta(Karta pKarta){
		this.eskua.remove(pKarta);
	}
	
}
