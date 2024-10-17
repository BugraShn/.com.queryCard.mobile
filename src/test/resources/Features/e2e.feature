
@E2E
Feature: As a registered user, you should purchase sneakers from the site's popular products.

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "e2eNumber" phone and "e2ePassword" password Login
    * User confirms to be on the homepage

  Scenario: Order a popular sneaker from the Women category

    * User click the button "Category"
    * Checks the functionality of the Women button and clicks it
    * As a registered user, I want the filtering button to be active and visible.
    * User clicks the button with itemName Nike Air Force 1 Sneakers and added
    * Selects the color of the shoe and adds it to the cart
    * Goes to cart and confirms it is the correct product
    * Proceed to the payment page with the Proceed to Checkout button.
    * Selects the address and clicks Save & Share button
    * Select cash and delivery and complete the order
    * Driver turns off

