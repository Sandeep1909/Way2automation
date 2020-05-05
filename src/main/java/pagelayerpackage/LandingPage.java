package pagelayerpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclassPackage.ProjectBaseClass;

public class LandingPage extends ProjectBaseClass

{

	public LandingPage() throws IOException {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Home']")
	WebElement HomeLink;

	public boolean Clickonbutton()
	

	
	{
		
		boolean StaleElement = true;
		
		while(StaleElement)
			
			try
		{
				HomeLink.click();
				StaleElement=false;
				
				
		}
		catch(StaleElementReferenceException e)
		{
			
			
			e.printStackTrace(); //This is method of Throwable Class which provide details,Class Name in which Error occur,Line Etc.
			
			
		}
		return true;
		
		
		
		
		
		
		
	}

	public void NuberoflinksonHomePage()

	{

		int count = driver.findElements(By.tagName("a")).size();

		for (int i = 0; i <= count; i++)

		{
			driver.findElements(By.tagName("a")).get(i).click();
			String text = driver.getCurrentUrl();
			System.out.println(text);
		}

	}

}
