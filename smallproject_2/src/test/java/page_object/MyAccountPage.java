package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyAccountPage extends BaseClass {
	
	public MyAccountPage (WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
//	TITLE
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement titleMyAccount;
	
//	BUTTON MENU
	@FindBy(xpath="//span[.='Order history and details']")
	private WebElement btn_order_history_details;
	
	@FindBy(xpath="//span[.='My credit slips']")
	private WebElement btn_mycredit_slips;
	
	@FindBy(xpath="//span[.='My addresses']")
	private WebElement my_address;
	
	@FindBy(xpath="//span[.='My personal information']")
	private WebElement btn_mypersonal_information;
	
//	SIDEBAR MENU
	@FindBy(xpath ="//button[@class='nav_toggle']")
	private WebElement btn_toggle;
	
	@FindBy(xpath ="//a[.='Home']")
	private WebElement btn_sidebarhome;
	
	@FindBy(xpath ="//a[.='Interior']")
	private WebElement btn_sidebarinterior;
	
	@FindBy(xpath ="//a[.='Amenities']")
	private WebElement btn_sidebaramenities;
	
	@FindBy(xpath ="//a[.='Rooms']")
	private WebElement btn_sidebarrooms;
	
	@FindBy(xpath ="//a[.='Testimonials']")
	private WebElement btn_sidebartestimonials;
	
	@FindBy(xpath ="//li[6]/a[.='Legal Notice']")
	private WebElement btn_sidebarlegal_notice;
	
	@FindBy(xpath ="//li[7]/a[.='About us']")
	private WebElement btn_sidebarabout_us;
	
	@FindBy(xpath ="//a[.='Contact']")
	private WebElement btn_sidebarcontact;
	
//	LOGO
	@FindBy(id ="header_logo")
	private WebElement header_logo;
	
	
	public boolean isDisplayed()
	{
		titleMyAccount.isDisplayed();
        return true;
	}
	
	public String getTitleMyAccount() 
	{
		return titleMyAccount.getText();
	}
	
	public void clickOrderHistory() 
	{
		btn_order_history_details.click();
	}
	
	public void click_Toggle() 
	{
		btn_toggle.click();
	}
	
	public void click_btnHome() 
	{
		btn_sidebarhome.click();
	}
	
	public void click_btnInterior() 
	{
		btn_sidebarinterior.click();
	}
	
	public void click_btnAmenities() 
	{
		btn_sidebaramenities.click();
	}
	
	public void click_btnRooms() 
	{
		btn_sidebarrooms.click();
	}
	
	public void click_btnTestimonials() 
	{
		btn_sidebartestimonials.click();
	}
	
	public void click_btnLegalNotice() 
	{
		btn_sidebarlegal_notice.click();
	}
	
	public void click_btnAboutUs() 
	{
		btn_sidebarabout_us.click();
	}
	
	public void click_btnContact() 
	{
		btn_sidebarcontact.click();
	}
	
	public void click_headerLogo() 
	{
		header_logo.click();
	}
	

}
