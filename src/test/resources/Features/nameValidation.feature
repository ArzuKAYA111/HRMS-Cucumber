
Feature: Name validation against DB
  #f3 e bsinca line in code una gidiliyor 
  @firstname
  Scenario: First Name validation against DB
    Given user is logged with valid admin credentials
    And user navigate to employee list page
    When admin searches employee by ID "14099"
    And verify table is displayed
    Then get first name from table
    And get first name from db
    Then validate first name from ui against db

  #14099
