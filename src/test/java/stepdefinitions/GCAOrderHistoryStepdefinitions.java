package stepdefinitions;

import Page.GCAPage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
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
        ReusableMethods.wait(5);

    }

    @Given("Verify the shopping history is displayed on the page")
    public void verify_the_shopping_history_is_displayed_on_the_page() {
        ReusableMethods.wait(10);
        Assert.assertTrue(gcaPage.orderHistoryShopping1.isDisplayed());
    }


    @Given("Click on the shopping")
    public void click_on_the_shopping() throws InvalidMidiDataException {
      ReusableMethods.orderHistoryKoordinatTiklama();
        ReusableMethods.wait(2);
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
    public void click_on_the_red_icon_under_the_action_menu_and_verify_the_visibility_of_the_opened_popup() throws InterruptedException, InvalidMidiDataException {
//        ReusableMethods.koordinatTiklamaMethodu(559, 681);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 559, 681));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        getAppiumDriver().perform(Arrays.asList(swipe));

        ReusableMethods.wait(5);
      OptionsMet.swipe(493,2053,493,300);
        ReusableMethods.wait(2);
    }



    @Given("Click on the {string} icon")
    public void click_on_the_icon(String string) {
        Assert.assertTrue(gcaPage.cancelOrderIcon.isDisplayed());
        gcaPage.cancelOrderIcon.click();



    }
    @Given("Verify the visibility of the Successfully message")
    public void verify_the_visibility_of_the_message() {
        Assert.assertTrue(gcaPage.succesfullyAOrderCancelled.isDisplayed());
        ReusableMethods.wait(2);
    }



}
