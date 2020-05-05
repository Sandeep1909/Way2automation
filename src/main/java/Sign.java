import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandeep\\ChromeDRIVERversion81\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");

		driver.findElement(By.xpath("//a[text()='Signin']")).click();

		WebElement loginpopup = driver.findElement(By.xpath("//div[@class='fancybox-inner']"));

		loginpopup.findElement(By.name("username")).sendKeys("sandeep");
		loginpopup.findElement(By.name("password")).sendKeys("way2automation");

		driver.findElements(By.xpath("//div[@class='span_1_of_4']/input")).get(1).click();

	}
}
