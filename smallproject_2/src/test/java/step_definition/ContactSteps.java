package step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.ContactPage;
import page_object.HomePage;
import page_object.LoginPage;
import page_object.MyAccountPage;

@SuppressWarnings("deprecation")
public class ContactSteps {
	private WebDriver webdriver;
	
	public ContactSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already login with \"(.*)\" as an valid email and \"(.*)\" as an valid password")
	public void setLogin(String email, String password) throws Throwable {
		HomePage create_account = new HomePage(webdriver);
		create_account.clickSignIn();
		LoginPage setLogin = new LoginPage(webdriver);
		setLogin.setEmail(email);
		setLogin.setPassword(password);
		setLogin.clickLogin();	
	}
	
	@When("User open the contact page on the sidebar menu")
	public void openContact() throws Throwable {
		MyAccountPage openContact = new MyAccountPage(webdriver);
		openContact.click_Toggle();
		Thread.sleep(3000);
		openContact.click_btnContact();
		ContactPage contactMenu = new ContactPage(webdriver);
		contactMenu.isDisplayed();
        String ActualTitleContact = contactMenu.getTitleContact();
        String ExpectedTitleContact = "Contact Us";
        assertEquals(ExpectedTitleContact, ActualTitleContact);
	}
	
	@And("User fill subject, \"(.*)\", \"(.*)\" and upload photo \"(.*)\"")
	public void fillContact(String email_contact, String message_contactMenu, String image) throws Throwable {
		ContactPage contactMenu = new ContactPage(webdriver);
		contactMenu.clickSubjectContact();
		Thread.sleep(1000);
		contactMenu.chooseSubject();
		contactMenu.inputEmail(email_contact);
		contactMenu.messageContact(message_contactMenu);
		contactMenu.clickUploadFile(image);
		contactMenu.clickSendMessage();
	}
	
	@Then("User message on the contact page has been send")
	public void sendMessage() throws Throwable {
		ContactPage sendMessage = new ContactPage(webdriver);
		sendMessage.getAlertSuccess();
        String ActualAlertSuccess = sendMessage.getAlertSuccess();
        String ExpectedAlertSuccess = "Your message has been successfully sent to our team.";
        assertEquals(ExpectedAlertSuccess, ActualAlertSuccess);
	}
	
//	NEGATIVE
	@Then("User will see an error message on the contact page")
	public void errorMessage() throws Throwable {
		ContactPage errorMessage = new ContactPage(webdriver);
		errorMessage.AlertDangerisDisplayed();
	}

}
