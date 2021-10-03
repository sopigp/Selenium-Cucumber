package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.BaseClass;

public class PersonalInformationPage extends BaseClass{

	public PersonalInformationPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//span[.='My personal information']")
	private WebElement btnPersonalInfo;
	
	@FindBy(xpath = "//h1[@class='page-subheading']")
	private WebElement titlePersonalInfo;
	
	@FindBy(xpath = "//h3[@class='page-subheading htl-reservation-page-sub-heading']")
	private WebElement titlePersonalInfo2;
	
	@FindBy(id = "id_gender2")
	private WebElement socialTitle;
	
	@FindBy(id = "firstname")
	private WebElement firstName;
	
	@FindBy(id = "lastname")
	private WebElement lastName;
	
	@FindBy(id = "email")
	private WebElement emailPersonalInformation;
	
	@FindBy(id = "days")
	private WebElement tanggal;
	
	@FindBy(id = "months")
	private WebElement bulan;
	
	@FindBy(id = "years")
	private WebElement tahun;
	
	@FindBy(id = "old_passwd")
	private WebElement currentPass;
	
	@FindBy(id = "passwd")
	private WebElement newPass;
	
	@FindBy(id = "confirmation")
	private WebElement confirmNewPass;
	
	@FindBy(id = "newsletter")
	private WebElement checkboxNewsLetter;
	
	@FindBy(id = "optin")
	private WebElement checkboxSpecialOffers;
	
	@FindBy(xpath = "//span[.='Save']")
	private WebElement btnSave;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement alertSuccess;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement alertDanger;
	
	public void clickPersonalInformationMenu() {
		btnPersonalInfo.click();
	}
	
	public boolean TitleisDisplayed() {
		titlePersonalInfo.isDisplayed();
		return true;
	}
	
	public boolean TitlePersonalInfoisDisplayed() {
		titlePersonalInfo2.isDisplayed();
		return true;
	}
	
	public String getTitle() {
		return titlePersonalInfo.getText();
	}
	
	public void clickSocialTitle() {
		socialTitle.click();
	}
	
	public void inputFirstName(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
	}
	
	public void inputLastName(String lastname) {
		lastName.clear();
		lastName.sendKeys(lastname);
	}
	
	public void inputEmail(String email) {
		emailPersonalInformation.clear();
		emailPersonalInformation.sendKeys(email);
	}
	
	public void selectDays() {
		Select select = new Select(tanggal);
		select.selectByValue("20");
	}
	
	public void selectMonths() {
		Select select = new Select(bulan);
		select.selectByValue("10");
	}
	
	public void selectYears() {
		Select select = new Select(tahun);
		select.selectByValue("1997");
	}
	
	public void inputOldPass(String current_password) {
		currentPass.sendKeys(current_password);
	}
	
	public void inputNewPass(String new_password) {
		newPass.sendKeys(new_password);
	}
	
	public void confirmNewPass(String confirmation_password) {
		confirmNewPass.sendKeys(confirmation_password);
	}
	
	public void clickNewsLetter() {
		checkboxNewsLetter.click();
	}
	
	public void clickSpecialOffers() {
		checkboxSpecialOffers.click();
	}
	
	public void clickSave() {
		btnSave.click();
	}
	
	public boolean isDisplayed() {
		alertSuccess.isDisplayed();
		return true;
	}
	
	public String getAlertSuccess() {
		return alertSuccess.getText();
	}
	
//	FOR REGISTER ONLY
	
	@FindBy(id = "customer_firstname")
	WebElement firstnameRegis;
	
	@FindBy(id = "customer_lastname")
	WebElement lastnameRegis;
	
	@FindBy(xpath = "//span[contains(.,'Register')]")
	WebElement btnRegister;
	
	public void inputFirstNameRegis(String firstname) {
		firstnameRegis.sendKeys(firstname);
	}
	
	public void inputLastNameRegis(String lastname) {
		lastnameRegis.sendKeys(lastname);
	}
	
	public void clickRegister() {
		btnRegister.click();
	}
	
//	NEGATIVE REGISTER
	public void inputInvalidFirstName(String invalid_firstname) {
		firstnameRegis.clear();
		firstnameRegis.sendKeys(invalid_firstname);
	}
	
	public void inputInvalidLastName(String invalid_lastname) {
		lastnameRegis.clear();
		lastnameRegis.sendKeys(invalid_lastname);
	}
	
	public void AlertDangerisDisplayed() {
		alertDanger.isDisplayed();
	}
	
}
