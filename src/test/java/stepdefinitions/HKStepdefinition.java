package stepdefinitions;

import io.cucumber.java.en.*;
import javax.sound.midi.InvalidMidiDataException;

import static utilities.OptionsMet.VerifyElementText;
import static utilities.OptionsMet.swipe;

public class HKStepdefinition extends BaseStep {


    /**
     US_05
     **/

    @When("Scrolls down the page until Popular Brands")
    public void scrolls_down_the_page_until_popular_brands() throws InvalidMidiDataException {

        PAGES.getHkPage().scrollPopularBrands();
    }

    @Then("Verifies that popular brands are displayed")
    public void verifies_that_popular_brands_are_displayed() throws InvalidMidiDataException {

        PAGES.getHkPage().verifyPopularBrands();
    }

    /**
     US_19
     **/

    @And("User adds new address {string} {string} {string} {string} {string} {string} {string} {string}")
    public void userAddsNewAddress(String fullName,String email,String phoneNumber,String country,String State,String city,String zipCode,String address) {
        PAGES.getHkPage().addAdress(fullName, email, phoneNumber, country, State, city, zipCode, address);
    }

    @Then("Verifies that added new address message displayed")
    public void verifiesThatAddedNewAddressMessageDisplayed() {

        PAGES.getHkPage().verifyAddressAddedSuccessMessage();
    }

    @Then("User verifies that the registered address is displayed")
    public void user_verifies_that_the_registered_address_is_displayed(){

        PAGES.getHkPage().verifyAddressDisplay();
    }

    @Then("User clicks Edit button")
    public void userClicksEditButton() {

        PAGES.getHkPage().clickEditButton();
    }

    @And("User edits address {string} {string} {string} {string} {string}")
    public void userEditsAddress(String fullName,String email,String phoneNumber,String zipCode,String address) {
        PAGES.getHkPage().editAdress(fullName, email, phoneNumber,zipCode, address);
    }

    @Then("Verifies that updated successfully message displayed")
    public void verifiesThatUpdatedSuccessfullyMessageDisplayed() {

        PAGES.getHkPage().verifyEditSuccessMessage();
    }

    @Then("User verifies that {string} is displayed")
    public void userVerifiesThatIsDisplayed(String description) {

        VerifyElementText(description);
    }

    @And("User scrolls down the page")
    public void userScrollsDownThePage() throws InvalidMidiDataException {

        swipe(670,2475,670,75);
    }

    @And("User enters the correct information {string} and {string}")
    public void userEntersTheCorrectInformationValidEmailAndValidPassword(String email,String password) {

        PAGES.getHkPage().loginWithEmail(email, password);
    }

    @Then("User navigates to a product page")
    public void user_navigates_to_a_product_page() {

        PAGES.getHkPage().clickFirstProduct();
    }

    @Then("User selects product size {string} information and quantity {int}")
    public void user_selects_product_size_information_and_quantity(String productSize, int productQuantity) throws InvalidMidiDataException {
        PAGES.getHkPage().selectSizeAndQuantity(productSize,productQuantity);
    }

    @Then("User clicks Chart button")
    public void user_clicks_chart_button() {
        PAGES.getHkPage().clickChartButton();
    }

    @Then("Verifies that no address error message displayed")
    public void verifiesThatNoAddressErrorMessageDisplayed() {
        PAGES.getHkPage().verifyNoAddressErrorMessage();
    }

    @Then("Verifies that user error messages are displayed")
    public void verifiesThatUserErrorMessagesAreDisplayed() {

        PAGES.getHkPage().verifyErrorMessageDisplayed();
    }

    /**
     US_25
     **/

    @And("User clicks on the eye mark to see the order summary")
    public void userClicksOnTheEyeMarkToSeeTheOrderSummary() {

        PAGES.getHkPage().clickOrder();
    }

    @Then("User verifies {string} displayed")
    public void userVerifiesDisplayed(String text) {

        PAGES.getHkPage().verifyWithDescription(text);
    }

    @Then("User fills important information")
    public void userFillsImportantInformation() {

        PAGES.getHkPage().fillReturnRequestInfo();
    }

    @Then("User verifies the presence of products in the return order")
    public void userVerifiesThePresenceOfProductsInTheReturnOrder() {

        PAGES.getHkPage().checkReturnOrderList();
    }

    /**
     US_26
     **/

    @Then("Verifies {string} icon is visible")
    public void verifiesIconIsVisible(String wishlist) {

        VerifyElementText(wishlist);
    }


    @Then("Verifies that the product has been added to favourites")
    public void verifiesThatTheProductHasBeenAddedToFavourites() {

        PAGES.getHkPage().checkWishlist();
    }


    @Then("Verifies that the user favourite icon is displayed and adds products")
    public void verifiesThatTheUserFavouriteIconIsDisplayedAndAddsProducts() {

        PAGES.getHkPage().verifyClickFavIcon();
    }

    @And("User deletes the product from favourites")
    public void userDeletesTheProductFromFavourites() {

        PAGES.getHkPage().clickWishlistFavIcon();
    }

    @Then("User confirms that the product has been deleted from favourites")
    public void userConfirmsThatTheProductHasBeenDeletedFromFavourites() {

        PAGES.getHkPage().verifyRemoveWishlistErrorMessage();
    }


}

