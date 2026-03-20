package walmartlogin;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.datafaker.Faker;

public class RegistrationFormTest {
	@Test
	public void registFormTest() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Faker fakename = new Faker();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String DOB = sdf.format(fakename.date().birthday());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");

		WebElement signInEle = driver.findElement(By.xpath("//a[text()='Sign in']"));
		signInEle.click();

		WebElement pageHeadingEle = driver.findElement(By.xpath("//h3[text()='Login']"));
		String heading = pageHeadingEle.getText();
		Assert.assertEquals(heading, "Login");

		driver.navigate().back();
		driver.navigate().forward();

		WebElement registerYourAccEle = driver.findElement(By.xpath("//a[text()='Register your account']"));
		registerYourAccEle.click();

		WebElement firstNameEle = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstNameEle.sendKeys(fakename.name().firstName());

		WebElement lastNameEle = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastNameEle.sendKeys(fakename.name().lastName());

		WebElement dOBEle = driver.findElement(By.xpath("//input[@id='dob']"));
		dOBEle.sendKeys(DOB);

		WebElement addressEle = driver.findElement(By.xpath("//input[@id='address']"));
		addressEle.sendKeys(fakename.address().fullAddress());

		WebElement postCodeEle = driver.findElement(By.xpath("//input[@id='postcode']"));
		postCodeEle.sendKeys(fakename.address().zipCode());

		WebElement cityEle = driver.findElement(By.xpath("//input[@id='city']"));
		cityEle.sendKeys(fakename.address().city());

		WebElement countryEle = driver.findElement(By.xpath("//input[@id='state']"));
		countryEle.sendKeys(fakename.address().country());

		WebElement stateEle = driver.findElement(By.xpath("//select[@id='country']"));

		Select dd = new Select(stateEle);
		List<WebElement> options = dd.getOptions();

		int size = options.size();

		// select second last option
		if (size > 1) {
			dd.selectByIndex(size - 2);
		}
		// dd.selectByContainsVisibleText("zam");
		// dd.selectByIndex(0);
		// dd.selectByValue("TV");
		// dd.selectByVisibleText("Cuba");

		WebElement phoneEle = driver.findElement(By.xpath("//input[@id='phone']"));
		phoneEle.sendKeys(fakename.phoneNumber().cellPhone());

		WebElement eMailEle = driver.findElement(By.xpath("//input[@id='email']"));
		eMailEle.sendKeys(fakename.internet().emailAddress());

		WebElement passwordEle = driver.findElement(By.xpath("//input[@id='password']"));
		passwordEle.sendKeys(fakename.credentials().password());

		Thread.sleep(5000);
		WebElement eyeIconEle = driver.findElement(By.xpath("//i[@class='fa fa-eye']"));
		eyeIconEle.click();

		Thread.sleep(5000);
		WebElement registerButtonEle = driver.findElement(By.xpath("//div/button[ contains (text(), 'Register')]"));
		registerButtonEle.click();

	}

}
