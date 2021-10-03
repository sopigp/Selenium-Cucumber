package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class RoomsPriceSummaryPage extends BaseClass {
	
	public RoomsPriceSummaryPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
//	ROOM & PRICE SUMMARY
	@FindBy(xpath = "//span[.='Rooms & Price Summary']")
	private WebElement titleRoomsPriceSummary;
	
	@FindBy(xpath = "//div[@class='room-xs-info']//a[contains(.,'General Rooms')]")
	private WebElement hotelName;
	
	@FindBy(xpath = "//p[@class='hotel-location']")
	private WebElement hotelLocation;
	
	@FindBy(xpath = "//p[contains(text(),\"Oct\")]")
	private WebElement hotelCheckIn;
	
	@FindBy(xpath = "//div[@class='col-sm-2 col-xs-6']")
	private WebElement hotelRooms;
	
	@FindBy(xpath = "//p[contains(.,'02 Adults, 02 Child')]")
	private WebElement hotelGuest;
	
	@FindBy(xpath = "//div[@class='rooms_price_block']//span[@class='room_type_current_price']")
	private WebElement totalRoomPrice;
	
	@FindBy(xpath = "//div[@class='total_price_block']//span[@class='room_type_current_price']")
	private WebElement totalPricePerNight;
	
	@FindBy(xpath = "//span[.='1 000,00 Rp‎']")
	private WebElement totalRoomCost;
	
	@FindBy(xpath = "//div[@class='total_price_block']//span[@class='room_type_current_price']")
	private WebElement finalTotalRoom;
	
	@FindBy(xpath = "//div[@class='order-detail-content']//span[contains(.,'Proceed')]")
	private WebElement btn_proceedRooms;
	
//	GUEST INFORMATION
	@FindBy(xpath = "//span[.='Guest Information']")
	private WebElement titleGuestInformation;
	
	@FindBy(xpath = "//div[contains(text(),\"Pratiwi\")]")
	private WebElement booking_name;
	
	@FindBy(xpath = "//div[contains(text(),\"@gmail.com\")]")
	private WebElement booking_email;
	
	@FindBy(xpath = "//div[@class='row margin-btm-10']/div[contains(.,'081316009990')]")
	private WebElement booking_mobilephone;
	
	@FindBy(xpath = "//div/a[contains(@title,'Proceed to Payment')]")
	private WebElement btn_guestInformation;
	
//	PAYMENT INFORMATION
	@FindBy(xpath = "//span[.='Payment Information']")
	private WebElement titlePaymentInformation;
	
	@FindBy(id = "tc_link")
	private WebElement link_tnc;
	
	@FindBy(xpath = "//a[@class='fancybox-item fancybox-close']")
	private WebElement close_tnc;
	
	@FindBy(id = "cgv")
	private WebElement checkbox_paymentInformation;
	
	@FindBy(className = "bankwire")
	private WebElement btn_payByBankWire;
	
	@FindBy(className = "cheque")
	private WebElement btn_payByCheck;
	
	@FindBy(xpath = "//a[contains(.,'Pay with your card or your PayPal account')]")
	private WebElement btn_payByPaypal;
	
	public void clickProceedRooms() {
		btn_proceedRooms.click();
	}
	
	public boolean isDisplayed(){
		titleRoomsPriceSummary.isDisplayed();
		hotelName.isDisplayed();
		hotelLocation.isDisplayed();
		hotelCheckIn.isDisplayed();
		hotelRooms.isDisplayed();
		hotelGuest.isDisplayed();
		totalRoomPrice.isDisplayed();
		totalPricePerNight.isDisplayed();
		totalRoomCost.isDisplayed();
		finalTotalRoom.isDisplayed();
        return true;
	}
	
	public String getTitle() {
		return titleRoomsPriceSummary.getText();
	}
	
//	VERIFY ROOM & PRICE SUMMARY
	
	public String getHotelName() {
		return hotelName.getText();
	}
	
	public String getHotelLocation() {
		return hotelLocation.getText();
	}
	
	public String getHotelCheckin() {
		return hotelCheckIn.getText();
	}
	
	public String getHotelRooms() {
		return hotelRooms.getText();
	}
	
	public String getHotelGuest() {
		return hotelGuest.getText();
	}
	
	public String getHotelPrice() {
		return totalRoomPrice.getText();
	}
	
	public String getHotelperNigh() {
		return totalPricePerNight.getText();
	}
	
	public String getHotelCost() {
		return totalRoomCost.getText();
	}
	
	public String getHotelTotal() {
		return finalTotalRoom.getText();
	}
	
//	VERIFY GUEST INFORMATION
	public boolean guestInformationIsDisplayed(){
		titleGuestInformation.isDisplayed();
		booking_name.isDisplayed();
		booking_email.isDisplayed();
		booking_mobilephone.isDisplayed();
        return true;
	}
	
	public String getTitleGuestInformation() {
		return titleGuestInformation.getText();
	}
	
	public String getName() {
		return booking_name.getText();
	}
	
	public String getEmail() {
		return booking_email.getText();
	}
	
	public String getMobileNumber() {
		return booking_mobilephone.getText();
	}
	
//	VERIFY PAYMENT INFORMATION
	
	public boolean paymentInformationIsDisplayed(){
		titlePaymentInformation.isDisplayed();
		link_tnc.isDisplayed();
		checkbox_paymentInformation.isDisplayed();
        return true;
	}
	
	public String getTitlePaymentInfo() {
		return titlePaymentInformation.getText();
	}
	
	public boolean paymentMethodIsDisplayed(){
		btn_payByBankWire.isDisplayed();
		btn_payByCheck.isDisplayed();
		btn_payByPaypal.isDisplayed();
        return true;
	}
	
	public void clickGuestInformation() {
		btn_guestInformation.click();
	}
	
	public void clickTnC() {
		link_tnc.click();
	}
	
	public void clickCloseTnC() {
		close_tnc.click();
	}
	
	public void checkboxPaymentInformation() {
		checkbox_paymentInformation.click();
	}
	
	public void payBankWire() {
		btn_payByBankWire.click();
	}


}
