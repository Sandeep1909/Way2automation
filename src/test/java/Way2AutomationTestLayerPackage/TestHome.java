package Way2AutomationTestLayerPackage;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassPackage.ProjectBaseClass;
import pagelayerpackage.LandingPage;

public class TestHome extends ProjectBaseClass
{
	
	public  LandingPage LP;

	public TestHome() throws IOException
	
	{
		
		
		super();
		
	}
	
	
	
	@BeforeMethod()
	public void startup() throws IOException
	{
		
		intialization();
		LP=new LandingPage();
		
	}
	
	
	@Test
	
	public void VeryHomeLink()
	
	{
		
		
		LP.Clickonbutton();
		
	}
	
	

	@AfterMethod
	
	public void QUIT()
	{
		
		driver.quit();
	}
}
