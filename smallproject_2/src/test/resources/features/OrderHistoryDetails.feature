@OrderHistory
Feature: View Order History Details
	User want to view the list of order history details

@PositiveCase
	Scenario Outline: view successful hotel bookings
		Given User already login with an email "<email>" and a password "<password>"
		When User open the order history and details menu
		Then User should be navigated to the order history page
		
		Examples:
			|		email								|		password	|
 			|		sopigp@gmail.com		|		12345			|