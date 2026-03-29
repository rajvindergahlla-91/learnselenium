package testngtests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTest extends BaseAlert   //used @beforemethod and @aftermethod
{
	@Test
public void DragandDropactionsTest()
{

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
	public void enterActionsData()            // used actions class to enter username
	
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Form Authentication']"))).click();
		Actions act = new Actions(driver);
		WebElement usernameEle =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']")));
		act.moveToElement(usernameEle).click().sendKeys("tomsmith").keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		
	}
}
