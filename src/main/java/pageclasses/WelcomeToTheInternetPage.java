package pageclasses;

//import java.io.IOException;
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
	By dragDrop = By.xpath("//a[text()='Drag and Drop']");
	By contextMenu=By.xpath("//a[text()='Context Menu']");
	
	public void clickFormAuthentication() 
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(formAuth)).click();
	}
	
public String getFormAuthPageTitle() 
{
	
	return wait.until(ExpectedConditions.visibilityOfElementLocated(heading)).getText();
}

   public void clickDragAndDrop() 
   {
     wait.until(ExpectedConditions.elementToBeClickable(dragDrop)).click();
}
   public void clickContextMenu()
   {
	   wait.until(ExpectedConditions.elementToBeClickable(contextMenu)).click();
   }
   
}
