package github.aq.stringcalculator;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testEmptyString() {
		Calculator calc = new Calculator();
		int total = calc.add("");
		assertEquals(total, 0);
	}
	
	@Test
	void testOneNumber() {
		Calculator calc = new Calculator();
		int total = calc.add("1");
		assertEquals(total, 1);
	}
	
	@Test
	void testTwoNumbers() {
		Calculator calc = new Calculator();
		int total = calc.add("1,2");
		assertEquals(total, 3);
		
		total = calc.add("1,2,");		
		assertEquals(total, 3);
	}	
	
	@Test
	void testOneNumberOneCharacter() {
		Calculator calc = new Calculator();
		try {
			calc.add("1,a");
		} catch (NumberFormatException ex) {
			assertTrue(true);
		}
	}
	
	@Test
	void testTenNumbers() {
		Calculator calc = new Calculator();
		int total = calc.add("2,2,2,2,2,2,2,2,2,2");		
		assertEquals(total, 20);
	}
	
	@Test
	void testNewLine() {
		Calculator calc = new Calculator();
		
		int total = 0;
				
		total = calc.add("1\n2,3");
		assertEquals(total, 6);
	}

}
