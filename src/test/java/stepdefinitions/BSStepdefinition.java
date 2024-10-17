package stepdefinitions;

import Page.BSPage;
import Page.QueryCardPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;
import javax.sound.midi.InvalidMidiDataException;


import static utilities.Driver.driver;
import static utilities.Driver.getAppiumDriver;

public class BSStepdefinition extends OptionsMet {

    BSPage page = new BSPage();
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());
    AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();


    @Given("Home page categories text is verified")
    public void home_page_categories_text_is_verified() {

        ReusableMethods.wait(10);
        Assert.assertTrue(page.homeCategoriesText.isDisplayed());

    }

    @Given("Category names are verified")
    public void category_names_are_verified() throws InvalidMidiDataException {

        Assert.assertTrue(page.categoriesMen.isDisplayed());
        ReusableMethods.wait(1);
        for (int i = 0; i < 14; i++) {
            OptionsMet.swipe(959, 885, 144, 885);
        }

        Assert.assertTrue(page.categoriesToys.isDisplayed());
    }

    @Given("Verifies profile button")
    public void verifies_profile_button() {
        Assert.assertTrue(page.homePageProfileButton.isDisplayed());
    }

    @Given("Clicks the profile button")
    public void clicks_the_profile_button() {
        page.homePageProfileButton.click();
    }

    @Given("On the page that opens, confirm the text Sign In To See Your Info")
    public void on_the_page_that_opens_confirm_the_text_sign_In_to_see_your_Info() {
        Assert.assertTrue(page.singInToSeeText.isDisplayed());
    }

    @Given("Sign Up the profile button")
    public void sign_up_the_profile_button() {
        page.signUpButton1.click();

    }

    @Given("Enter {string} , {string} , {string} into the form")
    public void enter_password_into_the_form(String name, String phone, String password) {
        page.SignInForm(name, phone, password);
    }

    @Given("The sign in page is verified.")
    public void the_sign_in_page_is_verified() {
        page.singUpButton2.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(page.signInText.isDisplayed());

    }

    @Given("Enter fake {string} , {string} , {string} into the form")
    public void enter_fake_password_into_the_form(String name, String phone, String password) {
        page.SignInForm(name, phone, password);
        ReusableMethods.wait(1);
        page.singUpButton2.click();
        ReusableMethods.wait(4);
        Assert.assertTrue(page.signUpButton1.isDisplayed());

    }

    @Given("Clicks the {string} button")
    public void clicks_the_button(String mainText) {
        ReusableMethods.wait(1);
        page.useEmailText.click();
        ReusableMethods.wait(1);
    }

    @Given("User click the button with Adidas Shoe")
    public void user_click_the_button_with_adidas_shoe() throws InvalidMidiDataException {
        OptionsMet.swipe(532, 1726, 532, 262);
        page.homePageadidasAyakkabi.click();
        ReusableMethods.wait(3);
    }


    @Given("Selects {string} and confirms the {string} text")
    public void selects_and_confirms_the_text(String detay, String productDetay) throws InvalidMidiDataException {
        OptionsMet.swipe(542, 1928, 542, 447);
        ReusableMethods.scrollAndClickByDescription(detay);
        ReusableMethods.scrollAndClickByDescription(productDetay);

    }

    @Given("Click on the Edit Profile text.")
    public void click_on_the_edit_profile_text() {
        Assert.assertTrue(page.editProfilText.isDisplayed());
        page.editProfilText.click();

    }

    @Given("Enter the new {string}, new {string}, new {string} and is saved")
    public void enter_the_new_new(String name, String mail, String phone) {
        page.ProfilEditBs(name, mail, phone);


    }

    // E2E stepleri //

    @Given("User click the button {string}")
    public void user_click_the_button(String category) {
        ReusableMethods.scrollAndClickByDescription(category);
    }

    @Given("Checks the functionality of the Women button and clicks it")
    public void checks_the_functionality_of_the_women_button_and_clicks_it() {
        OptionsMet.clickAndVerify(page.womencategory);

    }

    @Given("As a registered user, I want the filtering button to be active and visible.")
    public void as_a_registered_user_I_want_the_filtering_button_to_be_active_and_visible() {
        OptionsMet.clickAndVerify(page.filtreleme);
        OptionsMet.clickAndVerify(page.sortbyText);
        OptionsMet.clickAndVerify(page.topRated);
        ReusableMethods.wait(2);
    }

    @Given("User clicks the button with itemName Nike Air Force 1 Sneakers and added")
    public void user_clicks_the_button_with_item_name_and_and_added() throws InvalidMidiDataException {

        OptionsMet.swipe(528, 1844, 528, 700);
        ReusableMethods.wait(1);
        page.nikeayakkabi.click();

    }


    @Given("Selects the color of the shoe and adds it to the cart")
    public void selects_the_color_of_the_shoe_and_adds_it_to_the_cart() throws InvalidMidiDataException {

        OptionsMet.clickAndVerify(page.beyazrenk);
        OptionsMet.swipe(528, 1844, 528, 1300);
        ReusableMethods.wait(1);
        OptionsMet.clickAndVerify(page.addtoCard);
        ReusableMethods.wait(3);

    }

    @Given("Goes to cart and confirms it is the correct product")
    public void goes_to_cart_and_confirms_it_is_the_correct_product() {
        OptionsMet.clickAndVerify(page.sepet);
        Assert.assertTrue(page.sepettekiAyakkabi.isDisplayed());

    }

    @Given("Proceed to the payment page with the Proceed to Checkout button.")
    public void proceed_to_the_payment_page_with_the_Proceed_to_Checkout_button() {
        OptionsMet.clickAndVerify(page.proceedCheckout);

    }

    @Given("Selects the address and clicks Save & Share button")
    public void selects_the_address_and_clicks_save_share_button() throws InvalidMidiDataException {
        OptionsMet.clickAndVerify(page.deliveryButton);
        OptionsMet.clickAndVerify(page.houseadress);
        OptionsMet.swipe(528, 1844, 528, 1300);
        OptionsMet.clickAndVerify(page.saveandPay);


    }

    @Given("Select cash and delivery and complete the order")
    public void select_cash_and_delivery_and_complete_the_order() {
        OptionsMet.clickAndVerify(page.cashonDelivery);
        OptionsMet.clickAndVerify(page.confirmOrder);
        ReusableMethods.wait(10);
        Assert.assertTrue(page.thankyouOrder.isDisplayed());

        String message = page.okayPicture.getAttribute("contentDescription");
        driver.sendSMS("12345678911",message+"Siparişiniz verilmiştir. Bizimle olduğunuz için teşekkür ederiz <Team 2>");
        ReusableMethods.wait(2);

    }


}






