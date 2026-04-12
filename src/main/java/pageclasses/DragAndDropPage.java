package pageclasses;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import manger.DriverManager;
import utils.UTActionsUtils;
import utils.WaitUtils;

public class DragAndDropPage {


	private By columnA = By.id("column-a");
	private By columnB = By.id("column-b");
	private By columnBHeaderA = By.xpath("//div[@id='column-b']/header[text()='A']");

	public void dragBoxes() {
		DriverManager.getDriver();
		WebElement boxA = WaitUtils.visibilityOfElementLocated(columnA);
		WebElement boxB = WaitUtils.visibilityOfElementLocated(columnB);
		Actions act = new Actions(DriverManager.getDriver());
		act.dragAndDrop(boxA, boxB).perform();
	}

	public String getPositionAfterDrag(String nameOfTheElement) {
		return UTActionsUtils.getText(columnBHeaderA, nameOfTheElement);
	}
}
