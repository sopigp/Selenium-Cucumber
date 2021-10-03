package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CreateAccountPage extends BaseClass{

	public CreateAccountPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement titleAuthentication;
	
	@FindBy(xpath = "//h3[.='Create an account']")
	private WebElement titleCreateAccount;
	
	@FindBy(id = "email_create")
	private WebElement emailCreateAccount;
	
	@FindBy(xpath = "//span[contains(.,'Create an account')]")
	private WebElement btnCreateAccount;
	
	public boolean TitleisDisplayed() {
		titleAuthentication.isDisplayed();
		titleCreateAccount.isDisplayed();
		return true;
	}
	
	public String getTitle() {
		return titleCreateAccount.getText();
	}
	
	public void inputEmail(String email) {
		emailCreateAccount.sendKeys(email);
	}
	
	public void clickCreateAccount() {
		btnCreateAccount.click();
	}
}
