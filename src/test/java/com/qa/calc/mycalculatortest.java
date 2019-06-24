package com.qa.calc;

import org.junit.Assert;
import org.junit.Test;

public class mycalculatortest {

	@Test
	public void addTwoNumbersTogetherTest() {
		calculator calculator = new calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4,  result);
		// test
	}

}
