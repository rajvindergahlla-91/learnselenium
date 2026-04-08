package pageclasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

public class ContextMenuAlertPage {
	
	WebDriverWait wait;
	public ContextMenuAlertPage(WebDriverWait wait)
	{
		this.wait=wait;
	}
	
	public void handleRightClickAlert()
	{
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
	
	public String getAlertText()
	{ 
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		return alert.getText();
	}

}
