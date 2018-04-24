package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItsasLehoiaProba {

	Jokalaria j1;
	EskuKartak ek = new EskuKartak();
	MahaiKartak mk = new MahaiKartak();
	Karta itsaslehoia = null;

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoia = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Urdina");
	@Before
	public void setUp() throws Exception {
		 itsaslehoia = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Urdina");
	}

	@After
	public void tearDown() throws Exception {
		itsaslehoia= null;
	}
	
	@Test
	public void testJokalaria() {
		assertNotNull(itsaslehoia);
	}
	
	@Test
	public void testAnimaladaEgin() {
	
	}
}
