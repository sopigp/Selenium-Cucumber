package step_definition;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver webdriver;

	@Before
	public void openBrowser() throws MalformedURLException {
		System.out.println("Called openBrowser");
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\driver\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.manage().deleteAllCookies();
		webdriver.manage().window().maximize();
		webdriver.get("http://qa.cilsy.id:8080/en/");
	}
}
