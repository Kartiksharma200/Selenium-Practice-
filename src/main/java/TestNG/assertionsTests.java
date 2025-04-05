package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionsTests {
	
	String accName = "OrangeHRM";
	String expName = "OrangeHMR";
	
	
	@Test
    void verifyName() {
    	
     Assert.assertEquals(accName, expName);
    }
	
	@Test
    void verifyNameTrue() {
    	
     Assert.assertEquals("OrangeHMR", expName);
    }
	
	@Test
    void expTrue() {
    	
     Assert.assertTrue(false);
    }
}
