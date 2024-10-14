@US_26
Feature:As a registered user, I want to have a favorite products page on the site and I want to be able to manage this page.

  Background: User opens the app

    Given User makes driver adjustments
    When User confirms to be on the homepage
    Then User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    And User clicks the button with description "*Use Email Instead"
    And User enters the correct information "validEmail" and "validPassword"
    Then User clicks the button with description "Home"


  @TC_2601
  Scenario: Verify the Visibility and Activity of the Wishlist Icon on the Homepage

    Then Verifies "Wishlist" icon is visible
    And Driver turns off

  @TC_2602
  Scenario: Verify the Visibility and Activity of the Favourite Icon on Products

    Then Verifies that the user favourite icon is displayed
    Then Verifies that the product has been added to favourites
    And Driver turns off




