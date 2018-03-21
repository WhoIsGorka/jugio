package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KartaProba {
	Karta k1;
	@Before
	public void setUp() throws Exception {
		k1 = new Karta(6,"Itsaslehoia"," ",false,2,"urdina");
	}

	@After
	public void tearDown() throws Exception {
		k1= null;
	}

	@Test
	public void testKarta() {
		assertNotNull(k1);
	}

	@Test
	public void testGetIzena() {
		assertEquals(k1.getIzena(),"Itsaslehoia");
	}

}
