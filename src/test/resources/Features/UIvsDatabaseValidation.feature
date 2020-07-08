Feature: Sace Demo login

  Scenario: invalid login
    Given user is on employee list page 
    When user retrieve all data from the ui
    And user retrieves all the data from database using below query
      | select emp_firstname, emp_lastname, emp_birthday from hs_hr_employees; |
    Then user compare both data and it should match.
    And user logs out

  Scenario: invalid login
    Given user is on employee list page
    And user validates that drop down contains following values
      | Jan |
      | Feb |
      | Mar |
      | Apr |
      | May |
      | Jun |
      | Jul |
      | Aug |
      | Sep |
      | Oct |
      | Nov |
      | Dec |
    Then user compare both data and it should match.
    And user enters following data set
      | Alex | Smith |
    And user click on add employee page
    And user add the following employees "<FirstName>"and "<MiddleName>"and"<LastName>"and click on save btn
      | FirstName | MiddleName | LastName  |
      | James     | J          | Smith     |
      | Faisal    | F          | Sakhi     |
      | Sohil     | S          | Instuctor |
      | Yunus     | Emre       | Yakut     |
    And user logs out