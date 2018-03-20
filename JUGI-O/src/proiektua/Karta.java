package proiektua;

public class Karta {
	private int id;
	private String izena;
	private String deskr;
	private boolean errekurtsiboa;
	private int puntuak;
	private String kolorea;
	
	public Karta(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pKolorea){
		this.id = pId;
		this.izena = pIzena;
		this.deskr = pDeskr;
		this.errekurtsiboa = pErre;
		this.puntuak = pPuntuak;
		this.kolorea = pKolorea;
	}
	public String getIzena() {
		return izena;
	}
}
