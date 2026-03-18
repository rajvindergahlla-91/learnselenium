package walmartlogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.datafaker.Faker;

public class WalmartLoginTest {
	
	@Test
	public void  walmartTest()
	{
		//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//go to url
		driver.get("https://www.walmart.ca/en?cmpid=WMUSRedirect");
		
		//locate and click sign in account button
		WebElement signInAccEle =driver.findElement(By.xpath("//div[@style='margin-top: -4px;']"));
		signInAccEle.click();
		
		//locate and click sign in or create account option
		WebElement signInCreateACcEle =driver.findElement(By.xpath("//a[@data-testid='sign-in']"));
		signInCreateACcEle.click();
		
		//locate text field and type information
		WebElement phoneEmailEle =driver.findElement(By.xpath("//input[@aria-label='Phone or Email']"));
		 phoneEmailEle.sendKeys(new Faker().phoneNumber().cellPhone());
		 
		 //locate and click Continue button
		 WebElement continueButtonEle =driver.findElement(By.xpath("//button[text()='Continue']"));
		 continueButtonEle.click();
	}
	

}
