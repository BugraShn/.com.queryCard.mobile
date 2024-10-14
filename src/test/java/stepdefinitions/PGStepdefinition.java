package stepdefinitions;

import Page.PGPage;
import Page.QueryCardPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static utilities.Driver.getAppiumDriver;


public class PGStepdefinition extends OptionsMet {

    PGPage pgPage = new PGPage();
    List<WebElement> smallProductTextList;
    List<WebElement>  heartList ;
    String expectedText;


    @Given("Verify the products are visible and active")
    public void verify_the_products_are_visible_and_active() {
        Random random = new Random();

        for (int i = 9; i < smallProductTextList.size(); i += 6) {
            AndroidDriver driver = (AndroidDriver) getAppiumDriver();
            smallProductTextList = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(i)"));

            i = random.nextInt(smallProductTextList.size());
            System.out.println("i :" + i);

            for (int j = 0; j < i / 5; j++) {
                ReusableMethods.ekranKaydirmaMethodu(317, 1190, 1000, 317, 500);
            }

            Assert.assertTrue(smallProductTextList.get(i).isDisplayed());
            Assert.assertTrue(smallProductTextList.get(i).isEnabled());
        }
    }


    @Given("Verify visibility and activity of products and clicks")
    public void verify_visibility_and_activity_of_products_and_clicks() {
        Random random = new Random();

        for (int i = 9; i < smallProductTextList.size(); i += 6) {
            AndroidDriver driver = (AndroidDriver) getAppiumDriver();
            smallProductTextList = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(i)"));

            i = random.nextInt(smallProductTextList.size());
            System.out.println("i :"+i);

            for (int j = 0; j < i / 5 ; j++) {
                ReusableMethods.ekranKaydirmaMethodu(317, 1190, 1000, 317, 500);
            }

            Assert.assertTrue(smallProductTextList.get(i).isDisplayed());
            Assert.assertTrue(smallProductTextList.get(i).isEnabled());
            expectedText = smallProductTextList.get(i).getText();
            smallProductTextList.get(i).sendKeys(Keys.ENTER);

        }
    }


    @Given("The favorite icon on the right side of product image is visible and active")
    public void the_favorite_icon_on_the_right_side_of_product_image_is_visible_and_active() {

        Random random = new Random();

        for (int i = 2; i < heartList.size(); i += 7) {
            AndroidDriver driver = (AndroidDriver) getAppiumDriver();
            heartList=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().new UiSelector().className(\"android.widget.ImageView\").instance(i)"));

            i = random.nextInt(smallProductTextList.size());
            System.out.println("i :"+i);

            for (int j = 0; j < i / 5 ; j++) {
                ReusableMethods.ekranKaydirmaMethodu(317, 1190, 1000, 317, 500);
            }
            Assert.assertTrue(heartList.get(i).isDisplayed());
            Assert.assertTrue(heartList.get(i).isEnabled());

        }
    }


    @Given("Verify the directed page due to selected product")
    public void verify_the_directed_page_due_to_selected_product() {
        ReusableMethods.wait(2000);
        AndroidDriver  driver=(AndroidDriver)getAppiumDriver();
        String actualPropertyText = driver.findElement(AppiumBy.accessibilityId("\"accessibilityId\"")).getText();
        Assert.assertTrue(expectedText.contains(actualPropertyText));

    }

    @Given("The user scrolls down the page")
    public void the_user_scrolls_down_the_page() {
        ReusableMethods.ekranKaydirmaMethodu(317, 1190, 1500, 317, 500);
    }

    @Given("The favorite icon on the right side is visible and active")
    public void the_favorite_icon_on_the_right_side_is_visible_and_active() {
        Assert.assertTrue(pgPage.favoritePropertyAsign.isDisplayed());
        Assert.assertTrue(pgPage.favoritePropertyAsign.isEnabled());
    }

    @Given("Verify the directed page is not wishlist")
    public void verify_the_directed_page_is_not_wishlist() {
        String expectedPageText="Wishlist";
         String actualPageText= pgPage.textOfSignInPage.getText();
          Assert.assertNotEquals(expectedPageText,actualPageText);
    }
}
