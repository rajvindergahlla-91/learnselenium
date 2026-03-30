package testngtests;

//import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTest extends BaseAlert   //used @beforemethod and @aftermethod
{
	@Test
public void DragAndDropActionsTest()
{
    driver.navigate().to("https://the-internet.herokuapp.com/");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Drag and Drop']"))).click();
	
	WebElement boxA =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-a']")));
	WebElement boxB =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-b']")));
	
	
	Actions act = new Actions(driver);      // used actions class for drag and drop
	act.dragAndDrop(boxA, boxB).perform();
	WebElement header=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-b']/header[text()='A']")));
	String targetHead=header.getText();
	Assert.assertEquals(targetHead, "A");
	
}
	@Test
	public void enterActionsDataTest()            // used actions class to enter username
	
	{
		driver.navigate().to("https://the-internet.herokuapp.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Form Authentication']"))).click();
		Actions act = new Actions(driver);
		WebElement usernameEle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']")));
		act.moveToElement(usernameEle).click().sendKeys("tomsmith").keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		
	}
	
	@Test
	public void hoverAndSelectTest()
	{
		driver.navigate().to("https://the-internet.herokuapp.com/");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Hovers']"))).click();
		
		WebElement imgEle =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]")));
	    
		Actions act = new Actions(driver);
		act.moveToElement(imgEle).perform();
		
		WebElement textEle =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/users/1']")));
           act.moveToElement(textEle)	
           .click()
           .perform();
           
           WebElement headTextEle =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Not Found']")));
           String heading=headTextEle.getText();
           Assert.assertEquals(heading,"Not Found");
	}

		@Test
		public void hoverTest()
		{
		
		driver.navigate().to("https://practice.expandtesting.com/hovers");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight/4)");
		
		 WebElement picEle =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@data-testid='img-user-1']")));
		
		 
		 Actions act= new Actions(driver);
		 act.moveToElement(picEle).perform();
		 
		WebElement optionEle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'/users/1')]")));
		act.moveToElement(optionEle).click().perform();
	
		 WebElement headerText= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Welcome user1 ']")));
		 String heading=headerText.getText();
		 Assert.assertTrue(heading.contains("Welcome user1"));
		}
            @Test
		    public void testHoverAction()
		    {
		    	
		    
		driver.navigate().to("https://www.vinsguru.com/selenium-webdriver-practice-page/");
		 WebElement devEle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Development']")));
		 
		 Actions act= new Actions(driver);
		 
		 
		act.moveToElement(devEle).perform();
		
		WebElement optionEle =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Spring Boot']")));
		act.moveToElement(optionEle).click().perform();
		
		 WebElement headerText= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='entry-title']")));
		 String heading=headerText.getText();
		 Assert.assertTrue(heading.contains("Spring Boot"));
		    }
}