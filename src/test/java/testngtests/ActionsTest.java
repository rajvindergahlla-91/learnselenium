package testngtests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTest {
	@Test
public void DragandDropactionsTest()
{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://the-internet.herokuapp.com/");
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Drag and Drop']"))).click();
	
	WebElement boxA =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-a']")));
	WebElement boxB =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-b']")));
	
	
	Actions act = new Actions(driver);
	act.dragAndDrop(boxA, boxB).perform();
	WebElement header=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-b']/header[text()='A']")));
	String targetHead=header.getText();
	Assert.assertEquals(targetHead, "A");
	
}
}
