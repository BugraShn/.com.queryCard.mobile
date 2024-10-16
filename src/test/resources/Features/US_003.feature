@a
Feature: As a user, I want to be able to browse, select and add products to the cart without registering on the site.

  Background: User opens the app
    * User makes driver adjustments

Scenario: TC_01 Products and product features should be visible on the homepage
  * User confirms to be on the homepage
  * Verify "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" is seen and clicked
  * Verify that the "Blossom Boutique" is visible
  * Driver turns off

Scenario: TC_02 Size/color and quantity,add to cart features of the selected product must be selectable
  * User confirms to be on the homepage
  * Click on the "Flower Print Foil T-shirt" product
  * Verify that "Quantity:" is active
  * Verify that "Size:" is active
 # * Verify that "Color:" is active
  * Verify that "S" is selected.
  * Verify that Quantity can be increased.
  * Verify that the "Add To Cart" is visible
  * Verify that "Add To Cart" is active

