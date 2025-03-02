Feature: User Login to DemoBlaze

  Scenario: Successful Login with valid credentials
    Given I open the DemoBlaze website
    When I click on the login button
    And I enter username "praveen123"
    And I enter password "Murari@123"
    And I click on the submit button
    Then I should be logged in successfully