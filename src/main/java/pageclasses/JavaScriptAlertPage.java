package pageclasses;

import org.openqa.selenium.By;

import utils.UTActionsUtils;
import utils.WaitUtils;

public class JavaScriptAlertPage {
	private By JsAlert = By.xpath("//button[text()='Click for JS Alert']");
	private By JsConfirm = By.xpath("//button[text()='Click for JS Confirm']");
	private By JsPrompt = By.xpath("//button[text()='Click for JS Prompt']");
	private By jsResult = By.id("result");

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
	public String getTextOfJsConfirm()
	{
		UTActionsUtils.click(JsConfirm);
		String text1=WaitUtils.alertIsPresent().getText();
		WaitUtils.alertIsPresent().accept();
		return text1;
	}
	public String getTextOfJsPrompt()
	{
		UTActionsUtils.click(JsPrompt);
		String text2=WaitUtils.alertIsPresent().getText();
		WaitUtils.alertIsPresent().accept();
		return text2;
	}
	
	public String getResultTextForJsAlert()
	{
		UTActionsUtils.click(JsAlert);
	    WaitUtils.alertIsPresent().accept();
	  return  WaitUtils.visibilityOfElementLocated(jsResult).getText();
	}
	public String getResultTextforJsConfirm()
	{
		UTActionsUtils.click(JsConfirm);
		WaitUtils.alertIsPresent().dismiss();
		return WaitUtils.visibilityOfElementLocated(jsResult).getText();
		
	}
	public String getResultTextforJsPrompt(String name)
	{
		UTActionsUtils.click(JsPrompt);
	    WaitUtils.alertIsPresent().sendKeys(name);
	    WaitUtils.alertIsPresent().accept();
		return WaitUtils.visibilityOfElementLocated(jsResult).getText();
		
	}
}
