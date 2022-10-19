package test_case;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_object.Login_Page;
import test_base.Test_Base;

public class Test_Case02 extends Test_Base {
	
	Login_Page lp;
	
	@Test(priority = 1)
	public void verifybankguru99LogoTC()  {
	

		lp = new Login_Page(driver);

		if (lp.verifybankguru99logo())

		{
			Assert.assertTrue(true);
			
			
			System.out.println("bankguru99 Logo is displayed on login page");
			
		} else {
			System.out.println("bankguru99 Logo is not displayed on login page");
			
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 2)
	public void loginTest() {

		lp.EnteruserID("mngr448494");
	lp.EnterPass("ynUtemE");
		lp.clickLoginbtn();

		if (lp.shoeMsg().equals("Welcome To Manager's Page of Guru99 Bank")) {
		 
			Assert.assertTrue(true);
			System.out.println("Login Susses...");
		} else {
			Assert.assertTrue(false);
			System.out.println("Login fail....");
		}
	}


}
