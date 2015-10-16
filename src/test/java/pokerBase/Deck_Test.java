package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFullDeck() {
		int iDeckSize = 52;
		Deck d = new Deck();
		assertTrue(d.getTotalCards() == iDeckSize);		
	}
	
	@Test
	public void DrawOne() {
		int iDeckSize = 52;
		int iDeckSizeDrawOne = 51;
		
		Deck d = new Deck();
		assertTrue(d.getTotalCards() == iDeckSize);
		d.drawFromDeck();
		
		assertTrue(d.getTotalCards() == iDeckSizeDrawOne);		
	}
}
