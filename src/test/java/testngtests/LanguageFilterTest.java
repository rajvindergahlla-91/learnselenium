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
		By javaListOptions=By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[3]");
		
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
		By intermediateOption =By.xpath("//legend[text()='Level']/following::label[text()=' Intermediate']");
		By advancedOption =By.xpath("//legend[text()='Level']/following::label[text()=' Advanced']");
		By beginnerListOptions=By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[4]");
		
		
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(intermediateOption)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(advancedOption)).click();
	   List<WebElement> beginnersList= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy( beginnerListOptions));
	   
	   for(WebElement list : beginnersList )
	   {
		   String listOps =list.getText();
		   Assert.assertEquals(listOps,"Beginner");
	   }
	System.out.println("only beginner level is displayed in table");
}
	@Test
	public void minEnrollmentTest()
	{
		
		By dropDown=By.xpath("//legend[text()='Min enrollments']/following::div[@id='enrollDropdown']");
		By enrollOps=By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[5]");
		
		
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(dropDown)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='dropdown-menu']//li[text()='10,000+']"))).click();
	    List<WebElement> list =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enrollOps));
	    
	    for(WebElement eList: list)
	    {
	    	String enrollList =eList.getText();
	    	Integer value = Integer.valueOf(enrollList);
			Assert.assertTrue(value >= 10000);
	    	
	    }
	    System.out.println("enrollments greater than 10000 are present only");
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
