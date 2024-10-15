
@QWERT
Feature: Profile icon should be visible and active on the home page.

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "mobileNumber" phone and "Password" password Login
    * User confirms to be on the homepage

  @TC1601
  Scenario: Visibility test of the profile icon on the homepage
    * User clicks the button with description "Profile"

  @TC1602
  Scenario:Visibility and functionality test of the My Account menu
    * User clicks the button with description "Profile"
    * User clicks the button with description "My Account"

  @TC1603
  Scenario: Visibility test of menu titles containing user information on the My Account page
    * User clicks the button with description "Profile"
    * User clicks the button with description "My Account"
    * On the My Account page, the user should be able to see the menu titles with his information
    * Driver turns off



