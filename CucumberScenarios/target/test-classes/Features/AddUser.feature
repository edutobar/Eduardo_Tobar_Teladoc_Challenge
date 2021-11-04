Feature: feature to test adding user to the existing table

  Scenario: Validate user is added to the existing table
    Given user goes to link
    And user clicks on add user
    When user inputs required information
    And clicks saves
    Then new user is added to existing table
