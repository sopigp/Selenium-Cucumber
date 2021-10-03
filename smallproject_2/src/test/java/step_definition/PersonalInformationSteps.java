package step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.HomePage;
import page_object.LoginPage;
import page_object.MyAddressesPage;
import page_object.PersonalInformationPage;

@SuppressWarnings("deprecation")
public class PersonalInformationSteps {
	private WebDriver webdriver;
	
	public PersonalInformationSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already login with input \"(.*)\" in email field and \"(.*)\" in password field")
	public void setLogin(String email, String password) throws Throwable {
		HomePage create_account = new HomePage(webdriver);
		create_account.clickSignIn();
		LoginPage setLogin = new LoginPage(webdriver);
		setLogin.setEmail(email);
		setLogin.setPassword(password);
		setLogin.clickLogin();	
	}
	
	@When("User open the personal information menu")
	public void openPersonalInformationMenu() throws Throwable {
		PersonalInformationPage openPersonalInformationMenu = new PersonalInformationPage(webdriver);
		openPersonalInformationMenu.clickPersonalInformationMenu();
		openPersonalInformationMenu.TitleisDisplayed();
	}
	
	@And("User input social title, \"(.*)\" as a firstname, \"(.*)\" as a lastname, \"(.*)\" as an email, DOB, \"(.*)\", \"(.*)\", and \"(.*)\"")
	public void openPersonalInformationMenu(String firstname, String lastname, String email, String current_password, String new_password, String confirmation_password) throws Throwable {
		PersonalInformationPage openPersonalInformationMenu = new PersonalInformationPage(webdriver);
		openPersonalInformationMenu.TitleisDisplayed();
		String ActualTitle = openPersonalInformationMenu.getTitle();
        String ExpectedTitle = "YOUR PERSONAL INFORMATION";
        assertEquals(ExpectedTitle, ActualTitle);
		openPersonalInformationMenu.clickSocialTitle();
		
		openPersonalInformationMenu.inputFirstName(firstname);
		openPersonalInformationMenu.inputLastName(lastname);
		openPersonalInformationMenu.inputEmail(email);
		
		openPersonalInformationMenu.selectDays();
		openPersonalInformationMenu.selectMonths();
		openPersonalInformationMenu.selectYears();
		
		openPersonalInformationMenu.inputOldPass(current_password);
		openPersonalInformationMenu.inputNewPass(new_password);
		openPersonalInformationMenu.confirmNewPass(confirmation_password);
		
		openPersonalInformationMenu.clickNewsLetter();
		openPersonalInformationMenu.clickSpecialOffers();
		openPersonalInformationMenu.clickSave();
	}
	
	@Then("Updated personal information saved successfully")
	public void verifyPersonalInfo() throws Throwable {
		PersonalInformationPage verifyAlertSuccess = new PersonalInformationPage(webdriver);
        String ActualAlertSuccess = verifyAlertSuccess.getAlertSuccess();
        String ExpectedAlertSuccess = "Your personal information has been successfully updated.";
        assertEquals(ExpectedAlertSuccess, ActualAlertSuccess);
	}
	
//	NEGATIVE
	@Then("User will see an error message on the personal information page")
	public void errorMessagePersonalInfo() throws Throwable {
		PersonalInformationPage verifyAlertDanger = new PersonalInformationPage(webdriver);
		verifyAlertDanger.AlertDangerisDisplayed();
        
	}

}
