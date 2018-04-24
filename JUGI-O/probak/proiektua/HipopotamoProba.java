package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HipopotamoProba {
	Jokalaria j1;
	EskuKartak ek = new EskuKartak();
	MahaiKartak mk = new MahaiKartak();
	Karta hipo =null; 

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoia = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Urdina");
	@Before
	public void setUp() throws Exception {
		 hipo = new Hipopotamoa(11,"Hipopotamoa"," ",true,2,"11hipopotamoAzul.PNG","Urdina"); 
	}

	@After
	public void tearDown() throws Exception {
		hipo= null;
	}
	
	@Test
	public void testJokalaria() {
		assertNotNull(hipo);
	}
	
	@Test
	public void testAnimaladaEgin() {
		mk.getLista().add(kanguru);
		mk.getLista().add(tximino);
		mk.getLista().add(lehoia);
		mk.getLista().add(kanguru);
		mk.getLista().add(hipo);
		assertEquals(4,mk.getPosizioa(hipo.getIzena(), hipo.getKolorea()));
		hipo.animaladaEgin();
		assertEquals(3,mk.getPosizioa(hipo.getIzena(), hipo.getKolorea()));
	}
}
