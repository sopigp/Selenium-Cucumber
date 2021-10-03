@MyAddress
Feature: Add New Address
	User want to add new Address

@PositiveCase
	Scenario Outline: add address with valid data
		Given User already login with "<email>" email and "<password>" password
		When User open the My Addresses menu
		And User fills "<firstname>" as firstname, "<lastname>" as lastname, "<company>" as company, "<vat_number>" as VAT Number, "<address1>" as address1, "<address2>" as address1, "<postal_code>" as postal code, "<city>" as city, "<home_phone>" as home phone, "<mobile_phone>" as mobile phone, "<additional_info>" as additional info, and "<address_title>" as address title
		Then Add new address saved successfully
		
		Examples:
			|		email								|		password	|	firstname	|	lastname	|	company						|	vat_number|	address1		|	address2	|	postal_code	|	city	|	home_phone	|	mobile_phone	|	additional_info						|	address_title	|
 			|		sopigp@gmail.com		|		12345			|	Gita			| Pratiwi		|PT Cilsy Fiolution	|	12345678	|Puri Nirwana	| Cibinong 	| 16916				|Bogor	|02187904693	|081316009990		|Alamat sama seperti di KTP	|	sopigp				|