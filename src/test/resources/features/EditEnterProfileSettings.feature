@B34G10-181
Feature:  Edit/Enter Profile Settings Functionality

	Background:
		#@B34G10-153
		Given  user is  on the login page of the library application
		

	
	@B34G10-178
	Scenario: US013 TC01: User can see at least following titles inside “Personal Info” under Profile Settings page: Full name/Email/Phone Number
		When User clicks on a profile icon on the right conor
		And click on the Setting button in a drop down menu 
		Then User can see following titles inside “Personal Info” under Profile Settings page: 
		|Full name   |
		|Email       |
		|Phone number|


	
	@B34G10-179
	Scenario: US013 TC02: Name of the user in the Settings field should be the same with Full Name input box
		When User clicks on a profile icon on the right conor
		And click on the Setting button in a drop down menu 
		Then user sees Name of the user in the Settings field is the same as Full Name input box	

	
	#    @B34G10-180
  #      This test execution can not be automated due to a bug, bug report has been created.
	Scenario Outline: US013 TC03: User cannot pass any characters except numbers into the "Phone Number" input box.
		When User clicks on a profile icon on the right conor
		And click on the Setting button in a drop down menu 
		Then user cannot pass any characters except numbers into the "<Phone Number>" input box.
		Examples:
		|Phone Number     |
		|Hi how @re you!  |
		|hi 22 how are 33 |
		|3213334444       |