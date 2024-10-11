package stepdefinitions;

import Page.GGPage;
import Page.QueryCardPage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;


public class GGStepdefinition extends OptionsMet {

    AndroidDriver driver = (AndroidDriver) getAppiumDriver();

    GGPage page = new GGPage();
    QueryCardPage page2 = new QueryCardPage();

    @Then("Verifies {string} , {string} , {string} and {string} easylinks are visible")
    public void verifiesAndEasylinksAreVisible(String homelink, String categorylink, String wishlistlink, String profilelink) {

        ReusableMethods.wait(5);
        VerifyElementText(homelink);
        VerifyElementText(categorylink);
        VerifyElementText(wishlistlink);
        VerifyElementText(profilelink);


    }


    @And("Verifies profile page is opens")
    public void verifiesProfilePageIsOpens() {
        page.appDownloadLinkVisibilty();
        ReusableMethods.wait(1);
    }

    @And("Verifies sign in page is opens")
    public void verifiesSignInPageIsOpens() {
        page.forgotPasswordLinkVisibilty();
        page.goBackArrow.click();
        ReusableMethods.wait(1);
    }

    @And("Verifies category page is opens")
    public void verifiesCategoryPageIsOpens() {

        page.manCategoryLinkVisibilty();
        ReusableMethods.wait(1);


    }

    @And("Verifies home page is opens")
    public void verifiesHomePageIsOpens() {

        page2.LogoGorunurTest();

    }

    @Then("User clicks the search button")
    public void userClicksTheSearchButton() {
        ReusableMethods.wait(1);
        page.searchButtonClick();
    }

    @And("Enters {string} to search text box")
    public void entersToSearchTextBox(String item) {

        page.entersSearchTextBox(item);

    }

    @And("Verifies that items are displayed")
    public void verifiesThatItemsAreDisplayed() {

        page.searchResults();

    }

    @Then("User verifies {string} button is visible")
    public void userVerifiesLinkIsVisible(String link) {
        if (link.equalsIgnoreCase("Forgot Password")) {
            page.forgotPasswordLinkVisibilty();

        } else {

            WebElement button = driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiSelector().description(\"" + link + "\")"));

            assertTrue(button.isDisplayed());

        }

    }
}

