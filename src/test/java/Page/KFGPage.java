package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public class KFGPage {

    public KFGPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Category\")")
    public WebElement categoryButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    public WebElement categoryMenButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Women\")")
    public WebElement categoryWomenButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Juniors\")")
    public WebElement categoryJuniorsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement leftCornerBackButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement filterButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sort By\")")
    public WebElement sortByButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Brands\")")
    public WebElement brandsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"color\")")
    public WebElement colorButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Newest\")")
    public WebElement newestButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Price Low To High\")")
    public WebElement lowToHighButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Price High To Low\")")
    public WebElement highToLowButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Top Rated\")")
    public WebElement topRatedButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(8)")
    public WebElement adidasButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(6)")
    public WebElement whiteButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement closeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Adidas Ultraboost 21 Sneakers\n" +
            "0 (0  Reviews)\n" + "$180.00\")")
    public WebElement adidasUltraboostSneakers;


    @AndroidFindBy(uiAutomator = "@AndroidFindBy(uiAutomator = \"new UiSelector().className(\\\"android.widget.ImageView\\\").instance(0)\")\n" +
            "    public WebElement closeButton;")
    public WebElement adidassneakerPrice;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Most Popular\")")
    public WebElement mostPopularText;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"See All\")")
    public WebElement seeAllButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement backButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Most Popular\")")
    public WebElement mostPopularProductsText;




}
