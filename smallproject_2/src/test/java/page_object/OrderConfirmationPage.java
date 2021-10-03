package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderConfirmationPage extends BaseClass {
	
	public OrderConfirmationPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement titleOrderConfirmation;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement popupOrderSuccess;
	
	@FindBy(xpath = "//span[.='Confirmed']")
	private WebElement orderStatus;
	
	@FindBy(xpath = "//span[@class='bold']")
	private WebElement orderReference;
	
//	ORDER DETAILS
	@FindBy(xpath = "//a[contains(.,'General Rooms')]")
	private WebElement roomDescription;

//	PAKAI INI
	@FindBy(xpath = "//td[.='The Hotel Prime']")
	private WebElement hotelName;
	
	@FindBy(xpath = "//span[@class='product_original_price ']")
	private WebElement unitPrice;
	
	@FindBy(xpath = "//td[5]/p[contains(.,'1')]")
	private WebElement rooms;
	
	@FindBy(xpath = "//p[contains(.,'10-10-2021')]")
	private WebElement checkInDate;
	
	@FindBy(xpath = "//p[contains(.,'11-10-2021')]")
	private WebElement checkOutDate;
	
	@FindBy(xpath = "//p[@class='text-left']")
	private WebElement total;
	
	@FindBy(xpath = "//tfoot[1]/tr[1]//span[.='1 100,00 Rp‎']")
	private WebElement tax;
	
	@FindBy(xpath = "//tr[@class='totalprice item']//span[.='1 100,00 Rp‎']")
	private WebElement finalBookingTotal;
	
	@FindBy(xpath = "//tr[3]//span[.='1 100,00 Rp‎']")
	private WebElement dueAmount;
	
	public boolean orderConfirmationIsDisplayed(){
		titleOrderConfirmation.isDisplayed();
		popupOrderSuccess.isDisplayed();
		orderStatus.isDisplayed();
		orderReference.isDisplayed();
        return true;
	}
	
	public String getTitleOrderConfirmation() {
		return titleOrderConfirmation.getText();
	}
	
	public String getPopupSuccess() {
		return popupOrderSuccess.getText();
	}
	
	public String getOrderStatus() {
		return orderStatus.getText();
	}
	
	public void hash_orderDetails() {
	Actions action = new Actions(webdriver);
	WebElement orderdetails = webdriver.findElement(By.xpath("//a[.='View your order history']"));
	action.moveToElement(orderdetails).build().perform();
	}
	
	public boolean orderDetailsIsDisplayed(){
		roomDescription.isDisplayed();
		hotelName.isDisplayed();
		unitPrice.isDisplayed();
		rooms.isDisplayed();
		checkInDate.isDisplayed();
		checkOutDate.isDisplayed();
		total.isDisplayed();
		tax.isDisplayed();
		finalBookingTotal.isDisplayed();
		dueAmount.isDisplayed();
        return true;
	}
	
	public String getHotelName() {
		return hotelName.getText();
	}

}
