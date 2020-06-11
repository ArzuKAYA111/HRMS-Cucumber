
#Use Cucumber DataTable you need to automate
@Homework1
Feature: invalid log in
 
 Scenario Outline: Login with invalid credentials
   When User enter invalid "<UserName>" , "<Password >" and see "<ErrorMessage>"
   
   Examples: username
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid credentials |
      | Hello    | Syntax123! | Invalid credentials |
  
  
  #Scenario: Login with invalid credentials
    #When User enter invalid username and password  and see error message
      #| UserName | Password   | ErrorMessage        |
      #| Admin    | Admin123   | Invalid Credentials |
      #| Hello    | Syntax123! | Invalid Credentials |
      