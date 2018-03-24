package proiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TableroProba {
	Tableroa t;
	EskuKartak ek;
	
	@Before
	public void setUp() throws Exception {
		t = new Tableroa();
	}
	
	@After
	public void tearDown() throws Exception {
		t = null;
	}
	@Test
	public void testTableroa() {
		assertNotNull(t);
	}
	
	@Test
	public void testKartakSortu() {
		t.KartakSortu();
		assertNotNull(t);
	}
	
	@Test
	public void testPartidaJolastu() {
		t.partidaJolastu();
		assertEquals(ek.luzera(),12);
	}
	
	

}
