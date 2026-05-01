package testngtests;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseRefTest {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void preReqBaseTest() 
	{
		
	    System.out.println("I am in before Method");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void packUptest()
	{
		driver.quit();
		System.out.println("I am in after method");
	

}
}


