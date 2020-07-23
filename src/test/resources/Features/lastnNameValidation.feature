#Search an employee in hrms by id
#get the last name  from the table
#validate ui last name against db


Feature: lastname validation against DB

  @lastName
  Scenario: Scenario: Last Name validation against DB
    Given user is logged with valid admin credentials
    And user navigate to employee list page
    When admin searches employee by ID "14688"
    Then verify table is displayed
    And get last name from table
    And get last name from db
    Then validate last name from ui against db
  