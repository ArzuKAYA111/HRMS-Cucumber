#User should be be able to login as an Admin using valid admin credentials
#User should be be able to login as an ESS using valid ess credentials
Feature: Login
#This feature has no repetitive precondition so it has no Background

  #@smoke
  #Scenario: valid admin login
    #When user enter valid admin username and password
    #And user click on login button
    #Then admin user is successfully logged in
#
  #@smoke
  #Scenario: valid ess login
    #When user enter valid ess username and password
    #And user click on login button
    #Then ess user is successfully logged in
    #
    #Enhancing test with Scenario Outline
     
    #@smoke
  #Scenario Outline: 
    #When user enter valid "<Username>" and "<Password>"
    #And user click on login button
    #Then "<Firstname>" is successfully loged in
    #Examples: 
      #| Username | password    | Firstname |
      #| Admin    | Hum@nhrm123 | Admin     |
      #| Mahady   | Mahady123!! | John      |
      #| abd77    | Syntax123!  | Abdullah  |

  #@smoke
  #Scenario: Login with valid username and invalid password
    #When user enter valid username and invalid password
    #And user click on login button
    #Then user see Invalid Credentials text on login page
#@smoke
  #Scenario: Login with invalid credentials
    #When I enter invalid username and password and see error message
      #| UserName | Password   | ErrorMessage        |
      #| Admin    | Admin123   | Invalid credentials |
      #| Hello    | Syntax123! | Invalid Credentials |