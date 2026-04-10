package pageclasses;

import org.openqa.selenium.By;

import utils.UTActionsUtils;


public class LoginPagePage {
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.className("radius");

	public void enterUsername(String name) {
		UTActionsUtils.sendKeys(username, name);
	}

	public void enterPassword(String pswd) {
		UTActionsUtils.sendKeys(password, pswd);
	}

	public void clickLoginButton() {
		UTActionsUtils.click(loginButton);
	}
}
