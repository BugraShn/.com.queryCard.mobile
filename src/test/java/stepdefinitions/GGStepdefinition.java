package stepdefinitions;

import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class GGStepdefinition extends OptionsMet {

    @Then("Verifies {string} , {string} , {string} and {string} easylinks are visible")
    public void verifiesAndEasylinksAreVisible(String homelink, String categorylink, String wishlistlink, String profilelink) {

        ReusableMethods.wait(2);
        VerifyElementText(homelink);
        VerifyElementText(categorylink);
        VerifyElementText(wishlistlink);
        VerifyElementText(profilelink);


    }



}

