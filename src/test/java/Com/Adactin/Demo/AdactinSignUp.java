package Com.Adactin.Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import net.sourceforge.tess4j.*;
import java.io.*;
import Com.DriverClassPackage.AdactinDriverClass;
public class AdactinSignUp  {
	WebDriver driver;
	public AdactinSignUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New User Register Here')]")
	WebElement Register;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="re_password")
	WebElement repassword;
	
	@FindBy(id="full_name")
	WebElement FullName;
	
	@FindBy(id="email_add")
	WebElement email;
	
	@FindBy(id="captcha")
	WebElement captcha;
	
	@FindBy(id="captcha-form")
	WebElement CaptchaForm;
	
	@FindBy(id="tnc_box")
	WebElement checkbox;
	
	@FindBy(id="Submit")
	WebElement submit;
	
	public void RegisterMethod() {
		Register.click();
	}
	public void UserNamereg(String usernamereg) {
		username.sendKeys(usernamereg);
	}
	public void PassWordNamereg(String PWreg) {
		password.sendKeys(PWreg);
	}
	public void REPassWordNamereg(String RPWreg) {
		repassword.sendKeys(RPWreg);
	}
	public void FullNamereg(String FNreg) {
		FullName.sendKeys(FNreg);
	}
	public void EmailAdd(String emailadd) {
		email.sendKeys(emailadd);
	}
	public void cpatcha() throws IOException, InterruptedException {
		Thread.sleep(20000);
//		File src=captcha.getScreenshotAs(OutputType.FILE);
//		String path=System.getProperty("user.dir")+"/ScreenShots/captcha.png";
//		FileHandler.copy(src, new File(path));
//		ITesseract image=new Tesseract();
//		
//		String imageText=image.doOCR(new File(path));
//		//imageText.replaceAll("[^a-zA-Z]", "");
//		System.out.println(imageText);
		}
	public void checkbox() {
		checkbox.click();
	}
	public void summit() {
		submit.click();
	}
	}
