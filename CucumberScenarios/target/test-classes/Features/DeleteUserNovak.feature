Feature: feature to delete user novak

  Scenario: validate user novak is deleted
    Given user goes to table link
    And clicks the x on Novaks line
    When user clicks ok
    Then user novak will be deleted
