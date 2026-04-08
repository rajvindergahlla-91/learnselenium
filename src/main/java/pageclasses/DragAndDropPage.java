package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropPage {
	
	WebDriverWait wait;
	public DragAndDropPage(WebDriverWait wait)
	{
		this.wait=wait;
	}
	
	By columnA = By.className("column");
	By columnB =By.id("column-b");
	By columnBHeaderA=By.xpath("//div[@id='column-b']/header[text()='A']");
	public void dragBoxes(WebDriver driver)
	{
		WebElement boxA =wait.until(ExpectedConditions.visibilityOfElementLocated(columnA));
		WebElement boxB =wait.until(ExpectedConditions.visibilityOfElementLocated(columnB));
		Actions act = new Actions(driver);     
		act.dragAndDrop(boxA, boxB).perform();
	}
	
	public String getPositionAfterDrag()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(columnBHeaderA)).getText();
	}
}
