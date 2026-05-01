package testngtests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.datafaker.Faker;

public class SeleniumPracticeTest {
	@Test
	public void practiceTest()
	{
		Faker fake = new Faker();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://techbeamers.com/selenium-practice-test-page/");
		
		 WebElement pageHead =driver.findElement(By.xpath("//h2[text()='Welcome to the Selenium Practice Test Suite']"));
		  String heading1 = pageHead.getText();
		  
		  Assert.assertEquals(heading1,"Welcome to the Selenium Practice Test Suite");
		
		  WebElement userNameEle = driver.findElement(By.xpath("//input[@id='username']"));
		  userNameEle.sendKeys(fake.lorem().characters(3,true,false));
		  
		 WebElement emailEle =driver.findElement(By.xpath("(//input[@id='email'])[1]"));
		 emailEle.sendKeys(fake.internet().emailAddress());
		  
		 WebElement passwordEle =driver.findElement(By.xpath("//input[@id='password']"));
		 passwordEle.sendKeys(fake.credentials().password(8, 12))	;	  
		 
		 WebElement bioEle =driver.findElement(By.xpath("//textarea[@id='bio']"));
		 bioEle.sendKeys(fake.lorem().sentence());
		 
		 bioEle.sendKeys(Keys.TAB);
		WebElement countryEle= driver.findElement(By.xpath("//select[@id='country']"));
		Select dd = new Select(countryEle);
		List<WebElement> options= dd.getOptions();
		int size = options.size();
		if(size>1)
		{
		  dd.selectByIndex(size-3);
		}
	
//		dd.selectByContainsVisibleText("man");
//		dd.selectByIndex(0);
//		dd.deselectByValue("jp");
//		dd.selectByVisibleText("French");
//		use multi select
		
		
	}

}
