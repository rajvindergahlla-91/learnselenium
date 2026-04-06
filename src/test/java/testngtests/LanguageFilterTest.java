package testngtests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageFilterTest {
	@Test
	public void languageJavaTest()
	{
		By java =By.xpath("//legend[text()='Language']//following::label[text()=' Java']");
		By javaListOptions=By.xpath("//table//th[@id='col_lang']/following::td[text()='Java']");
		
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(java)).click();
	    
	  //List<WebElement> javaList =driver.findElements(javaListOptions);
	   List<WebElement> javaList= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(javaListOptions));
	
	  for(WebElement list:javaList)
	  {
			  String listText =list.getText();
			  Assert.assertEquals(listText,"Java");
	  }
			  System.out.println("found all java options only");
//	  if(!listText.equals("Java"))
//	  {
//		  System.out.println("found non java option:" + listText);
//	  }
//	  else
//	  {
//		  System.out.println("found all java options:" + listText);
//	  }
	  
	    
	    
		
	}
	@Test
 public void levelBeginnersTest()
 {
 
	
}}
