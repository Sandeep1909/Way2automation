package Way2AutomationTestLayerPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassPackage.ProjectBaseClass;

import pagelayerpackage.RegistrationPageClass;

public class RegistrationTestClass extends ProjectBaseClass {

	public static RegistrationPageClass RPC;

	public RegistrationTestClass() throws IOException {

		super();

	}

	@BeforeMethod()
	public void startup() throws IOException {

		intialization();
		RPC = new RegistrationPageClass();

	}

	
	@Test(priority=1)
	
	public void RegistrationPageTest() throws IOException
	
	{
		RPC.ClickonRegistrationTab();
		RPC.RegistarionPage();
		
		
	}
	
	

	@AfterMethod
	public void browserquit() throws InterruptedException
	
	
	{
		Thread.sleep(10000L);
		driver.quit();
		
	}
	
}
