package TestNG;

import org.testng.annotations.Test;

public class Suitstest {
	
	@Test
	public void login() {
		// TODO Auto-generated method stub
        System.out.println("Login 1");
	}
	@Test( groups = {"Sanity"})
	public void browserweb() {
		// TODO Auto-generated method stub
        System.out.println("browserweb");
	}
    @Test
	public void validatefunc() {
		// TODO Auto-generated method stub
        System.out.println("validatefunc");
	}
    @Test( groups = {"Sanity"})
	public void Logout() {
		// TODO Auto-generated method stub
        System.out.println("Logout");
	}


}
