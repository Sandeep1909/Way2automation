package Way2AutomationTestLayerPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassPackage.ProjectBaseClass;
import pagelayerpackage.DynamicElement;


public class DynamicElementTest extends ProjectBaseClass{
	
	public static DynamicElement DE;
	public DynamicElementTest() throws IOException {
		
		super();
		
	}

	
	@BeforeMethod()
	public void startup() throws IOException

	{

		intialization();
		DE=new DynamicElement();

	
}

	
	@Test(priority=1)
	public void TestDynamicElements()
	{
		
		DE.DynamicElementTab();
		DE.StartWith();
	}
	
	
	
	@Test(priority=2)
	public void DropDownSelect()
	{
		
		DE.DynamicElementTab();
		DE.DropDrown();
	}


	@Test(priority=3)
	public void DropDownSelectCountry()
	{
		
		DE.DynamicElementTab();
		DE.EntryContry();
	}
	
	@AfterMethod
	public void browserquit() throws InterruptedException
	
	
	{
		Thread.sleep(5000L);
		driver.quit();
		
	}
	
}

	