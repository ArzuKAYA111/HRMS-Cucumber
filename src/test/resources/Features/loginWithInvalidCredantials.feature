
#Use Cucumber DataTable you need to automate
@report
Feature: invalid log in
 
 Scenario Outline: Login with invalid credentials
   When User enter invalid "<UserName>" , "<Password >" and see "<ErrorMessage>"
   
   Examples: username
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid credentials |
      | Hello    | Syntax123! | Invalid credentials |
  
  @mvn
  Scenario: Login with invalid credentials
    When User enter invalid username and password  and see error message
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid credentials |
      | Hello    | Syntax123! | Invalid credentials |
      