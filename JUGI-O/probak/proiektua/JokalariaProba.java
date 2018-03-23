package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JokalariaProba {
	Jokalaria j1;
	EskuKartak ek = new EskuKartak();
	MazoKartak m = new MazoKartak();
	

	@Before
	public void setUp() throws Exception {
		j1 = new Jokalaria();
		//Kartak sortu
		Karta k1 = new Karta(1,"Mofeta"," ",false,4,"urdina");
		Karta k2 = new Karta(2,"Loroa"," ",false,4,"urdina");
		Karta k3 = new Karta(3,"Kangurua"," ",false,4,"urdina");
		Karta k4 = new Karta(4,"Tximinoa"," ",false,3,"urdina");
		Karta k5 = new Karta(5,"Kamalehoia"," ",false,3,"urdina");
				
		//Esku kartak definitu
		ek.gehituKarta(k1);
		ek.gehituKarta(k2);
		ek.gehituKarta(k3);
		ek.gehituKarta(k4);
		m.gehituKarta(k1);
		m.gehituKarta(k2);
		m.gehituKarta(k3);
		m.gehituKarta(k4);
		m.gehituKarta(k5);
		
		//Jokalariaren atributuak ezarri
		j1.setJokalariarenIzena("floyd");
		j1.setJokalariarenId(1);
		j1.setPuntuazioa(0);
		j1.getEskuKartak().gehituKarta(k1);
		j1.getEskuKartak().gehituKarta(k2);
		j1.getEskuKartak().gehituKarta(k3);
		j1.getEskuKartak().gehituKarta(k4);
		j1.getMazoa().gehituKarta(k5);
	}

	@After
	public void tearDown() throws Exception {
		j1= null;
	}
	
	
	@Test
	public void testJokalaria() {
		assertNotNull(j1);
	}

	@Test
	public void testGetId() {
		assertEquals(j1.getId(),1);
	}
	
	@Test
	public void testGetIzena() {
		assertEquals(j1.getIzena(),"floyd");
	}
	
	@Test
	public void testGetEskuKartak() {
		assertEquals(j1.getEskuKartak().luzera(),4);
	}
	
	@Test
	public void testGetMazoa() {
		assertEquals(j1.getMazoa().tamaina(),1);
	}
	
	@Test
	public void testGetPuntuazioa() {
		assertEquals(j1.getPuntuazioa(),0);
	}
	
	@Test
	public void testSetJokalariarenIzena() {
		j1.setJokalariarenIzena("jose");
		assertEquals(j1.getIzena(),"jose");
	}
	
	@Test
	public void testSetJokalariarenId() {
		j1.setJokalariarenId(2);
		assertEquals(j1.getId(),2);
	}
		
	@Test
	public void testSetPuntuazioa() {
		j1.setPuntuazioa(1);
		assertEquals(j1.getPuntuazioa(), 1);
	}
	
	@Test
	public void testHartuLehenengoLauKartak() {
		j1.hartuLehenegoLauKartak();
		j1.getEskuKartak().luzera();
		assertEquals(j1.getEskuKartak().luzera(),8);
	}
	
	@Test
	public void testHartuKartaBat() {
		j1.hartuKartaBat();
		assertEquals(j1.getEskuKartak().luzera(),5);
	}
}
