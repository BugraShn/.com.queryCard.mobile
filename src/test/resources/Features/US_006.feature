Feature: As a registered user, I want to be able to change my password when I forget it

  Background: User opens the app
    * User makes driver adjustments

  @tc0601
  Scenario: Forgot password link test on the Sign In page

    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User verifies "Forgot Password" button is visible

