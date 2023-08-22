package com.masaischool.masterclass_junit_mockito;

public class MathUtils {
	/**
	 * This method is used to find the question of two int numbers
	 * @param a int; numerator for the division
	 * @param b int; denominator for the division
	 * @return quotient as result for the division operation
	 */
	public int divisionInt(int a, int b) {
		return (a/b);
	}
	
	/**
	 * This method is used to find the question of two double numbers
	 * @param a double; numerator for the division
	 * @param b double; denominator for the division
	 * @return quotient as result for the division operation
	 */
	public double divisionDouble(double a, double b) {
		return (a/b);
	}
	
	/**
	 * This method is to check if the given number is prime or not
	 * @param number: int; the value to be checked for prime
	 * @return true if the number is prime; false otherwise
	 */
	public boolean isPrime(int number) {
		if(number < 2)
			return false;
		//you are here means number is 2 or more
		if(number <= 3)
			return true;
		//you are here means number is 4 or more
		int count = 2;
		while(count < number) {
			if(number % count == 0)
				return false;
			count++;
		}
		//you are here means count is equal to number i.e. number is prime
		return true;
	}
}
