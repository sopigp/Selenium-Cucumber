package page_object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class SearchedResultsPage extends BaseClass{

	public SearchedResultsPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//p[.='General Rooms']")
	private WebElement hotelName;
	
	@FindBy(xpath = "//span[contains(.,'1 100,00 Rp‎')]")
	private WebElement hotelPrice;
	
	@FindBy(id = "cat_quantity_wanted_1")
	private WebElement hotelQty;

	@FindBy(xpath = "//p[.='Search Rooms']")
	private WebElement results_room_form;
	
	@FindBy(xpath = "//span[.='Guest Rating']")
	private WebElement guest_rating;
	
	@FindBy(xpath = "//span[.='Amenities']")
	private WebElement amenities;
	
	@FindBy(xpath = "//div[@id='filter_results']//span[.='Price']")
	private WebElement price;
	
//	@FindBy(xpath = "//div[@id='category_data_cont']/div[1]//a[.='Book Now']")
//	WebElement btn_submitRoom;
	
	@FindBy(xpath = "//div[1]//a[.='Book Now']")
	private WebElement btn_submitRoom;
	
	@FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
	private WebElement btn_proccedToCheckout;
	
	public boolean isDisplayed(){
		results_room_form.isDisplayed();
		guest_rating.isDisplayed();
		amenities.isDisplayed();
		price.isDisplayed();
        return true;
	}
	
	public String getHotelName() {
		return hotelName.getText();
	}
	
	public String getHotelPrice() {
		return hotelPrice.getText();
	}
	
	public String getHotelQty() {
		return hotelQty.getText();
	}
	
	public void submitRoom() {
	btn_submitRoom.click();
	}
	
//	VERIFY FRAME HOTEL
	@FindBy(id = "layer_cart_product_title")
	private WebElement hotelNameActual;
	
	@FindBy(id = "layer_cart_product_time_duration")
	private WebElement hotelDurationActual;
	
	@FindBy(id = "layer_cart_product_quantity")
	private WebElement hotelQtyActual;
	
	@FindBy(id = "layer_cart_product_price")
	private WebElement hotelCostActual;
	
	@FindBy(xpath = "//span[@class='ajax_block_products_total']")
	private WebElement totalRoomsCost;
	
	@FindBy(xpath = "//span[@class='price ajax_cart_extra_demands_cost']")
	private WebElement totalAdditionalFacilities;
	
	@FindBy(xpath = "//span[@class='ajax_block_cart_total']")
	private WebElement totalTax;
	
	public String getActualHotelName() {
		return hotelNameActual.getText();
	}
	
	public String getActualHotelDuration() {
		return hotelDurationActual.getText();
	}
	
	public String getActualHotelQty() {
		return hotelQtyActual.getText();
	}
	
	public String getActualHotelPrice() {
		return hotelCostActual.getText();
	}
	
	public boolean CartDetailsisDisplayed(){
		hotelNameActual.isDisplayed();
		hotelDurationActual.isDisplayed();
		hotelQtyActual.isDisplayed();
		hotelCostActual.isDisplayed();
		totalRoomsCost.isDisplayed();
		totalAdditionalFacilities.isDisplayed();
		totalTax.isDisplayed();
        return true;
	}
	
	public void proccedCheckoutHotelList() throws InterruptedException {
	Thread.sleep(3000);
	webdriver.getWindowHandle();	
	btn_proccedToCheckout.click();
	}
	
//	VIA CART
	@FindBy(xpath = "//span[@class='cross']")
	private WebElement btncloseFrame;
	
	@FindBy(xpath = "//div[@class='shopping_cart']")
	private WebElement btnCart;
	
	@FindBy(xpath = "//span[contains(.,'Check out')]")
	private WebElement btnCheckoutCart;
	
	public void clickCloseFrame() {
		btncloseFrame.click();
	}
	
	public void hover_bookingCart() {
		Actions action = new Actions(webdriver);
		WebElement bookingCart = webdriver.findElement(By.xpath("//div[@class='shopping_cart']"));
		action.moveToElement(bookingCart).build().perform();
		}
	
	public void hover_CheckoutCart() {
		Actions action = new Actions(webdriver);
		WebElement bookingCart = webdriver.findElement(By.xpath("//span[contains(.,'Check out')]"));
		action.moveToElement(bookingCart).build().perform();
		}
	
	public void clickCart() {
		btnCheckoutCart.click();
	}
}
