
Feature: US_23 The favorite icon
  Background: User opens the app
    * User makes driver adjustments

  Scenario: The favorite icon must be visible and active on the products on the site
            and directed page to wishlist.
    * Verify the products are visible and active
    * The favorite icon on the right side of product image is visible and active
    * User clicks the button "favorite"
    * Verify the directed page is not wishlist
    * Driver turns off

  Scenario: The favorite icon must be visible and active on the selected product.
    * Verify visibility and activity of products and clicks
    * Verify the directed page due to selected product
    * The user scrolls down the page
    * The favorite icon on the right side is visible and active
    * Driver turns off

  Scenario: Saved items should be displayed and deleted on Wishlist page.
    * Verify visibility and activity of products and clicks
    * The user scrolls down the page
    * User clicks the button "favorite"
    * Verify the directed page is not wishlist
    * Driver turns off

