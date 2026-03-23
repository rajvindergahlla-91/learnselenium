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



public class InternetHerokuTest {
	@Test
	public void dynamicControlTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");      //Go to https://the-internet.herokuapp.com/
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dynamic Controls']"))).click();   //Click on Dynamic Controls link
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));//Wait for the disabled text field to appear under Enable/disable section
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enable']"))).click();//click on Enable button 
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Enable']")));//Wait until Enable button is disappeared
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));//Validate that "Disable" button appears
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Disable']")));//is clickable
		System.out.println("Disable button appears and is clickable");
		
		WebElement messageHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		String heading= messageHeading.getText();
		Assert.assertEquals(heading,"It's enabled!");//Validate that "It's enabled!" message is displayed

		System.out.println("required message displayed successfully ");
		driver.quit();
		}

}
