Feature: As a registered user, I would like to have a page in my Dashboard where I can view my shopping history
  @TC_1801
  Scenario: Order History menu item should be visible and active in Dashboard sideBar.
    * go to home page as a user
    * the user clicks on the user icon
    * Verify the visibility of the "Order History" menu item
    * Click on the "Order History" menu item
    * Verify the shopping history is displayed on the page
  @TC_1802
  Scenario: Order invoice should be accessible from Order History list.
    * go to home page as a user
    * the user clicks on the user icon
    * Verify the visibility of the "Order History" menu item
    * Click on the "Order History" menu item
    * Click on the shopping
    * Click on the Download Receipt icon
    * Verify the visibility of the invoice

    @TC_1803
   Scenario: Order should be canceled from Order History list
      * go to home page as a user
      * the user clicks on the user icon
      * Click on the "Order History" menu item
      * Click on the red icon under the Action menu and verify the visibility of the opened popup
      * Click on the "Cancel Order" icon
      * Verify the visibility of the Successfully message

