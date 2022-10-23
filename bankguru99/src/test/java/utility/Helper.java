package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static void captureScreenshot(WebDriver driver) {
		try {
		File scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("./ScreenShot/bank99_"+getCurrentDateTime()+".png");
		FileHandler.copy(scr, target);
		System.out.println("Screenshot caputred successfully");
		} catch (IOException e) {
			System.out.println("Screenshot is not caputred");
			e.printStackTrace();
		}
	}
   public static String getCurrentDateTime() {
	  DateFormat customeFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	 Date currentDate=new Date();
	 
	 return customeFormat.format(currentDate);
   }
   
   
}
