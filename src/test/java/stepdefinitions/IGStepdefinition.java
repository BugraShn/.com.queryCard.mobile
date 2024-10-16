package stepdefinitions;

import Page.IGPage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;
import javax.sound.midi.InvalidMidiDataException;
import static org.junit.Assert.*;
import static utilities.Driver.*;

public class IGStepdefinition extends OptionsMet {
    IGPage page = new IGPage();
    Actions actions = new Actions(getAppiumDriver());
    TouchAction action = new TouchAction<>((PerformsTouchActions) driver);



    @Given("{string} category window and subcategories should be visiblty test")
    public void men_category_window_and_subcategories_should_be_visiblty_test(String menMenu) {
        clickButtonByDescription(menMenu);
    }

    @Given("Actions can be taken on the products on the Men category page")
    public void actions_can_be_taken_on_the_products_on_the_men_category_page() {
        page.categoriesMen.click();
        ReusableMethods.wait(5);
        page.kategotiyButton.click();
        ReusableMethods.wait(5);

    }

    @Given("The user selects the product in the Men category and goes down to the text {string} on the page that opens")
    public void the_user_selects_the_product_in_the_men_category_and_goes_down_to_the_text_on_the_page_that_opens(String cardButton) throws InvalidMidiDataException {
        page.MenCardMethod();

    }

    @Given("As a registered user, I want the filtering button to be active and visible")
    public void as_a_registered_user_i_want_the_filtering_button_to_be_active_and_visible() {
        page.MenFilterMethod();

    }

    @Given("On the My Account page, the user should be able to see the menu titles with his/her information")
    public void on_the_my_account_page_the_user_should_be_able_to_see_the_menu_titles_with_his_her_information() {
        assertTrue(page.myAccountMenu.isDisplayed());
    }

    @Given("The {string} link should be visible in the profile dashboard sidebar")
    public void the_link_should_be_visible_in_the_profile_dashboard_sidebar(String logout) {

        assertTrue(page.logoutButton.isDisplayed());
    }
    @Given("The user clicks on the Logout button")
    public void the_user_clicks_on_the_logout_button() {
     ReusableMethods.KordinatlaTiklama();
     ReusableMethods.wait(2);

    }


    }
















