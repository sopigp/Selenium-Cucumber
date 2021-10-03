@BookingCart
Feature: BookingHotel
	User want to Booking Hotel Room

@PositiveCase
	Scenario Outline: Booking Hotel with Valid Data
		Given User already login with "<email>" as an email and "<password>" as an password
		When User open home menu on the Hotel Dominic Parks Website
		And User select the "<hotel_location>", hotel name, check in date, check out date
		Then User should be navigated to the hotel room list
		When User choose one of the hotel room on the list
		And User click the booking cart
		Then User should be navigated to the hotel room & price summary page
		When User choose to proceed on the room & price summary page
		Then User should be navigated to the guest information page
		When User choose to proceed on the guest information page
		Then User should be navigated to the payment information page
		And User choose the payment resource
		Then User should be navigated to order summary page
		When User confirm the order
		Then User should be navigated to the oder confirmation page
	
		Examples:
			|		email								|		password	|	hotel_location	|
 			|		sopigp@gmail.com		|		12345			| jakarta					|