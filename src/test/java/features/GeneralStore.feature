
Feature: Verifying Details for General Store

   Scenario Outline:  Enter complete details for General Store
    Given User opens General Store
    Then  User Selects India from Country dropdown
    Then  User enters name "<EnterName>"
    Then  User click on Lets shop button
    
  Examples: 
      | EnterName       |
      | Amit Chatterjee |
   
  