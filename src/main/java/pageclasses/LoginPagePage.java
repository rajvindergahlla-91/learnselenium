package pageclasses;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import utils.BaseUtils;

public class LoginPagePage {
	WebDriverWait wait;
	
	public LoginPagePage(WebDriverWait wait)
	{
		this.wait=wait;
	}
	
	By username=By.id("username");
	By password=By.id("password");
	By loginButton=By.className("radius");
	

	public void enterUsername( String name)
	{
		wait.until(ExpectedConditions.elementToBeClickable(username)).sendKeys(name);;
	}
	public void enterPassword(String pswd)
	{
		wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(pswd);
	}
    public void clickLoginButton()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
