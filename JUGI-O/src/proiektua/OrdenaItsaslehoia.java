package proiektua;

public class OrdenaItsaslehoia implements OrdenaPortaera{
	public OrdenaItsaslehoia(Karta pKarta){
		ordenaAldatu();
	}
	public void ordenaAldatu() {
		Tableroa.getTableroa().getMahaiKartak().bueltaEman();
	}

	
}