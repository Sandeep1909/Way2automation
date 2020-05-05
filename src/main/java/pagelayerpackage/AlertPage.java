package pagelayerpackage;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;

import baseclassPackage.ProjectBaseClass;

public class AlertPage extends ProjectBaseClass {

	@FindBy(xpath = "//a[text()='Alert']")
	WebElement AlerTab;

	@FindBy(xpath = "//div[@id='example-1-tab-1']//iframe")
	WebElement Frame1;

	@FindBy(xpath = "//button[text()='Click the button to display an alert box:']")
	WebElement Box;

	@FindBy(xpath = "//a[text()='Input Alert']")
	WebElement InputAlert;

	@FindBy(xpath = "//div[@id='example-1-tab-2']//iframe")
	WebElement Frame2;

	@FindBy(xpath = "//button[text()='Click the button to demonstrate the Input box.']")
	WebElement Frame2alert;

	public AlertPage() throws IOException

	{

		PageFactory.initElements(driver, this);

	}

	public boolean ClickonAlerTab()

	{

		boolean StaleElement = true;

		while (StaleElement) {

			try {

				AlerTab.click();
				StaleElement = false;

			}

			catch (StaleElementReferenceException e) {
				e.printStackTrace();

			}
		}

		return true;

	}

	public void Simplealertclick()

	{

		driver.switchTo().frame(Frame1);
		Box.click();
		driver.switchTo().alert().accept();

	}

	public void InputAlert() throws InterruptedException

	{

		InputAlert.click();
		driver.switchTo().frame(Frame2);
		Frame2alert.click();

		Thread.sleep(2000L);
		Alert alert = driver.switchTo().alert();

		alert.sendKeys("sandeep");

		Thread.sleep(2000L);
		alert.accept();
		

	}

}
