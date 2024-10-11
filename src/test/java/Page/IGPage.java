package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static utilities.Driver.getAppiumDriver;

public class IGPage {
    public IGPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
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
    @AndroidFindBy(uiAutomator  ="new UiSelector().description(\"Favorite\")")
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










}
