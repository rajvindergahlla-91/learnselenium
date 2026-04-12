package theinternetherokutest;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import manger.DriverManager;
import manger.ExtentManager;
import manger.ExtentTestManager;
import utils.BaseUtils;
import utils.WaitUtils;

public class BaseTest {
	@BeforeSuite
	public void initialise() throws IOException
	{
		ExtentManager.initReport();
	}

	@BeforeMethod
	public void preReqBaseTest(Method method) throws NumberFormatException, IOException {
		ExtentTestManager.createTest(method.getName());
		DriverManager.initDriver();
		WaitUtils.initWait();
		DriverManager.goToUrl(BaseUtils.getConfigValue("url"));
	}

	@AfterMethod
	public void packUptest() {
		DriverManager.quitDriver();

	}
	@AfterSuite
	public void tearDown()
	{
		ExtentManager.flushReport();
	}
}
