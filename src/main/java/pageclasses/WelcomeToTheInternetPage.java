package pageclasses;

import org.openqa.selenium.By;

import manger.ExtentTestManager;
import utils.UTActionsUtils;


public class WelcomeToTheInternetPage {

	private By formAuth = By.xpath("//a[text()='Form Authentication']");
	private By heading = By.className("heading");
	private By dragDrop = By.xpath("//a[text()='Drag and Drop']");
	private By contextMenu = By.xpath("//a[text()='Context Menu']");
	private By javaScript = By.xpath("//a[text()='JavaScript Alerts']");

	public void clickFormAuthentication() {

		UTActionsUtils.click(formAuth);
		ExtentTestManager.log.info("clicked Form Authentication");
	}

	public String getFormAuthPageTitle() {
		

		String titleText=UTActionsUtils.getText(heading);
		ExtentTestManager.log.info("Title text");
		return titleText;
	}

	public void clickDragAndDrop() {
		UTActionsUtils.click(dragDrop);
		ExtentTestManager.log.info("clicked Drag and Drop");
	}

	public void clickContextMenu() {
		UTActionsUtils.click(contextMenu);
		ExtentTestManager.log.info("clicked context menu");
	}
    public void clickJavaScriptAlerts() {
    	UTActionsUtils.click(javaScript);
    	ExtentTestManager.log.info("clicked javaScript Alerts");
    }
}
