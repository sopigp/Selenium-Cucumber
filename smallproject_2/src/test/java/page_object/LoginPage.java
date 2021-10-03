package page_object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(id = "email")
	private WebElement email_field;
	
	@FindBy(id = "passwd")
	private WebElement password_field;
	
	@FindBy(id = "SubmitLogin")
	private WebElement btn_login;
	
	@FindBy(xpath = "//div[@id='center_column']/div[@class='alert alert-danger']")
	private WebElement errorMessageBox;
	
//	@FindBy(id = "email")
//	private WebElement email_field_verify;
	
//	@FindBy(id = "id_gender1")
//	private WebElement radio_btn_gender;
	
//	@FindBy(id = "SubmitCreate")
//	private WebElement btn_submit_create_account;
//	
//	@FindBy(id = "customer_firstname")
//	private WebElement first_name_field;
//	
//	@FindBy(id = "customer_lastname")
//	private WebElement last_name_field;
	

	public void setEmail(String email) {
		email_field.sendKeys(email);
	}
	
	public void setPassword(String password) {
		password_field.sendKeys(password);
	}
	
	public void clickLogin() {
	btn_login.click();
	}
	
	public void errorMessageBox() {
	errorMessageBox.isDisplayed();
	}
	
//	public void setFirstName(String firstname) {
//		first_name_field.sendKeys(firstname);
//	}
//	
//	public void setLastName(String last_name) {
//		last_name_field.sendKeys(last_name);
//	}
//		
//	
//	public boolean verifyEmailAccount() {
//		email_field_verify.isDisplayed();
//		return true;
//	}
	
//	public void SubmitCreateAccount() {
//		btn_submit_create_account.click();
//	}
//	
//	public void ClickRadioButtonGender() {
//		radio_btn_gender.click();
//	}
	
}
