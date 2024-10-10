package stepdefinitions;

import Page.BSPage;
import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.sql.ResultSet;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class BSStepdefinition extends OptionsMet {

    BSPage page = new BSPage();


    @Given("Home page categories text is verified")
    public void home_page_categories_text_is_verified() {

        ReusableMethods.wait(5);
        Assert.assertTrue(page.homeCategoriesText.isDisplayed());

    }
    @Given("Category names are verified")
    public void category_names_are_verified() throws InvalidMidiDataException {

        Assert.assertTrue(page.categoriesMen.isDisplayed());
        ReusableMethods.wait(1);
        for (int i = 0; i < 14; i++) {
            OptionsMet.swipe(959,885,144,885);
        }

        Assert.assertTrue(page.categoriesToys.isDisplayed());

    }

}

