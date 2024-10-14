package stepdefinitions;

import Page.BSPage;
import Page.GCAPage;
import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.profiler.model.Profile;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class GCAStepdefinition extends OptionsMet {

  GCAPage gcaPage =new GCAPage();
    Actions actions = new Actions(getAppiumDriver());

    @Given("go to home page as a user")
    public void go_to_home_page_as_a_user() throws InterruptedException {
      getAppiumDriver();
        ReusableMethods.wait(5);
       gcaPage.userLoginWithMail();
    }
    @Given("Verify the visibility of the Women icon on Homepage and click on it")
    public void verify_the_visibility_of_the_women_icon_on_homepage_and_click_on_it() {

    }
    @Given("Verify the Women page is opened")
    public void verify_the_women_page_is_opened() {

    }
    @Given("Verify the visibility of the Women Clothing section")
    public void verify_the_visibility_of_the_women_clothing_section() {

    }
    @Given("Verify the visibility of the Women Dresses-Skirts section")
    public void verify_the_visibility_of_the_women_dresses_skirts_section() {

    }
    @Given("Verify the visibility of the Women T-shirt section")
    public void verify_the_visibility_of_the_women_t_shirt_section() {

    }
    @Given("Verify the visibility of the Women Trousers section")
    public void verify_the_visibility_of_the_women_trousers_section() {

    }
    @Given("Verify the visibility of the Women Coat section")
    public void verify_the_visibility_of_the_women_coat_section() {

    }
    @Given("Verify the visibility of the Women Shoes section")
    public void verify_the_visibility_of_the_women_shoes_section() {

    }
    @Given("Verify the visibility of the Women Casuel Shoes section")
    public void verify_the_visibility_of_the_women_casuel_shoes_section() {

    }
    @Given("Verify the visibility of the Women Classic Shoes section")
    public void verify_the_visibility_of_the_women_classic_shoes_section() {

    }
    @Given("Verify the visibility of the Women's Boots section")
    public void verify_the_visibility_of_the_women_s_boots_section() {

    }
    @Given("Verify the visibility of the Women Sneakers section")
    public void verify_the_visibility_of_the_women_sneakers_section() {

    }
    @Given("Verify the visibility of the Women Accessories section")
    public void verify_the_visibility_of_the_women_accessories_section() {

    }
    @Given("Verify the visibility of the Women Bags section")
    public void verify_the_visibility_of_the_women_bags_section() {

    }
    @Given("Verify the visibility of the Women Watch section")
    public void verify_the_visibility_of_the_women_watch_section() {

    }
    @Given("Verify the visibility of the Women Jewelry section")
    public void verify_the_visibility_of_the_women_jewelry_section() {

    }


}

