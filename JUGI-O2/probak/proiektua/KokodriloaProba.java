package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class KokodriloaProba {
	MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
	Karta koko =null; 

	//Kartak sortu
	Karta loro = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
	Karta kanguru = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
	Karta tximino = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
	Karta zebra = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
	Karta lehoia = new Lehoia(12,"Lehoia"," ",false,2,"12lehoiaAzul.PNG","Urdina");
	Karta mofeta = new Mofeta(1,"Mofeta"," ",false,2,"1mofetaAzul.PNG","Urdina");
	@Before
	public void setUp() throws Exception {
		koko = new Kokodriloa(10,"Kokodriloa"," ",true,3,"10cocodriloAzul.PNG","Urdina");
	}

	@After
	public void tearDown() throws Exception {
		koko= null;
	}
	
	@Test
	public void testKokodriloa() {
		assertNotNull(koko);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// beste lehoia bat
		mk.gehituKarta(mofeta);
		mk.gehituKarta(tximino);
		mk.gehituKarta(loro);
		mk.gehituKarta(zebra);
		mk.gehituKarta(koko);
		
		koko.animaladaEgin();
		assertSame(4,mk.getPosizioa(koko.getIzena(), koko.getKolorea()));
	
		mk.kenduKartaPos(3);
		mk.gehituKartaPos(lehoia, 3);
		koko.animaladaEgin();
		assertSame(4,mk.getPosizioa(koko.getIzena(), koko.getKolorea()));
		
		mk.kenduKartaPos(3);
		mk.gehituKartaPos(kanguru, 3);
		koko.animaladaEgin();
		assertSame(1,mk.getTamaina());
		
		
		
	}
}
