package theinternetherokutest;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageclasses.ContextMenuPage;
import pageclasses.DragAndDropPage;
import pageclasses.DropDownPage;
import pageclasses.JavaScriptAlertPage;
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
		String header = welcome.getFormAuthPageTitle("Form Authencation Page title");
		Assert.assertTrue(header.contains("Welcome to the-internet"));
		System.out.println("the title is correct");
		welcome.clickFormAuthentication();

		LoginPagePage login = new LoginPagePage();
		login.enterUsername("tomsmith");
		login.enterPassword("SuperSecretPassword!");
		login.clickLoginButton();

		SecureAreaPage msg = new SecureAreaPage();
		String text = msg.getSuccessMsg("Secure page Title");
		Assert.assertTrue(text.contains("Secure Area"));
		System.out.println("the heading is correct");

	}

	@Test
	public void dragAndDropTest() {
		WelcomeToTheInternetPage welcome = new WelcomeToTheInternetPage();
		welcome.clickDragAndDrop();

		DragAndDropPage dd = new DragAndDropPage();
		dd.dragBoxes();

		String position = dd.getPositionAfterDrag("updated text");
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

	@Test
	public void javaScriptsAlertsTest() {
		WelcomeToTheInternetPage welcome = new WelcomeToTheInternetPage();
		welcome.clickJavaScriptAlerts();

		JavaScriptAlertPage js = new JavaScriptAlertPage();
		String jsAlertText = js.getTextOfJsAlert();
		Assert.assertEquals(jsAlertText, "I am a JS Alert");
		js.clickOnClickForJsAlert();
		String resultText = js.getResultTextForJsAlert();
		Assert.assertEquals(resultText, "You successfully clicked an alert");

		String jsConfirmText = js.getTextOfJsConfirm();
		Assert.assertEquals(jsConfirmText, "I am a JS Confirm");
		js.clickOnClickForJsConfirm();
		String resultText1 = js.getResultTextforJsConfirm();
		Assert.assertEquals(resultText1, "You clicked: Cancel");

		String jsPromptText = js.getTextOfJsPrompt();
		Assert.assertEquals(jsPromptText, "I am a JS prompt");
		js.clickOnClickForJsPrompt("Raj");
		String resultText2 = js.getResultTextforJsPrompt("Raj");
		Assert.assertEquals(resultText2, "You entered: Raj");
	}

	@Test
	public void dropDownTest() {
		WelcomeToTheInternetPage welcome = new WelcomeToTheInternetPage();
		welcome.clickDropDown();
		
		DropDownPage ddp= new DropDownPage();
		ddp.clickOnDropDownBar();

	}
}
