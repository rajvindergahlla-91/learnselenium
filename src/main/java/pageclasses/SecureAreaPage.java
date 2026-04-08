package pageclasses;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureAreaPage {
	
	WebDriverWait wait;
	public SecureAreaPage(WebDriverWait wait)
	{
		this.wait=wait;
	}
	By header=By.tagName("h2");

	
	
	
	public String getSuccessMsg()
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(header)).getText();
	}
}
