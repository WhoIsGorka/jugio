package proiektua;

import java.util.Scanner;

public class Jokalaria {
	private int id;
	private String izena;
	private EskuKartak eskuKartak;
	private MazoKartak mazoa;
	private int puntuazioa;
	
	public Jokalaria() {
		this.id = -1;
		this.izena = null;
		this.eskuKartak = new EskuKartak();
		this.mazoa = new MazoKartak();
		this.puntuazioa = 0;
	}
	
	public int getId() {
		return id;
	}
	
	public String getIzena() {
		return izena;
	}

	public EskuKartak getEskuKartak() {
		return eskuKartak;
	}
	public MazoKartak getMazoa() {
		return mazoa;
	}
	
	public int getPuntuazioa() {
		return puntuazioa;
	}
	
	public void setPuntuazioa(int pPunt) {
		this.puntuazioa = pPunt;
	}

	public void setJokalariarenIzena(String pIzena){
		this.izena = pIzena;
	}
	public void setJokalariarenId(int pId){
		this.id = pId;
	}
	public void setPcIzenaId(){
		this.izena = "Ordenagailua";
		this.id = 0;
	}
	
	public void hartuLehenegoLauKartak(){
		for(int i=0;i<=4;i++){
			hartuKartaBat();
		}
	}	
	
	public void hartuKartaBat(){
		if(!this.mazoa.hutsaDa()){
			this.eskuKartak.gehituKarta(this.mazoa.kenduKarta());
		}
		
	
	}
}
