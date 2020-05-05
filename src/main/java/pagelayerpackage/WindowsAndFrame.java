package pagelayerpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclassPackage.ProjectBaseClass;

public class WindowsAndFrame extends ProjectBaseClass {

	@FindBy(xpath = "//a[text()='Frames and Windows']")
	WebElement FrameTab;

	@FindBy(xpath = "//div[@id='example-1-tab-1']//iframe")
	WebElement Frame1;

	@FindBy(xpath = "//a[text()='New Browser Tab']")
	WebElement NewBrowser;

	@FindBy(xpath = "Open Seprate New Window']")
	WebElement OpenSeprateNewWindow;

	@FindBy(xpath = "//div[@id='example-1-tab-2']//iframe")
	WebElement Frame2;

	@FindBy(xpath = "//a[text()='Open New Seprate Window']")
	WebElement OpenNewWindow;

	@FindBy(xpath = "//a[text()='Open Multiple Windows']")
	WebElement MultipleWindows;

	@FindBy(xpath = "//div[@id='example-1-tab-4']//iframe")
	WebElement Frame4;

	@FindBy(xpath = "//a[text()='Open multiple pages']")
	WebElement Openmultiplepagess;

	public WindowsAndFrame() throws IOException

	{

		PageFactory.initElements(driver, this);
	}
		
	public boolean FramesAndWindows()
	
	{
		
		
	boolean StaleElement=true;
	
	while(StaleElement) 
	
	{
		try
		{			
			FrameTab.click();
			StaleElement= false;
		
		}
		catch(StaleElementReferenceException e)
		{
			e.printStackTrace();
	
		}
	
	}
	return true;
}
	

public void NewBrowserTabMethod()
	
	
	{
		driver.switchTo().frame(Frame1);
		
		NewBrowser.click();
		
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		
		String Parent_id=it.next();
		String Chlid_id =it.next();
		
		driver.switchTo().window(Chlid_id);
		System.out.println(driver.getCurrentUrl());
		
}
	




public void OpenSeprateWindow()

{
	OpenSeprateNewWindow.click();
	driver.switchTo().frame(Frame2);
	OpenSeprateNewWindow.click();
	
	
	
}


public void OpenMulipleWindows()

{
	
	MultipleWindows.click();
	driver.switchTo().frame(Frame4);
	Openmultiplepagess.click();
	
	Set<String> set=driver.getWindowHandles();
	
	Iterator<String> it =set.iterator();
	
	while(it.hasNext())
	{
		
		driver.switchTo().window(it.next());
		System.out.println(driver.getCurrentUrl());
	}
	
}
	
	
	
	
}
