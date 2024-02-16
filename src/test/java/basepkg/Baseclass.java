package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException 
	{
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);*/
		driver=new ChromeDriver();
		//Actions actions=new Actions (driver);
		driver.get("https://www.starbucks.in/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	
	}
	@AfterTest
	public void posttest()
	{
		driver.quit();
	}

}
