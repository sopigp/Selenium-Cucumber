package step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.HomePage;
import page_object.LoginPage;
import page_object.MyAccountPage;
import page_object.MyAddressesPage;
import page_object.OrderHistoryDetailsPage;

@SuppressWarnings("deprecation")
public class OrderHistoryDetilsSteps {
	private WebDriver webdriver;
	
	public OrderHistoryDetilsSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	@Given("User already login with an email \"(.*)\" and a password \"(.*)\"")
	public void setLogin(String email, String password) throws Throwable {
		HomePage create_account = new HomePage(webdriver);
		create_account.clickSignIn();
		LoginPage setLogin = new LoginPage(webdriver);
		setLogin.setEmail(email);
		setLogin.setPassword(password);
		setLogin.clickLogin();
		Thread.sleep(3000);
	}
	
	@When("User open the order history and details menu")
	public void openMyAddressesMenu() throws Throwable {
		MyAccountPage openOrderHistoryMenu = new MyAccountPage(webdriver);
		openOrderHistoryMenu.clickOrderHistory();	
	}
	
	@Then("User should be navigated to the order history page")
	public void verifyMyAccountPage() throws Throwable {
		OrderHistoryDetailsPage orderHistory = new OrderHistoryDetailsPage(webdriver);
		orderHistory.isDisplayed();
		String ActualDate = orderHistory.getDate();
		System.out.println("Date order :" + ActualDate);
		
		String ActualPrice = orderHistory.getTotalPrice();
	    String ExpectedPrice = "1 100,00 Rp";
	    assertEquals(ExpectedPrice, ActualPrice);
	    System.out.println("Total price order :" + ActualPrice);
	    
	    String ActualPay = orderHistory.getPayment();
	    String ExpectedPay = "Bank wire";
	    assertEquals(ExpectedPay, ActualPay);
	    System.out.println("Payment method order :" + ActualPay);
	    
	    String ActualStatus = orderHistory.getStatus();
	    String ExpectedStatus = "Awaiting bank wire payment";
	    assertEquals(ExpectedStatus, ActualStatus);
	    System.out.println("Payment method order :" + ActualStatus);
	    
	}

}
