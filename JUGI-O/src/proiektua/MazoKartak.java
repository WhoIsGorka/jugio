package proiektua;

import java.util.Stack;

public class MazoKartak {
	private Stack<Karta> mazoa;
	
	public MazoKartak() {
		this.mazoa = new Stack<Karta>();
	}
	
	public void gehituKarta(Karta pKarta){
		this.mazoa.push(pKarta);
	}
	public Karta kenduKarta(){
		Karta k1=this.mazoa.pop();
		return k1;
	}
	public boolean hutsaDa(){
		return this.mazoa.isEmpty();
	}
}
