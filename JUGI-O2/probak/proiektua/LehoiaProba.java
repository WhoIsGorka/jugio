package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LehoiaProba {
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta lehoi =null; 

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoia2 = new Lehoia(12,"Lehoia"," ",false,2,"12lehoiaAzul.PNG","Urdina");
	Karta mofeta = new Mofeta(1,"Mofeta"," ",false,2,"1mofetaAzul.PNG","Urdina");
	@Before
	public void setUp() throws Exception {
		 lehoi = new Lehoia(12,"Lehoia"," ",true,2,"12leonBerde.PNG","Berdea"); 
	}

	@After
	public void tearDown() throws Exception {
		lehoi= null;
	}
	
	@Test
	public void testJokalaria() {
		assertNotNull(lehoi);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// beste lehoia bat
		mk.gehituKarta(lehoia2);
		mk.gehituKarta(tximino);
		mk.gehituKarta(loro);
		mk.gehituKarta(kanguru);
		mk.gehituKarta(lehoi);
		
		lehoi.animaladaEgin();
		assertSame(-1,mk.getPosizioa(lehoi.getIzena(), lehoi.getKolorea()));
	
		mk.kenduKartaPos(0);
		mk.gehituKarta(zebra);
		mk.gehituKarta(lehoi);
		
		lehoi.animaladaEgin();
		assertSame(0,mk.getPosizioa(lehoi.getIzena(), lehoi.getKolorea()));
		assertSame(-1,mk.getPosizioa(tximino.getIzena(), tximino.getKolorea()));
		
		
	}
}
