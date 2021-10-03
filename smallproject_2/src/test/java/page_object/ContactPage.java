package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.BaseClass;

public class ContactPage extends BaseClass{
	public ContactPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//p[@class='contact-header col-sm-offset-2 col-sm-8']")
	private WebElement titleContact;
	
	@FindBy(xpath = "//button[@class='form-control contact_type_input']")
	private WebElement fieldSubject;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement fieldEmail;
	
	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement fieldMessage;
	
	@FindBy(id = "contact_type")
	private WebElement subjectContact;
	
	@FindBy(xpath = "//li[contains(.,'Webmaster')]")
	private WebElement chooseObject;
	
	@FindBy(id = "email")
	private WebElement emailContact;
	
	@FindBy(id = "message")
	private WebElement messageContact;
	
	@FindBy(id = "fileUpload")
	private WebElement uploadFile;
	
	@FindBy(xpath = "//span[.='Send Message']")
	private WebElement btnSendMessage;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement alertSuccess;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement alertDanger;
	
	public void clickUploadFile(String image) {
		String projectLocation = System.getProperty("user.dir");
		String path = projectLocation + "//lib//photo//";
		path = path + image;
		uploadFile.sendKeys(path);
	}

	public boolean isDisplayed() {
		titleContact.isDisplayed();
		fieldSubject.isDisplayed();
		fieldEmail.isDisplayed();
		fieldMessage.isDisplayed();
		uploadFile.isDisplayed();
		emailContact.isDisplayed();
		return true;
	}
	
	public String getTitleContact() {
		return titleContact.getText();
	}
	
	public String getAlertSuccess() {
		return alertSuccess.getText();
	}
	
	public void messageContact(String message_contactMenu) {
		messageContact.sendKeys(message_contactMenu);
	}
	
	public void clickSendMessage() {
		btnSendMessage.click();
	}
	
	public void chooseSubject() {
		chooseObject.click();	
	}
	
	public void clickSubjectContact() {
		subjectContact.click();
	}
	
	public boolean AlertDangerisDisplayed() {
		alertDanger.isDisplayed();
		return true;
	}
	
	public void inputEmail(String email_contact) {
		fieldEmail.clear();
		fieldEmail.sendKeys(email_contact);
	}
	
	
}
