Feature: Women Test
  As a user I want to products by price and products names

  @sanity @regression
  Scenario: User should sort the products by name filter successfully
    Given I am on homepage
    When I mouse Hover on Women Menu
    And I mouse Hover on Tops
    And I click on Jackets
    And select product name filter "Product Name"
    Then I verify the products name display in alphabetical order

  @smoke @regression
  Scenario: User should sort the products by name filter successfully
    Given I am on homepage
    When I mouse Hover on Women Menu
    And I mouse Hover on Tops
    And I click on Jackets
    And select product price filter "Price"
    Then I verify the products price display in low to high