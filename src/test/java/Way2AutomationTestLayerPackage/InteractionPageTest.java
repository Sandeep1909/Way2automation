package Way2AutomationTestLayerPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassPackage.ProjectBaseClass;
import pagelayerpackage.InteractionPage;


public class InteractionPageTest extends ProjectBaseClass {

	public static InteractionPage IP;

	public InteractionPageTest() throws IOException

	{
		super();

	}

	@BeforeMethod()
	public void startup() throws IOException {

		intialization();
		IP = new InteractionPage();

	}

	
	@Test
	public void DrangandDropTest()

	{
		IP.ClickonInteractionTAB();
		IP.MoveDragAndDrop();

	}

	

	@Test
	public void MoveElementAlongYAxisTest()
	
	{

		IP.ClickonInteractionTAB();
		IP.Constrainmovementalonganaxis();
	}



@Test
	public void MoveElementAlongXAxisTest() {

		IP.ClickonInteractionTAB();
		IP.ConstrainmovementalonganHorizontalaxis();

	}



@Test
public void DragandShortTest()
{
	IP.ClickonInteractionTAB();
	IP.DragandSortable();
}
	

@Test
public void shoppingcartadd()
{
	IP.ClickonInteractionTAB();
	IP.shoppingcartadd();
	
}



	
	@AfterMethod
	public void browserquit() throws InterruptedException
	
	
	{
		Thread.sleep(10000L);
		driver.quit();
		
	}
	
	
	
	
	
	
}
