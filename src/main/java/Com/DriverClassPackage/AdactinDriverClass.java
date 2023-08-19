package Com.DriverClassPackage;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AdactinDriverClass {
	
	    public  WebDriver  DriverMethod() {
	    	WebDriverManager.chromedriver().setup();
	    	WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver-http-factory", "jdk-http-client");
		// driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://adactinhotelapp.com/index.php");
		 
		 return driver;
}
	    public String takeScreenshot(String testName,WebDriver driver) throws IOException{
	    	File srcScreenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	String srcScreenShotFilepath=	System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
	    	FileUtils.copyFile(srcScreenshot,new File( srcScreenShotFilepath));
	    	return srcScreenShotFilepath;
	    	}
}