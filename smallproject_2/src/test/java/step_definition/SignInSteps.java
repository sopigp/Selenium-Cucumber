package step_definition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import page_object.HomePage;

@SuppressWarnings("deprecation")
public class SignInSteps {
	private WebDriver webdriver;

	public SignInSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User open the Hotel Dominic Parks page")
	public void SignIn() {
		HomePage sign_in = new HomePage(webdriver);
		sign_in.isDisplayed();
		sign_in.clickSignIn();
	}

}
