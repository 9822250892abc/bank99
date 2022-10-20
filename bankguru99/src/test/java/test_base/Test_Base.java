package test_base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Base {
	
	public WebDriver driver;


	@BeforeTest
	@Parameters({"brname","appUrl"})
	public void setUp(@Optional("chrome")String browser ,@Optional("https://demo.guru99.com/v4/index.php") String url)  {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver =new ChromeDriver();
		}
		
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver" , "./Driver/geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Browser not matched with reqwired browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	


	@AfterTest

	public void closeTheBrowser() {
		//driver.quit();
	}

}