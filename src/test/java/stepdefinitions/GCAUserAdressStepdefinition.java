package stepdefinitions;

import Page.GCAPage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;

import static utilities.Driver.driver;
import static utilities.Driver.getAppiumDriver;

public class GCAUserAdressStepdefinition extends OptionsMet {
    GCAPage gcaPage = new GCAPage();
    Actions actions = new Actions(getAppiumDriver());
    TouchAction action = new TouchAction<>((PerformsTouchActions) driver);

    @Given("the user clicks on the user icon")
    public void the_user_clicks_on_the_user_icon() {

    }

    @Given("the Address Icon is visible and clicked")
    public void the_address_icon_is_visible_and_clicked() {

    }

    @Given("the {string} button is visible on the opened page")
    public void the_button_is_visible_on_the_opened_page(String string) {

    }


}
