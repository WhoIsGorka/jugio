package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MahaiKartakProba {
	MahaiKartak mk;
	Karta k1 = new Tximinoa(4,"Tximinoa"," ",false,3,"urdina","Urdina");
	Karta k2 = new Loroa(2,"Loroa"," ",false,4,"urdina","Urdina");
	Karta k3 = new Tximinoa(4,"Tximinoa"," ",false,3,"berdea","Berdea");
	Karta k4 = new Loroa(2,"Loroa"," ",false,3,"berdea","Berdea");
	Karta k5 = new Lehoia(12,"Lehoia"," ",false,2,"berdea","Berdea");
	@Before
	public void setUp() throws Exception {
		mk = new MahaiKartak();
	}

	@After
	public void tearDown() throws Exception {
		mk = null;
	}

	@Test
	public void testMahaiKartak() {
		assertNotNull(mk);
	}

	@Test
	public void testGetKarta() {
		
		
		mk.gehituKarta(k1);
		mk.gehituKarta(k2);
		mk.gehituKarta(k3);
		mk.gehituKarta(k4);
		
		assertEquals(k1, mk.getKarta(0));
		assertEquals(k2, mk.getKarta(1));
		assertEquals(k3, mk.getKarta(2));
		assertEquals(k4, mk.getKarta(3));
				
	}
	
	@Test
	public void testGetPosizioa() {
				
		mk.gehituKarta(k1);
		mk.gehituKarta(k2);
		mk.gehituKarta(k3);
		mk.gehituKarta(k4);
		
		assertSame(0, mk.getPosizioa("Tximinoa", "Urdina"));
		assertSame(1,mk.getPosizioa("Loroa", "Urdina"));
		assertSame(2,mk.getPosizioa("Tximinoa", "Berdea"));
		assertSame(3,mk.getPosizioa("Loroa", "Berdea"));
		assertSame(-1,mk.getPosizioa("Mofeta", "Urdina"));
	}
	@Test
	public void testZenbatEspezieBera() {
			
		mk.gehituKarta(k1);
		mk.gehituKarta(k2);
		mk.gehituKarta(k3);
		
		assertSame(2,mk.zenbatEspezieBera("Tximinoa"));
		assertSame(1,mk.zenbatEspezieBera("Loroa"));
		assertSame(0,mk.zenbatEspezieBera("Sugea"));
	
	}
	@Test
	public void testEzabatuBat() {
		
		mk.gehituKarta(k1);
		mk.gehituKarta(k2);
		mk.gehituKarta(k3);
		mk.gehituKarta(k4);
		
		mk.ezabatuBat(k4.getIzena(), k4.getKolorea());
		assertSame(-1,mk.getPosizioa("Loroa", "Berdea"));
		
		mk.ezabatuBat(k2.getIzena(), k2.getKolorea());
		assertSame(-1,mk.getPosizioa("Loroa", "Urdina"));
		
		mk.ezabatuBat(k1.getIzena(), k1.getKolorea());
		assertSame(-1,mk.getPosizioa("Tximinoa", "Urdina"));
	}
	@Test
	public void testEzabatuGuztiak() {

		
		mk.gehituKarta(k1);
		mk.gehituKarta(k2);
		mk.gehituKarta(k3);
		mk.gehituKarta(k4);
		
		mk.ezabatuGuztiak("Zebra");
		assertSame(4, mk.getTamaina());
		
		mk.ezabatuGuztiak("Mofeta");
		assertSame(0,mk.zenbatEspezieBera("Mofeta"));
		
		mk.ezabatuGuztiak("Tximinoa");
		assertSame(0,mk.zenbatEspezieBera("Tximinoa"));
	}
	@Test
	public void testTabernanSartu() {
		mk.gehituKarta(k1);
		mk.gehituKarta(k2);
		mk.gehituKarta(k3);
		mk.gehituKarta(k4);
		mk.gehituKarta(k5);
		
		mk.tabernanSartu();
		assertSame(2, mk.getTamaina());
		assertSame(-1,mk.getPosizioa(k1.getIzena(), k1.getKolorea()));
		assertSame(-1,mk.getPosizioa(k2.getIzena(), k2.getKolorea()));
		assertSame(0,mk.getPosizioa(k3.getIzena(), k3.getKolorea()));
		assertSame(1,mk.getPosizioa(k4.getIzena(), k4.getKolorea()));
		assertSame(-1,mk.getPosizioa(k5.getIzena(), k5.getKolorea()));		
		
	}
	
}
