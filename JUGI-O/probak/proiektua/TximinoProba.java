package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TximinoProba {

	Jokalaria j1;
	EskuKartak ek = new EskuKartak();
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta tximinourdin=null;
	Karta tximinoberde = null;

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta hipo = new Hipopotamoa(11,"Hipopotamoa"," ",true,2,"11hipopotamoAzul.PNG","Urdina");
	Karta kokodrilo = new Kokodriloa(10,"Kokodriloa"," ",true,3,"10cocodriloAzul.PNG","Urdina");
	@Before
	public void setUp() throws Exception {
		tximinourdin = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina"); 
		tximinoberde = new Tximinoa(4,"Tximinoa"," ",false,3,"mono4Berde.png","Berdea");
	}

	@After
	public void tearDown() throws Exception {
		tximinourdin= null;
		tximinoberde = null;
	}
	
	@Test
	public void testJokalaria() {
		assertNotNull(tximinourdin);
		assertNotNull(tximinoberde);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// Tximino bakarra
		mk.gehituKarta(kanguru);
		mk.gehituKarta(tximinourdin);
		mk.gehituKarta(hipo);
		mk.gehituKarta(kokodrilo);
		
		tximinourdin.animaladaEgin();
		assertEquals(0,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));
		assertEquals(1,mk.getPosizioa(tximinourdin.getIzena(), tximinourdin.getKolorea()));
		assertEquals(2,mk.getPosizioa(hipo.getIzena(), hipo.getKolorea()));
		assertEquals(3,mk.getPosizioa(kokodrilo.getIzena(), kokodrilo.getKolorea()));
		
		// Tximino bat baino gehiago, bota hipo coco
		mk.gehituKarta(tximinoberde);
		
		tximinoberde.animaladaEgin();
		assertEquals(0,mk.getPosizioa(tximinoberde.getIzena(), tximinoberde.getKolorea()));
		assertEquals(1,mk.getPosizioa(tximinourdin.getIzena(), tximinourdin.getKolorea()));
		assertEquals(2,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));
	
		
	}

}
