package testngtests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class AlertClassTest {
	public void alertTest() {
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Go to https://the-internet.herokuapp.com/
		driver.navigate().to("https://the-internet.herokuapp.com/"); 
		
}
}
