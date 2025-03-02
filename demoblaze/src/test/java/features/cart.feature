Feature: Cart Functionality

  Scenario: User navigates to cart and proceeds to checkout
    Given I am on the cart page
    When I click on the "Cart" button
    And I click on the "Place Order" button
    Then The checkout process should start
