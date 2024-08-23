

Feature: Calculate monthly additions to footer menu

  Scenario: Count monthly additions
    Given I am on the footer menu page
    When I retrieve the footer menu count
    Then the count should be [expected count]