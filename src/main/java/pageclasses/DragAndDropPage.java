package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.WaitUtils;

public class DragAndDropPage {

	By columnA = By.className("column");
	By columnB = By.id("column-b");
	By columnBHeaderA = By.xpath("//div[@id='column-b']/header[text()='A']");

	public void dragBoxes(WebDriver driver) {

		WebElement boxA = WaitUtils.visibilityOfElementLocated(columnA);
		WebElement boxB = WaitUtils.visibilityOfElementLocated(columnB);
		Actions act = new Actions(driver);
		act.dragAndDrop(boxA, boxB).perform();
	}

	public String getPositionAfterDrag() {
		return WaitUtils.visibilityOfElementLocated(columnBHeaderA).getText();
	}
}
