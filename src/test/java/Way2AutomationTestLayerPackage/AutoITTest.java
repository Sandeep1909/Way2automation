package Way2AutomationTestLayerPackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITTest {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandeep\\ChromeDRIVERversion81\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertwordtopdf.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#dropzoneInput-label")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Sandeep\\Pictures\\Camera Roll\\Upload.exe");

	}

}
