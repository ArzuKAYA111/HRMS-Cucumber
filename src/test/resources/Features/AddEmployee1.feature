@addEmployee 
Feature: Admin user should be able to create an employee and login credentials for an employee
#precondition olarak senario larda ortak olan stepleri background ta birlestirebiliriz

Background:
Given user logged in into HRMS
When user enters employees "Derya" name and "Duran"

Scenario: Add new Employee 

And user clicks save button
Then "Derya D  Duran"  is added successfully


Scenario:  Add Employee without employee id   


And user deletes employee id    
And user clicks save button
Then "Derya  D Duran" is added successfully


Scenario: AddEmployee and create Login Credentials   

  
And user clicks on create login checkbox   
And user enters  login credentials   
And user clicks save button
Then "Derya Duran"  is added successfully

Scenario Outline: Adding multipleemployees
When user enter employees "<FirstName>","<MiddleName>" and "<LastName>" 
And user click save button;
Then "<FirstName>","<MiddleName>" and "<LastName>" is added sucessfully

Examples: |FirstName  | MiddleName |LastName|
          | Derya     |    D      | Duran   |
          | Aygul     |   Aysen   | Buyuk   |
          |Seyma      | Sengul    |Saygin   |
  