@US_025
Feature: As a registered user, I would like to have a page about the orders I want to return and be able to manage my product returns.

  Background: User opens the app

    Given User makes driver adjustments
    When User confirms to be on the homepage
    Then User clicks the button with description "Profile"
    And User clicks the button with description "Sign In"
    And User clicks the button with description "*Use Email Instead"
    And User enters the correct information "hkValidEmail" and "hkValidPassword"
    Then User clicks the button with description "Profile"


  @TC_2501
  Scenario:Verify Return Request Button Visibility and Activity on Delivered Order

    And User clicks the button with description "Order History"
    And User clicks on the eye mark to see the order summary
    Then User verifies "Return Request" displayed

  @TC_2502
  Scenario:Select Product for Return, Add Return Reason, Note, and Attachment, and Verify Return Request Button Visibility and Activity

    And User scrolls down the page
    And User clicks the button with description "Return Request"
    Then User fills important information
    And User clicks the button with description "Return Request"

  @TC_2502
  Scenario:

    And User clicks the button with description "Return Orders"
    Then User verifies the presence of products in the return order
    