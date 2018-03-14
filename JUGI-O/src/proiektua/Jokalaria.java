package proiektua;

import java.util.Scanner;

public class Jokalaria {
	private int id;
	private String izena;
	private ListaKartak eskuKartak;
	private PilaKartak mazoa;
	private int puntuazioa;
	
	public Jokalaria() {
		this.id = -1;
		this.izena = null;
		this.eskuKartak = new ListaKartak();
		this.mazoa = new PilaKartak();
		this.puntuazioa = 0;
	}

	public void setJokalariarenIzena(){
		Scanner sc = new Scanner(System.in);
		String hitza = sc.nextLine();
		this.izena = hitza;
	}
	public void setJokalariarenId(){
		Scanner sc = new Scanner(System.in);
		int zenb = sc.nextInt();
		this.id = zenb;
	}
	public void setPcIzenaId(){
		this.izena = "Ordenagailua";
		this.id = 0;
	}
	
}
