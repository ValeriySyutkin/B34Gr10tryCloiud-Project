
@B34G10-152
Feature:  Dashboard page Modifications
	Agile Story : As a user I should be able to modify Dashboard page

Background:
	Given user is already logged in to trycloud.net and is on dashboard page

	@B34G10-149
	Scenario: US001 TC01: After Login user can see all modules and Username.

		Then User sees all modules on a dashboard page
		When User clicks on a profile icon and Dropdown comes up
		Then User sees "username" at the top of a drop down	

	
	@B34G10-150
	Scenario:  US001 TC02: User can click on Customize button and select any of the Widgets

		When User clicks customize button
		Then User can select any of the Widgets	

	
	@B34G10-151
	Scenario: US001 TC03: User can click on Set Status button and select any of the Status options.

		When User clicks on a profile icon and Dropdown comes up
		And User clicks on Status button
		Then User can select any of the status options