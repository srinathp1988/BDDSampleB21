Feature: CRM Login Feature

Scenario: Valid Login
Given User is on login page
When User enters "tomsmih" and "SuperSecretPassword"
Then User is on Home page