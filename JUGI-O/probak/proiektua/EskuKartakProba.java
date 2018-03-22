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
		Karta k1 = new Karta(4,"Tximinoa"," ",false,3,"urdina");
		ek.gehituKarta(k1);
		assertEquals(1,ek.luzera());
		
		Karta k2 = new Karta(2,"Loroa"," ",false,4,"urdina");
		ek.gehituKarta(k2);
		assertEquals(2,ek.luzera());			
	}
	
	@Test
	public void testKenduKarta() {
		Karta k1 = new Karta(4,"Tximinoa"," ",false,3,"urdina");
		Karta k2 = new Karta(2,"Loroa"," ",false,4,"urdina");
		ek.gehituKarta(k1);
		ek.gehituKarta(k2);
		
		ek.kenduKarta(1);		
		assertEquals(1,ek.luzera());
		
		ek.kenduKarta(0);
		assertEquals(0,ek.luzera());
				
	}

}
