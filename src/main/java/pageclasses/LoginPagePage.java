package pageclasses;

import org.openqa.selenium.By;

import utils.WaitUtils;

public class LoginPagePage {
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.className("radius");

	public void enterUsername(String name) {
		WaitUtils.elementToBeClicakable(username).sendKeys(name);
	}

	public void enterPassword(String pswd) {
		WaitUtils.elementToBeClicakable(password).sendKeys(pswd);
	}

	public void clickLoginButton() {
		WaitUtils.elementToBeClicakable(loginButton).click();
	}
}
