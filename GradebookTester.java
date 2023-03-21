import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {

	private GradeBook g1;
	private GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(89.0);
		g1.addScore(98.0);
		
		g2 = new GradeBook(5);
		g2.addScore(75.0);
		g2.addScore(82.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		// First Test
		int expectedSize = g1.getScoresSize() + 1;
		String expectedString = "89.0 98.0 99.0 0.0 0.0 ";
		
		g1.addScore(99.0);
		
		assertEquals(expectedSize, g1.getScoresSize());
		assertTrue(expectedString.equals(g1.toString()));
		
		//Second Test
		int expectedSize2 = g2.getScoresSize() + 1;
		String expectedString2 = "75.0 82.0 79.0 0.0 0.0 ";
		
		g2.addScore(79.0);
		
		assertEquals(expectedSize2, g2.getScoresSize());
		assertTrue(expectedString2.equals(g2.toString()));
	}

	@Test
	void testSum() {				
		assertEquals(187, g1.sum(), 0.0001);
		assertEquals(157, g2.sum(), 0.0001);
	}

	@Test
	void testMinimum() {
		assertEquals(89, g1.minimum(), 0.0001);
		assertEquals(75, g2.minimum(), 0.0001);
	}

	@Test
	void testFinalScore() {
		assertEquals(187, g1.sum(), 0.0001);
		assertEquals(157, g2.sum(), 0.0001);
	}
}
