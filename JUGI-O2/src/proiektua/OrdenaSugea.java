package proiektua;


public class OrdenaSugea implements OrdenaPortaera{
	public OrdenaSugea() {
	}
	
	public void ordenaAldatu() {
		Tableroa.getTableroa().getMahaiKartak().ordenatuTxikHand();
	}
}
