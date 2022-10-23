package page_object;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_NewCustomer {
	

	WebDriver driver;
	
	public Add_NewCustomer(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

	
	
	
	@FindBy(xpath="//input[@name='name']") 
	 WebElement customername;
	
	@FindBy(xpath = "//input[@value='m']")
	WebElement GenderMale;
	
	@FindBy(xpath = "//input[@value='f']")
	WebElement GenderFemale;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']") 
	WebElement add;
	
	@FindBy(xpath="//input[@name='city']") 
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']") 
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']") 
	WebElement pin;
	
	@FindBy(xpath="(//input[@name='telephoneno'])[1]") 
	WebElement telephoneno;
	
	@FindBy(xpath="(//input[@name='emailid'])[1]") 
	WebElement emailid;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement customerpassword;
	
	@FindBy(xpath="//input[@name='sub']") 
	WebElement sub;
	
	//@FindBy(xpath="//p[normalize-space()='Add New Customer']")
	@FindBy(xpath = "//p[text()='Add New Customer']")
	WebElement addcustmsg;
	
	@FindBy(xpath = "//*[@id=\"dismiss-button\"]")
	WebElement dismiss;

	@FindBy(xpath = "//p[normalize-space()='Customer Registered Successfully!!!']")
	WebElement customerregistered;
	
	@FindBy(linkText = "Continue")
	WebElement count;
	
	@FindBy(xpath = "//input[@name='res']")
	WebElement btnreset;
	
	
	
	//add customer info
	
	public void txtCustomername(String costomername) {
		try {
			customername.clear();
			customername.sendKeys(costomername);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	public void rb1GenderM() {
		try {
			
			GenderMale.click();;
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	public void rb2GenderF() {
		try {
			GenderFemale.click();;
			
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	public void txtDateofBirth(String dateofbirth) {
		try {
			dob.clear();
			dob.sendKeys(dateofbirth);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	public void txtAddress(String address) {
		try {
			add.clear();
			add.sendKeys(address);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	public void txtCity(String cityname) {
		try {
			city.clear();
			city.sendKeys(cityname);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	public void txtState(String statename) {
		try {
			state.clear();
			state.sendKeys(statename);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	public void txtPincode(String pinnumber) {
		try {
			pin.clear();
			pin.sendKeys(pinnumber);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	public void txtTelephone(String telenumber) {
		try {
			telephoneno.clear();
			telephoneno.sendKeys(telenumber);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	public void txtEmailID(String mailid) {
		try {
			emailid.clear();
			emailid.sendKeys(mailid);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	public void txtCustomerPass(String password01) {
		try {
			customerpassword.clear();
			customerpassword.sendKeys(password01);
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	
	//submit button
	
	public void btnSubmit() {
		try {
			sub.click();
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	//add customer msg
	public String showMssg() {
		try {
		return	addcustmsg.getText();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		return null;
		
	}
	
    //add customer sussesfully done msg
	public String sussesfullDone() {
		try {
		return	customerregistered.getText();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		return null;
		
	}
	
	
     //after sussesfully done continue
	public void linkbtnCountinue() {
		try {
			count.click();
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	
	//reset btn in addnew customer form
	public void btnReset() {
		try {
			btnreset.click();
		}
		catch (Exception e) {
			e.getStackTrace();
		}}
	

	
	
	

}
