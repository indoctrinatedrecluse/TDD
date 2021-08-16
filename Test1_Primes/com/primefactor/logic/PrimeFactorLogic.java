package com.primefactor.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorLogic {
	
	public List<Integer> getFactor(int number) {
		ArrayList<Integer> primeFactors = new ArrayList<>();
		if (number<2)
			return primeFactors;
		
		int testFactor = 2;
		
		while (number>1) {
			while (number%testFactor == 0) {
				primeFactors.add(testFactor);
				number/=testFactor;
			}
			testFactor++;
		}
		
		return primeFactors;
	}
}
