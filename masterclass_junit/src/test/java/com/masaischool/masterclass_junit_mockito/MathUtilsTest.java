package com.masaischool.masterclass_junit_mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class MathUtilsTest {	
	@Test
	public void testDivisionInt() {
		MathUtils mu = new MathUtils();
		assertEquals(2, mu.divisionInt(10, 5));		//a = 10, b = 5 ---> 2
		assertEquals(-2, mu.divisionInt(-10, 5));	//a = -10, b = 5 ---> -2
		assertEquals(2, mu.divisionInt(-10, -5));	//a = -10, b = -5 ---> 2
		assertEquals(-2, mu.divisionInt(10, -5));	//a = 10, b = -5 ---> -2
		assertEquals(2, mu.divisionInt(15, 7));		//a = 15, b = 7 ---> 2
		assertEquals(0, mu.divisionInt(0, 5));		//a = 0, b = 5 ---> 0
		
		assertThrows(ArithmeticException.class, () -> mu.divisionInt(10, 0));	//a = 10, b = 0 ---> ArithmeticException
		assertThrows(ArithmeticException.class, () -> mu.divisionInt(0, 0));	//a = 0, b = 0 ---> ArithmeticException
	}
	
	@RepeatedTest(value = 4, name = "Running for {currentRepetition} out of {totalRepetitions}")
	public void testDivisionDouble(RepetitionInfo rp) {
		MathUtils mu = new MathUtils();
		int currentRepition = rp.getCurrentRepetition();
		
		switch(currentRepition) {
			case 1:
				assertEquals(2.0, mu.divisionDouble(10.0, 5.0));				//a = 10.0 b = 5.0 ---> 2.0
				break;
			case 2:
				assertEquals(1.25, mu.divisionDouble(10.0, 8.0));				//a = 10.0 b = 8.0 ---> 1.25
				break;
			case 3:
				assertTrue(Double.isInfinite(mu.divisionDouble(10.0, 0.0)));	//a = 10.0 b = 0.0 ---> INF 
				break;
			case 4:
				assertTrue(Double.isNaN(mu.divisionDouble(0.0, 0.0)));			//a = 0.0 b = 0.0 ---> NaN
				break;
		}
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2, 3, 7, 13})
	public void testIsPrime(int number) {
		MathUtils mu = new MathUtils();
		assertTrue(mu.isPrime(number));
	}
}
