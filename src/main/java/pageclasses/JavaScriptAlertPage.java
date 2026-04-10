package pageclasses;

import org.openqa.selenium.By;

import utils.UTActionsUtils;
import utils.WaitUtils;

public class JavaScriptAlertPage {
	private By JsAlert = By.xpath("//button[text()='Click for JS Alert']");
	private By JsConfirm = By.xpath("//button[text()='Click for JS Confirm']");
	private By JsPrompt = By.xpath("//button[text()='Click for JS Prompt']");

	public void clickOnClickForJsAlert() {
		UTActionsUtils.click(JsAlert);
	    WaitUtils.alertIsPresent().accept();
	}

	
	public void clickOnClickForJsConfirm() {
		UTActionsUtils.click(JsConfirm);
		WaitUtils.alertIsPresent().dismiss();
	}

	public void clickOnClickForJsPrompt(String name) {
		UTActionsUtils.click(JsPrompt);
		WaitUtils.alertIsPresent().sendKeys(name);
		WaitUtils.alertIsPresent().accept();

	}
	public String getTextOfJsAlert() {
		 UTActionsUtils.click(JsAlert);
		    String text = WaitUtils.alertIsPresent().getText();
		    WaitUtils.alertIsPresent().accept();  // ⭐ MUST CLOSE ALERT
		    return text;
	}
}
