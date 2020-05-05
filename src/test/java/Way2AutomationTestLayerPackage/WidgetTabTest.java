package Way2AutomationTestLayerPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassPackage.ProjectBaseClass;
import pagelayerpackage.WidgetPage;

public class WidgetTabTest extends ProjectBaseClass{
	
	public static WidgetPage WP;

	public WidgetTabTest() throws IOException {
		super();
		
	}
	
	
	@BeforeMethod
	
	public void startup() throws IOException {

		intialization();
		WP = new WidgetPage();

	}
	
	@Test
	public void VerifyAutocompleTest()
	{
		WP.ClickonWidget();
		WP.programminglanguages();
		
	}
	
	@Test
	public void verifyCalenderTest()
	{
		
		
		WP.ClickonWidget();
		WP.DatepickerMethod();
	}

	
	@Test
	public void SliderMethodTest()
	{
		
		WP.ClickonWidget();
		 WP.SliderMethod();
	}
	
	
	
	
	
	
	@AfterMethod
	public void browserquit() throws InterruptedException
	
	
	{
		Thread.sleep(5000L);
		driver.quit();
		
	}
	
	
	

}
