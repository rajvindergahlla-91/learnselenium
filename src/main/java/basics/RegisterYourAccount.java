package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterYourAccount {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();     // open browser
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
		WebElement signInEle=driver.findElement(By.xpath("//a[text()='Sign in']"));
		signInEle.click();
		WebElement registerYourAccEle=driver.findElement(By.xpath("//a[text()='Register your account']"));
		registerYourAccEle.click();
		WebElement firstNameEle =driver.findElement(By.xpath("//input[@id='first_name']"));
		firstNameEle.sendKeys("Rajvinder");
		WebElement lastNameEle =driver.findElement(By.xpath("//input[@id='last_name']"));
		lastNameEle.sendKeys("kaur");
		WebElement dOBEle =driver.findElement(By.xpath("//input[@id='dob']"));
		dOBEle.sendKeys("1991-04-10");
		WebElement addressEle =driver.findElement(By.xpath("//input[@id='address']"));
		addressEle.sendKeys("fitzgibson street");
		WebElement postCodeEle =driver.findElement(By.xpath("//input[@id='postcode']"));
		postCodeEle.sendKeys("L6y5y2");
		WebElement cityEle =driver.findElement(By.xpath("//input[@id='city']"));
		cityEle.sendKeys("Ontario");
		WebElement countryEle=driver.findElement(By.xpath("//input[@id='state']"));
		countryEle.sendKeys("canada");
		WebElement stateEle=driver.findElement(By.xpath("//select[@id='country']"));
		stateEle.sendKeys("Ontario");
		WebElement phoneEle=driver.findElement(By.xpath("//input[@id='phone']"));
		phoneEle.sendKeys("9059933467");
		WebElement eMailEle=driver.findElement(By.xpath("//input[@id='email']"));
		eMailEle.sendKeys("raj123@gmail.com");
		WebElement passwordEle=driver.findElement(By.xpath("//input[@id='password']"));
		passwordEle.sendKeys("raj123");
		


	}

}
