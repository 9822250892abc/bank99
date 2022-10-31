package test_case;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution01.orangehrm.utility.ExcelDataProvider;

import page_object.Add_NewCustomer;
import page_object.Edit_Customer;
import page_object.Login_Page;
import page_object.Menu_Click_Event;
import test_base.Test_Base;
import utility.Helper;

public class Test_Case04_ExcelData extends Test_Base {
	public static utility.ExcelDataProvider excelDataProvider;
	Login_Page lp;
	Menu_Click_Event me;
	Add_NewCustomer cust;
	Edit_Customer edit;
	ExcelDataProvider excel;
	
	
	
	@Test(priority = 1)
	public void loginTest() {
		lp=new Login_Page(driver);
	
		
		lp.EnteruserID(utility.ExcelDataProvider.getStringCellData(0,1,0));
		lp.EnterPass(utility.ExcelDataProvider.getStringCellData(0, 1, 1));
		lp.clickLoginbtn();

		if (lp.showMsg().equals("Welcome To Manager's Page of Guru99 Bank")) {

			Assert.assertTrue(true);
			System.out.println("Login Susses...");
			Helper.captureScreenshot(driver);
		} else {
			Assert.assertTrue(false);
			System.out.println("Login fail....");
		}
	}
	
	
	@Test(priority=2)
	public void verifyForm()  {
		me= new Menu_Click_Event(driver);
		cust=new Add_NewCustomer(driver);
		
		me.clickNewCustomerbtn();
		
		Assert.assertEquals(cust.showMssg(), "Add New Customer");
		
		
	}
	
	@Test(priority=3)
	public void addnewcustomer() {
		cust=new Add_NewCustomer(driver);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		cust.txtCustomername(utility.ExcelDataProvider.getStringCellData(1,2,0));
		cust.rb1GenderM();
		
		cust.txtDateofBirth(utility.ExcelDataProvider.getStringCellData(1, 2, 1));
		cust.txtAddress(utility.ExcelDataProvider.getStringCellData(1,2,2));
		cust.txtCity(utility.ExcelDataProvider.getStringCellData(1,2,3));
		cust.txtState(utility.ExcelDataProvider.getStringCellData(1,2,4));
		cust.txtPincode("411043");
		cust.txtTelephone("9763400000");
		cust.txtEmailID(utility.ExcelDataProvider.getStringCellData(1,2,7));
		cust.txtCustomerPass("123456789");
		
	
		cust.btnSubmit();
		
		
		
	
		
		Assert.assertEquals(cust.sussesfullDone(),"Customer Registered Successfully!!!");
		
		cust.linkbtnCountinue();
	}

}