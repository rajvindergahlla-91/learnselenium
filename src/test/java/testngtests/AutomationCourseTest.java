package testngtests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationCourseTest {
	
	By java =By.xpath("//legend[text()='Language']//following::label[text()=' Java']");
	By javaListOptions=By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[3]");

	By intermediateOption =By.xpath("//legend[text()='Level']/following::label[text()=' Intermediate']");
	By advancedOption =By.xpath("//legend[text()='Level']/following::label[text()=' Advanced']");
	By beginnerListOptions=By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[4]");
	
	By dropDown=By.xpath("//legend[text()='Min enrollments']/following::div[@id='enrollDropdown']");
	By enrollOps=By.xpath("//table//tr[not(contains(@style, 'display: none'))]/td[5]");
	By anyOptions= By.xpath("//ul[@class='dropdown-menu']//li[text()='10,000+']");
	
	By pythonOp=By.xpath("//legend[text()='Language']//following-sibling::label[3]");
	By anyOption= By.xpath("//div[@class=\"dropdown-button\"]//following-sibling::ul//li[3]");
	By pythonTableEle=By.xpath("//table//tr[not(contains(@style, 'display:none'))]/td[3]");
	By beginnerTableEle=By.xpath("//table//tr[not(contains(@style, 'display:none'))]/td[4]");
	By enrollTableEle=By.xpath("//table//tr[not(contains(@style, 'display:none'))]/td[5]");
	
	
	By beginner =By.xpath("//legend[text()='Level']/following-sibling::label[1]");
	By noData=By.xpath("//div[@id='noData']");
	
	
	By resetButton=By.xpath("//button[text()='Reset']");
	By anyCheckbox=By.xpath("//legend[text()='Language']/following-sibling::label[' Any']/input[@checked]");
	By allLevelCheckBox=By.xpath("//legend[text()='Level']/following-sibling::label/input[@checked]");
	By enrollAny=By.xpath("//div[@class='dropdown-button']/span");
	By rows= By.xpath("//table/tbody/tr");
	
	
	By dropdown=By.xpath("//select[@id='sortBy']");
	By enrollColoumn=By.xpath("//table/tbody/tr/td[5]");
	
	
	
	
	
	@Test
	public void languageJavaTest()
	{
		
		
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
	  
	    
	    driver.quit();
		
	}
	@Test
 public void levelBeginnersTest()
 {
		
		
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
	 driver.quit();
}
	@Test
	public void minEnrollmentTest()
	{
		
		
		
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(dropDown)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(anyOptions)).click();
	    List<WebElement> list =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enrollOps));
	    
	    for(WebElement eList: list)
	    {
	    	String enrollList =eList.getText();
	    	Integer value = Integer.valueOf(enrollList);
			Assert.assertTrue(value >= 10000);
	    	
	    }
	    System.out.println("enrollments greater than 10000 are present only");
	    driver.quit();
	}
	@Test
	public void combinedfilterTest()
	{
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(pythonOp)).click();
        wait.until(ExpectedConditions.elementToBeClickable(intermediateOption)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(advancedOption)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(dropDown)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(anyOption)).click();
	    
	    WebElement python = wait.until(ExpectedConditions.visibilityOfElementLocated(pythonTableEle));
	    String pythonEle =python.getText();
	    WebElement begin= wait.until(ExpectedConditions.visibilityOfElementLocated(beginnerTableEle));
	    String beginEle=begin.getText();
	    WebElement enrol= wait.until(ExpectedConditions.visibilityOfElementLocated(enrollTableEle));
	    String enrolEle=enrol.getText();
	    int value = Integer.valueOf(enrolEle);
	   
	    Assert.assertEquals(pythonEle, "Python");
	    Assert.assertEquals(beginEle, "Beginner");
	    Assert.assertTrue(value>=10000);
	   System.out.println("only Python Beginner courses with ≥ 10,000 enrollments are visible");
	   driver.quit();
	
}
	@Test
	public void noResultsStateTest()
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(pythonOp)).click();
		wait.until(ExpectedConditions.elementToBeClickable(beginner)).click();
	    WebElement text =wait.until(ExpectedConditions.visibilityOfElementLocated(noData));
	    String textMsg=text.getText();
	    
	    Assert.assertTrue(textMsg.contains("No"));
	    System.out.println("no matching courses for this combination");
	    driver.quit();
	}	
	@Test
	public void resetButtonBehaviour()
	{
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
		wait.until(ExpectedConditions.elementToBeClickable(java)).click();
	    WebElement buttonText=wait.until(ExpectedConditions.visibilityOfElementLocated(resetButton));
	    String heading =buttonText.getText();
	    
	    Assert.assertEquals(heading,"Reset");
	    System.out.println("Reset button is visible");
	    
	    wait.until(ExpectedConditions.elementToBeClickable(resetButton)).click();
	    
	    WebElement checkBox=wait.until(ExpectedConditions.visibilityOfElementLocated(anyCheckbox));
	    boolean selected=checkBox.isSelected();
	     Assert.assertTrue(selected);
	     System.out.println("'Any' checkbox under Language is selected");
	     
	     WebElement allCheckBox=wait.until(ExpectedConditions.visibilityOfElementLocated(allLevelCheckBox));
	     boolean Tr=allCheckBox.isSelected();
	     
	     Assert.assertTrue(Tr);
	     System.out.println("All the checkbox under level are selected");
	     
	     WebElement anyField=wait.until(ExpectedConditions.visibilityOfElementLocated(enrollAny));
	     String textOfField=anyField.getText();
	
	     Assert.assertEquals(textOfField, "Any");
	     System.out.println("'Any' field is visible under enrollment");
	     
	    boolean truee= wait.until(ExpectedConditions.invisibilityOfElementLocated(resetButton));
	    Assert.assertTrue(truee);
	    System.out.println("reset button is hidden");
	     
	    
		
		  List<WebElement>allRows=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(rows)); 
		  boolean yes= allRows.stream().allMatch(WebElement::isDisplayed);
		  
	    Assert.assertTrue(yes);
	    System.out.println("all rows are visible in table");
	    driver.quit();
	 }	
	@Test
	public void sortByEnrollmentsTest()
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		Select dd= new Select(dropDown);
		dd.selectByVisibleText("Enrollments");
		
		//List<WebElement> enrollList=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(enrollColoumn));
	
		
	}
}
