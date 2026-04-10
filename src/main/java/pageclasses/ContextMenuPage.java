package pageclasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.WaitUtils;

public class ContextMenuPage {
	By clickBox = By.id("hot-spot");

	public void rightClickOnBox(WebDriver driver) {
		WebElement box = WaitUtils.elementToBeClicakable(clickBox);
		Actions act = new Actions(driver);
		act.contextClick(box).perform();
	}

	public void handleRightClickAlert() {
		Alert alert = WaitUtils.alertIsPresent();
		alert.accept();
	}

	public String getAlertText() {
		Alert alert = WaitUtils.alertIsPresent();
		return alert.getText();
	}
}
