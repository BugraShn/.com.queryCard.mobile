
@US_021
Feature: As a registered user, I would like to be able to edit my profile information on the site

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneBsNumber" phone and "passwordBs" password Login
    * User confirms to be on the homepage

  @TC2101
  Scenario: Editing a Profile as a User

    * Clicks the profile button
    * Click on the Edit Profile text.
    * Enter the new "bsName2", new "bsMail2", new "phoneBsNumber" and is saved
