package testngtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XpathTest extends BaseAlert{
@Test
	
	public void verifyXpathTest()
	{
	
	driver.navigate().to("https://practicetestautomation.com/practice-test-table/");
	WebElement advanceText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
			              ("//table//tr/td[text()='2854476']/following-sibling::td[text()='Intermediate']/following::td[6]")));
	String text =advanceText.getText();
	Assert.assertEquals(text,"Advanced");
	}
	
}
