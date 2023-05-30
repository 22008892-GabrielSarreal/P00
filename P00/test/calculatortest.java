import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calculatortest {

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
	public void testAdd() {
			// Arrange
			int a = 1234;
			int b = 8765;
			calculator cal = new calculator();
			
			//Act
			int actual = cal.add(a, b); 
				 
			//Assert
			int expected = 9999;
			assertEquals (expected, actual);

	}
	
	@Test
	public void testSubtract() {
			// Arrange
			int a = 2023;
			int b = 1023;
			calculator cal = new calculator();
			
			//Act
			int actual = cal.subtract(a, b); 
				 
			//Assert
			int expected = 1000;
			assertEquals (expected, actual);

	}
	@Test
	public void testMultiple() {
			// Arrange
			int a = 5;
			int b = 20;
			calculator cal = new calculator();
			
			//Act
			int actual = cal.multiple(a, b); 
				 
			//Assert
			int expected = 100;
			assertEquals (expected, actual);

	}
	@Test
	public void testDivide() {
			// Arrange
			int a = 20;
			int b = 5;
			calculator cal = new calculator();
			
			//Act
			int actual = cal.divide(a, b); 
				 
			//Assert
			int expected = 4;
			assertEquals (expected, actual);

	}
	
}
