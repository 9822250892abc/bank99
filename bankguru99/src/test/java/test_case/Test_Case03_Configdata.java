package test_case;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution01.orangehrm.utility.ConstantVarriable;

import page_object.Add_NewCustomer;
import page_object.Edit_Customer;
import page_object.Login_Page;
import page_object.Menu_Click_Event;
import test_base.Test_Base;
import utility.ConfigDataProvider;
import utility.Helper;

public class Test_Case03_Configdata extends Test_Base {
	
	public static ConfigDataProvider configDataProvider;
	Login_Page lp;
	Menu_Click_Event me;
	Add_NewCustomer cust;
	Edit_Customer edit;
	
	
	
	@Test(priority = 1)
	public void loginTest() {
		me= new Menu_Click_Event(driver);
		cust=new Add_NewCustomer(driver);
		edit=new Edit_Customer(driver);
		
		configDataProvider = new ConfigDataProvider(ConstantVarriable.ConfigDataProvider);
		lp=new Login_Page(driver);
		
		
		
		lp.EnteruserID(configDataProvider.getUserID());
		
	    lp.EnterPass(configDataProvider.getPassword());
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
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
	
	//enter in edit customer

	@Test(priority=2)
	public void verifyform() {
		
	
		me.clickEditCustomerbtn();
		Assert.assertEquals(edit.viewmsg(),"Edit Customer Form" );
		
	}
	
	//reset customer
	
	@Test(priority=3)
	public void resetcustomerid() {
		edit.txtCustomerID("36126");
		edit.btnReset();
		
	}
	
	
	@Test(priority=4)
public void entereditcustomerid() {
		edit.txtCustomerID("36126");
		edit.btnSubmit();
		edit.editcustformmsg();
	}
	
	@Test(priority=7)
	public void reseteditcustomerinfo() {
		edit.txtAddress("ramnagar");
		edit.txtCity("nashik");
		edit.txtState("karnatak");
edit.txtDateofBirth("11-07-2022");

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		edit.btnReset();
		
	}
	
	@Test(priority=6)
	public void entereditcustomerinfo() {
	//	edit.txtCustomername("maithili");
	//	edit.rb2GenderF();
	//	edit.txtDateofBirth("05-10-2020");
		edit.txtAddress("Katraj");
		edit.txtCity("Pune");
		edit.txtState("Maharashtra");
		edit.txtPincode("411043");
		edit.txtTelephone("9763400000");
		edit.txtEmailID("Prakashkumar90@gmail.com");
	    edit.btneditSubmit();
	    Helper.captureScreenshot(driver);
	    lp.popUpOkBtn();
	}
}
