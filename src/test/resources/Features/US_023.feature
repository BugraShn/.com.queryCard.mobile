
Feature: US_23 The favorite icon
  Background: User opens the app
    * User makes driver adjustments



  Scenario: The favorite icon must be visible and active on the products on the site
            and directed page to wishlist.
    * User clicks on Allow
    * Verify visibility and activity of products
    * The favorite icon on the right side of product image is visible and active
    * User clicks on favorite asign on product image
    * Verify the directed page is not wishlist
    * Driver turns off


  Scenario: The favorite icon must be visible and active on the selected product.
    * User clicks on Allow
    * Verify visibility and activity of products text
    * User clicks on one of products
    * Verify the directed page due to selected product
    * Driver turns off
  @QWERT
  Scenario:Saved items should be displayed and deleted on Wishlist page.
    * User clicks on Allow
    * Verify visibility and activity of products text
    * User clicks on one of products
    * The user scrolls down the page
    * The favorite icon in product property is visible and active
    * User clicks on favorite asign
    * Verify the directed page is not wishlist
    * Driver turns off



