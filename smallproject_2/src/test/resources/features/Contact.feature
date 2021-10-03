@ContactMenu
Feature: upload File Contact Page
	User want to upload File

@PositiveCase
	Scenario Outline: upload file with valid data
		Given User already login with "<email>" as an valid email and "<password>" as an valid password
		When User open the contact page on the sidebar menu
		And User fill subject, "<email>", "<message_contactMenu>" and upload photo "worship.png"
		Then User message on the contact page has been send
		
		Examples:
			|		email								|		password	|	hotel_location	|	message_contactMenu																				|
 			|		sopigp@gmail.com		|		12345			| jakarta					|	Saya sudah booking hotel, aplikasi mudah sekali digunakan!|