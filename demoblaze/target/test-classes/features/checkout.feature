Feature: Checkout Functionality

  Scenario: User fills checkout form and completes purchase
    Given I am on the checkout page
    When I enter name "Praveen Vikash Brajmohan"
    And I enter country "Bharat"
    And I enter city "Noida"
    And I enter credit card "3234 7654 2345 9856"
    And I enter month "March"
    And I enter year "2025"
    And I click the "Purchase" button
    Then The order should be placed successfully
