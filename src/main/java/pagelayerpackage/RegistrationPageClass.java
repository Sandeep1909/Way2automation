package pagelayerpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclassPackage.ProjectBaseClass;

public class RegistrationPageClass extends ProjectBaseClass {

	@FindBy(xpath = "//a[text()='Registration']")
	WebElement RegistrationTab;

	@FindBy(xpath = "//input[@name='name']")
	WebElement FirstName;

	@FindBy(xpath = "//fieldset[@class='fieldset']//p[2]//input[@type='text']")
	WebElement LastName;

	@FindBy(xpath = "//input[@type='radio']")
	WebElement MartialStatusButton;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement HobbyCheckbox;

	@FindBy(tagName = "select")
	WebElement SelectTag;

	@FindBy(xpath = "//div[@class='time_feild']//select")
	WebElement DOBTag;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement PhoneNumber;

	@FindBy(xpath = "//input[@name='username']")
	WebElement UserName;

	@FindBy(xpath = "//input[@name='email']")
	WebElement Email;

	@FindBy(xpath = "//input[@type='file']")
	WebElement ChooseFile;

	@FindBy(xpath = "//textarea")
	WebElement AboutYourself;

	@FindBy(xpath = "//fieldset[@class='fieldset']//input[@name='password']")
	WebElement Password2;

	@FindBy(xpath = "//input[@name='c_password']")
	WebElement c_password;

	@FindBy(xpath = "//input[@value='submit']")
	WebElement Sumbit;

	public RegistrationPageClass() throws IOException {

		PageFactory.initElements(driver, this);
	}

	public boolean ClickonRegistrationTab()

	{
		boolean StaleElement = true;

		while (StaleElement) {

			try {

				RegistrationTab.click();
				StaleElement = false;
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();

			}

		}

		return true;
	}

	public void RegistarionPage() throws IOException

	{

		FirstName.sendKeys("Sandeep");
		LastName.sendKeys("Kumar");
		
		MartialStatusButton.click();
		HobbyCheckbox.click();
		PhoneNumber.sendKeys("925365264");
		UserName.sendKeys("SndeepK");
		Email.sendKeys("SandeepKumarSingh@unionbank.com");

		AboutYourself.sendKeys("This is my descrption about myself");
		Password2.sendKeys("password123");
		c_password.sendKeys("password123");
		Sumbit.click();

	}

}
