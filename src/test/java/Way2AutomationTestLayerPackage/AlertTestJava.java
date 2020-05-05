package Way2AutomationTestLayerPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassPackage.ProjectBaseClass;
import pagelayerpackage.AlertPage;
import pagelayerpackage.InteractionPage;

public class AlertTestJava extends ProjectBaseClass {
	
	public static AlertPage AP ;

	public AlertTestJava() throws IOException {

		super();

	}

	@BeforeMethod()
	public void startup() throws IOException {

		intialization();
		AP = new AlertPage();
	}
	
	
	@Test(priority=1)
	public void VerifyAlertBox()
	{
		AP.ClickonAlerTab();
		AP.Simplealertclick();
		
	}
	
	
	
	@Test(priority=2)
	public void VerifyInputAlertBox() throws InterruptedException
	{
		AP.ClickonAlerTab();
		AP.InputAlert();
		
	}
	
	
	@AfterMethod
	public void browserquit() throws InterruptedException
	
	
	{
		Thread.sleep(10000L);
		driver.quit();
		
	}
	
	
	
	
}
	
	
	
	
	
	