package stepdefinitions;

import Page.KFGPage;
import Page.QueryCardPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class KFGStepdefinition extends OptionsMet {


    KFGPage KFGPage = new KFGPage();
    QueryCardPage QueryCardPage = new QueryCardPage();
    AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();


    @Given("User check if the {string} icon is visible and active in the navbar.")
    public void user_check_if_the_icon_is_visible_and_active_in_the_navbar(String Category) {


        ReusableMethods.wait(5);
        KFGPage.categoryButton.isDisplayed();
    }

    @Given("User click on the {string} icon and verify the visibility and activeness of the following category headings.")
    public void user_click_on_the_icon_and_verify_the_visibility_and_activeness_of_the_following_category_headings(String string) {

        ReusableMethods.wait(1);
        KFGPage.categoryButton.click();
        KFGPage.categoryMenButton.isDisplayed();

    }

    @Given("User see the Men category  and click")
    public void user_see_the_men_category_and_click() {

        ReusableMethods.wait(1);
        KFGPage.categoryMenButton.click();
        ReusableMethods.wait(1);
        KFGPage.leftCornerBackButton.click();

    }

    @Given("User see the Women category and click")
    public void user_see_the_women_category_and_click() {

        ReusableMethods.wait(1);
        KFGPage.categoryWomenButton.click();
        ReusableMethods.wait(1);
        KFGPage.leftCornerBackButton.click();

    }

    @Given("User see the Junior category and click")
    public void user_see_the_junior_category_and_click() {

        ReusableMethods.wait(1);
        KFGPage.categoryJuniorsButton.click();
        ReusableMethods.wait(1);
        KFGPage.leftCornerBackButton.click();

    }


    @Given("User select any category \\(e.g., Men or Women) and verify that the filter icons \\(such as for price, size, color, etc.) are visible and functional.")
    public void user_select_any_category_e_g_men_or_women_and_verify_that_the_filter_icons_such_as_for_price_size_color_etc_are_visible_and_functional() {

        KFGPage.categoryMenButton.click();
        KFGPage.filterButton.click();
        ReusableMethods.wait(2);
        KFGPage.brandsButton.click();
        ReusableMethods.wait(1);
        KFGPage.adidasButton.click();
        KFGPage.brandsButton.click();
        ReusableMethods.wait(1);
        KFGPage.colorButton.click();
        KFGPage.whiteButton.click();
        ReusableMethods.wait(1);
        KFGPage.closeButton.click();

        String message = KFGPage.adidasUltraboostSneakers.getAttribute("contentDescription");
        driver.sendSMS("125555555", message);

    }
    @Given("Locate the Most Popular menu in the navbar and click")
    public void locate_the_most_popular_menu_in_the_navbar_and_click() {
        ReusableMethods.wait(5);
        KFGPage.mostPopularText.isDisplayed();


    }

    @Given("Click See All and verify that it shows the list of all products")
    public void click_see_all_and_verify_that_it_shows_the_list_of_all_products() {
        KFGPage.seeAllButton.click();
        KFGPage.mostPopularProductsText.isDisplayed();
        String msppt = KFGPage.mostPopularProductsText.getAttribute("contentDescription");
        driver.sendSMS("12345",msppt+"Products successful");

    }

    @Given("Click the Back button.")
    public void click_the_back_button() {

        KFGPage.backButton.click();
    }
    @Given("Verify that clicking the Back button returns the user to the homepage.")
    public void verify_that_clicking_the_back_button_returns_the_user_to_the_homepage() {

        Assert.assertTrue(KFGPage.seeAllButton.isDisplayed());
        String homepage = KFGPage.seeAllButton.getAttribute("contentDescription");
        driver.sendSMS("12345",homepage+"Back button successful");

    }





}

