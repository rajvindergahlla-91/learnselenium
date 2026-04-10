package pageclasses;

import org.openqa.selenium.By;

import utils.WaitUtils;

public class WelcomeToTheInternetPage {

	By formAuth = By.xpath("//a[text()='Form Authentication']");
	By heading = By.className("heading");
	By dragDrop = By.xpath("//a[text()='Drag and Drop']");
	By contextMenu = By.xpath("//a[text()='Context Menu']");

	public void clickFormAuthentication() {

		WaitUtils.elementToBeClicakable(formAuth).click();
	}

	public String getFormAuthPageTitle() {

		return WaitUtils.visibilityOfElementLocated(heading).getText();
	}

	public void clickDragAndDrop() {
		WaitUtils.elementToBeClicakable(dragDrop).click();
	}

	public void clickContextMenu() {
		WaitUtils.elementToBeClicakable(contextMenu).click();
	}

}
