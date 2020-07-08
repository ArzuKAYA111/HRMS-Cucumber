@smoke  @login
Feature: Login

    #Enhancing test with Scenario Outline
     
    @smoke
  Scenario Outline: valid admin and ess login
    When user enter valid "<Username>" and "<Password>"
    And user click on login button
    Then "<Firstname>" is successfully loged in
    Examples: 
      | Username | password    | Firstname |
      | Admin    | Hum@nhrm123 | Admin     |
      | Mahady   | Mahady123!! | John      |
      | abd77    | Syntax123!  | Abdullah  |

  
@regression
Scenario: Error message validation while invalid login

  Scenario Outline:  Error message validation while invalid login
    When user enter invalid "<Username>" or "<Password>"
    And user click on login button
    Then user see "< ErrorMessage>"
    Examples:
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Hello    | Syntax123! | Invalid Credentials |