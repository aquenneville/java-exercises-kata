package id;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ListArrayTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
		List<Object> list = new ListArray<Object>();		
		assertTrue(list.isEmpty());
	}
	
	@Test
	public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
		List<Object> list = new ListArray<Object>();		
		list.add(null);
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void givenListWithAnElement_WhenGet_thenThatElementIsReturned() {
		List<Object> list = new ListArray<>();
		list.add("text");
		Object element = list.get(0);
		assertEquals("text", element);
	}
	
	@Test
	public void givenEmptyList_whenElementIsAdded_thenGetReturnsThatElement() {
		 List<Object> list = new ListArray<>();
		 boolean succeeded = list.add(null);
		 
		 assertTrue(succeeded);
	}

	@Test
	public void givenListWithAnElement_whenAnotherIsAdded_thenGetReturnsBoth() {
		List<Object> list = new ListArray<>();
	    list.add("baeldung");
	    list.add(".com");
	    Object element1 = list.get(0);
	    Object element2 = list.get(1);
	 
	    assertEquals("baeldung", element1);
	    assertEquals(".com", element2);
	}
	
}
