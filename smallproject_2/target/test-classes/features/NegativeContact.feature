@NegativeContactMenu
Feature: upload File Contact Page
	User want to upload File

@NegativeCase
	Scenario Outline: upload file with valid data
		Given User already login with "<email>" as an valid email and "<password>" as an valid password
		When User open the contact page on the sidebar menu
		And User fill subject, "<email_contact>", "<message_contactMenu>" and upload photo "worship.png"
		Then User will see an error message on the contact page
		
		Examples:
			|		email								|		password	|	email_contact		|	message_contactMenu			|
 			|		sopigp@gmail.com		|		12345			|sopigp@gmail.com	|													|
 			|		sopigp@gmail.com		|		12345			|									|													|