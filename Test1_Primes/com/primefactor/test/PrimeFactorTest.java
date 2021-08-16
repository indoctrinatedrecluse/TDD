package com.primefactor.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.primefactor.logic.PrimeFactorLogic;

public class PrimeFactorTest {
	private static PrimeFactorLogic factor;
	
	@BeforeClass
	public static void init () throws Exception {
		factor = new PrimeFactorLogic();
	}
	
	@Test
	public void factorOfZeroIsNothing () {
		factor.getFactor();
	}
}
