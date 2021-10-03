package step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.HomePage;
import page_object.LoginPage;
import page_object.MyAccountPage;
import page_object.OrderConfirmationPage;
import page_object.OrderSummaryPage;
import page_object.RoomsPriceSummaryPage;
import page_object.SearchedResultsPage;

@SuppressWarnings("deprecation")
public class BookingHotelSteps {
	private WebDriver webdriver;
	
	public BookingHotelSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	private String roomName;
	private String hotelName;
	private String dateCheckin;
	private String dateCheckout;
	
	@Given("User already login with \"(.*)\" as an email and \"(.*)\" as an password")
	public void setLogin(String email, String password) throws Throwable {
		HomePage signIn = new HomePage(webdriver);
		signIn.isDisplayed();
	    String ActualTittle = signIn.getTitleDashboard();
        String ExpectedTitle = "Hotel Dominic Parks";
        assertEquals(ExpectedTitle, ActualTittle);
		signIn.clickSignIn();
		LoginPage setLogin = new LoginPage(webdriver);
		setLogin.setEmail(email);
		setLogin.setPassword(password);
		setLogin.clickLogin();	
		
//		VERIFY AFTER LOGIN
		HomePage myAccount = new HomePage(webdriver);
		String ActualAccount = myAccount.getAccountName();
	    String ExpectedAccount = "Gita";
	    assertEquals(ExpectedAccount, ActualAccount);
	    
	    MyAccountPage myAccountTitle = new MyAccountPage(webdriver);
		String ActualTitleMyAccount = myAccountTitle.getTitleMyAccount();
	    String ExpectedTitleMyAccount = "MY ACCOUNT";
	    assertEquals(ExpectedTitleMyAccount, ActualTitleMyAccount);
	}
	
	@When("User open home menu on the Hotel Dominic Parks Website")
	public void openHomeMenu() throws Throwable {
		MyAccountPage homeMenu = new MyAccountPage(webdriver);
		homeMenu.click_Toggle();
		Thread.sleep(2000);
		homeMenu.click_btnHome();
		Thread.sleep(2000);
		
		homeMenu.click_Toggle();
		homeMenu.click_btnInterior();
		Thread.sleep(2000);
		
		homeMenu.click_btnAmenities();
		Thread.sleep(2000);
		
		homeMenu.click_btnRooms();
		Thread.sleep(2000);
		
		homeMenu.click_btnTestimonials();
		Thread.sleep(2000);
		
		homeMenu.click_btnLegalNotice();
		Thread.sleep(2000);
		
		homeMenu.click_Toggle();
		homeMenu.click_btnAboutUs();
		Thread.sleep(2000);
		
		homeMenu.click_Toggle();
		homeMenu.click_btnHome();
		Thread.sleep(2000);
	}
	
	@And("User select the \"(.*)\", hotel name, check in date, check out date")
	public void searchHotel(String hotel_location) throws Throwable {
		HomePage selectHotel = new HomePage(webdriver);
		selectHotel.getAccountName();
		String getAccountName = selectHotel.getAccountName();
		WebElement accountName = webdriver.findElement(By.xpath("//span[@class='account_user_name hide_xs']"));
		String ActualTitle = accountName.getText();
		System.out.println("Account Name is: " + ActualTitle);
		assertEquals(getAccountName, ActualTitle);
		selectHotel.setHotelLocation(hotel_location);
		selectHotel.click_hotelName();
		selectHotel.click_checkInDate();
		selectHotel.checkInDate();
		selectHotel.checkOutDate();
		hotelName = selectHotel.getHotel();
		selectHotel.search();
	}
	
	@Then("User should be navigated to the hotel room list")
	public void searchResult() throws Throwable {
		SearchedResultsPage resultHotelList = new SearchedResultsPage(webdriver);
		resultHotelList.isDisplayed();
		Thread.sleep(3000);
		String ExpectedHotelName = resultHotelList.getHotelName();
	    System.out.println("Expected Hotel name is: " + ExpectedHotelName);
	    roomName = ExpectedHotelName;
	    
	    String ExpectedHotelPrice = resultHotelList.getHotelPrice();
	    System.out.println("Expected Hotel price is: " + ExpectedHotelPrice);
	}
	
	@When("User choose one of the hotel room on the list")
	public void chooseHotelList() throws Throwable {
		SearchedResultsPage chooseHotel = new SearchedResultsPage(webdriver);
		chooseHotel.submitRoom();
		Thread.sleep(3000);
	}
	
