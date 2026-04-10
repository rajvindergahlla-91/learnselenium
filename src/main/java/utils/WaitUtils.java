package utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import manger.DriverManager;

public class WaitUtils {
	private static WebDriverWait wait;
	
	public static void initWait() throws NumberFormatException, IOException
	{
		 new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds
				                                (Integer.valueOf(BaseUtils.getConfigValue("explicitwait")))); 
	}
	
	public static WebDriverWait getWait()
	{
		return wait;
	}

}
