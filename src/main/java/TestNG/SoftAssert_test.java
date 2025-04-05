package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_test {
	
	@Test
	void testCase1() {
		System.out.println("test execution Started");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		
		System.out.println("test case complete");
		sa.assertAll();
	}

}
