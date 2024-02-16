package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Add_to_Cart;
import pagepkg.SB_login_page;
import utilitypkg.Excelutils;

public class SB_Tests extends Baseclass {
	@Test
	/*public void alerthandling() {
		Alert a= driver.switchTo().alert();
		a.accept();
	}*/
	public void Verify_login_with_valid_credentials() throws InterruptedException
	{
		//creating object for Fbloginpage
		SB_login_page p1 = new SB_login_page(driver);
		p1.clickRoundbutton();
		p1.clickLoginsignupBtn();
	
		//Reading data from the excel page by specified path
		String x1="D:\\Manu\\Software Testing\\notes and seminars\\Starbucks login data maven project.xlsx";
		String Sheet= "Sheet1";
		int RowCount=Excelutils.getRowCount(x1, Sheet);
		for(int i=1;i<=RowCount;i++) {
			String Username= Excelutils.getcellvalue(x1, Sheet, i, 0);
			String Pwd=Excelutils.getcellvalue(x1, Sheet, i, 1);
			//passing user name and password as parameters
			p1.setvalues(Username, Pwd);
			
			//Submitting the data by clicking loginbutton
			p1.clickloginbutton();
			
			
			
			
			String ExpectedUrl="https://www.starbucks.in/profile";
			String ActualUrl=driver.getCurrentUrl();
			System.out.println("The url loaded is:"+ActualUrl);
			Assert.assertEquals(ActualUrl,ExpectedUrl);
	
		}
	}
	@Test(priority = 2)
	public void View_menu_add_to_cart() throws InterruptedException
	{
		// creating object for Add to cart
		
		Add_to_Cart p2= new Add_to_Cart(driver);
		p2.Adding_item_to_cart();
		p2.Viewing_cart();
		p2.Minimizing_Quantity();
		p2.Confirmation_Button();
		p2.Back_Home_Button();
		p2.Round_Button_to_logout();
		p2.Log_out();
		
	}
	
	
	
	
}
