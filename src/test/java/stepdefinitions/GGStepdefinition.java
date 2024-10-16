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
import utilities.ConfigReader;
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

    @Then("User sends {string} to email-phone box")
    public void userSendsToEmailPhoneBox(String configdenInfo) {

        page.entersEmail(ConfigReader.getProperty(configdenInfo));


    }

    @Then("User verifies Reset Password page opens")
    public void userVerifiesResetPasswordPageOpens() {

        page.verifyResetPassPage();


    }

    @Then("User resets own password")
    public void userResetsOwnPassword() {

        page.resetPassword();


    }

    @Then("User verifies that resetting password is not allowed with this {string}")
    public void userVerifiesThatResettingPasswordIsNotAllowedWithThis(String phoneOrMail) {

        if (phoneOrMail.equals("phone")){
            page.phoneErrorMessageIsDisplayed();

        } else if (phoneOrMail.equals("email")) {
            page.emailErrorMessageIsDisplayed();
        }
    }


    @Then("Enters {string} to Email text box")
    public void entersToEmailTextBox(String configdenInfo) {

        page.sigInMail(ConfigReader.getProperty(configdenInfo));

    }

    @And("Enters {string} to Password text box")
    public void entersToPasswordTextBox(String configdenInfo) {

        page.sigInPass(ConfigReader.getProperty(configdenInfo));

    }

    @Then("User verifies old password box is displayed")
    public void userVerifiesOldPasswordBoxIsDisplayed() {

        page.verifiesOldPass();


    }

    @Then("User verifies new password box is displayed")
    public void userVerifiesNewPasswordBoxIsDisplayed() {

        page.verifiesNewPass();


    }

    @Then("User verifies confirm password box is displayed")
    public void userVerifiesConfirmPasswordBoxIsDisplayed() {

       page.verifiesConfirmPass();

    }

    @Then("User enters {string} to old password box")
    public void userEntersToOldPasswordBox(String configdenOldPass) {

        page.entersOldPass(ConfigReader.getProperty(configdenOldPass));


    }

    @Then("User enters {string} to new password box and confirm")
    public void userEntersToNewPasswordBoxAndConfirm(String newPass) {

        page.entersNewPass(newPass);
    }

    @Then("User verifies that the password has been changed")
    public void userVerifiesThatThePasswordHasBeenChanged() {

        page.passChangeMessageIsDisplayed();
    }

    @Then("User verifies that the password has not been changed")
    public void userVerifiesThatThePasswordHasNotBeenChanged() {

        page.passChangeErrorMessageIsDisplayed();
    }
}