	@When("User proceed to checkout the hotel room")
	public void proceedHotelList() throws Throwable {
		SearchedResultsPage proceedHotelList = new SearchedResultsPage(webdriver);
		proceedHotelList.CartDetailsisDisplayed();
		String ExpectedHotelName = proceedHotelList.getHotelName();
		String ActualHotelName = proceedHotelList.getActualHotelName();
		System.out.println("Actual hotel name is :" + ActualHotelName);
//		assertEquals(ExpectedHotelName, ActualHotelName);
		
		String ActualHotelDuration = proceedHotelList.getActualHotelDuration();
		System.out.println("Actual hotel duration is :" + ActualHotelDuration);
		
		String ActualHotelQty = proceedHotelList.getActualHotelQty();
		System.out.println("Actual hotel quantity is :" + ActualHotelQty);
		
		String ExpectedHotelPrice = "1 100,00 Rp";
		String ActualHotelPrice = proceedHotelList.getActualHotelPrice();
		System.out.println("Actual hotel price is :" + ActualHotelPrice);
		assertEquals(ExpectedHotelPrice, ActualHotelPrice);
		
		proceedHotelList.proccedCheckoutHotelList();
	}
	
	@Then("User should be navigated to the hotel room & price summary page")
	public void roomsPriceSummary() throws Throwable {
		RoomsPriceSummaryPage openRoomPriceSummary = new RoomsPriceSummaryPage(webdriver);
		openRoomPriceSummary.isDisplayed();
		String titlePriceSummary = openRoomPriceSummary.getTitle();
		System.out.println("-----"+titlePriceSummary+"------");
	}
	
	@When("User choose to proceed on the room & price summary page")
	public void proceedRoomsPriceSummary() throws Throwable {
		RoomsPriceSummaryPage summaryRoom = new RoomsPriceSummaryPage(webdriver);
		String ActualHotelName = summaryRoom.getHotelName();
	    String ExpectedHotelName = "General Rooms";
	    System.out.println("Actual hotel name is :" + ActualHotelName);
	    assertEquals(ExpectedHotelName, ActualHotelName);
	    
	    String ActualHotelLocation = summaryRoom.getHotelLocation();
	    String ExpectedHotelLocation = " The Hotel Prime, DefCity, Aceh, Indonesia, 44444";
	    System.out.println("Actual hotel Location is :" + ActualHotelLocation);
	    assertEquals(ExpectedHotelLocation, ActualHotelLocation);
	    
	    String ActualCheckIn = summaryRoom.getHotelCheckin();
	    String ActualCheckOut = "27 Sep, Mon";
	    System.out.println("Actual CheckIn is :" + ActualCheckIn);
	    System.out.println("Actual CheckOut is :" + ActualCheckOut);
	    
	    String ActualRoomQty = summaryRoom.getHotelRooms();
	    System.out.println("Actual Qty Room is :" + ActualRoomQty);
	    
	    String ActualHotelGuest = summaryRoom.getHotelGuest();
	    System.out.println("Actual Room Guests are :" + ActualHotelGuest);
	    
	    String ActualHotelPrice = summaryRoom.getHotelPrice();
	    String ExpectedHotelPrice = "1 100,00 Rp";
	    System.out.println("Actual hotel price is :" + ActualHotelPrice);
	    assertEquals(ExpectedHotelPrice, ActualHotelPrice);
	    
	    String ActualHotelperNight = summaryRoom.getHotelperNigh();
	    String ExpectedHotelperNight = "1 100,00 Rp";
	    System.out.println("Actual hotel per Night is :" + ActualHotelperNight);
	    assertEquals(ExpectedHotelperNight, ActualHotelperNight);
	    
	    String ActualHotelCost = summaryRoom.getHotelCost();
	    String ExpectedHotelCost = "1 000,00 Rp";
	    System.out.println("Actual hotel cost is :" + ActualHotelCost);
	    assertEquals(ExpectedHotelCost, ActualHotelCost);
	    
	    String ActualHotelTotal = summaryRoom.getHotelTotal();
	    String ExpectedHotelTotal = "1 100,00 Rp";
	    System.out.println("Actual hotel total is :" + ActualHotelTotal);
	    assertEquals(ExpectedHotelTotal, ActualHotelTotal);
	
		summaryRoom.clickProceedRooms();
	
	}
	
	@Then("User should be navigated to the guest information page")
	public void guestInformation() throws Throwable {
		RoomsPriceSummaryPage guestinfo = new RoomsPriceSummaryPage(webdriver);
		Thread.sleep(2000);
		guestinfo.guestInformationIsDisplayed();
		String titleGuestInfo = guestinfo.getTitleGuestInformation();
		System.out.println("-----"+titleGuestInfo+"------");
	}
	
