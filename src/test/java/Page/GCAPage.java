package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import java.time.Duration;

import static io.appium.java_client.AppiumBy.androidUIAutomator;
import static java.util.Collections.singletonList;
import static utilities.Driver.getAppiumDriver;

public class GCAPage {
    public GCAPage() {

        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    public AndroidDriver driver = (AndroidDriver) getAppiumDriver();
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Profile\"]")
   public WebElement ProfileButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Address\"]")
    public WebElement adressButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add New Address\"]")
    public WebElement addNewAdressButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"gül akyol\n" +
            "+112512555\n" +
            "Center,  Colorado,  United States,  \n" +
            "Free St 10\"]")
    public WebElement oldAdress;
    @AndroidFindBy(id = "    gül akyol\n" +
            "+112512555\n" +
            "    Center,  Colorado,  United States,\n" +
            "    Free St 10")
    public WebElement oldAdressId;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    public WebElement AddressEditIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement AddressEmailEditText;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Update Address\").instance(1)")
    public WebElement updateAddressIcon;


    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Address Updated Successfully!\")")
    public WebElement succesfullyUpdate;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Address Added\")")
    public WebElement succesfullyAdressAdded;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Order Canceled\")")
    public WebElement succesfullyAOrderCancelled;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement AddressDeleteIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Delete\")")
    public WebElement AddressDeleteAreYouSureIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement newAddressFullNameText;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement newAddressEmailText;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public WebElement newAddressPhoneText;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Country\")")
    public WebElement newAddressCountryText;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"State\")")
    public WebElement newAddressStateText;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"City\")")
    public WebElement newAddressCityText;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    public WebElement newStreetAddressText;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add Address\")")
    public WebElement AddAddressIcon;
    @AndroidFindBy(uiAutomator = " new UiSelector().description(\"Albania\")")
    public WebElement albania;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Berat District\")")
    public WebElement beratDistrict;
    @AndroidFindBy(uiAutomator = "  new UiSelector().description(\"Banaj\")")
    public WebElement banaj;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Dismiss\")")
    public WebElement dismiss;



    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Order History\")")
    public WebElement orderHistoryIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"#111024642\n" +
            "08:25 AM, 11-10-2024\n" +
            "Info: \n" +
            "1 Product\n" +
            "Delivery Status: \n" +
            "Canceled\n" +
            "Payment Status: \n" +
            "Unpaid\n" +
            "Total: \n" +
            "$160.00\")")
    public WebElement orderHistoryShopping1;
    @AndroidFindBy(uiAutomator = " new UiSelector().description(\"Download Receipt\")")
    public WebElement downloadReceiptIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Print Invoice\")")
    public WebElement printReceipt;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Cancel Order\")")
    public WebElement cancelOrderIcon;
    @AndroidFindBy(uiAutomator = "(//android.widget.ImageView[contains(@content-desc, 'Product')])[1]\n")
    public WebElement urun1CancelOrder;






////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign In\"]")
    public WebElement SignInButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"*Use Email Instead\"]")
    public WebElement UseEmailInsteadButton;
    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement EmailButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement PasswordButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Remember me\")")
    public WebElement rememberMeButton;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])[2]")
    public WebElement signIn2Button;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Women\")")
    public WebElement womenCategory;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"(18, Wine Red) Womens Short Sleeve Tie Dye Blosue T-Shirt\n" +
            "0 (0  Reviews)\n" +
            "$21.00\")")
    public WebElement womenCategoryUrun1;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Bohemian Style V Neck Summer Top\n" +
            "0 (0  Reviews)\n" +
            "$22.00\")")
    public WebElement womenCategoryUrun2;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sterling Silver Heart Design Bracelet\n" +
            "0 (0  Reviews)\n" +
            "$1000.00\")")
    public WebElement siralamaPriceHochUrun1;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Women Watches Fashion Square Ladies Quartz Watch\n" +
            "0 (0  Reviews)\n" +
            "$700.00\")")
    public WebElement siralamaPriceHochUrun2;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"M\"]")
    public WebElement sizeM;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add To Cart\"]")
    public WebElement addToCartIcon;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Favorite\"]")
    public WebElement favoriteIcon;
    @AndroidFindBy(xpath = "00000000-0000-0032-0000-02d500000003")
    public WebElement sepet;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    public WebElement sepet2;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Casual Women Shoes\n" +
            "0 (0  Reviews)\n" +
            "$250.00\")")
    public WebElement urunShoesilk;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Nike Air Force 1 Sneakers\n" +
            "0 (0  Reviews)\n" +
            "$120.00\")")
    public WebElement nikeUrun;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    public WebElement kalpIconUrunUstunde;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"(18, Wine Red) Womens Short Sleeve Tie Dye Blosue T-Shirt\n" +
            "M\n" +
            "$21.00\n" +
            "1\")")
    public WebElement sepettekiUrunTshirt;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Remove\").instance(1)")
    public WebElement remove;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")
    public WebElement geriUstTusu;
