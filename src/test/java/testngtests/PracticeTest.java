package testngtests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTest {
	@Test
	public void loginTest()
	
	{
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Open the website
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		
		//Enter Username: tomsmith
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']"))).sendKeys("tomsmith");
		
		// Enter wrong Password: wrongpass
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']"))).sendKeys("wrongpass");
		
		//Click on Login button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-2x fa-sign-in']"))).click();
		
		//Validate:Error message appears,Text should be:👉 "Your password is invalid!"
	   String heading= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Your password is invalid!')]"))).getText();
	   Assert.assertTrue(heading.contains("Your password is invalid!"));
	   System.out.println("correct message appears successfully");
	   
	  
	}

}
