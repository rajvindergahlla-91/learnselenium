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

import manger.DriverManager;
import utils.BaseUtils;

public class BaseTest{
	WebDriver driver;
	WebDriverWait wait;
	
	
	@BeforeMethod
	public void preReqBaseTest() throws NumberFormatException, IOException
	{
		DriverManager.initDriver();
		driver=DriverManager.getDriver();
	  
		wait = new WebDriverWait(driver,Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("explicitwait"))));
		 DriverManager.goToUrl("url");
	}
	
	@AfterMethod
	public void packUptest()
	{
		DriverManager.quitDriver();
	
}
}
