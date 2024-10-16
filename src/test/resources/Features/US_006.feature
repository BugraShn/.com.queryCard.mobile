Feature: As a registered user, I want to be able to change my password when I forget it

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"

  @tc0601
  Scenario: Forgot password link test on the Sign In page

    * User verifies "Forgot Password" button is visible

  @tc0602
  Scenario: Password reset test by entering a valid e-mail

    * User clicks the button with description "Forgot Password"
    * User clicks the button with description "*Use Email Instead"
    * User sends "ggValidEmail" to email-phone box
    * User verifies "Get OTP" button is visible
    * User clicks the button with description "Get OTP"
    * User verifies Reset Password page opens
    * User resets own password

  @tc0603
  Scenario: Password reset test by entering an invalid e-mail

    * User clicks the button with description "Forgot Password"
    * User clicks the button with description "*Use Email Instead"
    * User sends "ggInvalidEmail" to email-phone box
    * User clicks the button with description "Get OTP"
    * User verifies that resetting password is not allowed with this "email"

  @tc0604
  Scenario: Password reset test by entering a valid phone number

    * User clicks the button with description "Forgot Password"
    * User sends "ggValidPhone" to email-phone box
    * User clicks the button with description "Get OTP"
    * User resets own password

  @tc0605
  Scenario: Password reset test by entering an invalid phone number

    * User clicks the button with description "Forgot Password"
    * User sends "ggInvalidPhone" to email-phone box
    * User clicks the button with description "Get OTP"
    * User verifies that resetting password is not allowed with this "phone"

  @tc0606
  Scenario: Back to Sign In link test

    * User clicks the button with description "Forgot Password"
    * User verifies "Back to sign in" button is visible
    * User clicks the button with description "Back to sign in"
    * Verifies sign in page is opens

