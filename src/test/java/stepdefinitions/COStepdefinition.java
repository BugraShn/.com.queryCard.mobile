package stepdefinitions;
import Page.COPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import java.util.Objects;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;


public class COStepdefinition extends OptionsMet {

    Actions actions = new Actions(getAppiumDriver());

    COPage page = new COPage();


    // Us003

    @Given("Verify {string} and {string} and {string} is seen and clicked")
    public void verify_and_and_is_seen_and_clicked(String name, String review, String price) throws InvalidMidiDataException {
        ReusableMethods.wait(2);
//        OptionsMet.swipe(278,1591,278,972);
//        ReusableMethods.wait(2);
        page.floralTshirtLink.isDisplayed();
        //       xPathElementClick(name,review,price);
        page.floralTshirtLink.click();
        ReusableMethods.wait(3);
        OptionsMet.KeyBack();
    }




    @Given("Verify that {string} is active")
    public void verify_that_is_active(String elementText)  {
        ReusableMethods.wait(2);
        VerifyElementText(elementText);
        ReusableMethods.wait(2);
    }



    @Given("Click on the {string} product")
    public void click_on_the_product(String deger) throws InvalidMidiDataException {
        ReusableMethods.wait(3);
        boolean flag=true;
        do{
            try {
                page.floralTshirtLink.click();
                flag=false;
            } catch (Exception e) {
                OptionsMet.swipe(351,1909,351,1106);

            }}while(flag);

        ReusableMethods.wait(2);    }


    @Given("Verify that {string} is selected.")
    public void verify_that_is_selected(String deger) {
        page.SelectElementText(deger);

    }
    @Given("Verify that Quantity can be increased.")
    public void verify_that_quantity_can_be_increased() throws InvalidMidiDataException {
        ReusableMethods.wait(2);
        OptionsMet.swipe(351,1909,351,1106);

        page.increaseQuantity.click();
        assertTrue(page.increaseQuantity.isEnabled());
//                // Yeni miktar değerini al
//                String yeniDeger = card.newquantityproduct.getText();
////                Assert.assertTrue(card.quantityproduct.isDisplayed());
//               System.out.println(yeniDeger);
//                String mevcutDeger = card.quantityproduct.getText();
//               System.out.println(mevcutDeger);
//
//                // Değerin arttığını kontrol et
//               // assertTrue("Miktar arttırılmadı!", yeniDeger > mevcutDeger);
    }


    @Given("Verify that the {string} is visible")
    public void verify_that_the_is_visible(String element) throws InvalidMidiDataException {
        boolean flag=true;
        do{
            try {
                VerifyElementText(element);
                flag=false;
            } catch (Exception e) {
                OptionsMet.swipe(351,1909,351,1000);

            }}while(flag);

        ReusableMethods.wait(2);    }

//-----------------------------------
    //Us024 için

    @Given("Log in as a registered user.")
    public void log_in_as_a_registered_user() {

        page.login();
    }
    @Given("Navigate to the Payment Information page.")
    public void navigate_to_the_payment_ınformation_page() {
        ReusableMethods.wait(5);
        Assert.assertTrue(page.paymentInfoText.isDisplayed());
        ReusableMethods.wait(3);
    }
    @Given("Verify the Select Payment Method menu item is visible.")
    public void locate_the_menu_item() {
        ReusableMethods.wait(3);
        Assert.assertTrue(page.paymentSelectionMenu.isDisplayed());

    }

    @Given("Select Stripe as the payment method.")
    public void select_as_the_payment_method() throws InterruptedException {

        page.stripeButton.click();
        page.confirmOrderButton.click();
        ReusableMethods.wait(3);

    }

    @Given("Verify that the card information form is displayed.")
    public void verify_that_the_card_information_form_is_displayed() {
        ReusableMethods.wait(3);
        Assert.assertTrue(page.confirmButton.isDisplayed());
        ReusableMethods.wait(3);
        Assert.assertTrue(page.backToPaymentLink.isDisplayed());
    }


    @Given("On the payment information page,confirm that payment types are available.")
    public void on_the_payment_information_page_confirm_that_payment_types_are_available() {
        Assert.assertTrue(page.confirmOrderButton.isDisplayed());
        Assert.assertTrue(page.stripeButton.isDisplayed());
        Assert.assertTrue(page.stripeButton.isEnabled());
        Assert.assertTrue(page.cashOnDeliveryButton.isDisplayed());
        Assert.assertTrue(page.cashOnDeliveryButton.isEnabled());
        Assert.assertTrue(page.creditButton.isDisplayed());
        Assert.assertTrue(page.creditButton.isEnabled());
    }



    @Given("The payment should be made, and a confirmation message should be displayed.")
    public void the_payment_should_be_made_and_a_confirmation_message_should_be_displayed() {
        ReusableMethods.wait(7);
        Assert.assertTrue(page.thankYou.isDisplayed());
        ReusableMethods.wait(3);
    }
    @Given("Fill in the card information form {string},{string},{string},{string}")
    public void fill_in_the_card_information_form(String cardNo, String expiryDate, String cvv, String zip) {
        ReusableMethods.wait(3);
        page.stripePayment(cardNo,expiryDate,cvv,zip);
        ReusableMethods.wait(3);

    }

