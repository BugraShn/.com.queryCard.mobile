package stepdefinitions;

import Page.BSPage;
import Page.QueryCardPage;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.sql.ResultSet;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class BSStepdefinition extends OptionsMet {

    BSPage page = new BSPage();
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());


    @Given("Home page categories text is verified")
    public void home_page_categories_text_is_verified() {

        ReusableMethods.wait(10);
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

    @Given("Verifies profile button")
    public void verifies_profile_button() {
       Assert.assertTrue(page.homePageProfileButton.isDisplayed());
    }
    @Given("Clicks the profile button")
    public void clicks_the_profile_button() {
       page.homePageProfileButton.click();
    }

    @Given("On the page that opens, confirm the text Sign In To See Your Info")
    public void on_the_page_that_opens_confirm_the_text_sign_In_to_see_your_Info() {
        Assert.assertTrue(page.singInToSeeText.isDisplayed());
    }

    @Given("Sign Up the profile button")
    public void sign_up_the_profile_button() {
        page.signUpButton1.click();

    }

    @Given("Enter {string} , {string} , {string} into the form")
    public void enter_password_into_the_form(String name, String phone, String password) {
        page.SignInForm(name,phone,password);
    }

    @Given("The sign in page is verified.")
    public void the_sign_in_page_is_verified() {
        page.singUpButton2.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(page.signInText.isDisplayed());

    }

    @Given("Enter fake {string} , {string} , {string} into the form")
    public void enter_fake_password_into_the_form(String name, String phone, String password) {
        page.SignInForm(name,phone,password);
        ReusableMethods.wait(1);
        page.singUpButton2.click();
        ReusableMethods.wait(4);
        Assert.assertTrue(page.signUpButton1.isDisplayed());

    }

    @Given("Clicks the {string} button")
    public void clicks_the_button(String mainText) {
        ReusableMethods.wait(1);
        page.useEmailText.click();
        ReusableMethods.wait(1);
    }

    @Given("User click the button with Adidas Shoe")
    public void user_click_the_button_with_adidas_shoe() throws InvalidMidiDataException {
        OptionsMet.swipe(532,1726,532,262);
        page.homePageadidasAyakkabi.click();
        ReusableMethods.wait(3);
    }


    @Given("Selects {string} and confirms the {string} text")
    public void selects_and_confirms_the_text(String detay, String productDetay) throws InvalidMidiDataException {
        OptionsMet.swipe(542,1928,542,447);
       ReusableMethods.scrollAndClickByDescription(detay);
       ReusableMethods.scrollAndClickByDescription(productDetay);

    }

    @Given("Click on the Edit Profile text.")
    public void click_on_the_edit_profile_text() {
        Assert.assertTrue(page.editProfilText.isDisplayed());
        page.editProfilText.click();

    }
    @Given("Enter the new {string}, new {string}, new {string} and is saved")
    public void enter_the_new_new(String name, String mail, String phone) {
        page.ProfilEditBs(name, mail, phone);
        // asdasdasadsasd
        // kajdshlkas
        // kajdshlkas


    }




}






