package manger;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.BaseUtils;

public class DriverManager {
	
	private static WebDriver driver;
	public static void initDriver() throws IOException
	{
		String browser =BaseUtils.getConfigValue("browser");
		switch (browser.toLowerCase()) {
		
		case "Chrome":
		driver=new ChromeDriver();
		break;
		
		case "firefox":
		driver=new FirefoxDriver();
		break;
		
		case "Edge":
		driver=new EdgeDriver();
		break;
			
		
		default:
		System.out.println("browser not supported");
		break;
	}
		driver.manage().window().maximize();
	}
public static WebDriver getDriver() {
	return driver;
}

public static void  quitDriver() {
	driver.quit();
}
public static void  goToUrl(String url)
{
	driver.get(url);
}

	


}
