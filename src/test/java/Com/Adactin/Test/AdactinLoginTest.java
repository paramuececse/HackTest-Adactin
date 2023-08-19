package Com.Adactin.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Adactin.Demo.AdactinLogin;

import Com.DriverClassPackage.AdactinDriverClass;

public class AdactinLoginTest extends  AdactinDriverClass{
	WebDriver driver;
	AdactinLogin AAL;
	//AdactinSearchHotel ASH;
		WebDriverWait wait ;
		@BeforeTest
		public void beforeTest() {
			driver=DriverMethod();
		}
  @Test(priority = 1)
  public void LoginMethod() throws InterruptedException {
	  AAL=new AdactinLogin(driver);
	  AAL.LoginName("psivasankari");
	  AAL.LoginPass("sankari");
	  AAL.Login();
	  Thread.sleep(5000);
	  AAL.locations();
	  AAL.Hotels();
	  //AAL.RoomLocation();
	  AAL.RoomsType();
	  AAL.NoOfRooms();
	  AAL.DatepickIn("22/08/2023");
	  AAL.DatepickOut("23/08/2023");
	  AAL.AdultRoom();
	  AAL.ChildRoom();
	  AAL.Search();
	  Thread.sleep(4000);
	  AAL.BookAHotel("sivasankari", "p", "1/171,xyz street,kpy nagar,PBRL dtr.", "9876543210123456", "987");
  }
 
//  @AfterTest
//  public void Registerpageclose() throws InterruptedException {
//  	Thread.sleep(3000);
//  	driver.close();
//  }
}
