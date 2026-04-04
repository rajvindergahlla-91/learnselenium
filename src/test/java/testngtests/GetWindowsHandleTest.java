package testngtests;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		    

		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://demoqa.com/browser-windows");

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        String parentHandle = driver.getWindowHandle();
		        System.out.println("Parent handle: " + parentHandle);

		        // Open all windows
		        wait.until(ExpectedConditions.elementToBeClickable(tabButton)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(winButton)).click();
		        wait.until(ExpectedConditions.elementToBeClickable(msgWin)).click();

		        Set<String> allHandles = driver.getWindowHandles();

		        String tabHandle = null;
		        String windowHandle = null;
		        String msgHandle = null;

		        // Identify all handles
		        for (String handle : allHandles) {

		            if (handle.equals(parentHandle)) continue;

		            driver.switchTo().window(handle);

		            String url = driver.getCurrentUrl();

		            if (url.contains("browser-windows")) {
		                // Tab window
		                tabHandle = handle;
		                System.out.println("Tab Handle: " + tabHandle);

		                String text = wait.until(ExpectedConditions.visibilityOfElementLocated(head)).getText();
		                Assert.assertEquals(text, "This is a sample page");

		            } else if (url.contains("sample")) {
		                // Window popup
		                windowHandle = handle;
		                System.out.println("Window Handle: " + windowHandle);

		                String text = wait.until(ExpectedConditions.visibilityOfElementLocated(head)).getText();
		                Assert.assertEquals(text, "This is a sample page");

		            } else {
		                // Message window (no DOM text usually)
		                msgHandle = handle;
		                System.out.println("Message Window Handle: " + msgHandle);
		            }
		        }

		        // Switch back to parent at end
		        driver.switchTo().window(parentHandle);

		        driver.quit();
		    }

}

		

