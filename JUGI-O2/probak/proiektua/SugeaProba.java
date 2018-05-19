package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SugeaProba {
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta sugea =null; 

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta lehoia = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Urdina");
	Karta mofeta = new Mofeta(1,"Mofeta"," ",false,4,"mofeta1Berde.png","Berdea");
	@Before
	public void setUp() throws Exception {
		sugea = new Sugea(9,"Sugea"," ",false,2,"9serpienteAzul.PNG","Urdina");
	}

	@After
	public void tearDown() throws Exception {
		sugea= null;
	}
	
	@Test
	public void testSugea() {
		assertNotNull(sugea);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// Karta bat bakarrik ilaran
		mk.gehituKarta(sugea);
		
		sugea.animaladaEgin();
		assertEquals(0,mk.getPosizioa(sugea.getIzena(), sugea.getKolorea()));
		
		// 2 karta ilaran
		mk.gehituKarta(loro);
		
		sugea.animaladaEgin();
		assertEquals(0,mk.getPosizioa(sugea.getIzena(), sugea.getKolorea()));
		assertEquals(1,mk.getPosizioa(loro.getIzena(), loro.getKolorea()));
		
		// 3 karta ilaran
		mk.gehituKarta(tximino);

		sugea.animaladaEgin();
		assertEquals(0,mk.getPosizioa(sugea.getIzena(), sugea.getKolorea()));
		assertEquals(1,mk.getPosizioa(tximino.getIzena(), tximino.getKolorea()));
		assertEquals(2,mk.getPosizioa(loro.getIzena(), loro.getKolorea()));
		
		// 4 karta ilaran
		mk.gehituKarta(lehoia);
		
		sugea.animaladaEgin();
		assertEquals(0,mk.getPosizioa(lehoia.getIzena(), lehoia.getKolorea()));
		assertEquals(1,mk.getPosizioa(sugea.getIzena(), sugea.getKolorea()));
		assertEquals(2,mk.getPosizioa(tximino.getIzena(), tximino.getKolorea()));
		assertEquals(3,mk.getPosizioa(loro.getIzena(), loro.getKolorea()));
		
		// 5 karta ilaran
		mk.gehituKarta(kanguru);
		
		sugea.animaladaEgin();
		assertEquals(0,mk.getPosizioa(lehoia.getIzena(), lehoia.getKolorea()));
		assertEquals(1,mk.getPosizioa(sugea.getIzena(), sugea.getKolorea()));
		assertEquals(2,mk.getPosizioa(tximino.getIzena(), tximino.getKolorea()));
		assertEquals(3,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));
		assertEquals(4,mk.getPosizioa(loro.getIzena(), loro.getKolorea()));		
		
		
		mk.kenduKartaPos(2);
		mk.gehituKartaPos(mofeta, 2);
		sugea.animaladaEgin();
		assertEquals(0,mk.getPosizioa(lehoia.getIzena(), lehoia.getKolorea()));
		assertEquals(1,mk.getPosizioa(sugea.getIzena(), sugea.getKolorea()));
		assertEquals(2,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));
		assertEquals(3,mk.getPosizioa(loro.getIzena(), loro.getKolorea()));
		assertEquals(4,mk.getPosizioa(mofeta.getIzena(), mofeta.getKolorea()));
	}

}
