Feature: Product Search and Purchase
@test
  Scenario: verify user can successfully search a product and add the product to shopping cart to purchase the product
    Given I am BestBuy Homepage
    And I enter Maclaptop on searchbar
    And I click on search icon button
    And I click on the first maclaptop link from the list
    And I click on the add to cart button
    And I click on go to cart from the popup window
    And I click the on close icon to cancel the popup window
    When I click on the Checkout Button
    Then I should click on continue as guest button
#    And I enter valid email address for contact information
#    And I enter valid phone number for contact information
#    Then I click on continue to payment information
#    And I enter Credit or Debit Card Number
#    And I enter First Name
#    And I enter Last Name
#    And I enter Address
#    And I enter City
#    And I Select State
#    And I enter Zipcode
#    And I click on Place your Order button








