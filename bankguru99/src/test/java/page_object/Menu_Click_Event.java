package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu_Click_Event {
	
	WebDriver driver;
	
	public Menu_Click_Event(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	
	@FindBy(xpath="//a[normalize-space()='New Customer']") 
	
	//@FindBy(xpath = "//a[text()='New Customer']")
	WebElement newCustomer;
	
	@FindBy(xpath = "//a[normalize-space()='Edit Customer']")
	
	//@FindBy(xpath = "//a[text()='Edit Customer']")
	WebElement editCustomer;

	@FindBy(xpath = "//a[normalize-space()='Delete Customer']")
	
	//@FindBy(xpath = "//a[text()='Delete Customer']")
	WebElement deleteCustomer;
	
	@FindBy(xpath="//a[normalize-space()='New Account']")
	
	//@FindBy(xpath = "//a[text()='New Account']")
	WebElement newAccount;
	
	
	
	
	public void clickNewCustomerbtn() {
		newCustomer.click();		
	}
	
	public void clickEditCustomerbtn() {
		editCustomer.click();		
	}
	
	
	public void clickDeleteCustomerbtn() {
		deleteCustomer.click();		
	}
	
	public void clickNewAccountbtn() {
		newAccount.click();		
	}
	
	
	

}
