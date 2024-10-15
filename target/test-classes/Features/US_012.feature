@US_012
Feature: As a user, I want to be able to access detailed information about the product I have selected on the page

  Background: User opens the app

    * User makes driver adjustments
    * User confirms to be on the homepage

  @TC_1201
  Scenario: Click on Details and Product Details will be verified.

    * User click the button with Adidas Shoe
    * Selects "Details" and confirms the "Product Details" text

  @TC_1202
  Scenario: Click on Videos and Product Videos will be verified.
    * User click the button with Adidas Shoe
    * Selects "Videos" and confirms the "Product Videos" text

  @TC_1203
  Scenario: Click on Review and Product Reviews will be verified.
    * User click the button with Adidas Shoe
    * Selects "Review" and confirms the "Product Reviews" text

  @TC_1204
  Scenario: Click on Shipping & Return and Shipping & Return will be verified.
    * User click the button with Adidas Shoe
    * Selects "Shipping & Return" and confirms the "Shipping & Return" text


