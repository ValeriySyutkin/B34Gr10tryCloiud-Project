@B34G10-186
Feature: Check/Change Profile Settings Functionality

	Background:
		#@B34G10-153
		Given  user is  on the login page of the library application
		

	
	@B34G10-183
	Scenario: US014 TC01: Full name and username should be the same.
		When User clicks on a profile icon on the right conor
		And click on the Setting button in a drop down menu
		Then user sees Name of the user in the Settings field is the same as Full Name input box	

	
	@B34G10-184
	Scenario: US014 TC02: User can enter a proper e-mail to Email input box.
		When User clicks on a profile icon on the right conor
		And click on the Setting button in a drop down menu
		And User enters invalid email "abcdefjhijk" into the email input box
		Then User should see that email input box did not accepted it
		And User enters valid email "valeriyprotrainer@gmail.com" into the email input box
		Then User should see "valeriyprotrainer@gmail.com" in email input box

	
	@B34G10-185
	Scenario Outline: US014 TC03: User can change Language.
		When User clicks on a profile icon on the right conor
		And click on the Setting button in a drop down menu 
		And User clicks a drop down Language menu
		And User can choose any  "<languages>"  from drop down menu and click on it
		Then User see  "<languages>"  he chose is selected
		Examples:
			| languages |
			| en      |
			| es      |
			| fr      |
			| ja      |
			| ru      |
			| uk      |
		    | en      |