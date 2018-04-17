package proiektua;

public class OrdenaItsasLehoia implements OrdenaPortaera{
	public OrdenaItsasLehoia(Karta pKarta){
		ordenaAldatu(pKarta);
	}
	public void ordenaAldatu(Karta pKarta) {
		Tableroa.getTableroa().getMahaiKartak().bueltaEman();
	}
	
}