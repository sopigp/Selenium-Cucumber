package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.BaseClass;

public class MyAddressesPage extends BaseClass{
	public MyAddressesPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	private WebElement title_MyAddresses;
	
	@FindBy(xpath = "//span[.='My addresses']")
	private WebElement btnMyAddressesMenu;
	
	@FindBy(xpath = "//span[.='Add a new address']")
	private WebElement btnAddNewAddresses;
	
	@FindBy(xpath = "//h1[@class='page-subheading']")
	private WebElement subtitle_MyAddresses;
	
	@FindBy(id = "firstname")
	private WebElement firstName;
	
	@FindBy(id = "lastname")
	private WebElement lastName;
	
	@FindBy(id = "company")
	private WebElement companyAddress;
	
	@FindBy(id = "vat-number")
	private WebElement vatNumber;
	
	@FindBy(id = "address1")
	private WebElement firstAddress;
	
	@FindBy(id = "address2")
	private WebElement secondAddress;
	
	@FindBy(id = "postcode")
	private WebElement zip;
	
	@FindBy(id = "city")
	private WebElement cityAddress;
	
	@FindBy(id = "id_state")
	private WebElement state;
	
	@FindBy(id = "id_country")
	private WebElement country;
	
	@FindBy(id = "phone")
	private WebElement homePhone;
	
	@FindBy(id = "phone_mobile")
	private WebElement mobilePhone;
	
	@FindBy(id = "other")
	private WebElement additionalInformation;
	
	@FindBy(xpath = "//span[contains(.,'Save')]")
	private WebElement btnSaveAddress;
	
	@FindBy(id = "alias")
	private WebElement assignAddress;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement alertDanger;
	
	public boolean TitleisDisplayed() {
		title_MyAddresses.isDisplayed();
		return true;
	}
	
	public boolean isDisplayed() {
		subtitle_MyAddresses.isDisplayed();
		return true;
	}
	
	public String getTitle() {
		return title_MyAddresses.getText();
	}
	
	public String getSubTitle() {
		return subtitle_MyAddresses.getText();
	}
	
	public void clickMyAddressesMenu() {
		btnMyAddressesMenu.click();
	}
	
	public void clickAddNewAddress() {
		btnAddNewAddresses.click();
	}
	
	public void inputFirstname(String firstname) {
		firstName.clear();
		firstName.sendKeys(firstname);
	}
	
	public void inputLastname(String lastname) {
		lastName.clear();
		lastName.sendKeys(lastname);
	}
	
	public void inputCompany(String company) {
		companyAddress.sendKeys(company);
	}
	
	public void inputVATNumber(String vat_number) {
		vatNumber.sendKeys(vat_number);
	}
	
	public void inputAddress1(String address1) {
		firstAddress.sendKeys(address1);
	}
	
	public void inputAddress2(String address2) {
		secondAddress.sendKeys(address2);
	}
	
	public void inputZip(String postal_code) {
		zip.sendKeys(postal_code);
	}
	
	public void inputCity(String city) {
		cityAddress.sendKeys(city);
	}
	
	public void selectState() {
		Select select = new Select(state);
		select.selectByValue("245");
	}
	
	public boolean countryIsDisplayed() {
		country.isDisplayed();
		return true;
	}
	
	public void inputHomePhone(String home_phone) {
		homePhone.sendKeys(home_phone);
	}
	
	public void inputMobilePhone(String mobile_phone) {
		mobilePhone.sendKeys(mobile_phone);
	}
	
	public void inputAdditionalInfo(String additional_info) {
		additionalInformation.sendKeys(additional_info);
	}
	
	public void inputAddressTitle(String address_title) {
		assignAddress.clear();
		assignAddress.sendKeys(address_title);
	}
	
	public void clickSaveAddress() {
		btnSaveAddress.click();
	}
	
//	GET TEXT FOR VERIFY
	@FindBy(xpath = "//span[@class='address_name']")
	WebElement getfirstName;
	
	@FindBy(xpath = "//span[contains(.,'Pratiwi')]")
	WebElement getlastName;
	
	@FindBy(xpath = "//span[@class='address_company']")
	WebElement getcompanyAddress;
	
	@FindBy(xpath = "//span[contains(.,'12345678')]")
	WebElement getvatNumber;
	
	@FindBy(xpath = "//span[@class='address_address1']")
	WebElement getfirstAddress;
	
	@FindBy(xpath = "//span[@class='address_address2']")
	WebElement getsecondAddress;
	
	@FindBy(xpath = "//span[contains(.,'16916')]")
	WebElement getzip;
	
	@FindBy(xpath = "//span[@class='address_city']")
	WebElement getcityAddress;
	
	@FindBy(xpath = "//span[contains(.,'Jakarta')]")
	WebElement getstate;
	
	@FindBy(xpath = "//li[9]/span[contains(.,'Indonesia')]")
	WebElement getcountry;
	
	@FindBy(xpath = "//span[@class='address_phone']")
	WebElement gethomePhone;
	
	@FindBy(xpath = "//span[@class='address_phone_mobile']")
	WebElement getmobilePhone;
	
//	VERIFY ADD NEW ADDRESS
	public String getFirstName() {
		return getfirstName.getText();
	}
	
	public String getLastName() {
		return getlastName.getText();
	}
	
	public String getCompany() {
		return getcompanyAddress.getText();
	}
	
	public String getVATNumber() {
		return getvatNumber.getText();
	}

	public String getFirstAddress() {
		return getfirstAddress.getText();
	}
	
	public String getSecondAddress() {
		return getsecondAddress.getText();
	}
	
	public String getZIP() {
		return getzip.getText();
	}
	public String getCity() {
		return getcityAddress.getText();
	}
	public String getState() {
		return getstate.getText();
	}
	
	public String getCountry() {
		return getcountry.getText();
	}

	public String getHomePhone() {
		return gethomePhone.getText();
	}
	
	public String getMobilePhone() {
		return getmobilePhone.getText();
	}
	
//	NEGATIVE
	public boolean AlertDangerIsDisplayed() {
		alertDanger.isDisplayed();
		return true;
	}
}
