Feature: As a registered user, I would like to be able to see the categories and products of the Women menu on the home page.

  Background: User click the app
#    * go to home page as a user

@TC_1501
    Scenario:Women category window and subcategories should be displayed in the body section of the home page.

     * Verify the visibility of the Women icon on Homepage and click on it
     * Verify the visibility of the "Women Clothing" section
     * Verify the visibility of the "Woman Dresses - Skirts" section
     * Verify the visibility of the "Woman T-shirt" section
     * Verify the visibility of the "Woman Trousers" section
     * Verify the visibility of the "Woman Coat" section
     * Verify the visibility of the "Women Shoes" section
     * Verify the visibility of the "Women Casual Shoes" section
     * Verify the visibility of the "Women Classic Shoes" section
     * Verify the visibility of the "Women's Boots" section
     * Verify the visibility of the "Women Sneakers" section
     * Verify the visibility of the "Women Accessories" section
     * Verify the visibility of the "Women Bags" section
     * Verify the visibility of the "Women Watch" section
     * Verify the visibility of the "Women Jewelry" section

 @TC_1502
 Scenario: Add to Cart Test
  * Given User clicks on the Women icon
  * User clicks on a product on the page
  * User selects the size
  * User clicks on the "Add to Cart" button
  * User navigates to the cart in the top right corner
  * Verify that the product is added to the cart
  @TC_1503
   Scenario:  Remove Product from Cart Test
   * Given User clicks on the Women icon
   * User clicks on a product on the page
   * User selects the size
   * User clicks on the "Add to Cart" button
   * User navigates to the cart in the top right corner
   * User clicks on the "Remove" button under the added product
   * Verify that the product is removed from the cart
     @TC_1504
     Scenario: Add to Wishlist and View Wishlist Test
        * go to home page as a user
        * User clicks on the "Women Shoes" icon
        * User clicks on a product on the shoes page
        * User clicks on the "Favorite" icon
        * User navigates to the wishlist
        * Verify that the added product is visible in the wishlist
    @TC_1505
     Scenario:  Sort By  Testing
       * Given User clicks on the Women icon
        * User clicks on the Sort By icon
        * User selects "Newest" filter
        * Verify that the products on the page are sorted by newest
        * User clicks on the Sort By icon
        * User selects "Price Low to High" filter
        * Verify that products are sorted from lowest price to highest price
        * User clicks on the Sort By icon
        * User selects "Price High to Low" filter
        * Verify that products are sorted from highest price to lowest price
  @TC_1506
     Scenario: Brand Filtering functionality
        * Given User clicks on the Women icon
        * User clicks on the SortByHamburger By icon
        * User selects "Brands" filter
        * User selects "Nike" filter
        * Verify that only Nike products are displayed
  @TC_1507
     Scenario:Size Filter Test
   * Given User clicks on the Women icon
   * User clicks on the SortByHamburger By icon
   * User selects "Size" filter
    * Verify that only M size products are displayed
  @TC_1508
     Scenario:Color Filter Test
   * Given User clicks on the Women icon
   * User clicks on the SortByHamburger By icon
   * User selects "color" filter
   * Verify that only red-colored products are displayed







