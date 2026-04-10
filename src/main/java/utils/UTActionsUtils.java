package utils;

import org.openqa.selenium.By;

public class UTActionsUtils {
	public static String getText(By locator) {
		return WaitUtils.visibilityOfElementLocated(locator).getText();
	}

	public static void sendKeys(By locator, String text) {
		WaitUtils.visibilityOfElementLocated(locator).sendKeys(text);
	}

	public static void click(By locator) {
		WaitUtils.elementToBeClicakable(locator).click();
	}
}
