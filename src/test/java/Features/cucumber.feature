Feature: Title of your feature


@test1
     Scenario: To check login with Invalid credentials
    Given User is on ecommerce login page
    When User enter invalid username and password on ecommerece site
    And User clicks on the login button with invalid credentials on ecommerce site 
    Then user got an error message on ecommerce site
    
@test2 
    Scenario: To enter details into excel using valid credentials
    Given User is on ecommerce login page
    When user enter valid username and password on ecommerce site
    And user clicks on the login button with valid credentials on ecommerce site
    And user able to add an item into cart on ecommerce site
    Then User is able to send the detail of that item on an excel