//@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    //android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Wishlist\")")
    public WebElement wishList;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement sortByIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sort By\")")
    public WebElement filteringSortByIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Newest\")")
    public WebElement filteringNewest;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Womens Short Sleeve V Neck Mini Dress\n" +
            "0 (0  Reviews)\n" +
            "$89.00\")")
    public WebElement newestUrun1;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Price Low To High\")")
    public WebElement filteringPriceLowToHigh;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Price High To Low\")")
    public WebElement filteringPriceHighToLow;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Brands\")")
    public WebElement filteringBrands;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(8)")
    public WebElement filteringBrandsNike;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"size\")")
    public WebElement filteringSize;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(4)")
    public WebElement filteringSizeM;
    @AndroidFindBy(uiAutomator = " new UiSelector().description(\"M\")")
    public WebElement sizeUrunM;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"(18, Wine Red) Womens Short Sleeve Tie Dye Blosue T-Shirt\n" +
            "0 (0  Reviews)\n" +
            "$21.00\"]")
    public WebElement urunSizeM;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"color\")")
    public WebElement filteringColor;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(13)")
    public WebElement filteringColorRed;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Women Solid Casual Kaftan Gypsy Maxi Dress\n" +
            "0 (0  Reviews)\n" +
            "$99.00\")")
    public WebElement urunColorRed;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Go to Shopping\")")
    public WebElement afterRemoveGoToShpping;


    public  void userLoginWithMail () throws InterruptedException {
    String email = "gulcihan.user@querycart.com";
    String passWord = "Query.71024";
        ProfileButton.click();
        SignInButton.click();
        ReusableMethods.wait(1);
        UseEmailInsteadButton.click();
        ReusableMethods.wait(1);
        EmailButton.click();
        OptionsMet.clickAndSendKeys(EmailButton,email);
        ReusableMethods.wait(1);
        OptionsMet.clickAndSendKeys(PasswordButton,passWord);
        ReusableMethods.wait(3);
        signIn2Button.click();
        ReusableMethods.wait(1);
    }

    public void ekranKaydirmaMetodu(int x,int y,int wait, int shiftPixel, int times){
        for (int i = 0; i < times; i++) {
            // Create a pointer input instance for touch interactions
            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

// Define the actions sequence (e.g., press, wait, move, and release)
            Sequence swipe = new Sequence(finger, 1);
            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y)); // press
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.RIGHT.asArg())); // press down
            swipe.addAction(new Pause(finger, Duration.ofMillis(wait))); // wait
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(wait), PointerInput.Origin.viewport(), x-shiftPixel, y)); // move
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.RIGHT.asArg())); // release

// Perform the swipe action
            getAppiumDriver().perform(singletonList(swipe));

        }
    }
    public double getPriceFromProduct(WebElement product) {
        // Ürünün description alanından fiyatı çekiyoruz
        String description = product.getAttribute("contentDescription");

        // Fiyat bilgisini almak için $ işaretinden sonra gelen kısmı ayıklıyoruz
        String priceText = description.split("\\$")[1]; // $'den sonraki kısmı al

        // Fiyatı double olarak döndürüyoruz
        return Double.parseDouble(priceText);
    }
    // Her iki ürünün fiyatlarını almak için ayrı bir metod
    public void printProductPrices() {
        // İlk ürünün fiyatını al ve yazdır
        double price1 = getPriceFromProduct(womenCategoryUrun1);
        System.out.println("Price of Product 1: $" + price1);

        // İkinci ürünün fiyatını al ve yazdır
        double price2 = getPriceFromProduct(womenCategoryUrun2);
        System.out.println("Price of Product 2: $" + price2);
    }

}