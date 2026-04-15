package pageclasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import manger.DriverManager;
import manger.ExtentTestManager;
import utils.WaitUtils;

public class ContextMenuPage {
	private By clickBox = By.id("hot-spot");

	public void rightClickOnBox() {
		DriverManager.getDriver();
		WebElement box = WaitUtils.elementToBeClicakable(clickBox);
		Actions act = new Actions(DriverManager.getDriver());
		act.contextClick(box).perform();
		ExtentTestManager.log.info("The box is right clicked");
	}

	public void handleRightClickAlert() {
		Alert alert = WaitUtils.alertIsPresent();
		alert.accept();
		ExtentTestManager.log.info("The alert is handled by clicking 'ok'");
	}

	public String getAlertText() {
		Alert alert = WaitUtils.alertIsPresent();
		String text= alert.getText();
		ExtentTestManager.log.info("the text is : " + text);
		return text;
	}
}
