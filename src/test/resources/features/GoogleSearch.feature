Feature: To test google search

  @LocalRunner
  Scenario: Google search is working
    Given browser is open
    And user is on search page
    When user enters a text in search box
    And user clicks on search button
    Then user is navigated to search results