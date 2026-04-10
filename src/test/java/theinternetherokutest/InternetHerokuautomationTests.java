package theinternetherokutest;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageclasses.ContextMenuPage;
import pageclasses.DragAndDropPage;
/*import pageclasses.ContextMenuPage;
import pageclasses.DragAndDropPage;*/
import pageclasses.LoginPagePage;
import pageclasses.SecureAreaPage;
import pageclasses.WelcomeToTheInternetPage;

public class InternetHerokuautomationTests extends BaseTest {

	@Test
	public void loginSuccessTest() throws IOException

	{
		WelcomeToTheInternetPage welcome = new WelcomeToTheInternetPage();
		String header = welcome.getFormAuthPageTitle();
		Assert.assertTrue(header.contains("Welcome to the-internet"));
		System.out.println("the title is correct");
		welcome.clickFormAuthentication();

		LoginPagePage login = new LoginPagePage();
		login.enterUsername("tomsmith");
		login.enterPassword("SuperSecretPassword!");
		login.clickLoginButton();

		SecureAreaPage msg = new SecureAreaPage();
		String text = msg.getSuccessMsg();
		Assert.assertTrue(text.contains("Secure Area"));
		System.out.println("the heading is correct");

	}

	@Test
	public void dragAndDropTest() {
		WelcomeToTheInternetPage welcome = new WelcomeToTheInternetPage();
		welcome.clickDragAndDrop();

		DragAndDropPage dd = new DragAndDropPage();
		dd.dragBoxes();

		String position = dd.getPositionAfterDrag();
		Assert.assertTrue(position.contains("A"));
		System.out.println("position verified");
	}

	@Test
	public void contextMenuTest() {
		WelcomeToTheInternetPage welcome = new WelcomeToTheInternetPage();
		welcome.clickContextMenu();

		ContextMenuPage cm = new ContextMenuPage();
		cm.rightClickOnBox();

		String msg = cm.getAlertText();
		cm.handleRightClickAlert();
		Assert.assertEquals(msg, "You selected a context menu");

	}

}
