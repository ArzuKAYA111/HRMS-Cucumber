#Tag for entire featue
 #Tags feature can be based on the sprint or based on the functionality
@searchEmployee @sprint13 
Feature: Employee Search
 Background is used only for precondition repetitive steps for each scenarios/ can not be use for other steps like last steps midle steps etc.
Background: 
 Given user is logged with valid admin credentials
  And user navigate to employee list page


 #tag for specific scenario
   @smoke  
  Scenario: Search Employee by id
    When user enters valid employee id
    And click on search button
    Then user see employee information is displayed
  @regression
  Scenario: Search Employee by name
     When user enters valid employee name and last name
    And click on search button
    Then user see employee information is displayed

#short cut ...> to go to implementation class of that feature clas we click on F3

#