	@When("User choose to proceed on the guest information page")
	public void proceedGuestInformation() throws Throwable {
		RoomsPriceSummaryPage proceedGuestInfo = new RoomsPriceSummaryPage(webdriver);
		String ActualBookerName = proceedGuestInfo.getName();
	    String ExpectedBookerName = "Gita Pratiwi";
	    System.out.println("Hotel booker name is :" + ActualBookerName);
	    assertEquals(ExpectedBookerName, ActualBookerName);
	    
	    String ActualBookerEmail = proceedGuestInfo.getEmail();
	    String ExpectedBookerEmail = "sopigp@gmail.com";
	    System.out.println("Hotel booker name is :" + ActualBookerEmail);
	    assertEquals(ExpectedBookerEmail, ActualBookerEmail);
	    
	    String ActualBookerPhoneNumber = proceedGuestInfo.getMobileNumber();
	    String ExpectedBookerPhoneNumber = "081316009990";
	    System.out.println("Hotel booker mobile phone number is :" + ActualBookerPhoneNumber);
	    assertEquals(ExpectedBookerPhoneNumber, ActualBookerPhoneNumber);
	    
		proceedGuestInfo.clickGuestInformation();
	}
	
	@Then("User should be navigated to the payment information page")
	public void paymentInformation() throws Throwable {
		RoomsPriceSummaryPage payInfo = new RoomsPriceSummaryPage(webdriver);
		Thread.sleep(2000);
		payInfo.paymentInformationIsDisplayed();
		String titlePaymentInfo = payInfo.getTitlePaymentInfo();
		System.out.println("-----"+titlePaymentInfo+"------");
	}
	
	@And("User choose the payment resource")
	public void proceedPayInformation() throws Throwable {
		RoomsPriceSummaryPage proceedPayInfo = new RoomsPriceSummaryPage(webdriver);
		proceedPayInfo.clickTnC();
		Thread.sleep(3000);
		proceedPayInfo.clickCloseTnC();
		proceedPayInfo.checkboxPaymentInformation();
		Thread.sleep(3000);
		proceedPayInfo.payBankWire();
	}
	
	@Then("User should be navigated to order summary page")
	public void orderSummary() throws Throwable {
		OrderSummaryPage orderInfo = new OrderSummaryPage(webdriver);
		orderInfo.orderSummaryIsDisplayed();
		String titleOrderSummary = orderInfo.getTitleOrderSummary();
		System.out.println("-----"+titleOrderSummary+"------");
	}
	
	@When("User confirm the order")
	public void confirmOrder() throws Throwable {
		OrderSummaryPage orderInfo = new OrderSummaryPage(webdriver);
		orderInfo.clickConfirmOrder();
	}
	
	@Then("User should be navigated to the oder confirmation page")
	public void orderDetails() throws Throwable {
		OrderConfirmationPage orderDetails = new OrderConfirmationPage(webdriver);
		Thread.sleep(3000);
		orderDetails.orderConfirmationIsDisplayed();
		String titleOrderConfirmation= orderDetails.getTitleOrderConfirmation();
		System.out.println("-----"+titleOrderConfirmation+"------");
		
		String ActualPopUp = orderDetails.getPopupSuccess();
	    String ExpectedPopUp = "Your order on Sekolah QA is complete.";
	    System.out.println(ActualPopUp);
	    assertEquals(ExpectedPopUp, ActualPopUp);
	    
	    String ActualOrderStatus = orderDetails.getOrderStatus();
	    String ExpectedOrderStatus = "Confirmed";
	    System.out.println("Your Status Order is :" + ActualOrderStatus);
	    assertEquals(ExpectedOrderStatus, ActualOrderStatus);
	    
		orderDetails.hash_orderDetails();
		orderDetails.orderDetailsIsDisplayed();
		System.out.println(hotelName);
		System.out.println(orderDetails.getHotelName());
		Assert.assertEquals(hotelName, orderDetails.getHotelName());
	}
	
//	DATE PICKER SEND KEY
	@And("User select\"(.*)\", hotel name, \"(.*)\" as date check in, \"(.*)\" as date check out")
	public void searchHotelbykey(String hotel_location, String checkin, String checkout) throws Throwable {
		HomePage selectHotel = new HomePage(webdriver);
		selectHotel.getAccountName();
		String getAccountName = selectHotel.getAccountName();
		WebElement accountName = webdriver.findElement(By.xpath("//span[@class='account_user_name hide_xs']"));
		String ActualTitle = accountName.getText();
		System.out.println("Account Name is: " + ActualTitle);
		assertEquals(getAccountName, ActualTitle);
		selectHotel.setHotelLocation(hotel_location);
		selectHotel.setCheckin(checkin, checkout);
//		selectHotel.click_hotelName();
//		selectHotel.click_checkInDate();
//		selectHotel.checkInDate();
//		selectHotel.checkOutDate();
		hotelName = selectHotel.getHotel();
		selectHotel.search();
	}
	
//	VIA BOOKING CART
	
	@When("User click the booking cart")
	public void proceedBookingCart() throws Throwable {
		SearchedResultsPage BookingViaCart = new SearchedResultsPage(webdriver);
		BookingViaCart.clickCloseFrame();
		BookingViaCart.hover_bookingCart();
		BookingViaCart.hover_CheckoutCart();
		Thread.sleep(2000);
		BookingViaCart.clickCart();
	}
	
}