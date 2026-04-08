package theinternetherokutest;

import java.io.IOException;

import org.testng.Assert;
//import org.openqa.selenium.By;


import org.testng.annotations.Test;

import pageclasses.LoginPagePage;
import pageclasses.SecureAreaPage;
import pageclasses.WelcomeToTheInternetPage;


public class FormAuthentication extends BaseTest {
	
	@Test
	public void loginSuccessTest() throws IOException
	
	{
		 WelcomeToTheInternetPage welcome= new  WelcomeToTheInternetPage(wait);
		 String header=welcome.getFormAuthPageTitle();
		 Assert.assertTrue(header.contains("Welcome to the-internet"));
		 System.out.println("the title is correct");
		 welcome.clickFormAuthentication();
			
			
			  
		 
		 LoginPagePage login = new LoginPagePage(wait);
		 login.enterUsername("tomsmith");
		 login.enterPassword("SuperSecretPassword!");
		 login.clickLoginButton();
		 
		 SecureAreaPage msg= new SecureAreaPage(wait);
	     String text=msg.getSuccessMsg();
		Assert.assertTrue(text.contains("Secure Area"));
		System.out.println("the heading is correct");
		   
	  
	}

}
