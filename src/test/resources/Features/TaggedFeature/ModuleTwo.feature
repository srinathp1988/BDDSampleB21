@Phase2
Feature: CRM Contact and Details

Background: User Login
 Given User is logged in

@Regression
  Scenario: Create Contact
    When user create a new contact

 @SmokeTest
  Scenario: View contact 
  When User updates his contact details
  
  
