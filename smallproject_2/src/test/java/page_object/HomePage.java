package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class HomePage extends BaseClass{

	public HomePage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}

//	HOTEL NAME
	@FindBy(className = "header-hotel-name")
	private WebElement welcome;
	
//	HOTEL NAME
	@FindBy(xpath = "//span[@class='account_user_name hide_xs']")
	private WebElement account_name;
	
//	BUTTON SIGN IN
	@FindBy(className = "hide_xs")
	private WebElement btn_sign_in;
	
//	AUTHENTICATION
	@FindBy(className = "page-heading")
	private WebElement authentication;
	
//	HOTEL LOCATION
	@FindBy(id="hotel_location")
	private WebElement select_hotelLocation;
	
//	HOTEL NAME
	@FindBy(id="id_hotel_button")
	private WebElement select_hotel_name;
	
//	PAKAI YG INI
	@FindBy(className="search_result_li")
	private WebElement click_hotel_name;
	
	@FindBy(id="hotel_cat_name")
	private WebElement hotelName;
	
//	CHECK IN DATE
	@FindBy(id="check_in_time")
	private WebElement select_checkInDate;
	
	@FindBy(xpath="//a[.='Next']")
	private WebElement NextDatePicker;
	
	@FindBy(xpath="//a[.='10']")
	private WebElement checkInDate;
	
	@FindBy(id="search_room_submit")
	private WebElement btn_search;
	
	
//	CHECK OUT DATE
	@FindBy(id="check_out_time")
	private WebElement select_checkOutDate;
	
	@FindBy(xpath="//a[.='11']")
	private WebElement checkOutDate;
	
//	ROOM HOTEL
	@FindBy(xpath="//a[@href='http://qa.cilsy.id:8080/en/the-hotel-prime/4-super-delux-rooms.html']/span[.='book now']")
	WebElement general_rooms;
	
	public void clickSignIn() {
		btn_sign_in.click();
	}
	
	public boolean isDisplayed(){
		btn_sign_in.isDisplayed();
		welcome.isDisplayed();
        return true;
	}
	
	public String getTitle() {
		return authentication.getText();
	}
	
	public String getTitleDashboard() {
		return welcome.getText();
	}
	
	public String getAccountName() {
		return account_name.getText();
	}
	
//	SEARCH FIELD
		
	public void setHotelLocation(String hotel_location) {
		select_hotelLocation.sendKeys(hotel_location);
	}
	
	public void click_hotelName() {
		select_hotel_name.click();
		click_hotel_name.click();
	}
	
	public void click_checkInDate() {
		select_checkInDate.click();
		NextDatePicker.click();
	}
	
	public void checkInDate() {
		checkInDate.click();
	}
	
	
	public void click_checkOutDate() {
		select_checkOutDate.click();
		NextDatePicker.click();
	}
	
	public void checkOutDate() {
		checkOutDate.click();
	}
	
	public void search() {
		btn_search.click();
	}
	
	public String getHotel() {
		return hotelName.getText();
	}
	
	public void setCheckin(String checkin, String checkout) {
		select_checkInDate.sendKeys(checkin);
		select_checkOutDate.sendKeys(checkout);
	}
}
