Feature: Modify personal Detail
  I want to use this template for my feature file

  Background: 
    Given user enter valid admin username and password
    And user click on login button
    When admin user is successfully logged in
    And admin navigate to Employee Information page
@Modify
  Scenario: Modify personal Detail
    Given admin searches employee by name
    And admin select employee from the list
    And admin navigate to Personal Deatils page and click to Edit
    Then admin add new information and save
  
      | OtherId   | MaritalStatus | DateOfBirth | NickName | MilitaryService |  
      | 239483720 | Married       | 1996-Jun-27 | Jacki    | Marine Corps    |  

  Scenario: Modify personal Detail
    Given admin searches employee by ID
    And admin select employee from the list
    And admin navigate to Personal Deatils page and click to Edit
    Then admin add new information and save
