@Login
Feature: Login
  User want to Login

  @PositiveLogin
  Scenario Outline: User Sign In with Valid Data
  	Given User on The Hotel Dominic Parks Homepage
		When User Click The button SignIn in the Homepage
		Then User Will be Direct On The Authentication Page
		When User fill "<email>" as an email "<password>" as an password
		Then User Will be Direct On The My Account Page
		
		Examples:
			|		email								|		password	|
 			|		sopigp@gmail.com		|		12345			|
 			
 #		abis when jgn ada then lagi, pake and aja	
 			
 		