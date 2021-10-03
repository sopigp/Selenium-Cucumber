@Register
Feature: Registration
  User want to registration

  @PositiveRegistration
  Scenario Outline: Create account with valid data
  	Given User on The Hotel Dominic Homepage
		And User click signIn in the homepage
		Then User should be navigated to the Authentication Page
		When User input "<email>"
		And User click button create an account
		When User input social title, "<firstname>" in field firstname, "<lastname>" in field lastname, "<password>" in field password, and DOB
		And User click button register
		Then New account created successfully
		
		Examples:
		|	email	|	firstname	|	lastname	|	password	|	
		|	valid	|		valid		|	valid			|		12345		|					