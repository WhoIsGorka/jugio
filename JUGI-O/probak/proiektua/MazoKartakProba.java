package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MazoKartakProba {
	MazoKartak m1;
	@Before
	public void setUp() throws Exception {
		m1= new MazoKartak();
	}

	@After
	public void tearDown() throws Exception {
		m1 = null;
	}

	@Test
	public void testMazoKartak() {
		assertNotNull(m1);
	}

	@Test
	public void testMazoaSortu() {
		EskuKartak kartak = new EskuKartak();
		Karta k1 = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Urdina");
		Karta k2 = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Urdina");
		Karta k3 = new Kamalehoia(5,"Kamalehoia"," ",false,3,"5camaleonAzul.PNG","Urdina");
		kartak.gehituKarta(k1);
		kartak.gehituKarta(k2);
		kartak.gehituKarta(k3);
		
		m1.mazoaSortu(kartak);
		
		assertEquals(m1.tamaina(),3);
	}

	@Test
	public void testGehituKarta() {
		Karta k1 = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Urdina");
		m1.gehituKarta(k1);
		assertEquals(1,m1.tamaina());
	}

	@Test
	public void testKenduKarta() {
		//EZ HUTSA
		Karta k1 = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Urdina");
		m1.gehituKarta(k1);
		Karta k2 = m1.kenduKarta();
		assertEquals(k1.getIzena(),k2.getIzena());
	
		
	}

	@Test
	public void testHutsaDa() {
		//HUTSA
		assertEquals(m1.hutsaDa(),true);
		//EZ HUTSA
		Karta k1 = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Urdina");
		m1.gehituKarta(k1);
		assertEquals(m1.hutsaDa(),false);
	}
	
	@Test
	public void testTamaina() {
		//HUTSA
		assertEquals(m1.tamaina(),0);
		//EZ HUTSA
		Karta k1 = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Urdina");
		m1.gehituKarta(k1);
		assertEquals(m1.tamaina(),1);
	}
}
