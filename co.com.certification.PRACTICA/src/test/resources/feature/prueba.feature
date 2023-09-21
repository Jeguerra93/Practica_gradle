#Autor: John Guerra

 Scenario: Verify correct entry
   Given I enter with my credentials
   When I proceed with authentication
   Then go to the main view
