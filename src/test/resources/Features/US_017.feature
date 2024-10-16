Feature: As a registered user, I would like to have a page on the site where I can manage my address information
  @TC_1701
  Scenario: Address menu item should be visible and active in Dashboard sideBar
    * go to home page as a user
    * the user clicks on the user icon
    * the Address Icon is visible and clicked
    * the "Add New Address" button is visible on the opened page

  @TC_1702
  Scenario: Registered addresses should be visible, editable and deleteable on the Address page
    * go to home page as a user
    * the user clicks on the user icon
    *  user navigates to the address page
    *  user clicks on "Edit" in the top right corner of the address
    *  user enters an email address in the email field
    *  user clicks on the "Update Address" icon
    *  visibility of the "Success" message is verified
    *  visibility of the "Delet" in the top right corner of the address and clicked
    *  visibility of the Are you sure to Delete? popup is verified

  @TC_1703
  Scenario: Add New Address button should be visible and active
    * go to home page as a user
    * the user clicks on the user icon
    * user navigates to the address page
    * Click on the "Add New Address" button
    * Enter the full name into the "Full Name" field
    * Enter a phone number into the "Phone" field
    * Enter  into the Country field
    * Enter  into  State field
    * Enter the city into the City field
    * Enter the address into the Street Address field
    * Click on the Add Address icon
    * Verify the visibility of the "Successfully" message