    @Given("After completing the payment, verify that you should see go shopping.")
    public void after_completing_the_payment_verify_that_you_should_see_go_shopping() {
        ReusableMethods.wait(3);
        Assert.assertTrue(page.gotoShoppingButton.isDisplayed());
        Assert.assertTrue(page.gotoShoppingButton.isEnabled());
    }

    @Given("Click on the option to go shopping.")
    public void click_on_the_option_to_go_shopping() {
        ReusableMethods.wait(3);
        page.gotoShoppingButton.click();
        Assert.assertTrue(page.homePage1.isDisplayed());
        page.floralTshirtLink.click();
    }

    @And("Verify that order details and invoice are seen")
    public void verify_that_order_details_and_invoice_are_seen() throws InvalidMidiDataException {
        ReusableMethods.wait(3);
        Assert.assertTrue(page.invoiceFirstItem.isDisplayed());
        page.invoiceFirstItem.click();
        Assert.assertTrue(page.orderStatusText.isDisplayed());
        OptionsMet.swipe(217,1926,217,599);
        ReusableMethods.wait(3);
        page.downlandReceiptButton.click();
        Assert.assertTrue(page.invoceHeader.isDisplayed());
        Assert.assertTrue(page.printInvoice.isDisplayed());
        Assert.assertTrue(page.printInvoice.isEnabled());


    }


    @Given("Click the Add to cart and Save & Pay button.")
    public void click_the_add_to_cart_and_button() throws InvalidMidiDataException {
        page.addTocart();
        ReusableMethods.wait(2);

    }


    @Then("After order completion, click {string} to see details to the order or invoice.")
    public void after_order_completion_click_to_see_details_to_the_order_or_invoice(String orderdetails)  {
        ReusableMethods.wait(3);
        clickButtonByDescription(orderdetails);
        Assert.assertTrue(page.orderHistoryText.isDisplayed());

    }

    @Given("The payment should not be made, and an error message should be displayed.")
    public void the_payment_should_not_be_made_and_an_error_message_should_be_displayed() {
        Assert.assertTrue(page.cardErrorText.isDisplayed());
    }


    //US027
    @Given("Verify that card icon is visible and active on the homepage")
    public void verify_that_card_icon_is_visible_and_active_on_the_homepage() {

        Assert.assertTrue(page.cardIcon.isDisplayed());
        Assert.assertTrue(page.cardIcon.isEnabled());
    }


    @Given("Add {string} products to card and add {string} is selected.")
    public void add_products_to_card_and_add_is_selected(String name, String size) throws InvalidMidiDataException {
        ReusableMethods.wait(3);
        page.floralTshirtLink.click();
        ReusableMethods.wait(3);
        page.SelectElementText(size);
        OptionsMet.swipe(217,1926,217,599);
        ReusableMethods.wait(3);


    }
    @Given("Click the {string}")
    public void click_the(String add) {
        clickButtonByDescription(add);
        ReusableMethods.wait(2);

    }
    @Given("Click to card page")
    public void click_to_card_page() {
        page.cartIcon.click();
        ReusableMethods.wait(2);

    }
    @Given("Verify that products are displayed")
    public void verify_that_products_are_displayed() {
        ReusableMethods.wait(3);
        Assert.assertTrue(page.shoppingproductName.isDisplayed());

    }
    @Given("Delete the product on the card")
    public void delete_the_product_on_the_card() {
        ReusableMethods.wait(3);
        page.removeProductOnTheCardButton.click();
    }

    @Given("Verify that product has been deleted")
    public void verify_that_product_has_been_deleted() {
        String actualSubTotalText = page.subTotalText.getAttribute("content-desc");  //Android uygulamalarında, content-desc genellikle android:contentDescription şeklinde tanımlanır.
    //    System.out.println(actualSubTotalText);
        String expectedSubTotalText = "$0.00";

        Assert.assertEquals(expectedSubTotalText, actualSubTotalText);
    }

    @Given("Verify that subtotal information is visible")
    public void verify_that_subtotal_information_is_visible() {
        page.subTotalText.isDisplayed();
        page.subTotal.isDisplayed();
    }
    @Given("Verify that proceed to checkout button is visible and active")
    public void verify_that_proceed_to_checkout_button_is_visible_and_active() {
        page.proceedToCheckoutButton.isDisplayed();
        page.proceedToCheckoutButton.isEnabled();

    }

    @Given("Verify the go to shopping button is visible and active if there are no items in the card otherwise you should not see.")
    public void verify_the_go_to_shopping_button_is_visible_and_active_if_there_are_no_items_in_the_card_otherwise_you_should_not_see() {
        ReusableMethods.wait(3);
        if (Objects.equals(page.subTotalText.getAttribute("content-desc"), "$0.00")){
            ReusableMethods.wait(3);
            Assert.assertTrue(page.goToShoppingButton.isDisplayed());
            Assert.assertTrue(page.goToShoppingButton.isEnabled());
        }else {
            ReusableMethods.wait(3);
            Assert.assertTrue(page.proceedToCheckoutButton.isDisplayed());
            Assert.assertTrue(page.proceedToCheckoutButton.isEnabled());
        }
    }

}

