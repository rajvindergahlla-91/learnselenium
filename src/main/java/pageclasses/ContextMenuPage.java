package pageclasses;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuPage {
	WebDriverWait wait;
	public ContextMenuPage(WebDriverWait wait)
	{
		this.wait=wait;
	}
	
	By clickBox= By.id("hot-spot");
	
	public void rightClickOnBox(WebDriver driver)
	{
		WebElement box =wait.until(ExpectedConditions.elementToBeClickable(clickBox));
		Actions act = new Actions(driver);
		act.contextClick(box).perform();
	}


}
