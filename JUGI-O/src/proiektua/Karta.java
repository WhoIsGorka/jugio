package proiektua;

public class Karta {
	private int id;
	private String izena;
	private String deskr;
	private boolean errekurtsiboa;
	private int puntuak;
	private String irudia;
	
	public Karta(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia){
		this.id = pId;
		this.izena = pIzena;
		this.deskr = pDeskr;
		this.errekurtsiboa = pErre;
		this.puntuak = pPuntuak;
		this.irudia = pIrudia;
	}
	public String getIzena() {
		return izena;
	}
}
