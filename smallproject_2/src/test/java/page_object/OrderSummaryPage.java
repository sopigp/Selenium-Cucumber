package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderSummaryPage extends BaseClass{
	
	public OrderSummaryPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement titleOrderSummary;
	
	@FindBy(xpath = "//div[@class='box cheque-box']")
	private WebElement boxBankwirepayment;
	
	@FindBy(xpath = "//h3[@class='page-subheading']")
	private WebElement titleBankwirepayment;
	
	@FindBy(xpath = "//span[contains(.,'I confirm my order')]")
	private WebElement btn_confirmOrder;
	
	public boolean orderSummaryIsDisplayed(){
		titleOrderSummary.isDisplayed();
		boxBankwirepayment.isDisplayed();
		titleBankwirepayment.isDisplayed();
        return true;
	}
	
	public String getTitleOrderSummary() {
		return titleOrderSummary.getText();
	}
	
	public void clickConfirmOrder() {
		btn_confirmOrder.click();
	}
	
}
