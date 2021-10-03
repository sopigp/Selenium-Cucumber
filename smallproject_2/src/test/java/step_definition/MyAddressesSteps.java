package step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.ContactPage;
import page_object.HomePage;
import page_object.LoginPage;
import page_object.MyAccountPage;
import page_object.MyAddressesPage;

@SuppressWarnings("deprecation")
public class MyAddressesSteps {
	private WebDriver webdriver;
	
	public MyAddressesSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already login with \"(.*)\" email and \"(.*)\" password")
	public void setLogin(String email, String password) throws Throwable {
		HomePage create_account = new HomePage(webdriver);
		create_account.clickSignIn();
		LoginPage setLogin = new LoginPage(webdriver);
		setLogin.setEmail(email);
		setLogin.setPassword(password);
		setLogin.clickLogin();	
	}
	
	@When("User open the My Addresses menu")
	public void openMyAddressesMenu() throws Throwable {
		MyAddressesPage openMyAddressMenu = new MyAddressesPage(webdriver);
		openMyAddressMenu.clickMyAddressesMenu();
		openMyAddressMenu.TitleisDisplayed();
		String ActualTitleMyAddress= openMyAddressMenu.getTitle();
	    String ExpectedTitleMyAddress = "MY ADDRESSES";
	    assertEquals(ExpectedTitleMyAddress, ActualTitleMyAddress);
		openMyAddressMenu.clickAddNewAddress();
		openMyAddressMenu.isDisplayed();
		String ActualsubTitleMyAddress= openMyAddressMenu.getSubTitle();
	    String ExpectedsubTitleMyAddress = "YOUR ADDRESSES";
	    assertEquals(ExpectedsubTitleMyAddress, ActualsubTitleMyAddress);
	}
	
	@And("User fills \"(.*)\" as firstname, \"(.*)\" as lastname, \"(.*)\" as company, \"(.*)\" as VAT Number, \"(.*)\" as address1, \"(.*)\" as address1, \"(.*)\" as postal code, \"(.*)\" as city, \"(.*)\" as home phone, \"(.*)\" as mobile phone, \"(.*)\" as additional info, and \"(.*)\" as address title")
	public void fillMyAddress(String firstname, String lastname, String company, String vat_number, String address1, String address2, String postal_code, String city, String home_phone, String mobile_phone, String additional_info, String address_title) throws Throwable {
		MyAddressesPage fillAddress = new MyAddressesPage(webdriver);
		fillAddress.inputFirstname(firstname);
		fillAddress.inputLastname(lastname);
		fillAddress.inputCompany(company);
		Thread.sleep(1000);
		fillAddress.inputVATNumber(vat_number);
		fillAddress.inputAddress1(address1);
		fillAddress.inputAddress2(address2);
		fillAddress.inputZip(postal_code);
		fillAddress.inputCity(city);
		fillAddress.selectState();
		fillAddress.countryIsDisplayed();
		fillAddress.inputHomePhone(home_phone);
		fillAddress.inputMobilePhone(mobile_phone);
		fillAddress.inputAdditionalInfo(additional_info);
		fillAddress.inputAddressTitle(address_title);
		fillAddress.clickSaveAddress();
	}
	
	@Then("Add new address saved successfully")
	public void verifyNewAddress() throws Throwable {
		MyAddressesPage verifyAddress = new MyAddressesPage(webdriver);
        String ActualFirstName = verifyAddress.getFirstName();
        String ExpectedFirstName = "Gita";
        assertEquals(ExpectedFirstName, ActualFirstName);
        
        String ActualLastName = verifyAddress.getLastName();
        String ExpectedLastName = "Pratiwi";
        assertEquals(ExpectedLastName, ActualLastName);
        
        String ActualCompany = verifyAddress.getCompany();
        String ExpectedCompany = "PT Cilsy Fiolution";
        assertEquals(ExpectedCompany, ActualCompany);
        
        String ActualVAT = verifyAddress.getVATNumber();
        String ExpectedVAT= "12345678";
        assertEquals(ExpectedVAT, ActualVAT);
        
        String ActualFirstAddress = verifyAddress.getFirstAddress();
        String ExpectedFirstAddress = "Puri Nirwana";
        assertEquals(ExpectedFirstAddress, ActualFirstAddress);
        
        String ActualSecondAddress = verifyAddress.getSecondAddress();
        String ExpectedSecondAddress = "Cibinong";
        assertEquals(ExpectedSecondAddress, ActualSecondAddress);
        
        String ActualZIP = verifyAddress.getZIP();
        String ExpectedZIP = "16916";
        assertEquals(ExpectedZIP, ActualZIP);
        
        String ActualCity = verifyAddress.getCity();
        String ExpectedCity = "Bogor";
        assertEquals(ExpectedCity, ActualCity);
        
        String ActualState = verifyAddress.getState();
        String ExpectedState = "Jakarta";
        assertEquals(ExpectedState, ActualState);
        
        String ActualCountry = verifyAddress.getCountry();
        String ExpectedCountry = "Indonesia";
        assertEquals(ExpectedCountry, ActualCountry);
        
        String ActualHomePhone= verifyAddress.getHomePhone();
        String ExpectedHomePhone = "02187904693";
        assertEquals(ExpectedHomePhone, ActualHomePhone);
        
        String ActualMobilePhone = verifyAddress.getMobilePhone();
        String ExpectedMobilePhone = "081316009990";
        assertEquals(ExpectedMobilePhone , ActualMobilePhone);
	}
	
	@Then("User will see an error message on the my address page")
	public void verifyErrorMessage() throws Throwable {
		MyAddressesPage errorMessage= new MyAddressesPage(webdriver);
		errorMessage.AlertDangerIsDisplayed();
	
	}

}
