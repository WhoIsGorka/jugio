package proiektua;

public abstract class Karta {
	private int id;
	private String izena;
	private String deskr;
	private boolean errekurtsiboa;
	private int puntuak;
	private String irudia;
	private String kolorea;
	
	protected BotaPortaera bPortaera;
	protected AurreratuPortaera aPortaera;
	protected OrdenaPortaera oPortaera;
	
	public Karta(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		this.id = pId;
		this.izena = pIzena;
		this.deskr = pDeskr;
		this.errekurtsiboa = pErre;
		this.puntuak = pPuntuak;
		this.irudia = pIrudia;
		this.kolorea = pKolorea;
	}
	public String getIzena() {
		return this.izena;
	}
	public String getIrudia() {
		return this.irudia;
	}
	public int getId() {
		return this.id;
	}
	public String getKolorea() {
		return this.kolorea;
	}
	public void setKolorea(String pKolorea){
		this.kolorea= pKolorea;
	}
	public boolean getErrekurtsiboa() {
		return this.errekurtsiboa;
	}
	public int getPuntuak() {
		return this.puntuak;
	}
	public abstract void animaladaEgin();
}
