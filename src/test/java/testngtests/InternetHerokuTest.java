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
	public void dynamicControlTest() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Go to https://the-internet.herokuapp.com/
		driver.navigate().to("https://the-internet.herokuapp.com/"); 
		
		// Click on dynamic controls link
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dynamic Controls']"))).click(); 
		
		//wait for the disabled text field to appear under Enable/Disable section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		
		//click on Enable button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enable']"))).click();
		
		//wait until Enable button is disappeared
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Enable']")));
		
		// validate that "Disable" button appears is clickable
		WebElement disableBtnEle = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Disable']")));

		Assert.assertTrue(disableBtnEle.isEnabled() && disableBtnEle.isDisplayed(),"Disable button is not clickable") ;
			System.out.println("Disable button appears and is clickable");
		
       //validate that the "It's enabled!" message is displayed
		WebElement messageHeading = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		String heading = messageHeading.getText();

		Assert.assertEquals(heading, "It's enabled!", "message not displayed successfully");
		System.out.println("message displayed successfully ");

		driver.quit();
	}

	@Test
	public void dynamicControlTest2()
	{
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));  
		
		//Go to https://the-internet.herokuapp.com/
		driver.navigate().to(" https://the-internet.herokuapp.com/");
		
		//Click on Dynamic Controls link
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dynamic Controls']"))).click();   
		
		//Wait for the Remove button to be clickable under Remove/add section
		WebElement removeButtonEle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Remove')]")));
		
		//Click on checkbox
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']"))).click();
		
		//Click on Remove button
		removeButtonEle.click();
		
		//Validate that Remove button is removed and Add button appears and is clickable
	    boolean removeEle=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Remove')]")));
		Assert.assertTrue(removeEle,"button still present");
		
		WebElement addButtonEle=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		Assert.assertTrue(addButtonEle.isDisplayed() && addButtonEle.isEnabled(),
                "Add button is not displayed or clickable!");
		System.out.println("Remove button is removed and Add button is displayed successfully");
		
		//Validate that "It's gone!" message is displayed
		WebElement messageHeadingEle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		String head =messageHeadingEle.getText();
		Assert.assertEquals(head, "It's gone!", "message not displayed successfully");
		System.out.println("Its gone is displayed successfully");
		driver.quit();
			
		
		
		
	}
}
