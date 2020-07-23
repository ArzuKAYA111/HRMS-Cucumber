@regression
Feature: Modify personal Detail


  Background: 
    Given user enter valid admin username and password
    And user click on login button
    When admin user is successfully logged in
    And admin navigate to Employee Information page

  Scenario: Modify personal Detail
    Given admin searches employee by full name "Zehra Fatma Gulec"
    And admin select employee from the list
    And admin navigate to Personal Deatils page and click to Edit
    Then admin add new information and save
      | OtherId   | DateOfBirth | NickName | MilitaryService | ssnNo     | SinNo   |
      | 239483720 | 1996-Jun-27 | gulec    | Marine Corps    | 745234986 | 456*789 |

  #Scenario: Modify personal Detail
    #Given admin searches employee by ID "11390"
    #And admin select employee from the list
    #And admin navigate to Personal Deatils page and click to Edit
    #Then admin add new information and save
      #| OtherId   | DateOfBirth | NickName | MilitaryService | ssnNo     | SinNo   |
      #| 239483720 | 1996-Jun-27 | Gulec    | Marine Corps    | 745234986 | 456*789 |
