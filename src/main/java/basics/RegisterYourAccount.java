package basics;

import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.datafaker.Faker;

public class RegisterYourAccount {

	public static void main(String[] args) {
		Faker fakename=new Faker();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String DOB=sdf.format(fakename.date().birthday());
		
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
	    
		WebElement signInEle=driver.findElement(By.xpath("//a[text()='Sign in']"));
		signInEle.click();
		
		WebElement registerYourAccEle=driver.findElement(By.xpath("//a[text()='Register your account']"));
		registerYourAccEle.click();
		
		WebElement firstNameEle =driver.findElement(By.xpath("//input[@id='first_name']"));
		firstNameEle.sendKeys(fakename.name().firstName());
		
		WebElement lastNameEle =driver.findElement(By.xpath("//input[@id='last_name']"));
		lastNameEle.sendKeys(fakename.name().lastName());
		
		WebElement dOBEle =driver.findElement(By.xpath("//input[@id='dob']"));
		dOBEle.sendKeys(DOB);
		
		WebElement addressEle =driver.findElement(By.xpath("//input[@id='address']"));
		addressEle.sendKeys(fakename.address().fullAddress());
		
		WebElement postCodeEle =driver.findElement(By.xpath("//input[@id='postcode']"));
		postCodeEle.sendKeys(fakename.address().zipCode());
		
		WebElement cityEle =driver.findElement(By.xpath("//input[@id='city']"));
		cityEle.sendKeys(fakename.address().city());
		
		WebElement countryEle=driver.findElement(By.xpath("//input[@id='state']"));
		countryEle.sendKeys(fakename.address().country());
		
        WebElement phoneEle=driver.findElement(By.xpath("//input[@id='phone']"));
		phoneEle.sendKeys(fakename.phoneNumber().cellPhone());
		
		WebElement eMailEle=driver.findElement(By.xpath("//input[@id='email']"));
		eMailEle.sendKeys(fakename.internet().emailAddress());
		
		WebElement passwordEle=driver.findElement(By.xpath("//input[@id='password']"));
		passwordEle.sendKeys(fakename.internet().password());
		
		WebElement eyeIconEle=driver.findElement(By.xpath("//i[@class='fa fa-eye']"));
		eyeIconEle.click();
		
		WebElement registerButtonEle=driver.findElement(By.xpath("//div/button[ contains (text(), 'Register')]"));
		registerButtonEle.click();
		


	}

}
