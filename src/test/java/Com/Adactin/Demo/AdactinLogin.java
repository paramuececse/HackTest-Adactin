package Com.Adactin.Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class AdactinLogin {
	WebDriver driver;
	public AdactinLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement LoginUserName;
	
	@FindBy(id="password")
	WebElement Loginpassword;
	
	@FindBy(id="login")
	WebElement login;
	
	@FindBy(id="location")
	WebElement location;
	
	@FindBy(id="hotels")
	WebElement hotel;
	
	@FindBy(id="room_type")
	WebElement room_type;
	
	@FindBy(id="room_nos")
	WebElement room_nos;
	
	@FindBy(id="datepick_in")
	WebElement datepick_in;
	
	@FindBy(id="datepick_out")
	WebElement datepick_out;
	

	@FindBy(id="adult_room")
	WebElement adult_room;

	@FindBy(id="child_room")
	WebElement child_room;

	@FindBy(xpath="//input[@value=\"Search\"]")
	WebElement search;
	
	@FindBy(id="radiobutton_0")
	WebElement clickcircle;
	
	@FindBy(id="continue")
	WebElement clickcontinue;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="cc_num")
	WebElement cc_num;
	
	@FindBy(id="cc_type")
	WebElement cc_type;
	
	@FindBy(id="cc_exp_month")
	WebElement cc_exp_month;
	
	@FindBy(id="cc_exp_year")
	WebElement cc_exp_year;
	
	@FindBy(id="cc_cvv")
	WebElement cc_cvv;
	
	@FindBy(id="book_now")
	WebElement bookingbtn;
	@FindBy(xpath="//td[@class=\"login_title\"]")
	WebElement confirm;
	@FindBy(id="search_hotel")
	WebElement search_hotel;
	
	public void LoginName(String name) {
		LoginUserName.sendKeys(name);
	}
	public void LoginPass(String password) {
		Loginpassword.sendKeys(password);
	}
	
	public void Login() {
		login.click();
	}
	public void locations() {
		Select s=new Select(location);
		s.selectByVisibleText("London");
		
	}
	public void Hotels() {
		Select h=new Select(hotel);
		h.selectByVisibleText("Hotel Sunshine");
	}
//	public void RoomLocation() {
//		Select h=new Select(location);
//		h.selectByVisibleText("Hotel Sunshine");
//	}
	public void RoomsType() {
		Select h=new Select(room_type);
		h.selectByVisibleText("Standard");
	}
	public void NoOfRooms() {
		Select h=new Select(room_nos);
		h.selectByVisibleText("1 - One");
	}
	public void DatepickIn(String datein) {
		datepick_in.sendKeys(datein);
	}
	public void DatepickOut(String dateout) {
		datepick_out.sendKeys(dateout);
	}
	public void AdultRoom() {
		Select h=new Select(adult_room);
		h.selectByVisibleText("1 - One");
	}
	public void ChildRoom() {
		Select h=new Select(child_room);
		h.selectByVisibleText("0 - None");
	}
	public void Search() throws InterruptedException {
		search.click();
		Thread.sleep(5000);
		clickcircle.click();
		clickcontinue.click();
	}
	public void BookAHotel(String Bfirstname,String Blastname,String Baddress,String cno,String cvv) throws InterruptedException {
		firstname.sendKeys(Bfirstname);
		lastname.sendKeys(Blastname);
		address.sendKeys(Baddress);
		cc_num.sendKeys(cno);
		Thread.sleep(2000);
		Select vtype=new Select(cc_type);
		vtype.selectByVisibleText("VISA");
		Thread.sleep(2000);
		Select month=new Select(cc_exp_month);
		month.selectByVisibleText("January");
		Select year=new Select(cc_exp_year);
		year.selectByVisibleText("2026");
		cc_cvv.sendKeys(cvv);
		bookingbtn.click();
		Thread.sleep(5000);
		String s=confirm.getText();
		System.out.println("confirmation--->"+s);
        driver.getTitle();
		search_hotel.click();
	}
}
