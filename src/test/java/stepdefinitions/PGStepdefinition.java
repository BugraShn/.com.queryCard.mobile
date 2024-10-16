package stepdefinitions;

import Page.PGPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
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
    Random random = new Random();
    List<WebElement> imageOfProductsList;
    List<WebElement> heartList;
    List<WebElement> textList;
    WebElement expectedImage;


    @Given("Verify the products are visible and active")
    public void verify_the_products_are_visible_and_active() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        imageOfProductsList = new ArrayList<>();

        WebElement webElementimage01 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Floral Print Midi Dress\n0 (0  Reviews)\n$100.00\")"));
        WebElement webElementimage02 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Flower Print Foil T-shirt\n0 (0  Reviews)\n$65.00\")"));
        WebElement webElementimage03 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Classic Cotton T-Shirt\n0 (0  Reviews)\n$20.00\")"));
        WebElement webElementimage04 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Adidas Ultraboost 21 Sneakers\n0 (0  Reviews)\n$180.00\")"));
        WebElement webElementimage05 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"The North Face Arctic Parka\n0 (0  Reviews)\n$400.00\")"));
        WebElement webElementimage06 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Quilted Puffer Jacket\n0 (0  Reviews)\n$120.00\")"));

        imageOfProductsList.add(webElementimage01);
        imageOfProductsList.add(webElementimage02);
        imageOfProductsList.add(webElementimage03);
        imageOfProductsList.add(webElementimage04);
        imageOfProductsList.add(webElementimage05);
        imageOfProductsList.add(webElementimage06);

        int i = random.nextInt(imageOfProductsList.size());
        System.out.println("i :" + i);

        if (i > 2) {
            for (int j = 3; j < i; j++) {
                ReusableMethods.ekranKaydirmaMethodu(670, 2475, 1000, 670, 75);
            }
        }
        Assert.assertTrue(imageOfProductsList.get(i).isDisplayed());
        Assert.assertTrue(imageOfProductsList.get(i).isEnabled());

    }


    @Given("Verify visibility and activity of products and clicks")
    public void verify_visibility_and_activity_of_products_and_clicks() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        imageOfProductsList = new ArrayList<>();

        WebElement webElementimage01 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Floral Print Midi Dress\n0 (0  Reviews)\n$100.00\")"));
        WebElement webElementimage02 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Flower Print Foil T-shirt\n0 (0  Reviews)\n$65.00\")"));
        WebElement webElementimage03 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Classic Cotton T-Shirt\n0 (0  Reviews)\n$20.00\")"));
        WebElement webElementimage04 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Adidas Ultraboost 21 Sneakers\n0 (0  Reviews)\n$180.00\")"));
        WebElement webElementimage05 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"The North Face Arctic Parka\n0 (0  Reviews)\n$400.00\")"));
        WebElement webElementimage06 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Quilted Puffer Jacket\n0 (0  Reviews)\n$120.00\")"));

        imageOfProductsList.add(webElementimage01);
        imageOfProductsList.add(webElementimage02);
        imageOfProductsList.add(webElementimage03);
        imageOfProductsList.add(webElementimage04);
        imageOfProductsList.add(webElementimage05);
        imageOfProductsList.add(webElementimage06);

        int i = random.nextInt(imageOfProductsList.size());
        System.out.println("i :" + i);

        if (i > 2) {
            for (int j = 3; j < i; j++) {
                ReusableMethods.ekranKaydirmaMethodu(670, 2475, 1000, 670, 75);
            }
        }
        Assert.assertTrue(imageOfProductsList.get(i).isDisplayed());
        Assert.assertTrue(imageOfProductsList.get(i).isEnabled());

        expectedImage = imageOfProductsList.get(i);
        imageOfProductsList.get(i).sendKeys(Keys.ENTER);


    }

    @Given("The favorite icon on the right side of product image is visible and active")
    public void the_favorite_icon_on_the_right_side_of_product_image_is_visible_and_active() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        heartList = new ArrayList<>();

        WebElement webElementHeart01 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(9)"));
        WebElement webElementHeart02 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)"));
        WebElement webElementHeart03 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(23)"));
        WebElement webElementHeart04 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(16)"));
        WebElement webElementHeart05 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(31)"));
        WebElement webElementHeart06 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(30)"));

        heartList.add(webElementHeart01);
        heartList.add(webElementHeart02);
        heartList.add(webElementHeart04);
        heartList.add(webElementHeart05);
        heartList.add(webElementHeart06);


        int i = random.nextInt(heartList.size());
        System.out.println("i :" + i);

        if (i > 2) {
            for (int j = 3; j < i; j++) {
                ReusableMethods.ekranKaydirmaMethodu(670, 2475, 1000, 670, 75);
            }
        }
        Assert.assertTrue(heartList.get(i).isDisplayed());
        Assert.assertTrue(heartList.get(i).isEnabled());


    }


    @Given("Verify the directed page due to selected product")
    public void verify_the_directed_page_due_to_selected_product() {
        ReusableMethods.wait(2000);
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();

        textList = new ArrayList<>();

        WebElement webElementText01 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(10)"));
        WebElement webElementText02 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(8)"));
        WebElement webElementText03 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(29)"));
        WebElement webElementText04 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(13)"));
        WebElement webElementText05 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(12)"));

        textList.add(webElementText01);
        textList.add(webElementText02);
        textList.add(webElementText03);
        textList.add(webElementText04);
        textList.add(webElementText05);
        int i = random.nextInt(textList.size());
        System.out.println("i :" + i);

        if (i > 1) {
            for (int j = 1; j < i; j++) {
                ReusableMethods.ekranKaydirmaMethodu(670, 2475, 1000, 670, 75);
            }
        }
        String expectedText = textList.get(i).getText();
        textList.get(i).sendKeys(Keys.ENTER);
        String actualSelectedImageText = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(6)")).getText();

        Assert.assertTrue(expectedText.contains(actualSelectedImageText));


    }

    @Given("The user scrolls down the page")
    public void the_user_scrolls_down_the_page() {
        ReusableMethods.ekranKaydirmaMethodu(670, 2475, 1500, 670, 75);
    }

    @Given("The favorite icon on the right side is visible and active")
    public void the_favorite_icon_on_the_right_side_is_visible_and_active() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebElement webElementSelectedFavorite = driver.findElement(AppiumBy.accessibilityId("Favorite"));

        Assert.assertTrue(webElementSelectedFavorite.isDisplayed());
        Assert.assertTrue(webElementSelectedFavorite.isEnabled());

    }

    @Given("Verify the directed page is not wishlist")
    public void verify_the_directed_page_is_not_wishlist() {
        String expectedPageText = "Wishlist";
        String actualPageText = pgPage.textOfSignInPage.getText();
        Assert.assertNotEquals(expectedPageText, actualPageText);
    }

    @Given("User click the product")
    public void user_click_the_product() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebElement webElementimage01 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().description(\"Floral Print Midi Dress\n0 (0  Reviews)\n$100.00\")"));
        webElementimage01.sendKeys(Keys.ENTER);
    }
}
