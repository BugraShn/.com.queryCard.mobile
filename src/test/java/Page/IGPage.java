package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class IGPage {
    public IGPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    // "Men" kategorisini bulma
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    public WebElement categoriesMen;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Adidas Ultraboost 21 Sneakers\n" +
            "0 (0  Reviews)\n" +
            "$180.00\")")
    public WebElement kategotiyButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"White\")")
    public WebElement whiteButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add To Cart\")")
    public WebElement addToCartButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Favorite\")")
    public WebElement favoriteButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    public WebElement cardButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Adidas Ultraboost 21 Sneakers\n" +
            "White\n" +
            "$180.00\n" +
            "1\")")
    public WebElement urunText;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Wishlist\")")
    public WebElement wishListButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement filterButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sort By\")")
    public WebElement sortedbyButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Price Low To High\")")
    public WebElement lowToHighButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"(23 Products Found)\")")
    public WebElement productsText;
    @AndroidFindBy(xpath = "//*[@class='android.widget.ScrollView']")
    public WebElement myAccountMenu;
    //@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Logout\")")
    //public WebElement logoutButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Logout']")
    public WebElement logoutButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Logout\")")
    public WebElement logoutButton1;


    public void MenCardMethod() throws InvalidMidiDataException {
        categoriesMen.click();
        ReusableMethods.wait(5);
        kategotiyButton.click();
        ReusableMethods.wait(5);
        OptionsMet.swipe(434, 1800, 434, 900);
        ReusableMethods.wait(3);
        whiteButton.click();
        ReusableMethods.wait(3);
        addToCartButton.click();
        ReusableMethods.wait(5);
        favoriteButton.click();
        ReusableMethods.wait(5);
        cardButton.click();
        assertTrue(urunText.isDisplayed());
        ReusableMethods.wait(5);
        wishListButton.click();
        ReusableMethods.wait(5);


    }

    public void MenFilterMethod() {
        categoriesMen.click();
        ReusableMethods.wait(3);
        assertTrue(filterButton.isDisplayed());
        ReusableMethods.wait(3);
        filterButton.click();
        ReusableMethods.wait(3);
        sortedbyButton.isDisplayed();
        ReusableMethods.wait(3);
        sortedbyButton.click();
        ReusableMethods.wait(3);
        lowToHighButton.click();
        ReusableMethods.wait(3);
        assertTrue(productsText.isDisplayed());
        ReusableMethods.wait(3);


    }


}
