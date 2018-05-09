package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MofetaProba {
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta Mofeta =null; 

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoia = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Urdina");
	Karta Mofeta2 = new Mofeta(1,"Mofeta"," ",false,4,"1mofetaBerde.PNG","Berdea");
	Karta zebra2 = new Zebra(7,"Zebra"," ",true,4,"7zebraBerde.PNG","Berdea");
	@Before
	public void setUp() throws Exception {
		Mofeta = new Mofeta(1,"Mofeta"," ",false,4,"1mofetaAzul.PNG","Urdina");
	}

	@After
	public void tearDown() throws Exception {
		Mofeta= null;
	}
	
	@Test
	public void testJokalaria() {
		assertNotNull(Mofeta);
	}
	
	@Test
	public void testAnimaladaEgin() {

		mk.gehituKarta(kanguru);
		mk.gehituKarta(Mofeta);
		Mofeta.animaladaEgin();
		
//		assertSame(-1,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));
		
		mk.gehituKarta(Mofeta2);
		Mofeta.animaladaEgin();

//		assertSame(2,mk.getTamaina());
		
		mk.gehituKarta(lehoia);
		mk.gehituKarta(zebra);
		mk.gehituKarta(loro);
		
		Mofeta.animaladaEgin();
//		assertSame(-1,mk.getPosizioa(lehoia.getIzena(), lehoia.getKolorea()));
//		assertSame(-1,mk.getPosizioa(zebra.getIzena(), zebra.getKolorea()));
//		assertSame(2,mk.getPosizioa(loro.getIzena(), loro.getKolorea()));
//		assertSame(3,mk.getTamaina());
		
		mk.gehituKarta(zebra2);
		mk.gehituKarta(lehoia);
		mk.gehituKarta(zebra);
		mk.kenduKartaPos(2);
		
		Mofeta.animaladaEgin();
		assertSame(-1,mk.getPosizioa(lehoia.getIzena(), lehoia.getKolorea()));
		assertSame(-1,mk.getPosizioa(zebra.getIzena(), zebra.getKolorea()));
		assertSame(-1,mk.getPosizioa(zebra2.getIzena(), zebra2.getKolorea()));
		assertSame(2,mk.getTamaina());
		
		
	}
}
