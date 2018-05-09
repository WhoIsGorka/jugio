package proiektua;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItsaslehoiaProba {
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta itsaslehoia = null;

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoia = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Urdina");
	@Before
	public void setUp() throws Exception {
		 itsaslehoia = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Urdina");
	}

	@After
	public void tearDown() throws Exception {
		itsaslehoia= null;
	}
	
	@Test
	public void testJokalaria() {
		assertNotNull(itsaslehoia);
	}
	
	@Test
	public void testAnimaladaEgin() {
		mk.gehituKarta(loro);
		mk.gehituKarta(tximino);
		mk.gehituKarta(lehoia);
		mk.gehituKarta(kanguru);
		mk.gehituKarta(itsaslehoia);
		
		itsaslehoia.animaladaEgin();
		assertSame(0,mk.getPosizioa(itsaslehoia.getIzena(), itsaslehoia.getKolorea()));
		assertSame(1,mk.getPosizioa(kanguru.getIzena(), kanguru.getKolorea()));
		assertSame(2,mk.getPosizioa(lehoia.getIzena(), lehoia.getKolorea()));
		assertSame(3,mk.getPosizioa(tximino.getIzena(), tximino.getKolorea()));
		assertSame(4,mk.getPosizioa(loro.getIzena(), loro.getKolorea()));
	}
}
