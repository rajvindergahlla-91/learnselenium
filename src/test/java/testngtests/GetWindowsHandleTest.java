package testngtests;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetWindowsHandleTest {
	
	@Test

	public void windowHandleTest()
	{
		By tabButton = By.id("tabButton");
	    By winButton = By.id("windowButton");
	    By msgWin = By.id("messageWindowButton");
	    By head = By.id("sampleHeading");
	    By msgWindow =By.xpath("//body[contains(text(),'Knowledge')]");
		    

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://demoqa.com/browser-windows");

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        String parentHandle = driver.getWindowHandle();
		        System.out.println("Parent handle: " + parentHandle);

		        // Open all windows
		        wait.until(ExpectedConditions.elementToBeClickable(tabButton)).click();
	            
//		        wait.until(ExpectedConditions.elementToBeClickable(msgWin)).click();

		        Set<String> allHandles = driver.getWindowHandles();

		        String tabHandle = null;
		        String windowHandle = null;
	            String msgHandle = null;
		        
              for(String handle:allHandles)
            	  if(!handle.equals(parentHandle)) {
            		  tabHandle=handle;
              driver.switchTo().window(tabHandle);
              System.out.println("tab handle is : " + tabHandle);
            	  }
             WebElement tab = wait.until(ExpectedConditions.visibilityOfElementLocated(head));
             String tabMsg= tab.getText();
              
             Assert.assertEquals(tabMsg,"This is a sample page");
             
             driver.switchTo().window(parentHandle);
             
             wait.until(ExpectedConditions.elementToBeClickable(winButton)).click();
             
             Set<String> handles =driver.getWindowHandles();
             for(String control: handles)
            	 if(!control.equals(parentHandle) && !control.equals(tabHandle))
            	 {
            		 windowHandle =control;
            		 driver.switchTo().window(windowHandle);
            		 System.out.println("window handle is :"+ windowHandle);
            	 }
             
            WebElement windowHead= wait.until(ExpectedConditions.visibilityOfElementLocated(head));
            String windowMsg= windowHead.getText();
            Assert.assertEquals(windowMsg,"This is a sample page");
            
            driver.switchTo().window(parentHandle);
            
             wait.until(ExpectedConditions.visibilityOfElementLocated(msgWin)).click();
             
             Set<String> totalHandles=driver.getWindowHandles();
             for(String hand:totalHandles)
            	 if(!hand.equals(parentHandle) && !hand.equals(tabHandle) && !hand.equals(windowHandle))
            	 {
            		 msgHandle=hand;
            		 driver.switchTo().window(msgHandle);
            		 System.out.println("msg handle is :"+ msgHandle);
	}
//            WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(msgWindow));
//            String msgText= msg.getText();
//            Assert.assertTrue(msgText.contains("Knowledge"));
//	
}
}

		       

