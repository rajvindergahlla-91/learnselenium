package testngtests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuRightClick extends BaseAlert
{
	By clickBox= By.xpath("//div[@id='hot-spot']");
	@Test
	public void actionsRightClickTest()
	{
	
driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
WebElement box =wait.until(ExpectedConditions.elementToBeClickable(clickBox));
Actions act = new Actions(driver);
act.contextClick(box).perform();

Alert alert=wait.until(ExpectedConditions.alertIsPresent());
String alertMessage =alert.getText();
alert.accept();


Assert.assertEquals(alertMessage,"You selected a context menu");
driver.quit();


	
}
}
