package testngtests;

import java.time.Duration;
//import java.util.List;

//import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertClassTest {
	@Test
	public void jsAlertTest()
	
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='JavaScript Alerts']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click for JS Alert']"))).click();
		
	
		Alert alertText =wait.until(ExpectedConditions.alertIsPresent());
		String alertHead=alertText.getText();
		Assert.assertTrue(alertHead.equals("I am a JS Alert"));
		alertText.accept();
		
		WebElement resultEle =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='result']")));
		String heading=resultEle.getText();
		
		Assert.assertTrue(heading.equals("You successfully clicked an alert"));
		driver.quit();
		
	}

	@Test	
	public void	cancelJsConfirmTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='JavaScript Alerts']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click for JS Confirm']"))).click();
		
	
		Alert alertText =wait.until(ExpectedConditions.alertIsPresent());
		String alertHead=alertText.getText();
		Assert.assertTrue(alertHead.equals("I am a JS Confirm"));
		alertText.dismiss();
		
		WebElement resultEle =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='result']")));
		String heading=resultEle.getText();
		
		Assert.assertTrue(heading.equals("You clicked: Cancel"));
		driver.quit();
	}
		@Test
		public void jsPromptTest()
		{
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://the-internet.herokuapp.com/");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='JavaScript Alerts']"))).click();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click for JS Prompt']"))).click();
			
		
			Alert alertText =wait.until(ExpectedConditions.alertIsPresent());
			String alertHead=alertText.getText();
			Assert.assertTrue(alertHead.equals("I am a JS prompt"));
			alertText.sendKeys("Raj");
			alertText.accept();
			
			
			WebElement resultEle =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='result']")));
			String heading=resultEle.getText();
			
			Assert.assertTrue(heading.equals("You entered: Raj"));
			driver.quit();
		}

}
