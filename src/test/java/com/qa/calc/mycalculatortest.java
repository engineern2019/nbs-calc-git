package com.qa.calc;

import org.junit.Assert;
import org.junit.Test;

public class mycalculatortest {

	@Test
	public void addTwoNumbersTogetherTest() {
		calculator calculator = new calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4,  result);
	}
	public void subtractTwoNumbersTest() {
		calculator calculator = new calculator();
		int result = calculator.subtract(10,5);
		Assert.assertEquals(5, result);
	}
	public void multiplyTwoNumberstest() {
		calculator calculator = new calculator();
		int result = calculator.multiply(2,10);
		Assert.assertEquals(20, result);
	}

}
