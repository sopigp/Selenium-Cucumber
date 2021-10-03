package step_definition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.LoginPage;
import page_object.MyAccountPage;
import page_object.HomePage;


@SuppressWarnings("deprecation")
public class LoginSteps {
	private WebDriver webdriver;

	public LoginSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User on The Hotel Dominic Parks Homepage")
	public void homePageUser() throws Throwable {
		HomePage homepage = new HomePage(webdriver);
		homepage.isDisplayed();
	}

	@When("User Click The button SignIn in the Homepage")
	public void clickSignIn() throws Throwable {
		HomePage signIn = new HomePage(webdriver);
		signIn.clickSignIn();
	}
	
	@Then("User Will be Direct On The Authentication Page")
	public void verifyAuthenticationPage() throws Throwable {
		HomePage authentication = new HomePage(webdriver);
        String ActualTittle = authentication.getTitle();
        String ExpectedTitle = "AUTHENTICATION";
        assertEquals(ExpectedTitle, ActualTittle);
	}
	
	@When("User fill \"(.*)\" as an email \"(.*)\" as an password")
	public void setLogin(String email, String password) throws Throwable {
		LoginPage setLogin = new LoginPage(webdriver);
		setLogin.setEmail(email);
		setLogin.setPassword(password);
		setLogin.clickLogin();	
	}
	
	@Then("User Will be Direct On The My Account Page")
	public void verifyMyAccountPage() throws Throwable {
		HomePage myAccount = new HomePage(webdriver);
		String ActualAccount = myAccount.getAccountName();
	    String ExpectedAccount = "Gita";
	    assertEquals(ExpectedAccount, ActualAccount);
	    
	    MyAccountPage myAccountTitle = new MyAccountPage(webdriver);
		String ActualTitleMyAccount = myAccountTitle.getTitleMyAccount();
	    String ExpectedTitleMyAccount = "MY ACCOUNT";
	    assertEquals(ExpectedTitleMyAccount, ActualTitleMyAccount);
	}
	
//	NEGATIVE
	
//	@Given("User already on The Hotel Dominic Parks Homepage")
//	public void loginUser() throws Throwable {
//		HomePage homepage = new HomePage(webdriver);
//		homepage.isDisplayed();
//	}
//	
//	@When("User click SignIn button")
//	public void SignIn() throws Throwable {
//		HomePage signIn = new HomePage(webdriver);
//		signIn.clickSignIn();
//	}
//	
//	@Then("User should be navigated to the Authentication")
//	public void AuthenticationPage() throws Throwable {
//		HomePage authentication = new HomePage(webdriver);
//        String ActualTittle = authentication.getTitle();
//        String ExpectedTitle = "AUTHENTICATION";
//        assertEquals(ExpectedTitle, ActualTittle);
//	}
//	
	@When("User fill invalid email \"(.*)\" and invalid password \"(.*)\"")
	public void setInvalidLogin(String email, String password) throws Throwable {
		LoginPage setLogin = new LoginPage(webdriver);
		setLogin.setEmail(email);
		setLogin.setPassword(password);
		setLogin.clickLogin();	
	}
	
	@Then("User will see an error message on the login page")
	public void verifyErrorMessage() throws Throwable {
		LoginPage errorMessage= new LoginPage(webdriver);
		errorMessage.errorMessageBox();
	
	}


}
