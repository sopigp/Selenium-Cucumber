@NegativeRegisterMenu
Feature: Registration
  User want to registration

  @PositiveRegistration
  Scenario Outline: Create account with valid data
  	Given User on The Hotel Dominic Homepage
		And User click signIn in the homepage
		Then User should be navigated to the Authentication Page
		When User input "<email>"
		And User click button create an account
		When User fills social title, "<invalid_firstname>" in field firstname, "<invalid_lastname>" in field lastname, "<invalid_password>" in field password, and DOB
		And User click button register
		Then user will see an error message
		
		Examples:
		|	email	|	invalid_firstname	|	invalid_lastname	|	password	|	
		|	valid	|				abc123			|	pratiwi						|		12345		|		
		|	valid	|				Tiara				|	pratiwi#$%				|		12345		|				
		|	valid	|										|	pratiwi						|		12345		|
		|	valid	|			Annisa				|										|		12345		|		
