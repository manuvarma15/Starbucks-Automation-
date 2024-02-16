package pagepkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Add_to_Cart {
	WebDriver driver;
	// locating the item to add to cart
	@FindBy(xpath="/html/body/app-root/div/app-dashboard/div/section[2]/div/div[2]/div/swiper/div[4]/div[2]/div/div[2]/div[2]/button")
	WebElement Item;
	
	//loating customization tab
	
	@FindBy(xpath="//*[@id=\"mat-expansion-panel-header-0\"]/span/mat-panel-title/span")
WebElement Customization;
	
	// locating venti size
	@FindBy(xpath="//*[@id=\"cdk-accordion-child-0\"]/div/div/div/div/div/div/div/div[2]/div/div[3]/button/div/div[2]/button")
	WebElement Ventisize;
	//locating Add item
	@FindBy(xpath="/html/body/app-root/div/app-product-customization/div/div[4]/div/div/div/button")
	WebElement AddItem;
	//locating ViewCart
	@FindBy(xpath= "/html/body/app-root/div/app-dashboard/div/app-home-order-track/div/div/div/div/swiper/div[4]/div/div/div[2]/div/button")
	WebElement ViewCart;
	
	//locating quantity minus button
	@FindBy(xpath="/html/body/app-root/div/app-cart/div/div/div[2]/div/div[3]/div/div[4]/div[1]/div/a[1]/span")
	WebElement MinusButton;
	//locating confirmation Button
	@FindBy(xpath="//button[@class='custom-btn btn-md-rounded btn-yes']")
	WebElement YesButton;
	
	//locating home by clicking logo
	@FindBy(xpath= "//img[@fetchpriority='high']")
	WebElement Homelogo;
	//locating Button for logout
	
	@FindBy(xpath= "//body[1]/app-root[1]/div[1]/app-dashboard[1]/div[1]/app-header[1]/header[1]/div[1]/div[1]/div[2]/a[1]")
		
	WebElement Roundbutton;
	//locating logout option
	@FindBy(xpath="/html/body/app-root/div/app-user-profile/div/div[2]/div/mat-card/div/div/div[9]/a/span")
	WebElement Logout;
	
	public Add_to_Cart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Adding Item to Cart
	
	public void Adding_item_to_cart() throws InterruptedException
	{
		Item.click();
		Thread.sleep(1000);
		Customization.click();
		Thread.sleep(2000);
		Ventisize.click();
		AddItem.click();
	}
	public void Viewing_cart()
	{
		ViewCart.click();
	}
	public void Minimizing_Quantity() throws InterruptedException
	{
		MinusButton.click();
		Thread.sleep(2000);
	}
	public void Confirmation_Button() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		YesButton.click();
	}
	public void Back_Home_Button() throws InterruptedException
	{
		Thread.sleep(5000);
		Homelogo.click();
		
	}
	public void Round_Button_to_logout() throws InterruptedException
	{
		Thread.sleep(3000);
		Roundbutton.click();
	}
	
	public void Log_out() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 4000)");
        Thread.sleep(2000);
		Logout.click();
	}
}

	
	

	
	
	
	




