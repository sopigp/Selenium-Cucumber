package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class BookingHotelPage extends BaseClass {

	public BookingHotelPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(className = "nav_toggle")
	private WebElement btn_home;

	@FindBy(className = "account_user_name hide_xs")
	private WebElement account_name;

	public void clickLogoHotel() {
		btn_home.click();
	}

	public boolean isDisplayed() {
		account_name.isDisplayed();
		return true;
	}

	public String getAccountName() {
		return account_name.getText();
	}

}
