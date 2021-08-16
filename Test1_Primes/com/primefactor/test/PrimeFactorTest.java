package com.primefactor.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

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
		assertEquals(Arrays.asList(), factor.getFactor(0));
	}
	
	@Test
	public void factorOfTwoIsTwo () {
		assertEquals(Arrays.asList(2), factor.getFactor(2));
	}
}
