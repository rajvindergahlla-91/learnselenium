package pageclasses;

import java.io.IOException;
//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import utils.BaseUtils;

public class WelcomeToTheInternetPage {
	
	WebDriverWait wait;
	
	public WelcomeToTheInternetPage(WebDriverWait wait)
	{
		this.wait=wait;
	}
	By formAuth=By.xpath("//a[text()='Form Authentication']");
	By heading = By.className("heading");
	
	
	public void clickFormAuthentication() 
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(formAuth)).click();
	}
	
public String getFormAuthPageTitle() 
{
	
	return wait.until(ExpectedConditions.visibilityOfElementLocated(heading)).getText();
}

}
