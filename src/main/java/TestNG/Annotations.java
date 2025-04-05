package TestNG;

import org.testng.annotations.Test;

public class Annotations {
//DEFAULT PRIORITY IT WILL BE ZERO
		@Test (priority = 1, groups = {"Sanity"})
		void openApp() {
			System.out.println("opening the app");		
		}
		@Test(priority = 3)
		void login() {
			System.out.println("Login in the App");		
		}
		@Test(priority = 2, groups = {"Sanity"})
		void verifyLogo() {
			System.out.println("Verfiy the app Logo");		
		}
		@Test(priority = 4,  groups = {"Sanity"})
		void Logout() {
			System.out.println("Logout from the app");		
		}

	

}
