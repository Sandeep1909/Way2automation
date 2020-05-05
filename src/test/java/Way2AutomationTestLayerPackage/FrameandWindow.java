package Way2AutomationTestLayerPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassPackage.ProjectBaseClass;
import pagelayerpackage.WindowsAndFrame;

public class FrameandWindow extends ProjectBaseClass

{
	public static WindowsAndFrame WF;

	public FrameandWindow() throws IOException

	{

		super();

	}

	@BeforeMethod()
	public void startup() throws IOException

	{

		intialization();
		WF = new WindowsAndFrame();

	}

	@Test

	public void VerifyNewBrowser()

	{
		WF.FramesAndWindows();
		WF.NewBrowserTabMethod();

	}
	
	@Test
	public void VerifyOpenMultipleWindow()
	{
		
		WF.FramesAndWindows();
		WF.OpenMulipleWindows();
		
		
	}
	
	
	
	@AfterMethod
	public void browserquit() throws InterruptedException
	
	
	{
		Thread.sleep(5000L);
		driver.quit();
		
	}
	

}
