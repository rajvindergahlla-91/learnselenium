package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

import manger.ExtentTestManager;
import utils.SelectUtils;
import utils.WaitUtils;

public class DropDownPage {

	private By dropDownBar = By.xpath("//select[@id='dropdown']");

	public void clickOnDropDownBar() {
		WebElement dropDownEle = WaitUtils.visibilityOfElementLocated(dropDownBar);

		SelectUtils.selectByIndex(dropDownEle, 1);

		ExtentTestManager.log.info("dropdown is selected");

	}

}
