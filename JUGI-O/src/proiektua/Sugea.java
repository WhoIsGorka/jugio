package proiektua;

public class Sugea extends Karta {

	public Sugea(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pKolorea);
		oPortaera = new OrdenaSugea();
	}

}
