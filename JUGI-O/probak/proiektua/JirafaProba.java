package proiektua;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JirafaProba {
	Jokalaria j1;
	EskuKartak ek = new EskuKartak();
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta Jirafa =null; 

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoia = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Urdina");
	@Before
	public void setUp() throws Exception {
		Jirafa = new Jirafa(8,"Jirafa"," ",true,3,"8jirafaAzul.PNG","Urdina");
	}

	@After
	public void tearDown() throws Exception {
		Jirafa= null;
	}
	
	@Test
	public void testJokalaria() {
		assertNotNull(Jirafa);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// Aurrekoa ahulagoa denez, aurreratu
		mk.gehituKarta(kanguru);
		mk.gehituKarta(tximino);
		mk.gehituKarta(lehoia);
		mk.gehituKarta(kanguru);
		mk.gehituKarta(Jirafa);
		assertEquals(4,mk.getPosizioa(Jirafa.getIzena(), Jirafa.getKolorea()));
		Jirafa.animaladaEgin();
		assertEquals(3,mk.getPosizioa(Jirafa.getIzena(), Jirafa.getKolorea()));
		
		// Aurrekoa ezin aurreratu, dagoen lekuan geratu
		Jirafa.animaladaEgin();
		assertEquals(3,mk.getPosizioa(Jirafa.getIzena(), Jirafa.getKolorea()));
	}
}
