package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JokalariaProba {
	Jokalaria j1;
	EskuKartak ek = new EskuKartak();
	MazoKartak m = new MazoKartak();
	//Kartak sortu
	Karta k1 = new Mofeta(1,"Mofeta"," ",false,4,"1mofetaAzul.PNG","Urdina");
	Karta k2 = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta k3 = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta k4 = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");

	@Before
	public void setUp() throws Exception {
		j1 = new Ni(0, null, ek, m, 0);
		//Jokalariaren atributuak ezarri
		j1.setJokalariarenIzena("floyd");
		j1.setJokalariarenId(1);
		j1.setPuntuazioa(1);
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
		j1.getEskuKartak().gehituKarta(k1);
		j1.getEskuKartak().gehituKarta(k2);
		j1.getEskuKartak().gehituKarta(k3);
		j1.getEskuKartak().gehituKarta(k4);
		assertEquals(j1.getEskuKartak().luzera(),4);
	}
	
	@Test
	public void testGetMazoa() {
		j1.getMazoa().gehituKarta(k1);
		j1.getMazoa().gehituKarta(k2);
		j1.getMazoa().gehituKarta(k3);
		j1.getMazoa().gehituKarta(k4);
		assertEquals(j1.getMazoa().tamaina(),4);
	}
	
	@Test
	public void testGetPuntuazioa() {
		assertEquals(j1.getPuntuazioa(),1);
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
		j1.getMazoa().gehituKarta(k1);
		j1.getMazoa().gehituKarta(k2);
		j1.getMazoa().gehituKarta(k3);
		j1.getMazoa().gehituKarta(k4);
		j1.hartuLehenegoLauKartak();
		assertEquals(j1.getEskuKartak().luzera(),4); //Eskuan jada gehitu diogu 4 karta, beraz beste 4 hartu behar ditu.
	}
	
	@Test
	public void testHartuKartaBat() {
		j1.hartuKartaBat();
		assertEquals(j1.getEskuKartak().luzera(),0);
		j1.getMazoa().gehituKarta(k1);
		j1.hartuKartaBat();
		assertEquals(j1.getEskuKartak().luzera(),1);
	}
	@Test
	public void testHartuKarta() {
		j1.getMazoa().gehituKarta(k1);
		j1.getMazoa().gehituKarta(k2);
		j1.getMazoa().gehituKarta(k3);
		j1.getMazoa().gehituKarta(k4);
		j1.hartuKarta();
		assertEquals(j1.getEskuKartak().luzera(),4); // Esku kartan ez dago kartarik
		j1.getMazoa().gehituKarta(k1);
		j1.hartuKarta();
		assertEquals(j1.getEskuKartak().luzera(),4); // 4 karta daude, beraz ez du kartarik hartuko
		j1.getEskuKartak().kenduKarta(0);
		j1.hartuKarta();
		assertEquals(j1.getEskuKartak().luzera(),4); // 3 karta dauzka, eta mazoan karta bat dago
		j1.hartuKarta();
		assertEquals(j1.getEskuKartak().luzera(),4); // 4 karta dauzka eta mazoa hutsik
	}
}
