package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	void test1() {
		Assert.assertTrue(false);
		System.out.println("Test Case was failed");
	}

}
