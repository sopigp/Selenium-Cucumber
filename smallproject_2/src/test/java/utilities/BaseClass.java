package utilities;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver webdriver;
	public static WebDriverWait wait;

	public void wait (WebElement WebElement) {
		wait.until(ExpectedConditions.elementToBeClickable(WebElement));
	}
	
	public BaseClass(WebDriver webdriver) {
		BaseClass.webdriver = webdriver;
		wait = new WebDriverWait(webdriver, 10);
		wait.ignoring(WebDriverException.class);
		wait.ignoring(StaleElementReferenceException.class);
	}

	public void click(WebElement WebElement) {
		WebElement.click();
	}

	public void input(WebElement WebElement, String text) {
		WebElement.sendKeys(text);
	}


}
