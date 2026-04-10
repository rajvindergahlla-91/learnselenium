package theinternetherokutest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import manger.DriverManager;
import utils.BaseUtils;
import utils.WaitUtils;

public class BaseTest {

	@BeforeMethod
	public void preReqBaseTest() throws NumberFormatException, IOException {
		DriverManager.initDriver();
		WaitUtils.initWait();
		DriverManager.goToUrl(BaseUtils.getConfigValue("url"));
	}

	@AfterMethod
	public void packUptest() {
		DriverManager.quitDriver();

	}
}
