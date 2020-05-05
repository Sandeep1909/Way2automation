package pagelayerpackage;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclassPackage.ProjectBaseClass;

public class WidgetPage extends ProjectBaseClass

{

	@FindBy(xpath = "//a[text()='Widget']")
	WebElement WidgetLink;

	@FindBy(xpath = "//a[text()='Autocomplete']")
	WebElement Autocomplete;

	@FindBy(xpath = "//a[text()='Multiple Values']")
	WebElement MultipleValues;

	@FindBy(css = ".ui-autocomplete-input")
	WebElement Tagprogramminglanguages;

	@FindBy(xpath = "//div[@id='example-1-tab-2']//iframe")
	WebElement Frame2;

	@FindBy(xpath = "//a[text()='Datepicker']")
	WebElement DatepickerLink;

	@FindBy(xpath = "//div[@id='example-1-tab-1']//iframe")
	WebElement Frame1;

	@FindBy(xpath = "//input[@id='datepicker']")
	WebElement DateBox;

	@FindBy(tagName = "//table[@class='ui-datepicker-calendar']//td")
	WebElement Listofdates;

	@FindBy(xpath = "//a[text()='Slider']")
	WebElement SliderLink;

	@FindBy(css = ".ui-slider-handle.ui-state-default.ui-corner-all")
	WebElement Slider;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement NoofBedroooms;

	public WidgetPage() throws IOException

	{

		PageFactory.initElements(driver, this);

	}

	// Action//

	public boolean ClickonWidget()

	{

		boolean StaleElement = true;

		while (StaleElement) {

			try {
				WidgetLink.click();
				StaleElement = false;

			} catch (StaleElementReferenceException e)

			{

				e.printStackTrace();

			}

		}
		return true;

	}

	public void programminglanguages()

	{
		Autocomplete.click();
		MultipleValues.click();
		driver.switchTo().frame(Frame2);
		Tagprogramminglanguages.sendKeys("java");
		Tagprogramminglanguages.sendKeys(Keys.ARROW_DOWN);
		Tagprogramminglanguages.sendKeys(Keys.ENTER);

	}

	public void DatepickerMethod()

	{
		DatepickerLink.click();

		driver.switchTo().frame(Frame1);

		DateBox.click();

		WebElement datewidget = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));

		java.util.List<WebElement> col = datewidget.findElements(By.tagName("td"));

		for (WebElement ele : col) 
		
		{

			String DateValue = ele.getText();

			if (DateValue.equalsIgnoreCase("10"))

			{

				ele.findElement(By.linkText("10")).click();
				break;

			}

		}

	}
	
	public void SliderMethod()
	
	{
		
		SliderLink.click();
		driver.switchTo().frame(Frame1);
		a.dragAndDropBy(Slider,300,0).build().perform();
		String ValueText=NoofBedroooms.getText();
		System.out.println(ValueText);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
