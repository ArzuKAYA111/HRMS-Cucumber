
Feature: user should see error message with invalid credentials
  @smoke
  Scenario: validate error massage
  
    And user entered invalid admin credentials
    When user click login button
    Then user see error massage
    Then user close the browser
  
  