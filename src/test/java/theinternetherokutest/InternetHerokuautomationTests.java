package theinternetherokutest;

import java.io.IOException;

import org.testng.Assert;
//import org.openqa.selenium.By;


import org.testng.annotations.Test;

import pageclasses.ContextMenuAlertPage;
import pageclasses.ContextMenuPage;
import pageclasses.DragAndDropPage;
import pageclasses.LoginPagePage;
import pageclasses.SecureAreaPage;
import pageclasses.WelcomeToTheInternetPage;


public class InternetHerokuautomationTests extends BaseTest {
	
	 
	
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
	@Test
	public void dragAndDropTest()
	{
	     WelcomeToTheInternetPage welcome= new  WelcomeToTheInternetPage(wait);
		 welcome.clickDragAndDrop();
		 
		 DragAndDropPage dd= new DragAndDropPage(wait);
		 dd.dragBoxes(driver);
		 
		 String position =dd.getPositionAfterDrag();
		 Assert.assertTrue(position.contains("A"));
		 System.out.println("position verified");
}
	@Test
	public void contextMenuTest()
	{
		WelcomeToTheInternetPage welcome= new  WelcomeToTheInternetPage(wait);
		welcome.clickContextMenu();
		
		 ContextMenuPage cm = new ContextMenuPage(wait);
		 cm.rightClickOnBox(driver);
		 
		 ContextMenuAlertPage cAlert= new ContextMenuAlertPage(wait);
		 String msg=cAlert.getAlertText();
		 cAlert.handleRightClickAlert();
		Assert.assertEquals(msg,"You selected a context menu");
		 
	}
	
}
