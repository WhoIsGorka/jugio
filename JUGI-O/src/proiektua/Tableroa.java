package proiektua;

import java.util.Scanner;

public class Tableroa {
	
	private IlaraKartak ilara = new IlaraKartak();
	private Jokalaria j1;
	private Jokalaria pc;
	
	public Tableroa() {
		this.ilara = new IlaraKartak();
		this.j1 =  new Jokalaria();
		this.pc = new Jokalaria();
		
	}
	public void partidaJolastu(){
		System.out.println("Sartu jokalariaren izena: ");
		j1.setJokalariarenIzena();
		System.out.println("Sartu jokalariaren zenbakia: ");
		j1.setJokalariarenId();

		pc.setPcIzenaId();
		
	}
}
