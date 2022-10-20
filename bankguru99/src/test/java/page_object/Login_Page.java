package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
WebDriver driver;

public Login_Page(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@name='uid']") 
	WebElement uid;
		
	@FindBy(xpath="//input[@name='password']") 
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']") 
	WebElement btnLogin;
	
	@FindBy(xpath = "//img[@src='/logo.png']")
	WebElement imglogo;
	
	@FindBy(xpath  = "//marquee[@class='heading3']")
	WebElement Welcomemsg;
	

	@FindBy(xpath  = "//input[@name='btnReset']")
	WebElement Reset;
	
	//logo
	
	public boolean verifybankguru99logo() {
		try {
	return imglogo.isDisplayed();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
		}

	//userId
	
	public void EnteruserID(String userid) {
		try {
	uid.clear();
	uid.sendKeys(userid);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	public String verifyTextuserID() {
		try {
	       return uid.getAttribute("value");
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}
	
	//password
	
	public String verifyTextPass() {
		try {
	       return password.getAttribute("value");
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}
	
	public void EnterPass(String pass) {
		try {
		password.clear();
		password.sendKeys(pass);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	//clickbtn
	
	public void clickLoginbtn() {
		btnLogin.click();
		
	}
	
	//after login wel msg
	
	public String showMsg() {
		try {
		return	Welcomemsg.getText();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		return null;
		
	}
	
	//for invalid credential
	
	public String popUpMsg() {
	
		try {
	return	driver.switchTo().alert().getText();
		}catch(Exception e) {
			e.getStackTrace();
		}
		return null;
		
		
	}
	
	//click popup btn
	
	public void popUpOkBtn() {
		
		try {
		driver.switchTo().alert().accept();
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		
	}
	
	
	//reset btn
	
      public void buttonReset() {
	     Reset.click();
		
		
	}
	

}
	
	
	






