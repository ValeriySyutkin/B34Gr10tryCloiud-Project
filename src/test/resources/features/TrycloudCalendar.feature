
@calendar
  #Valeriy's version of US005
Feature: Calendar Module Functionality
  User Story: As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event under the Calendar module



  @day
  Scenario: User can display daily calendar view
    Given user is already logged in to trycloud.net and is on dashboard page
    When user clicks calendar button
    And user clicks three line button
    And user clicks "Day" button
    Then user can see "Day"ly calendar view

  @week
  Scenario: User can display daily calendar view
    Given user is already logged in to trycloud.net and is on dashboard page
    When user clicks calendar button
    And user clicks three line button
    And user clicks "Week" button
    Then user can see "Week"ly calendar view

  @month
  Scenario: User can display daily calendar view
    Given user is already logged in to trycloud.net and is on dashboard page
    When user clicks calendar button
    And user clicks three line button
    And user clicks "Month" button
    Then user can see "Month"ly calendar view

  @extraPractice
  Scenario Outline: User can display daily/weekly/monthly calendar view
    Given user is already logged in to trycloud.net and is on dashboard page
    When user clicks calendar button
    And user clicks three line button
    And user clicks "<Day/Week/Month>" button
    Then user can see "<Day/Week/Month>"ly calendar view
    Examples:
      | Day/Week/Month |
      | Day            |
      | Week           |
      | Month          |

    @createEvent
    Scenario:User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
      Given user is already logged in to trycloud.net and is on dashboard page
      When user clicks calendar button
      And user clicks new event button
      And user writes event name in a event title window
      And user chooses a day month year and time of starting event in a dedicated window
      And user chooses a day month year and time of ending event in a dedicated window
      And user clicks save button
      Then user can see new event he created in a monthly calendar view