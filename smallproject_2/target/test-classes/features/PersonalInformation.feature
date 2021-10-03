@PersonalInformation
Feature: Update Personal Information
	User want to update personal information

@PositiveCase
	Scenario Outline: update personal information with valid data
		Given User already login with input "<email>" in email field and "<password>" in password field
		When User open the personal information menu
		And User input social title, "<firstname>" as a firstname, "<lastname>" as a lastname, "<email>" as an email, DOB, "<current_password>", "<new_password>", and "<confirmation_password>"
		Then Updated personal information saved successfully
		
		Examples:
			|		email								|		password	|	current_password	|	new_password	|	confirmation_password |	firstname	|	lastname	|
 			|		sopigp@gmail.com		|		12345			|				12345				|			12345			|					12345					|	Gita			| Pratiwi		|