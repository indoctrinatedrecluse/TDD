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
	
	@Test
	public void factorOfThreeIsThree () {
		assertEquals(Arrays.asList(3), factor.getFactor(3));
	}
	
	@Test
	public void factorsOfFourAreTwoTwos () {
		assertEquals(Arrays.asList(2, 2), factor.getFactor(4));
	}
	
	@Test
	public void factorsOfNegativeNumbersAreNothing () {
		assertEquals(Arrays.asList(), factor.getFactor(-1));
	}
}
