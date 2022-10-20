package test_case;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_object.Add_NewCustomer;
import page_object.Login_Page;
import page_object.Menu_Click_Event;
import test_base.Test_Base;

public class Test_Case02 extends Test_Base {
	
	Login_Page lp;
	Menu_Click_Event me;
	Add_NewCustomer cust;
	
	
	@Test(priority = 1)
	public void loginTest() {
		
		lp=new Login_Page(driver);

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
	
	
	@Test(priority=2)
	public void verifyForm()  {
		me= new Menu_Click_Event(driver);
		
		
		me.clickNewCustomerbtn();
	
			
			
			
		Assert.assertEquals(cust.showMssg(), "Add New Customer");
		
		
	}
	
	
	@Test(priority=3)
	public void addnewcustomer() {
		cust=new Add_NewCustomer(driver);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		cust.txtCustomername("shree");
		cust.rb1GenderM();
		cust.txtDateofBirth("05-06-1990");
		cust.txtAddress("Dhankwadi");
		cust.txtCity("Pune");
		cust.txtState("Maharashtra");
		cust.txtPincode("411043");
		cust.txtTelephone("9763400000");
		cust.txtEmailID("saeekumar90@gmail.com");
		cust.txtCustomerPass("123456789");
		cust.btnSubmit();
		
		Assert.assertEquals(cust.sussesfullDone(),"Customer Registered Successfully!!!");
	}


}
