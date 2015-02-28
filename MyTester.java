/**
 * Author: MARTINEZ, AL JOHN B.
 * Student Number: 2012-61595
 * Lab Section: CMSC 128 AB-6L
**/

import static org.junit.Assert.*;
import org.junit.Test;


public class MyTester {

	@Test
	// Function that tests the predefined function that returns the factorial of a number
	public void testNfactorial() {
		MyCalculator calculator = new MyCalculator();
		int actual = calculator.nfactorial(2);
		assertEquals("2! is 2",2,actual,0.0);
		actual = calculator.nfactorial(4);
		assertEquals("4! is 24",24,actual,0.0);
	}

	@Test
	// Function that tests the predefined function that finds an element of an array
	public void testBinarySearch() {
		MyCalculator calculator2 = new MyCalculator();
		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int actual = calculator2.binarySearch(array, 11);
		assertEquals("Find 11",1,actual,0.0);	// Returns 1 if the element was not found
	}

}
