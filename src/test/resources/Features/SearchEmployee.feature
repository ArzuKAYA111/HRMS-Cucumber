@searchEmployee @sprint13
Feature: Employee Search
@smoke
  Scenario: Search Employee by id
    Given user is navigate to HRMS
    And user is logged with valid admin credentials
    And User navigate to employee list page
    When user enters valid employee id 
    And click on search button
    Then user see employee information is displayed 

  @regression
  Scenario: Search Employee by name
    Given user is navigate to HRMS
    And user is logged with valid admin credentials
    And User navigate to employee list page
    When user enters valid employee name and last name
    And click on search button
    Then user see employee information is displayed 

