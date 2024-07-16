@B34G10-162
Feature: Deck Module Functionality
	User Story : As a user, I should be able to manage my works by creating a new board/list/card
	             and modifying them under Deck Module

	Background:
		Given user is already logged in to trycloud.net and is on dashboard page
	
	@B34G10-158
	Scenario: US004-TC001 User can create a new board
			When the user creates a new board
		    And the new board is successfully created
				Then the user is navigated to the new board view

	
	@B34G10-159
	Scenario: US004-TC002 User can create a new list of card under any board
		    When the user creates a new list of cards
		    Then the new list is added under the current board

	
	@B34G10-160
	Scenario: US004-TC003 User can add a new card on any list on the current board
		    When the user adds a new card to a specific list
		    Then the user can see the new card in the list

	
	@B34G10-161
	Scenario: User can create a new board, list, card, and assign it to themselves
		When the user creates a new board
		And the new board is successfully created
		Then the user is navigated to the new board view


		When the user creates a new list of cards
		Then the new list is added under the current board

		When the user adds a new card to a specific list
		Then the user can see the new card in the list

		When the user selects the three dots menu on the card
		And chooses to assign the card to themselves
		Then the user's profile is linked with the assigned card
