package proiektua;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Jokalaria {
	protected int id;
	protected String izena;
	private EskuKartak eskuKartak;
	private MazoKartak mazoa;
	private int puntuazioa;
	
	
	public Jokalaria() {
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
	public void hartuKarta(){
		if (this.eskuKartak.luzera()==0){
			this.hartuLehenegoLauKartak();
		}else if(this.eskuKartak.luzera()>0 && this.eskuKartak.luzera()<=3 ){
			if(!this.mazoa.hutsaDa()){
				this.hartuKartaBat();	
			}
		}
		Tableroa.getTableroa().notifikatuInterfazea();
	}

	public void hartuLehenegoLauKartak(){
		for(int i=0;i<=3;i++){
			hartuKartaBat();
		}
	}	
	
	public void hartuKartaBat(){
		if(!this.mazoa.hutsaDa()){
			this.eskuKartak.gehituKarta(this.mazoa.kenduKarta());
		}
	}

	
	public abstract void txandaEgin(int karta);
}
