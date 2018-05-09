package proiektua;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HipopotamoProba {
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta hipo =null; 

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoia = new Lehoia(12,"Lehoia"," ",false,2,"12lehoiaAzul.PNG","Urdina");
	Karta mofeta = new Mofeta(1,"Mofeta"," ",false,2,"1mofetaAzul.PNG","Urdina");
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
		// Lehoia ezin aurreratu, 3 pos-en gelditu
		mk.gehituKarta(kanguru);
		mk.gehituKarta(tximino);
		mk.gehituKarta(lehoia);
		mk.gehituKarta(kanguru);
		mk.gehituKarta(hipo);
		assertEquals(4,mk.getPosizioa(hipo.getIzena(), hipo.getKolorea()));
		hipo.animaladaEgin();
		assertEquals(3,mk.getPosizioa(hipo.getIzena(), hipo.getKolorea()));
		
		// Zebra ezin aurreratu, 3 pos-en gelditu
		mk.kenduKartaPos(2);
		mk.gehituKartaPos(zebra, 2);
		hipo.animaladaEgin();
		assertEquals(3,mk.getPosizioa(hipo.getIzena(), hipo.getKolorea()));
		
		// Aurreko guztiak aurreratu, 0 pos-en gelditu
		mk.kenduKartaPos(2);
		mk.gehituKartaPos(mofeta, 2);
		assertEquals(3,mk.getPosizioa(hipo.getIzena(), hipo.getKolorea()));
		hipo.animaladaEgin();
		assertEquals(0,mk.getPosizioa(hipo.getIzena(), hipo.getKolorea()));
	
		
	}
}
