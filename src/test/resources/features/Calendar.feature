Feature: Calendar functionality
  Agile story:  As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event under the Calendar module

  Background:
    Given user is  on the login page of the library application

  @B34G10-154 @day @calendarIryna
  Scenario: Daily calendar view
    When user clicks calendar module icon
    And user clicks dayWeekMonth list on the left
    And user clicks Day view in the dropdown menu
    Then user should see daily calendar view

  @B34G10-155 @week @calendarIryna
  Scenario: Weekly calendar view
    When user clicks calendar module icon
    And user clicks dayWeekMonth list on the left
    And user clicks Week view in the dropdown menu
    Then user should see weekly calendar view

  @B34G10-156 @month @calendarIryna
  Scenario: Monthly calendar view
    When user clicks calendar module icon
    And user clicks dayWeekMonth list on the left
    And user clicks Month view in the dropdown menu
    Then user should see monthly calendar view

  @B34G10-157 @newEvent @calendarIryna
  Scenario: create a new event under the Calendar module
    When user clicks calendar module icon
    And user clicks dayWeekMonth list on the left
    And user clicks Month view in the dropdown menu
    When user clicks New event button on the left
    When user enters event name into event title box
    And user enters event start with random date and "9:00 PM"
    And user enters event end with random date and "10:00 PM"
    And  user clicks Save button
    Then user should see new event displayed on monthly view calendar

  @B34G10-201 @deleteEvent @calendarIryna
  Scenario: user delete a new event
    When user clicks calendar module icon
    And user click on new event
    And user click More button
    And user click on three dot menu on the right
    And user click Delete button
    Then user should be able to see new event is deleted

