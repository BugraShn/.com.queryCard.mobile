@US_19
Feature:As a registered user, I would like to have a page on the site where I can select and manage my address information before completing the payment.

  Background: User opens the app
    Given User makes driver adjustments
    When User confirms to be on the homepage
    Then User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    And User clicks the button with description "*Use Email Instead"
    And User enters the correct information "validEmail" and "validPassword"
    Then User clicks the button with description "Home"
    Then User navigates to a product page
    And User selects product size "M" information and quantity 1
    Then User clicks the button with description "Add To Cart"
    And User clicks Chart button
    And User clicks the button with description "Proceed to Checkout"

  @TC_1903
  Scenario: Adding address test

    And User clicks the button with description "Add"
    And User adds new address "John Doe" "johndoe@gmail.com" "5555555555" "Germany" "Berlin" "Berlin" "12345" "Berlin Street"
    Then Verifies that added new address message displayed
    And Driver turns off

  @TC_1901
  Scenario: Address display test

    Then User verifies that the registered address is displayed
    And Driver turns off

  @TC_1902
  Scenario: Address editing test

    And User clicks the button with description "Edit"
    Then User clicks Edit button
    And User edits address "John Doe" "johndoe@gmail.com" "5555555555" "12345" "Berlin Street"
    Then Verifies that updated successfully message displayed
    And Driver turns off

  @TC_1904
  Scenario: Visibility and Activity of ‘Delivery’ and ‘Pick Up’ Buttons, Order Summary Display, and ‘Save & Pay’ Button

    Then User verifies that "Delivery" is displayed
    Then User verifies that "Pick Up" is displayed
    And User scrolls down the page
    Then User verifies that "Order Summary" is displayed
    Then User verifies that "Save & Pay" is displayed
    And Driver turns off

  @TC_1905
  Scenario:Save&Pay button click test without address

    And User clicks the button with description "Save & Pay"
    Then Verifies that no address error message displayed

  @TC_1906
  Scenario: Address without entering the necessary information

    And User clicks the button with description "Add"
    And User adds new address "" "johndoegmail.com" "" "Germany" "Berlin" "Berlin" "" ""
    Then Verifies that user error messages are displayed
    And Driver turns off

















