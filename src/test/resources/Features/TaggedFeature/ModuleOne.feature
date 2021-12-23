
Feature: CRM Deal and Details


  Scenario: Create Deal
    Given User is logged in
    When user create a new Deal

  @tag2
  Scenario: View Deal
  Given User is logged in
  When User view his Deal details
  
    Scenario: Update Deal
  Given User is logged in
  When User updates his Deal details
  
    Scenario: Create Contact
    Given User is logged in
    When user create a new contact

  @tag2
  Scenario: View contact
  Given User is logged in
  When User view his contact details
  
    Scenario: Update contact
  Given User is logged in
  When User updates his contact details
