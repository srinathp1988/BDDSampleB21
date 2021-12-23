Feature: Google search
Scenario: Google Search
   
 Given I am open Browser
 When I type Java
 And I click search
 Then Search result should be opened
 Then Bye bye
