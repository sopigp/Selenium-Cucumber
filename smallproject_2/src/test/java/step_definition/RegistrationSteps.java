package step_definition;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.CreateAccountPage;
import page_object.HomePage;
import page_object.LoginPage;
import page_object.PersonalInformationPage;

public class RegistrationSteps {
	private WebDriver webdriver;

	private Faker faker = new Faker();

	private String email = faker.name().firstName();
	private String firstName = faker.name().username();
	private String lastName = faker.name().username();

	public RegistrationSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	

	@Given("User on The Hotel Dominic Homepage")
	public void homePageUser() throws Throwable {
		HomePage homepage = new HomePage(webdriver);
		homepage.isDisplayed();
	}

	@And("User click signIn in the homepage")
	public void clickSignIn() throws Throwable {
		HomePage signIn = new HomePage(webdriver);
		signIn.clickSignIn();
	}
	
	@Then("User should be navigated to the Authentication Page")
	public void verifyAuthenticationPage() throws Throwable {
		HomePage authentication = new HomePage(webdriver);
        String ActualTittle = authentication.getTitle();
        String ExpectedTitle = "AUTHENTICATION";
        assertEquals(ExpectedTitle, ActualTittle);
	}
	
	@When("User input \"(.*)\"")
	public void setLogin(String email) throws Throwable {
		CreateAccountPage setCreateAccount = new CreateAccountPage(webdriver);
		setCreateAccount.TitleisDisplayed();
		if (email.equalsIgnoreCase("valid")) {
			email = faker.name().firstName();
			email = email+"@gmail.com";
		}
		CreateAccountPage setEmail = new CreateAccountPage(webdriver);
		setEmail.inputEmail(email);
		setCreateAccount.clickCreateAccount();	
	}
	
	@And("User click button create an account")
	public void clickCreateAccount() throws Throwable {
		CreateAccountPage setCreateAccount = new CreateAccountPage(webdriver);
		setCreateAccount.clickCreateAccount();	
	}
	
//	@Then("User should be navigated to the your personal information page")
//	public void setPersonalInfo() throws Throwable {
//		PersonalInformationPage openPersonalInformationMenu = new PersonalInformationPage(webdriver);
//		openPersonalInformationMenu.TitlePersonalInfoisDisplayed();
//		String ActualTitle = openPersonalInformationMenu.getTitle();
//        String ExpectedTitle = "YOUR PERSONAL INFORMATION";
//        assertEquals(ExpectedTitle, ActualTitle);
//	}
	
	@When("User input social title, \"(.*)\" in field firstname, \"(.*)\" in field lastname, \"(.*)\" in field password, and DOB")
	public void openPersonalInformationMenu(String firstname, String lastname, String password) throws Throwable {
		PersonalInformationPage openPersonalInformationMenu = new PersonalInformationPage(webdriver);
		Thread.sleep(3000);
		openPersonalInformationMenu.clickSocialTitle();
		
		if (firstname.equalsIgnoreCase("valid")) {
			firstname = faker.name().firstName();
		}
		openPersonalInformationMenu.inputFirstNameRegis(firstname);
		
		if (lastname.equalsIgnoreCase("valid")) {
			lastname = faker.name().lastName();
		}
		openPersonalInformationMenu.inputLastNameRegis(lastname);
//		openPersonalInformationMenu.inputEmail(email);
		
		openPersonalInformationMenu.selectDays();
		openPersonalInformationMenu.selectMonths();
		openPersonalInformationMenu.selectYears();
		
		openPersonalInformationMenu.inputNewPass(password);
		Thread.sleep(2000);
		openPersonalInformationMenu.clickNewsLetter();
		openPersonalInformationMenu.clickSpecialOffers();
		
	}
	
	@And("User click button register")
	public void clickRegister() throws Throwable {
		PersonalInformationPage createAccount = new PersonalInformationPage(webdriver);	
		createAccount.clickRegister();
	}
	
	@Then("New account created successfully")
	public void verifyPersonalInfo() throws Throwable {
		PersonalInformationPage verifyAlertSuccess = new PersonalInformationPage(webdriver);
        String ActualAlertSuccess = verifyAlertSuccess.getAlertSuccess();
        String ExpectedAlertSuccess = "Your account has been created.";
        assertEquals(ExpectedAlertSuccess, ActualAlertSuccess);
	}
	
//	NEGATIVE
	@When("User fills social title, \"(.*)\" in field firstname, \"(.*)\" in field lastname, \"(.*)\" in field password, and DOB")
	public void openPersonalInfoMenu(String invalid_firstname, String invalid_lastname, String password) throws Throwable {
		PersonalInformationPage openPersonalInformationMenu = new PersonalInformationPage(webdriver);
		Thread.sleep(3000);
		openPersonalInformationMenu.clickSocialTitle();
		openPersonalInformationMenu.inputInvalidFirstName(invalid_firstname);
		openPersonalInformationMenu.inputInvalidLastName(invalid_lastname);
//		openPersonalInformationMenu.inputEmail(email);

		openPersonalInformationMenu.selectDays();
		openPersonalInformationMenu.selectMonths();
		openPersonalInformationMenu.selectYears();
		
		openPersonalInformationMenu.inputNewPass(password);
	
		openPersonalInformationMenu.clickNewsLetter();
		openPersonalInformationMenu.clickSpecialOffers();
	}
	
	@Then("user will see an error message")
	public void verifyErrorMessage() throws Throwable {
		PersonalInformationPage verifyAlertDanger = new PersonalInformationPage(webdriver);
		verifyAlertDanger.AlertDangerisDisplayed();
	}
	

}
