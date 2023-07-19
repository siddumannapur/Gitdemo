

Feature: feature to test the login funtionality
 
@Smoke
  Scenario: check login is successfull
  Given User is on login page
  When user enters the username and password
  And Clicks on login button
  Then user is navigated to the environment page


@Smoke
 Scenario: Order an item
  Given user adds bag to cart
  When user goes to cart 
  Then Clicks check out
  And enter all the details
  And order the item
  
  