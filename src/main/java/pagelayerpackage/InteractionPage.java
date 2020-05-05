package pagelayerpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclassPackage.ProjectBaseClass;

public class InteractionPage extends ProjectBaseClass {

	@FindBy(xpath = "//a[text()='Interaction']")
	WebElement Interaction;

	@FindBy(xpath = "//a[text()='Draggable']")
	WebElement Draggable;

	@FindBy(xpath = "//a[text()='Resizable']")
	WebElement Resizable;

	@FindBy(xpath = "//a[text()='Selectable']")
	WebElement Selectable;

	@FindBy(xpath = "//a[text()='Selectable']")
	WebElement Sortable;

	// WebElements of Draggable Page//

	@FindBy(xpath = "//div[@id='example-1-tab-1']/div/iframe")
	WebElement Frame1;

	@FindBy(xpath = "//div[@id='draggable']")
	WebElement DragandDrop;

	@FindBy(xpath = "//a[text()='Constrain movement']")
	WebElement Constrainmovement;

	@FindBy(xpath = "//div[@id='example-1-tab-2']//iframe[@class='demo-frame']")
	WebElement Frame2;

	@FindBy(xpath = "//div[@id='draggable']")
	WebElement DraggedVertical;

	@FindBy(xpath = "//div[@id='draggable2']")
	WebElement DraggedHorizontal;

	@FindBy(xpath = "//div[@id='draggable3']")
	WebElement ChildBox;

	@FindBy(xpath = "//div[@id='draggable5']")
	WebElement ParentBox;

	@FindBy(xpath = "//a[text()='Draggable + Sortable']")
	WebElement DraggableSortable;

	@FindBy(xpath = "//ul[@id='sortable']/li[2]")
	WebElement item4;

	@FindBy(xpath = "//ul[@id='sortable']/li[2]")
	WebElement item1;

	@FindBy(xpath = "//div[@id='example-1-tab-5']//iframe[@class='demo-frame']")
	WebElement Frame5;

	@FindBy(xpath = "//a[text()='Droppable']")
	WebElement DroppableLink;

	// Shopping cart demo

	@FindBy(xpath = "//a[text()='Shopping cart demo']")
	WebElement ShoppingcartdemoTab;

	@FindBy(xpath = "//li[text()='Cheezeburger Shirt']")
	WebElement CheezeburgerShirt;

	@FindBy(css = ".ui-widget-content")
	WebElement ShoppingCart;

	public InteractionPage() throws IOException

	{
		PageFactory.initElements(driver, this);

	}

	// Actions

	public boolean ClickonInteractionTAB()

	{
		boolean StaleElement = true;

		while (StaleElement)

		{

			try {
				Interaction.click();
				StaleElement = false;

			}

			catch (StaleElementReferenceException e) {

				e.printStackTrace();
			}

		}

		return true;

	}

	public void MoveDragAndDrop()

	{

		Draggable.click();
		driver.switchTo().frame(Frame1);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		a.dragAndDropBy(DragandDrop, 250, 0).build().perform();

	}

	public void Constrainmovementalonganaxis()

	{
		Draggable.click();
		Constrainmovement.click();
		driver.switchTo().frame(Frame2);

		a.dragAndDropBy(DraggedVertical, 0, 250).build().perform();

	}

	public void ConstrainmovementalonganHorizontalaxis()

	{
		Draggable.click();
		Constrainmovement.click();
		driver.switchTo().frame(Frame2);
		a.dragAndDropBy(DraggedHorizontal, 250, 0).build().perform();

	}

	public void DragandSortable()

	{
		Draggable.click();
		DraggableSortable.click();
		driver.switchTo().frame(Frame5);
		a.dragAndDrop(item4, item1);

	}
	
	
	
	
	public void shoppingcartadd()
	
	{
		DroppableLink.click();
		ShoppingcartdemoTab.click();
		driver.switchTo().frame(Frame5);
		a.clickAndHold(CheezeburgerShirt).build().perform();
		a.dragAndDrop(CheezeburgerShirt, ShoppingCart);
		
		
	}

}
