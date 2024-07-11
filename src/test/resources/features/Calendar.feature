Feature: Calendar functionality
  Agile story:  As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event under the Calendar module

  Background:
    Given user is  on the login page of the library application

  @B34G10-154 @day @calendar
  Scenario: Daily calendar view
    When user clicks calendar module icon
    And user clicks dayWeekMonth list on the left
   And user clicks Day view in the dropdown menu
    Then user should see daily calendar view

  @B34G10-155 @week @calendar
  Scenario: Weekly calendar view
    When user clicks calendar module icon
    And user clicks dayWeekMonth list on the left
   And user clicks Week view in the dropdown menu
    Then user should see weekly calendar view

  @B34G10-156 @month @calendar
  Scenario: Monthly calendar view
    When user clicks calendar module icon
    And user clicks dayWeekMonth list on the left
    And user clicks Month view in the dropdown menu
    Then user should see monthly calendar view

 @B34G10-157 @newEvent
 Scenario: create a new event under the Calendar module
    When user clicks calendar module icon
    When user clicks New event button on the left
   When user enters "Grooming Meeting" into event title box
    When user enters event start "07/11/2024" and "8:00 PM"
    When user enters event end "07/11/2024" and "9:00 PM"
    And  user clicks Save button
    Then user should see new event displayed on monthly view calendar

