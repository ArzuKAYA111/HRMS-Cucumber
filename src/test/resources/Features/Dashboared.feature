#Author: Write mail of  who develop this feature  

#dashboared different for admin and  for any user 
Feature: 
@Dashboared
  Scenario: Dasboared menu view for admin 
   When user enter valid admin username and password
    Then user see dashboard menu is displayed
   |Admin| PIM| Leave| Time| Recruitment|Performance| Dashboard|Directory|

 