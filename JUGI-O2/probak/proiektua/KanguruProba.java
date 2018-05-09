package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class KanguruProba {
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta kanguru =null; 

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoi = new Lehoia(12,"Lehoia"," ",false,2,"12lehoiaAzul.PNG","Urdina");
	Karta mofeta = new Mofeta(1,"Mofeta"," ",false,2,"1mofetaAzul.PNG","Urdina");
	@Before
	public void setUp() throws Exception {
		 kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	}

	@After
	public void tearDown() throws Exception {
		kanguru= null;
	}
	
	@Test
	public void testJokalaria() {
		assertNotNull(kanguru);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// beste lehoia bat
		mk.gehituKarta(lehoi);
		mk.gehituKarta(tximino);
		mk.gehituKarta(loro);
		mk.gehituKarta(kanguru);
		
		kanguru.animaladaEgin();
		assertSame(1,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));
		kanguru.animaladaEgin();
		assertSame(0,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));
		kanguru.animaladaEgin();
		assertSame(0,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));

		
		
	
	
		
		
	}
}
