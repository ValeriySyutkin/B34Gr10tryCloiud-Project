@B34G10-195
Feature: Default

	Background:
		#@B34G10-153
		Given  user is  on the login page of the library application
		

	
	@B34G10-192
	Scenario: US011 TC01: User can display all listed items under the Activity module.
		When user clicks on a activity button of the module on top
		Then user can see all listed items under the Activity module.	

	
	@B34G10-193
	Scenario: US011 TC02: User can see all items list ordered by newest to oldest.
		When user clicks on a activity button of the module on top
		Then User can see all items list ordered by newest to oldest.	

	
	@B34G10-194
	Scenario: US011 TC03: User can see "No more events to load" message at the end of the All Activities tab.
		When user clicks on a activity button of the module on top
		Then User can see "No more events to load" message at the end of the All Activities tab.