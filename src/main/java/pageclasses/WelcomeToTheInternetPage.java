package pageclasses;

import org.openqa.selenium.By;

import utils.UTActionsUtils;


public class WelcomeToTheInternetPage {

	By formAuth = By.xpath("//a[text()='Form Authentication']");
	By heading = By.className("heading");
	By dragDrop = By.xpath("//a[text()='Drag and Drop']");
	By contextMenu = By.xpath("//a[text()='Context Menu']");

	public void clickFormAuthentication() {

		UTActionsUtils.click(formAuth);
	}

	public String getFormAuthPageTitle() {

		return UTActionsUtils.getText(heading);
	}

	public void clickDragAndDrop() {
		UTActionsUtils.click(dragDrop);
	}

	public void clickContextMenu() {
		UTActionsUtils.click(contextMenu);
	}

}
