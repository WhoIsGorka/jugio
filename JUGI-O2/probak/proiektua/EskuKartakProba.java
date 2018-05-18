package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EskuKartakProba {
	EskuKartak ek;
	@Before
	public void setUp() throws Exception {
		ek = new EskuKartak();
	}

	@After
	public void tearDown() throws Exception {
		ek=null;
	}

	@Test
	public void testEskuKartak() {
		assertNotNull(ek);
	}
	
	@Test
	public void testGehituKarta() {
		Karta k1 = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
		ek.gehituKarta(k1);
		assertEquals(1,ek.luzera());
		
		Karta k2 = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
		ek.gehituKarta(k2);
		assertEquals(2,ek.luzera());			
	}
	@Test
	public void testGetKarta() {
		Karta k1 = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
		ek.gehituKarta(k1);
		assertEquals(k1,ek.getKarta(0));
	}
	@Test
	public void testKenduKarta() {
		Karta k1 = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
		Karta k2 = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
		ek.gehituKarta(k1);
		ek.gehituKarta(k2);
		
		ek.kenduKarta(1);		
		assertEquals(1,ek.luzera());
		
		ek.kenduKarta(0);
		assertEquals(0,ek.luzera());			
	}
	@Test
	public void testHutsaDa() {
		assertTrue(ek.hutsaDa());
	}
	@Test
	public void testLuzera() {
		assertEquals(0,ek.luzera());
	}
}
