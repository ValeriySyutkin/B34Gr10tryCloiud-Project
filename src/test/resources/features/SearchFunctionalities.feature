@B34G10-172
Feature: Default

  Background:
		#@B34G10-153
    Given  user is  on the login page of the library application


  @B34G10-163
 Scenario Outline: US009-TC1: Verify user can search file from Dashboard Module
    When user is in module "<nameModule>"
    And user clicks on Magnify icon
    And user types "fileName" and clicks it
    Then user should see file from the list in Files module
    And user should be able to see the details side page of the file when clicked on it
    Examples:
    |nameModule |
    |Dashboard  |
    |Files      |
    |Photos     |
    |Activity   |
    |Talk       |
    |Contacts   |
    |Circles    |
    |Calendar   |
    |Deck       |

  @B34G10-164
  Scenario: US009-TC2: Verify user can navigate to Dashboard clicking on App icon
    Then user should be able to navigate to the Dashboard page whenever clicking the App icon at the top left corner on the page