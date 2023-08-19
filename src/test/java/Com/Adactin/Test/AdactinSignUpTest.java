package Com.Adactin.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Adactin.Demo.AdactinSignUp;
import Com.DriverClassPackage.AdactinDriverClass;
//import net.sourceforge.tess4j.TesseractException;

public class AdactinSignUpTest extends AdactinDriverClass{
	 WebDriver driver;
	 AdactinSignUp AAS;
		WebDriverWait wait ;
		@BeforeTest
		public void beforeTest() {
			driver=DriverMethod();
		}
 
@Test
  public void AdactinMethod() throws IOException, InterruptedException {
	AAS=new AdactinSignUp(driver);
	AAS.RegisterMethod();
	AAS.UserNamereg("psivasankari");
	AAS.PassWordNamereg("sankari");
	AAS.REPassWordNamereg("sankari");
	AAS.FullNamereg("sivasankari");
	AAS.EmailAdd("paraproject2022@gmail.com");
	AAS.cpatcha();
	AAS.checkbox();
	AAS.summit();
  }

@AfterTest
public void Registerpageclose() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
}
}
