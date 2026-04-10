package pageclasses;

import org.openqa.selenium.By;

import utils.UTActionsUtils;

public class SecureAreaPage {

	By header = By.tagName("h2");

	public String getSuccessMsg() {
		return UTActionsUtils.getText(header);
	}
}
