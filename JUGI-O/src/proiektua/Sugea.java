package proiektua;

public class Sugea extends Karta {

	public Sugea(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		oPortaera = new OrdenaSugea();
	}
	public void animaladaEgin(){
		
	}
}
