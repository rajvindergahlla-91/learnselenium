package theinternetherokutest;

import java.io.IOException;
//import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.BaseUtils;

public class BaseTest{
	WebDriver driver;
	WebDriverWait wait;
	
	
	@BeforeMethod
	public void preReqBaseTest() throws NumberFormatException, IOException
	{
		
	    System.out.println("I am in before Method");
	   
		driver=new ChromeDriver();
		driver.navigate().to(BaseUtils.getConfigValue("url"));
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("explicitwait"))));
	}
	
	@AfterMethod
	public void packUptest()
	{
		driver.quit();
		System.out.println("I am in after method");
	

}
}
