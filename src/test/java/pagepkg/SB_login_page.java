package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SB_login_page {
	
	WebDriver driver;
	//locating Button for login
	
	@FindBy(xpath= "//body[1]/app-root[1]/div[1]/app-dashboard[1]/div[1]/app-header[1]/header[1]/div[1]/div[1]/div[2]/a[1]")
	
	WebElement Roundbutton;
	
	// Locating login/signup button
	@FindBy(xpath= "//button[@type='button']")
	WebElement Loginsignupbutton;
	
	//locating emailid textbox
	
	@FindBy (xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-login-dialog/section/div[2]/form/div[1]/mat-form-field/div/div[1]/div/input")
	WebElement Emailfield;
	//Locating Password textbox
	@FindBy(xpath="//*[@id=\"mat-input-1\"]")
	WebElement Passwordfield;
	
	//locating login button
		@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-login-dialog/section/div[2]/form/div[4]/button")
		WebElement Loginbutton;
	
	public SB_login_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	//Clicking on Roundbutton to see the login option
	public void clickRoundbutton() throws InterruptedException
	{
		
		Thread.sleep(3000);
		Roundbutton.click();
	}
	//clicking on login/signup button 
		public void clickLoginsignupBtn() throws InterruptedException
		{
			Thread.sleep(3000);
			Loginsignupbutton.click();
		}
// specifying email and password 
		public void setvalues(String UN,String PWD) {
			Emailfield.sendKeys(UN);
			Passwordfield.sendKeys(PWD);
			Emailfield.clear();
			
}
		//clicking on login button 
		public void clickloginbutton() throws InterruptedException 
		{
			Thread.sleep(2000);
			Loginbutton.click();
		}
}
