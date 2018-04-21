package proiektua;

public class Itsaslehoia extends Karta {

	public Itsaslehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		oPortaera = new OrdenaItsaslehoia();
	}
	public void animaladaEgin(){
		oPortaera.ordenaAldatu();
	}
}
