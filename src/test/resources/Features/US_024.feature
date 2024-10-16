
Feature: As a registered user, I want to have a payment page where I can pay for my orders that I control.

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * Log in as a registered user.



Scenario:TC001 Payment Method Selection

  * Click on the "Flower Print Foil T-shirt" product
  * Verify that "S" is selected.
  * Verify that the "Add To Cart" is visible
  * Verify that "Add To Cart" is active
  * Click the Add to cart and Save & Pay button.
  * Navigate to the Payment Information page.
  * Driver turns off



Scenario:TC002 Stripe payment method form availability and payment types availability
  * Click on the "Flower Print Foil T-shirt" product
  * Verify that "S" is selected.
  * Verify that the "Add To Cart" is visible
  * Verify that "Add To Cart" is active
  * Click the Add to cart and Save & Pay button.
  * Navigate to the Payment Information page.
  * Verify the Select Payment Method menu item is visible.

  * On the payment information page,confirm that payment types are available.
  * Driver turns off


Scenario:TC003  Entering Stripe Card Information and Payment positive case
  * Click on the "Flower Print Foil T-shirt" product
  * Verify that "S" is selected.
  * Verify that the "Add To Cart" is visible
  * Verify that "Add To Cart" is active
  * Click the Add to cart and Save & Pay button.

  * Select Stripe as the payment method.
  * Verify that the card information form is displayed.
  * Fill in the card information form "<cardNo>","<expiryDate>","<CVV>","<Zip>"
  * The payment should be made, and a confirmation message should be displayed.
  * Driver turns off

  Examples:
    | cardNo             | expiryDate | CVV    | Zip   |
    | 4111 1111 1111 1111 | 1225       | 123   | 45678 |


Scenario: TC004 Stripe Payment Method Shopping
  * Click on the "Flower Print Foil T-shirt" product
  * Verify that "S" is selected.
  * Verify that the "Add To Cart" is visible
  * Verify that "Add To Cart" is active
  * Click the Add to cart and Save & Pay button.

  * Select Stripe as the payment method.
  * Fill in the card information form "<cardNo>","<expiryDate>","<CVV>","<Zip>"
  * After completing the payment, verify that you should see go shopping.
  * Click on the option to go shopping.
  * Driver turns off

  Examples:
    | cardNo             | expiryDate | CVV    | Zip   |
    | 4111 1111 1111 1111 | 1225       | 123   | 45678 |



Scenario: TC005 Stripe Payment Method Order Details and Invoice
  * Click on the "Flower Print Foil T-shirt" product
  * Verify that "S" is selected.
  * Verify that the "Add To Cart" is visible
  * Verify that "Add To Cart" is active
  * Click the Add to cart and Save & Pay button.

  * Select Stripe as the payment method.
  * Fill in the card information form "<cardNo>","<expiryDate>","<CVV>","<Zip>"

  * After order completion, click "Go to order details" to see details to the order or invoice.
  * Verify that order details and invoice are seen

  Examples:
    | cardNo              | expiryDate | CVV    | Zip   |
    | 4111 1111 1111 1111 | 1225       | 123    | 45678 |



  Scenario:TC006  Entering Stripe Card Information and Payment negative case(Invalid card)
    * Click on the "Flower Print Foil T-shirt" product
    * Verify that "S" is selected.
    * Verify that the "Add To Cart" is visible
    * Verify that "Add To Cart" is active
    * Click the Add to cart and Save & Pay button.

    * Select Stripe as the payment method.
    * Fill in the card information form "<cardNo>","<expiryDate>","<CVV>","<Zip>"
    * The payment should not be made, and an error message should be displayed.
    * Driver turns off

    Examples:
      | cardNo              | expiryDate | CVV    | Zip   |
      | 4111 1111 1111 1112 | 1225       | 123   | 45678 |