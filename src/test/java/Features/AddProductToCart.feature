@AddProductToCart @RegressionTest
Feature: User can search for a product and add to cart

  Scenario: Search for product and add it to cart
    When Search for a product
    And Add the product to cart
    Then Verify the product is added to cart successfully

