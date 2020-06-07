
Feature: user should see error message with invalid credentials
  Scenario: validate error massage
    Given user is navigate to HRMS
    And user entered invalid admin credentials
    When user click login button
    Then user see error massage
    Then user close the browser
  
  