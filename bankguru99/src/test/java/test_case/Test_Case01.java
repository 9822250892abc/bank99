package test_case;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_object.Login_Page;
import test_base.Test_Base;

public class Test_Case01 extends Test_Base {
	
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

	@Test(priority = 6)
	public void loginTest() {

		lp.EnteruserID("mngr448494");
	lp.EnterPass("ynUtemE");
		lp.clickLoginbtn();

		if (lp.showMsg().equals("Welcome To Manager's Page of Guru99 Bank")) {
		 
			Assert.assertTrue(true);
			System.out.println("Login Susses...");
		} else {
			Assert.assertTrue(false);
			System.out.println("Login fail....");
		}
	}

	//Negative Test cases Automated
	
	@Test(priority = 2)
	public void loginTest01() {

		lp.EnteruserID("mngr448493");
		lp.EnterPass("ynUtemE");
		lp.clickLoginbtn();
			Assert.assertEquals(lp.popUpMsg(),"User or Password is not valid");
			lp.popUpOkBtn();
			
		
	}
	
	@Test(priority = 3)
	public void loginTest02() {

		lp.EnteruserID("mngr448494");
		lp.EnterPass("ynUtemaa");
		lp.clickLoginbtn();
			Assert.assertEquals(lp.popUpMsg(),"User or Password is not valid");
			lp.popUpOkBtn();
			
		
	}
	
	@Test(priority = 4)
	public void loginTest03() {

		lp.EnteruserID("mngr1234");
		lp.EnterPass("abcdef");
		lp.clickLoginbtn();
			Assert.assertEquals(lp.popUpMsg(),"User or Password is not valid");
			lp.popUpOkBtn();
			
		
	}
	
	@Test(priority = 5)
	public void reset() {

		lp.EnteruserID("mngr1234");
		lp.EnterPass("abcdef");
		lp.buttonReset();
		if(lp.verifyTextuserID().equals(null) && lp.verifyTextPass().equals(null)) {
			Assert.assertEquals(lp.verifyTextuserID(),null);
		}
		
	}

}
