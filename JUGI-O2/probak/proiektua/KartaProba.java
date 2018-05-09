package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KartaProba {
	Karta k1;
	@Before
	public void setUp() throws Exception {
		k1 =new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Urdina");
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
	
	@Test
	public void testGetIrudia() {
		assertEquals(k1.getIrudia(),"6focaAzul.PNG");
	}
	
	@Test
	public void testGetId() {
		assertEquals(k1.getId(),6);
	}
	
	@Test
	public void testGetKolorea() {
		assertEquals(k1.getKolorea(),"Urdina");
	}
	
	@Test
	public void testGetErrekurtsiboa() {
		assertEquals(k1.getErrekurtsiboa(),false);
	}
	
	@Test
	public void testGetPuntuak() {
		assertEquals(k1.getPuntuak(),2);
	}

}
