package com.primefactor.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorLogic {
	
	public List<Integer> getFactor(int number) {
		ArrayList<Integer> primeFactors = new ArrayList<>();
		if (number<2)
			return primeFactors;
		while (number%2 == 0) {
			primeFactors.add(2);
			number/=2;
		}
		if (number%3 == 0)
			primeFactors.add(3);
		
		return primeFactors;
	}
}
