Feature: To verify the basic functionality of Trello task management tool

  Scenario: verify the basic functionality of Trello task management tool
    Given launch chrome browser
    Then I should see Login page
    When User click on login
    And User Enter Username and click on atlassian login button
    And User Enter Password and click on login button
    Then I should see Home Screen
    When User create a board
    Then I should see board Screen
    When User create a list
    And User adds a card to the list
    Then I should see new list and card in the list
    When User click on cancel button
    And User click on Add another list button
    And User create a  another list
    And User adds a card to the Second list
    Then I should see new list and card in the list
    When User moves card from one list to another
    Then I should see card is moved to the new list
    When User edit the Task
    Then I should see updated task