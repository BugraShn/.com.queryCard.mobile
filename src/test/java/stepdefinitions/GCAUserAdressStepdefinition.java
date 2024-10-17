package stepdefinitions;

import Page.GCAPage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;
import static utilities.Driver.getAppiumDriver;

public class GCAUserAdressStepdefinition extends OptionsMet {
    GCAPage gcaPage = new GCAPage();
    Actions actions = new Actions(getAppiumDriver());
    TouchAction action = new TouchAction<>((PerformsTouchActions) driver);

    @Given("the user clicks on the user icon")
    public void the_user_clicks_on_the_user_icon() {
        ReusableMethods.wait(3);
        gcaPage.ProfileButton.click();

    }

    @Given("the Address Icon is visible and clicked")
    public void the_address_icon_is_visible_and_clicked() {
        OptionsMet.clickAndVerify(gcaPage.adressButton);
    }

    @Given("the {string} button is visible on the opened page")
    public void the_button_is_visible_on_the_opened_page(String string) {
        ReusableMethods.wait(10);
        Assert.assertTrue(gcaPage.oldAdress.isDisplayed());
    }

    @Given("user navigates to the address page")
    public void user_navigates_to_the_address_page() {
        OptionsMet.clickAndVerify(gcaPage.adressButton);
    }

    @Given("user clicks on {string} in the top right corner of the address")
    public void user_clicks_on_in_the_top_right_corner_of_the_address(String string) {
        ReusableMethods.wait(5);
        OptionsMet.clickAndVerify(gcaPage.AddressEditIcon);
    }
    @Given("user enters an email address in the email field")
    public void user_enters_an_email_address_in_the_email_field() {
        ReusableMethods.wait(3);
        String emailaddress = "haticebetul018@gmail.com" ;
        OptionsMet.clickAndSendKeys(gcaPage.AddressEmailEditText,emailaddress);
        ReusableMethods.wait(5);
        OptionsMet.KeyBack();

    }
    @Given("user clicks on the {string} icon")
    public void user_clicks_on_the_icon(String string) {
        ReusableMethods.wait(3);
        Assert.assertTrue(gcaPage.updateAddressIcon.isDisplayed());
        gcaPage.updateAddressIcon.click();

    }
    @Given("visibility of the {string} message is verified")
    public void visibility_of_the_message_is_verified(String string) {
   //succes yazisi görünürlük testi
//        OptionsMet.VerifyElementText(string);
        assertTrue(gcaPage.succesfullyUpdate.isDisplayed());
    }
    @Given("visibility of the {string} in the top right corner of the address and clicked")
    public void visibility_of_the_in_the_top_right_corner_of_the_address_and_clicked(String string) {
     OptionsMet.clickAndVerify(gcaPage.AddressDeleteIcon);
     ReusableMethods.wait(2);
    }
    @Given("visibility of the Are you sure to Delete? popup is verified")
    public void visibility_of_the_are_you_sure_to_delete_popup_is_verified() {
        Assert.assertTrue(gcaPage.AddressDeleteAreYouSureIcon.isDisplayed());
        OptionsMet.KeyBack();


    }
/////////////////////////////////////////////////////////////////////////////////////////

//    @Given("Navigate to the address page")
//    public void navigate_to_the_address_page() {
//
//    }
    @Given("Click on the {string} button")
    public void click_on_the_button(String string) {
    OptionsMet.clickAndVerify(gcaPage.addNewAdressButton);
        ReusableMethods.wait(4);
    }
    @Given("Enter the full name into the {string} field")
    public void enter_the_full_name_into_the_field(String string) {
        ReusableMethods.wait(2);
        String fullname="Mehmet Ozdemir";
    OptionsMet.clickAndSendKeys(gcaPage.newAddressFullNameText,fullname);
        ReusableMethods.wait(2);
    }
    @Given("Enter a phone number into the {string} field")
    public void enter_a_phone_number_into_the_field(String string) {
        String phone="12512556";
        OptionsMet.clickAndSendKeys(gcaPage.newAddressPhoneText,phone);
        ReusableMethods.wait(2);
    }
    @Given("Enter  into the Country field")
    public void enter_into_the_field() {
        OptionsMet.clickAndVerify(gcaPage.newAddressCountryText);
        ReusableMethods.scrollAndClickByDescription("Albania");

//        String country="United States";
//        OptionsMet.clickAndSendKeys(gcaPage.newAddressCountryText,country);
//        gcaPage.newAddressCountryText.click();
        ReusableMethods.wait(2);

    }
    @Given("Enter  into  State field")
    public void enter_the_city_into_the_field() {
        String state="Berat County";
     OptionsMet.clickAndVerify(gcaPage.newAddressStateText);
        ReusableMethods.scrollAndClickByDescription("Berat District");
        ReusableMethods.wait(2);
    }
    @Given("Enter the city into the City field")
    public void enter_the_address_into_the_field() {
        String city="Banaj";
        OptionsMet.clickAndVerify(gcaPage.newAddressCityText);
        ReusableMethods.scrollAndClickByDescription("Banaj");
        ReusableMethods.wait(2);
    }
    @Given("Enter the address into the Street Address field")
    public void enter_the_theStreetAdress_icon() throws InvalidMidiDataException, InterruptedException {
        OptionsMet.swipe(484,1303,484,741);
        ReusableMethods.wait(2);
        String streetAdress="Freedom";
//        ReusableMethods.koordinatTiklamaMethodu(218, 1208);
        ReusableMethods.wait(4);
        OptionsMet.clickAndSendKeys(gcaPage.newStreetAddressText,streetAdress);

        ReusableMethods.wait(2);
    }
    @Given("Click on the Add Address icon")
    public void click_on_the_icon() {
        OptionsMet.clickAndVerify(gcaPage.AddAddressIcon);
    }
    @Given("Verify the visibility of the {string} message")
    public void verify_the_visibility_of_the_message(String string) {
        assertTrue(gcaPage.succesfullyAdressAdded.isDisplayed());
        ReusableMethods.wait(2);
    }



}
