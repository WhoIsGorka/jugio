package proiektua;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Stack;

public class MazoKartak {
	private Stack<Karta> mazoa;
	
	public MazoKartak() {
		this.mazoa = new Stack<Karta>();
	}
	public void mazoaSortu(EskuKartak kartak){
		while(!kartak.hutsaDa()){
			int randomNum = ThreadLocalRandom.current().nextInt(0,kartak.luzera());
			this.gehituKarta(kartak.getKarta(randomNum));
			kartak.kenduKarta(randomNum);
		}
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
