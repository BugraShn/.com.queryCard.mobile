Feature: As a registered user, I want to change my password on my dashboard page

  Background: User opens the app

    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with description "*Use Email Instead"
    * Enters "ggValidEmail" to Email text box
    * Enters "ggValidPass" to Password text box
    * User clicks the button "signInLoginButton"
    * User clicks the button with description "Profile"

  @tc2001
  Scenario: Change password link visibilty test

    * User verifies "Change Password" button is visible


  @tc2002
  Scenario: Change password page form visibilty test

    * User clicks the button with description "Change Password"
    * User verifies old password box is displayed
    * User verifies new password box is displayed
    * User verifies confirm password box is displayed
    * User verifies "Save Changes" button is visible


  @tc2003
  Scenario: Change password test with correct current password

    * User clicks the button with description "Change Password"
    * User enters "ggValidPass" to old password box
    * User enters "1234567" to new password box and confirm
    * User clicks the button with description "Save Changes"
    * User verifies that the password has been changed


  @tc2004
  Scenario: Change password test with incorrect current password

    * User clicks the button with description "Change Password"
    * User enters "ggInvalidPass" to old password box
    * User enters "1234567" to new password box and confirm
    * User clicks the button with description "Save Changes"
    * User verifies that the password has not been changed


    
