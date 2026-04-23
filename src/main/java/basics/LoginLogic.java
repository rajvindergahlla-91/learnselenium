package basics;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogic {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // opens browser
		driver.get("https://the-internet.herokuapp.com/"); // opens url
		WebElement formAuthenticationEle = driver.findElement(By.xpath("//a[@href='/login']"));
		formAuthenticationEle.click();
		WebElement userNameEle = driver.findElement(By.xpath("//input[@name='username']"));
		userNameEle.sendKeys("tomsmith");

		WebElement passwordEle = driver.findElement(By.xpath("//input[@name='password']"));
		passwordEle.sendKeys("SuperSecretPassword!");
		WebElement loginButtonEle = driver.findElement(By.xpath("//i[text()=' Login']"));
		loginButtonEle.click();

	}

}



