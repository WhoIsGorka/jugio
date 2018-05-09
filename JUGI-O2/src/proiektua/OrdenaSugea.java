package proiektua;

import java.util.ArrayList;
import java.util.Iterator;



public class OrdenaSugea implements OrdenaPortaera{
	public OrdenaSugea() {
	}
	
	public void ordenaAldatu() {
		Tableroa.getTableroa().getMahaiKartak().ordenatuTxikHand();
	}
}
