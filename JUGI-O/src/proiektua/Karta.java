package proiektua;

public abstract class Karta {
	private int id;
	private String izena;
	private String deskr;
	private boolean errekurtsiboa;
	private int puntuak;
	private String irudia;
	
	protected BotaPortaera bPortaera;
	protected AurreratuPortaera aPortaera;
	protected OrdenaPortaera oPortaera;
	
	public Karta(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia){
		this.id = pId;
		this.izena = pIzena;
		this.deskr = pDeskr;
		this.errekurtsiboa = pErre;
		this.puntuak = pPuntuak;
		this.irudia = pIrudia;
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
	public abstract void animaladaEgin();
}
