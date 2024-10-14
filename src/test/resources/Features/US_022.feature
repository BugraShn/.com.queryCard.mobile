Feature: Profile icon visibility test on homepage

  Background: User opens the app
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "mobileNumber" phone and "Password" password Login





  @TC2201
  Scenario: The profile icon should be visible on the homepage
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "mobileNumber" phone and "Password" password Login

    * User clicks the button with description "Profile"

  @TC2202
  Scenario:Logout link visibility test in profile dashboard sidebar
    * User clicks the button with description "Profile"
    * The "Logout" link should be visible in the profile dashboard sidebar
    @TC2203
    Scenario:By clicking on the Logout link, you should be able to return to the home page
      * User clicks the button with description "Profile"
      * The "Logout" link should be visible in the profile dashboard sidebar
      * The user clicks on the Logout button
      #hkhlkhlkjlkj



