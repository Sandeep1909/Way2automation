package pagelayerpackage;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclassPackage.ProjectBaseClass;

public class DynamicElement extends ProjectBaseClass {



	@FindBy(xpath = "//a[text()='Dynamic Elements']")
	WebElement DynamicElements;
	
	
	
	@FindBy(xpath = "//a[text()='Submit Button Clicked']")
	WebElement SubmitButtonClicked;

	@FindBy(xpath = "//div[@id='example-1-tab-1']//iframe")
	WebElement Frame1;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement InputType;
	
	@FindBy(xpath = "//input[@id='submit19015']")
	WebElement Submit;
	
	@FindBy(xpath = "//a[text()='Dropdown']")
	WebElement Dropdown;
	
	@FindBy(xpath="//html//body//select")
	WebElement SelectTab;
	
	@FindBy(xpath = "//div[@id='example-1-tab-2']//iframe")
	WebElement Frame2;
	
	@FindBy(xpath = "//a[text()='Enter Country']")
	WebElement EnterCountryTab;
	
	
	
	@FindBy(css=".custom-combobox-input.ui-widget.ui-widget-content.ui-state-default.ui-corner-left.ui-autocomplete-input")
	WebElement EnterCountry;
	
	
	public DynamicElement() throws IOException

	{

		PageFactory.initElements(driver, this);

	}
	
	
	
	public boolean DynamicElementTab()
	
	{
		
		boolean StaleElement=true;
		
		while(StaleElement)
		{
			
			try {
				
				DynamicElements.click();
				StaleElement =false;
			}
			catch(StaleElementReferenceException e)
			{
				e.printStackTrace();
				
			}
			
		}
		
		return true;
	}
	
	
	
	
	
	public void StartWith()
	
	{
		SubmitButtonClicked.click();
		driver.switchTo().frame(Frame1);
		InputType.sendKeys("Hello i am submitting");
		
		
		
	}
	
	
	public void DropDrown()
	
	{
		
		Dropdown.click();
		driver.switchTo().frame(Frame1);
		Select s= new Select(SelectTab);
		
		s.selectByVisibleText("Congo");
		SelectTab.sendKeys(Keys.ENTER);
		
	}
	
	
	public void EntryContry()
	
	{
		
		Dropdown.click();
		EnterCountryTab.click();
		driver.switchTo().frame(Frame2);
		EnterCountry.click();
		EnterCountry.clear();
		EnterCountry.sendKeys("INDIA");
		EnterCountry.sendKeys(Keys.ARROW_DOWN);
		EnterCountry.sendKeys(Keys.ARROW_DOWN);
		EnterCountry.sendKeys(Keys.ENTER);
		
		
	}
	

}
