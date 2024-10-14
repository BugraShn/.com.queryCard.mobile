Feature: As a user, I would like to have easy links in the bottom bar of the home page so that I can easily perform internal site operations.

  Background: User opens the app
    * User makes driver adjustments

  @tc0201
  Scenario:  Footer menu easy links visibility test

    * Verifies "Home" , "Category" , "Wishlist" and "Profile" easylinks are visible
    * Driver turns off

  @tc0202
  Scenario: Footer menu easy links redirect to the relevant page test

    * User clicks the button with description "Profile"
    * Verifies profile page is opens
    * User clicks the button with description "Wishlist"
    * Verifies sign in page is opens
    * User clicks the button with description "Category"
    * Verifies category page is opens
    * User clicks the button with description "Home"
    * Verifies home page is opens


  @tc0203
  Scenario Outline: Search text box functionality test

    * User clicks the search button
    * Enters "<items>" to search text box
    * Verifies that items are displayed

    Examples:
    |items   |
    |backpack|
    |shoe    |










