
Feature: As a registered user, I want to have a cart on the site and I want to be able to manage these cart operations



  Background:
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * Log in as a registered user.

  Scenario: TC_001 Verify the cart icon is visible and active on the homepage.
    * Verify that card icon is visible and active on the homepage
    * Driver turns off

  Scenario: TC002 Verify products are displayed in the cart and should be deleted.
    * Add "Flower Print Foil T-shirt" products to card and add "S" is selected.
    * Click the "Add To Cart"
    * Click to card page
    * Verify that products are displayed
    * Delete the product on the card
    * Verify that product has been deleted
    * Verify the go to shopping button is visible and active if there are no items in the card otherwise you should not see.
    * Driver turns off

  @b
  Scenario: TC003 Verify the subtotal information is visible on the Shopping Card page.
    * Add "Flower Print Foil T-shirt" products to card and add "S" is selected.
    * Click the "Add To Cart"
    * Click to card page
    * Verify that subtotal information is visible
    * Verify that proceed to checkout button is visible and active
    * Driver turns off


