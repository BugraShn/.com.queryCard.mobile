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

import static utilities.Driver.driver;
import static utilities.Driver.getAppiumDriver;

public class GCAOrderHistoryStepdefinitions extends OptionsMet {
    GCAPage gcaPage = new GCAPage();
    Actions actions = new Actions(getAppiumDriver());
    TouchAction action = new TouchAction<>((PerformsTouchActions) driver);

//    @Given("Click on the user icon")
//    public void click_on_the_user_icon() {
//
//    }

    @Given("Verify the visibility of the {string} menu item")
    public void verify_the_visibility_of_the_menu_item(String string) {
        ReusableMethods.wait(10);
        Assert.assertTrue(gcaPage.orderHistoryIcon.isDisplayed());
    }

    @Given("Click on the {string} menu item")
    public void click_on_the_menu_item(String string) {
        ReusableMethods.wait(5);
        OptionsMet.clickAndVerify(gcaPage.orderHistoryIcon);

    }

    @Given("Verify the shopping history is displayed on the page")
    public void verify_the_shopping_history_is_displayed_on_the_page() {
        ReusableMethods.wait(10);
        Assert.assertTrue(gcaPage.orderHistoryShopping1.isDisplayed());
    }

    @Given("Navigate to the {string} page")
    public void navigate_to_the_page(String string) {

    }

    @Given("Click on the shopping")
    public void click_on_the_shopping() throws InvalidMidiDataException {
        OptionsMet.clickAndVerify(gcaPage.orderHistoryShopping1);
         OptionsMet.swipe(480,2075,480,846);

    }

    @Given("Click on the Download Receipt icon")
    public void click_on_the_download_receipt_icon() {
        OptionsMet.clickAndVerify(gcaPage.downloadReceiptIcon);
    }

    @Given("Verify the visibility of the invoice")
    public void verify_the_visibility_of_the_invoice() {
        Assert.assertTrue(gcaPage.printReceipt.isDisplayed());

    }

    @Given("Click on the red icon under the Action menu and verify the visibility of the opened popup")
    public void click_on_the_red_icon_under_the_action_menu_and_verify_the_visibility_of_the_opened_popup() {

    }

    @Given("Click on the View icon")
    public void click_on_the_view_icon() {

    }

    @Given("Click on the {string} icon")
    public void click_on_the_icon(String string) {

    }

    @Given("Verify that the {string} popup appears")
    public void verify_that_the_popup_appears(String string) {

    }

}
