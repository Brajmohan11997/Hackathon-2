Feature: Adding a product to the cart

  Scenario: User adds a product to the cart successfully
    Given I am on the product page
    When I click on the "Add to cart" button
    Then The product should be added to the cart