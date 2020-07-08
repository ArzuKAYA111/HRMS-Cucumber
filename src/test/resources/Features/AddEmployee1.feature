#Admin user should be able to create an employee and login credentials for an employee
#precondition olarak senario larda ortak olan stepleri background ta birlestirebiliriz
#Feature: Add new Employee
#
  #Background: 
    #Given user is logged with valid admin credentials
    #And user navigates to AddEmployeePage
#
  #@smoke
  #Scenario: Add Employee with first and lastname
    #When user enters employees "Lemann" and "senliknk"
    #And user clicks save button
    #Then "Lemann senliknk" is added successfully
#
  #@regression
  #Scenario: Add Employee without employee id
    #When user enters employees first name and last name
    #And user deletes employee id
    #And user clicks save button
    #Then employee is added successfully
#
  #@smoke
  #Scenario: AddEmployee and create Login Credentials
    #When user enters employees first name and last name
    #And user clicks on create login checkbox
    #And user enters login credentials
    #And user clicks save button
    #Then employee is added successfully
#
  #to perform DDT in cucumber we use Scenario Outline with Examples
  #@regression
  #Scenario Outline: Adding multiple employees
    #When user enter employees "<FirstName>", "<MiddleName>" and "<LastName>"
    #And user clicks save button
    #Then "<FirstName>", "<MiddleName>" and "<LastName>" is added successfully
#
    #Examples: 
      #| FirstName | MiddleName | LastName |
      #| Luishs    | sLs        | Syjk     |
      #| Farukks   | cgd        | olp      |
      #| Jacobs    | kls        | wdr      |
      #| Ilyass    | dft        | kjrf     |
#
  #adding multiple employees using Cucumber DataTable
  #@inProgress
  #Scenario: Adding multiple employees
    #When user enters employee details and click on save then employee is added
      #| FirstName | MiddleName | LastName |
      #| Jainss    | jijk       | Doveser  |
      #| Aysunss   | aasku      | Smilesee |
      #| Kadirrss  | kkklo      | aaaadead |
#
  #@excel
  #Scenario: Adding multiple employees from excel
    #When user enters employee data from "addEmployeeData" excel sheet then employee is added
