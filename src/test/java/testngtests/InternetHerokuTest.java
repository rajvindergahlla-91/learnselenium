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

//Test: Validate the user can enable the text field on Dynamic Control Page
//
//Steps:
//
//1. Go to https://the-internet.herokuapp.com/
//2. Click on Dynamic Controls link
//3. Wait for the disabled text field to appear under Enable/disable section
//4. Click on Enable button 
//5. Wait until Enable button is disappeared, Validate that "Disable" button appears and is clickable  (Note: you need to use three different exp wait methods here)
//6. Validate that "It's enabled!" message is displayed

public class InternetHerokuTest {
	@Test
	public void dynamicControlTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dynamic Controls']"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enable']"))).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Enable']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Disable']")));
		System.out.println("Disable button appears and is clickable");
		
		WebElement messageHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		String heading= messageHeading.getText();
		Assert.assertEquals(heading,"It's enabled!");
		System.out.println("required message displayed successfully ");
		driver.quit();
		}

}
