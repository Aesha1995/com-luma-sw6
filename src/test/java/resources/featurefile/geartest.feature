@sanity
Feature: Gear Test Page

  @sanity @regression
  Scenario: user should add product successfully to shopping cart
    Given I am on homepage
    When I mouse hover on gear menu
    And I click on bags
    And I click on over night duffle
    Then Verify over night duffle text "Overnight Duffle"
    And I change quantity "3"
    And click on add to cart
    Then verify add to cart text "You added Overnight Duffle to your shopping cart."
    And click on shopping cart
    Then verify duffle text "Overnight Duffle"
    Then verify quantity "3"
    Then verify product price "$135.00"
    And I change old quantity"5"
    And click on update shopping cart
    Then verify updated product price "$225.00"