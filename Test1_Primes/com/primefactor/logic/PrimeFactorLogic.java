package com.primefactor.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class PrimeFactorLogic {
	
	public List<Integer> getFactor(int number) {
		ArrayList<Integer> primeFactors = new ArrayList<>();
		
		int sqrt = (int) Math.ceil(Math.sqrt(number));
		
		for (int testFactor = 2; number > 1 || testFactor <= sqrt; testFactor++) {
			for ( ; number % testFactor == 0; number /= testFactor) {
				primeFactors.add(testFactor);
			}
		}
		
		return primeFactors;
	}
}
