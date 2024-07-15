@B34G10-177
Feature: Upload Edit Delete Functionality
	Agile story: As a user, I should be able to upload a file,
	move or delete any selected file under the Files module

	Background:
		Given user is  on the login page of the library application


	@B34G10-173 @uploadFile
	Scenario: US002 TC01: Verify user can upload a file
		When user clicks files module icon
		And user clicks the plus button
		And user selects Upload file
		Then the file should be listed in the files list	



	@B34G10-174 @createFolder
	Scenario: US002 TC02: Verify user can create a new folder
		When user clicks files module icon
		And user clicks the plus button
		And user selects New folder from the dropdown menu
		And user enters a name for the new folder
		And user clicks the create button
		Then new folder should be listed in the files list	


	@B34G10-175 @deleteItem
	Scenario: US002 TC03: Verify user can delete any selected item from its three dots menu
		When user clicks files module icon
		When user clicks the three dots menu next to the item
		And user selects the delete file option
		Then item should no longer be listed in the files list	


	@B34G10-176 @totalNumberOfFile
	Scenario: US002 TC04: Verify user can see the total number of files and folders under the files list table
		When user clicks files module icon
		Then user should see the total number of files and folders displayed under the files list table