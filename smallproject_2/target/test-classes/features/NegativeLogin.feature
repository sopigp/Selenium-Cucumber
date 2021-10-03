@NegativeLoginMenu
Feature: Login
  User want to Login
	
	@NegativeLogin
  Scenario Outline: User Sign In with Invalid Data
  	Given User on The Hotel Dominic Parks Homepage
		When User Click The button SignIn in the Homepage
		Then User Will be Direct On The Authentication Page
		When User fill invalid email "<email>" and invalid password "<password>"
		Then User will see an error message on the login page
		
		Examples:
			|			email					|		password	|
 			|sofiegp@gmail.com	|		12345			|
 			|sopigp@gmail.com		|		54321			|
 			|										|		12345			|
 			|sopigp@gmail.com		|							|
 			|										|							|
 			|			sopigp				|		12345			|
 			
 			