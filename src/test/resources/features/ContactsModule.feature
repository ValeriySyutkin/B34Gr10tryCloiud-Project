Feature: Contact Module Functionality
  Agile Story: As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Background:
    Given user is  on the login page of the library application

  @alina
  Scenario: User can create a new contact
    When user clicks contacts module icon
    And user click newContact button in the left
    Then user enter "Lily Brown" into the new contact inbox
    And user clicks All Contact button on the left
    Then verify "Lily Brown" under all contacts list




  @alina
  Scenario: User can see all contacts
    When user clicks contacts module icon
    And user clicks All Contact button on the left
    Then verify "Lily Brown" under all contacts list
    Then user see the total number of the contacts


@alina
    Scenario: User can change the profile picture
      When user clicks contacts module icon
      And user clicks All Contact button on the left
      Then user click on the picture icon
      And user click on choose from Files button
      And user pick the avatar picture
      Then user press choose button

  @alina
      Scenario: User can delete the contact
        When user clicks contacts module icon
        And user clicks All Contact button on the left
        Then verify "Lily Brown" under all contacts list
        And user click hamburger menu
        Then delete "Lily Brown" from the all contacts list








