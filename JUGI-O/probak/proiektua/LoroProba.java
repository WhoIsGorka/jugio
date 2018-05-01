package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoroProba {
	Jokalaria j1;
	EskuKartak ek = new EskuKartak();
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta loroa =null; 

	//Kartak sortu
	
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoia = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Urdina");
	@Before
	public void setUp() throws Exception {
		loroa = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	}

	@After
	public void tearDown() throws Exception {
		loroa= null;
	}
	
	@Test
	public void testJokalaria() {
		assertNotNull(loroa);
	}
	
	@Test
	public void testAnimaladaEgin() {

		mk.gehituKarta(kanguru);
		mk.gehituKarta(tximino);
		mk.gehituKarta(lehoia);
		mk.gehituKarta(zebra);
		mk.gehituKarta(loroa);
		
		loroa.animaladaEgin();
		assertEquals(-1,mk.getPosizioa(zebra.getIzena(), zebra.getKolorea()));
		
		loroa.animaladaEgin();
		assertEquals(-1,mk.getPosizioa(tximino.getIzena(), tximino.getKolorea()));
		
		loroa.animaladaEgin();
		assertEquals(-1,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));
		
		
		
	}
}
