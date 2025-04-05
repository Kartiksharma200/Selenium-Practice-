package Extent_Reports;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Extent_Reports.ExtentReports_Manager.class)
public class OrangeHRM_Test {
	

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
	@Test //(dependsOnMethods = "verifyNameTrue")
	void expTruthVal() {
		
		Assert.assertTrue(true, "OrangeHRM");
	}

}
