package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MahaiKartakProba {
	MahaiKartak mk;
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
		Karta k1 = new Tximinoa(4,"Tximinoa"," ",false,3,"urdina","Urdina");
		Karta k2 = new Loroa(2,"Loroa"," ",false,4,"urdina","Urdina");
		Karta k3 = new Tximinoa(4,"Tximinoa"," ",false,3,"berdea","Berdea");
		Karta k4 = new Loroa(2,"Loroa"," ",false,3,"berdea","Berdea");
		
		mk.getLista().add(k1);
		mk.getLista().add(k2);
		mk.getLista().add(k3);
		mk.getLista().add(k4);
		
		assertEquals(k1, mk.getKarta(0));
		assertEquals(k2, mk.getKarta(1));
		assertEquals(k3, mk.getKarta(2));
		assertEquals(k4, mk.getKarta(3));
				
	}
	
	@Test
	public void testGetPosizioa() {
		Karta k1 = new Tximinoa(4,"Tximinoa"," ",false,3,"urdina","Urdina");
		Karta k2 = new Loroa(2,"Loroa"," ",false,4,"urdina","Urdina");
		Karta k3 = new Tximinoa(4,"Tximinoa"," ",false,3,"berdea","Berdea");
		Karta k4 = new Loroa(2,"Loroa"," ",false,3,"berdea","Berdea");
		
		mk.getLista().add(k1);
		mk.getLista().add(k2);
		mk.getLista().add(k3);
		mk.getLista().add(k4);
		
		assertSame(0, mk.getPosizioa("Tximinoa", "Urdina"));
		assertSame(1,mk.getPosizioa("Loroa", "Urdina"));
		assertSame(2,mk.getPosizioa("Tximinoa", "Berdea"));
		assertSame(3,mk.getPosizioa("Loroa", "Berdea"));
		assertSame(-1,mk.getPosizioa("Mofeta", "Urdina"));
	}
	@Test
	public void testZenbatEspezieBera() {
		Karta k1 = new Tximinoa(4,"Tximinoa"," ",false,3,"urdina","Urdina");
		Karta k2 = new Loroa(2,"Loroa"," ",false,4,"urdina","Urdina");
		Karta k3 = new Tximinoa(4,"Tximinoa"," ",false,3,"berdea","Berdea");

		
		mk.getLista().add(k1);
		mk.getLista().add(k2);
		mk.getLista().add(k3);
		
		assertSame(2,mk.zenbatEspezieBera("Tximinoa"));
		assertSame(1,mk.zenbatEspezieBera("Loroa"));
		assertSame(0,mk.zenbatEspezieBera("Sugea"));
	
	}
	@Test
	public void testEzabatuBat() {
		Karta k1 = new Tximinoa(4,"Tximinoa"," ",false,3,"urdina","Urdina");
		Karta k2 = new Loroa(2,"Loroa"," ",false,4,"urdina","Urdina");
		Karta k3 = new Tximinoa(4,"Tximinoa"," ",false,3,"berdea","Berdea");
		Karta k4 = new Loroa(2,"Loroa"," ",false,3,"berdea","Berdea");
		
		mk.getLista().add(k1);
		mk.getLista().add(k2);
		mk.getLista().add(k3);
		mk.getLista().add(k4);
		
		mk.ezabatuBat(k4.getIzena(), k4.getKolorea());
		assertSame(-1,mk.getPosizioa("Loroa", "Berdea"));
		
		mk.ezabatuBat(k2.getIzena(), k2.getKolorea());
		assertSame(-1,mk.getPosizioa("Loroa", "Urdina"));
		
		mk.ezabatuBat(k1.getIzena(), k1.getKolorea());
		assertSame(-1,mk.getPosizioa("Tximinoa", "Urdina"));
	}
	@Test
	public void testEzabatuGuztiak() {
		Karta k1 = new Tximinoa(4,"Tximinoa"," ",false,3,"urdina","Urdina");
		Karta k2 = new Loroa(2,"Loroa"," ",false,4,"urdina","Urdina");
		Karta k3 = new Mofeta(4,"Mofeta"," ",false,3,"urdina","Urdina");
		Karta k4 = new Loroa(2,"Loroa"," ",false,3,"berdea","Berdea");
		
		mk.getLista().add(k1);
		mk.getLista().add(k2);
		mk.getLista().add(k3);
		mk.getLista().add(k4);
		
		mk.ezabatuGuztiak("Zebra");
		assertSame(4, mk.getLista().size());
		
		mk.ezabatuGuztiak("Mofeta");
		assertSame(0,mk.zenbatEspezieBera("Mofeta"));
		
		mk.ezabatuGuztiak("Tximinoa");
		assertSame(0,mk.zenbatEspezieBera("Tximinoa"));
	}
	
}
