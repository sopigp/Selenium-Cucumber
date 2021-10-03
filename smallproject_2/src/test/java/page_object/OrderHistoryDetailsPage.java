package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderHistoryDetailsPage extends BaseClass {

	public OrderHistoryDetailsPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
	private WebElement orderHistoryTitle;
	
	@FindBy(className = "color-myaccount")
	private WebElement orderReference;
	
	@FindBy(xpath = "//tr[@class='first_item ']/td[@class='history_date bold']")
	private WebElement date;
	
	@FindBy(xpath = "//tr[@class='first_item ']//span[@class='price']")
	private WebElement totalPrice;
	
	@FindBy(xpath = "//tr[@class='first_item ']/td[@class='history_method']")
	private WebElement payment;
	
	@FindBy(xpath = "//tr[@class='first_item ']//span[@class='label']")
	private WebElement status;
	
	@FindBy(xpath = "//tr[@class='first_item ']//span[contains(.,'Details')]")
	private WebElement btnDetails;
	
	public boolean isDisplayed() {
		orderHistoryTitle.isDisplayed();
		date.isDisplayed();
		totalPrice.isDisplayed();
		payment.isDisplayed();
		orderReference.isDisplayed();
		btnDetails.isDisplayed();
		status.isDisplayed();
		return true;
	}
	
	public String getDate() {
		return date.getText();
	}
	
	public String getTotalPrice() {
		return totalPrice.getText();
	}
	
	public String getPayment() {
		return payment.getText();
	}
	
	public String getStatus() {
		return status.getText();
	}
}
