package pageclasses;

import org.openqa.selenium.By;

import utils.WaitUtils;

public class SecureAreaPage {

	By header = By.tagName("h2");

	public String getSuccessMsg() {
		return WaitUtils.visibilityOfElementLocated(header).getText();
	}
}
