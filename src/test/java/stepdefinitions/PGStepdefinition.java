package stepdefinitions;

import Page.PGPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static utilities.Driver.driver;
import static utilities.Driver.getAppiumDriver;


public class PGStepdefinition extends OptionsMet {

    PGPage pgPage = new PGPage();
    Random random = new Random();
    List<WebElement> imageOfProductsList;
    List<WebElement> heartList;
    List<WebElement> textList;
    WebElement expectedImage;
    WebElement expectedText;
    WebElement expectedHeart;


    @Given("User clicks on Allow")
    public void user_clicks_on_allow() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webElementAllow = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("com.android.permissioncontroller:id/permission_allow_button")));
        webElementAllow.click();
    }



    public static void navigateScreen(int xPress,int yPress ,int wait,int xMove,int yMove) {
        final var finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        var start = new Point(xPress, yPress);
        var end = new Point(xMove, yMove);
        var swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(wait),
                PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }


    @Given("Verify visibility and activity of products")
    public void verify_visibility_and_activity_of_products_and_clicks() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        imageOfProductsList = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webElementimage01 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().description(\"Floral Print Midi Dress\n0 (0  Reviews)\n$100.00\")")));
        // WebElement webElementimage01 = driver.findElement(AppiumBy.androidUIAutomator());

        WebElement webElementimage02 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().description(\"Flower Print Foil T-shirt\n0 (0  Reviews)\n$65.00\")")));
        //WebElement webElementimage02 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Flower Print Foil T-shirt\n0 (0  Reviews)\n$65.00\")"));
       navigateScreen(330, 1260, 1000, 330, 410);

        WebElement webElementimage03 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().description(\"Classic Cotton T-Shirt\n0 (0  Reviews)\n$20.00\")")));
        //WebElement webElementimage03 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Classic Cotton T-Shirt\n0 (0  Reviews)\n$20.00\")"));

        WebElement webElementimage04 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().description(\"Adidas Ultraboost 21 Sneakers\n0 (0  Reviews)\n$180.00\")")));
        //WebElement webElementimage04 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Adidas Ultraboost 21 Sneakers\n0 (0  Reviews)\n$180.00\")"));

        WebElement webElementimage05 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().description(\"Floral Print Midi Dress\n0 (0  Reviews)\n$100.00\")")));
        //WebElement webElementimage05 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Floral Print Midi Dress\n0 (0  Reviews)\n$100.00\")"));

        //WebElement webElementimage06 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Quilted Puffer Jacket\n0 (0  Reviews)\n$120.00\")"));
        WebElement webElementimage06 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().description(\"Quilted Puffer Jacket\n0 (0  Reviews)\n$120.00\")")));

        imageOfProductsList.add(webElementimage01);
        imageOfProductsList.add(webElementimage02);
        imageOfProductsList.add(webElementimage03);
        imageOfProductsList.add(webElementimage04);
        imageOfProductsList.add(webElementimage05);
        imageOfProductsList.add(webElementimage06);

        int i = random.nextInt(imageOfProductsList.size());
        System.out.println("i :" + i);

        if (i < 3) { navigateScreen(355, 369, 1000, 362, 880); }
        expectedImage = imageOfProductsList.get(i);
        Assert.assertTrue(expectedImage.isDisplayed());
        Assert.assertTrue(expectedImage.isEnabled());

    }


    @Given("The favorite icon on the right side of product image is visible and active")
    public void the_favorite_icon_on_the_right_side_of_product_image_is_visible_and_active() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();

        heartList = new ArrayList<>();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webElementHeart01 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(9)")));
        //WebElement webElementHeart01 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(9)"));

        WebElement webElementHeart02 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)")));
       // WebElement webElementHeart02 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)"));
        navigateScreen(330, 1260, 1000, 330, 410);
        WebElement webElementHeart03 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(23)")));
       //WebElement webElementHeart03 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(23)"));

        WebElement webElementHeart04 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(16)")));
        //WebElement webElementHeart04 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(16)"));

        WebElement webElementHeart05 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(31)")));
        //WebElement webElementHeart05 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(31)"));

        WebElement webElementHeart06 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(30)")));
        //WebElement webElementHeart06 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(30)"));

        ReusableMethods.wait(2);
        heartList.add(webElementHeart01);
        ReusableMethods.wait(2);
        heartList.add(webElementHeart02);
        ReusableMethods.wait(2);
        heartList.add(webElementHeart03);
        ReusableMethods.wait(2);
        heartList.add(webElementHeart04);
        ReusableMethods.wait(2);
        heartList.add(webElementHeart05);
        ReusableMethods.wait(2);
        heartList.add(webElementHeart06);

        ReusableMethods.wait(5);
        int i = random.nextInt(heartList.size());
        System.out.println("i :" + i);
        ReusableMethods.wait(5);
        if (i < 3) {

navigateScreen(357,1300,1000,357,418);
        }
        ReusableMethods.wait(10);
        expectedHeart=heartList.get(i);
        Assert.assertTrue(expectedHeart.isDisplayed());
        Assert.assertTrue(expectedHeart.isEnabled());


    }
