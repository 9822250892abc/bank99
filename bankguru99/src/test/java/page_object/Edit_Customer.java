package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Customer {


	WebDriver driver;
	
	public Edit_Customer(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath = "//p[text()='Edit Customer Form']")
	WebElement editcustmsg;
	
	@FindBy(xpath = "//input[@name='cusid']")
	WebElement customerid;
	
	@FindBy(xpath = "//input[@name='res']")
	WebElement reseteditcust;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submitcus;
	
	@FindBy(xpath = "//p[text()='Edit Customer']")
	WebElement editcustformmsg;
	
//	@FindBy(xpath = "//input[@name='res']")
//	WebElement editcustformmsg;
//	
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']") 
	WebElement add;
	
	@FindBy(xpath="//input[@name='city']") 
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']") 
	WebElement state;
	
	@FindBy(xpath="//input[@name='name']") 
	 WebElement customername;
	
	@FindBy(xpath = "//input[@value='f']")
	WebElement GenderFemale;
	
	@FindBy(xpath="//input[@name='pinno']") 
	WebElement pin;
	
	@FindBy(xpath="(//input[@name='telephoneno'])[1]") 
	WebElement telephoneno;
	
	@FindBy(xpath="(//input[@name='emailid'])[1]") 
	WebElement emailid;
	
	@FindBy(xpath = "//input[@name='sub']")
	WebElement btneditsubmit;
	
	
	
	//edit customer msg
		public String viewmsg() {
			try {
			return	editcustmsg.getText();
			}
			catch (Exception e) {
				e.getStackTrace();
			}
			return null;
			
		}
		
	//customer id	

		public void txtCustomerID(String custid) {
			try {
				customerid.clear();
				customerid.sendKeys(custid);
			}
			catch (Exception e) {
				e.getStackTrace();
			}}
		
		//reset btn in edit customer
		public void btnReset() {
			try {
				reseteditcust.click();
			}
			catch (Exception e) {
				e.getStackTrace();
			}}
		
		
		public void btnSubmit() {
			try {
				submitcus.click();
			}
			catch (Exception e) {
				e.getStackTrace();
			}}
		
		//edit customer form msg
				public String editcustformmsg() {
					try {
					return	editcustformmsg.getText();
					}
					catch (Exception e) {
						e.getStackTrace();
					}
					return null;
					
				}
				
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
		

				public void rb2GenderF() {
					try {
						GenderFemale.click();;
						
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
				
				
				public void txtCustomername(String costomername) {
					try {
						customername.clear();
						customername.sendKeys(costomername);
					}
					catch (Exception e) {
						e.getStackTrace();
					}}
				
				public void btneditSubmit() {
					try {
						btneditsubmit.click();
					}
					catch (Exception e) {
						e.getStackTrace();
					}}
		}
		
		
		

