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

public class AmazonTest {
	@Test
	
	public void productXpathTest()
	{
		By iphone15pro=By.xpath("//h2[@aria-label='Apple iPhone 16e, 128GB, eSIM, Black - Unlocked (Renewed)']/following::h2[@aria-label='Apple iPhone 15 Pro Max, 512GB, Blue Titanium - Unlocked (Renewed)']");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/s?k=iphone+15&crid=2LXQ1GJ5HFB9O&sprefix=iphone+15+%2Caps%2C145&ref=nb_sb_noss_2");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement description =wait.until(ExpectedConditions.visibilityOfElementLocated(iphone15pro));
		String text =description.getText();
		
		Assert.assertEquals(text,"Apple iPhone 15 Pro Max, 512GB, Blue Titanium - Unlocked (Renewed)\"");
		System.out.println("element Found");
		
		
	}

}