@Given("Verify visibility and activity of products text")
public void verify_visibility_and_activity_of_products_text(){
    ReusableMethods.wait(10);
    AndroidDriver driver = (AndroidDriver) getAppiumDriver();

    textList = new ArrayList<>();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement webElementText01 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(10)")));
    //WebElement webElementText01 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(10)"));
    WebElement webElementText02 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(8)")));
    //WebElement webElementText02 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(8)"));
    navigateScreen(357,1300,1000,357,418);
    WebElement webElementText03 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(29)")));
    //WebElement webElementText03 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(29)"));
    WebElement webElementText04 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(13)")));
    // WebElement webElementText04 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(13)"));
    WebElement webElementText05 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(12)")));
    // WebElement webElementText05 = driver.findElement(MobileBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(12)"));

    ReusableMethods.wait(2);
    textList.add(webElementText01);
    ReusableMethods.wait(2);
    textList.add(webElementText02);
    ReusableMethods.wait(2);
    textList.add(webElementText03);
    ReusableMethods.wait(2);
    textList.add(webElementText04);
    ReusableMethods.wait(2);
    textList.add(webElementText05);



    int i = random.nextInt(textList.size());


    if (i < 3) { navigateScreen(355, 369, 1000, 362, 880); }
    expectedText  = textList.get(i);
    Assert.assertTrue(expectedText.isDisplayed());
    Assert.assertTrue(expectedText.isEnabled());


}
    @Given("User clicks on one of products")
    public void user_clicks_on_one_of_products(){

        Actions actions=new Actions(Driver.getAppiumDriver());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(expectedText));
        actions.sendKeys(expectedText,Keys.ENTER).perform();

    }

    @Given("Verify the directed page due to selected product")
    public void verify_the_directed_page_due_to_selected_product() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webElementActual = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(6)")));
        String actualSelectedImageText = webElementActual.getText();
ReusableMethods.wait(10);
        Assert.assertTrue((expectedText.getText()).contains(actualSelectedImageText));


    }

    @Given("The user scrolls down the page")
    public void the_user_scrolls_down_the_page() {
        ReusableMethods.wait(10);
navigateScreen(360,1280,1000,360,650);    }

    @Given("The favorite icon in product property is visible and active")
    public void the_favorite_icon_in_product_property_is_visible_and_active() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();

        ReusableMethods.wait(10);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webElementSelectedFavorite = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.accessibilityId("Favorite")));
        //WebElement webElementSelectedFavorite = driver.findElement(AppiumBy.accessibilityId("Favorite"));
        ReusableMethods.wait(5);
        Assert.assertTrue(webElementSelectedFavorite.isDisplayed());
        Assert.assertTrue(webElementSelectedFavorite.isEnabled());

    }


    @Given("User clicks on favorite asign on product image")
    public void user_clicks_on_favorite_asign_on_product_image() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Actions actions=new Actions(Driver.getAppiumDriver());
        wait.until(ExpectedConditions.visibilityOf(expectedHeart));
        actions.sendKeys(expectedHeart,Keys.ENTER).perform();

    }
    @Given("User clicks on favorite asign")
    public void user_clicks_on_favorite_asign() {

        Actions actions=new Actions(Driver.getAppiumDriver());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement webElementFavorite=wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.accessibilityId("Favorite")));
        actions.sendKeys(webElementFavorite,Keys.ENTER).perform();
    }


    @Given("Verify the directed page is not wishlist")
    public void verify_the_directed_page_is_not_wishlist() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pgPage.SignInTitle));
        String actualWishText  = pgPage.SignInTitle.getText();
        String expectedTitle="Wishlist";
        Assert.assertNotEquals(expectedTitle, actualWishText);

    }


}