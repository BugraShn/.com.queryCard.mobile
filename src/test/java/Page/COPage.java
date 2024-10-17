package Page;


import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;
import javax.sound.midi.InvalidMidiDataException;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class COPage {

    public COPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }



    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\n" +
            "0 (0  Reviews)\n" +
            "$65.00\")")
    public WebElement floralTshirtLink;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\n" +
            "S\n" +
            "$65.00\n" +
            "1\")")
    public WebElement shoppingproductName;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
    public WebElement increaseQuantity;

    @AndroidFindBy(accessibility  ="1")
    public WebElement quantityproduct;

    @AndroidFindBy(accessibility  ="2")
    public WebElement newquantityproduct;


    //Us024



    @AndroidFindBy(accessibility = "*Use Email Instead")
    public WebElement useMailInsteadLink;


    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public  WebElement emailBox;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public  WebElement passwordBox;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])[2]")
    public WebElement signInButton2;

    @AndroidFindBy(accessibility = "Add To Cart")
    public WebElement addToCartButton;
    @AndroidFindBy(accessibility = "Success\nProduct added to cart")
    public WebElement addToCartSuccessText;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    public WebElement cartIcon;
    @AndroidFindBy(accessibility = "Proceed to Checkout")
    public WebElement proceedToCheckoutButton;

    @AndroidFindBy(accessibility = "Save & Pay")
    public WebElement saveAndPayButton;
    @AndroidFindBy(accessibility = "Payment Information")
    public WebElement paymentInfoText;
    @AndroidFindBy(accessibility = "Select Payment Method")
    public WebElement paymentSelectionMenu;
    @AndroidFindBy(accessibility = "Stripe")
    public WebElement stripeButton;
    @AndroidFindBy(accessibility = "Cash On Delivery")
    public WebElement cashOnDeliveryButton;
    @AndroidFindBy(accessibility = "Credit")
    public WebElement creditButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Confirm Order\"]")
    public WebElement confirmOrderButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Back to Payment\"]")
    public WebElement backToPaymentLink;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement cardNo;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement dateCart;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement cvcCart;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public WebElement zipCart;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"confirmBtn\"]")
    public WebElement confirmButton;
    @AndroidFindBy(accessibility = "Go to shopping")
    public WebElement gotoShoppingButton;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"QueryCart - Shop Smarter, Live Better\"])[1]")
    public WebElement invoceHeader;

    @AndroidFindBy(accessibility = "Print Invoice")
    public WebElement printInvoice;

    @AndroidFindBy(accessibility = "Logout")
    public WebElement logoutButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Thank you for your order!\n" +
            "Your order is confirmed.\"]")
    public WebElement thankYou;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"card-errors\"]")
    public WebElement cardErrorText;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public WebElement invoiceFirstItem;
    @AndroidFindBy(accessibility = "Your Order status is as follows")
    public WebElement orderStatusText;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Go to Shopping\")")
    public WebElement goToShoppingButton;


    @AndroidFindBy(accessibility = "Home")
    public WebElement homePage1;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Download Receipt\")")
    public WebElement downlandReceiptButton; //fatura indirme

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add\")")
    public WebElement addNewAddressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement addAdressFullnameBox;

    @AndroidFindBy(accessibility = "Add Address") //  "Add Address" Button
    public WebElement addressButton;


    public  void login (){

        useMailInsteadLink.click();
        emailBox.click();
        emailBox.sendKeys(ConfigReader.getProperty("cimenemail"));
        ReusableMethods.wait(1);
        passwordBox.click();
        passwordBox.sendKeys(ConfigReader.getProperty("password2"));
        ReusableMethods.wait(2);
        signInButton2.click();
    }


    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[1]") //  "Full Name" Textbox
    public WebElement NewAdressFullName;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[2]") // "Email" Textbox
    public WebElement NewAdressEmail;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[3]") // "Phone" Textbox
    public WebElement NewAdressPhone;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.EditText\"])[4]") //  "Zip Code" Textbox
    public WebElement NewAdressZipCode;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(4)") // "Street Adress" Textbox
    public WebElement NewAdressStreetAdress;


    @AndroidFindBy(accessibility = "Country")
    public WebElement NewAdressCountry;

    @AndroidFindBy(accessibility = "State")
    public WebElement NewAdressState;

    @AndroidFindBy(accessibility = "City")
    public WebElement NewAdressCity;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement NewAdressAramaTextBox;

    @AndroidFindBy(accessibility = "Subtotal") //  "Subtotal"
    public WebElement subTotal;

    @AndroidFindBy(xpath = "(//*[@index=\"0\"])[13]")
    public WebElement NewAdressilk;

    @AndroidFindBy(accessibility = "AYŞE GEZGİN\n+12017776655\nfake1mail@gmail.com\nBeylikdüzü,IstanbulProvince,Turkey,2630000\nBagcı Street")
    public WebElement addressenter;

    public void addTocart() throws InvalidMidiDataException {
        addToCartButton.click();
        assertTrue(addToCartSuccessText.isDisplayed());
        ReusableMethods.wait(2);
        cartIcon.click();
        ReusableMethods.wait(2);
        proceedToCheckoutButton.click();
        ReusableMethods.wait(2);
        addressenter.click();

//        addNewAddressButton.click();
//        ReusableMethods.wait(2);
//        NewAdressFullName.click();
//        NewAdressFullName.sendKeys("AYŞE GEZGİN");
//        NewAdressEmail.click();
//        NewAdressEmail.sendKeys("fake1mail@gmail.com");
//        NewAdressPhone.click();
//        NewAdressPhone.sendKeys("7776655");
//        NewAdressCountry.click();
//        NewAdressAramaTextBox.click();
//        NewAdressAramaTextBox.sendKeys("Turkey");
//        NewAdressilk.click();
//        NewAdressState.click();
//        NewAdressAramaTextBox.click();
//        NewAdressAramaTextBox.sendKeys("İstanbul Province");
//        NewAdressilk.click();
//        NewAdressCity.click();
//        NewAdressAramaTextBox.click();
//        NewAdressAramaTextBox.sendKeys("Beylikdüzü");
//        NewAdressilk.click();
//        NewAdressZipCode.click();
//        NewAdressZipCode.sendKeys("2630000");
//        ReusableMethods.wait(2);
//        OptionsMet.hideKeyboard();
//        ReusableMethods.wait(4);
//        OptionsMet.swipe(204,1406,204,1228);
//        NewAdressStreetAdress.click();
//        NewAdressStreetAdress.sendKeys("Bagcı Street");
//        OptionsMet.hideKeyboard();
//        ReusableMethods.wait(2);
//        addressButton.click();

        ReusableMethods.wait(2);
        OptionsMet.swipe(408,1740,408,1002);
        ReusableMethods.wait(2);
        saveAndPayButton.click();
        ReusableMethods.wait(2);


    }



    public void stripePayment(String cartNo, String expiryDate, String cvv, String zip){
        ReusableMethods.wait(5);
        cardNo.click();
        cardNo.sendKeys(cartNo);
        ReusableMethods.wait(2);
        dateCart.click();
        dateCart.sendKeys(expiryDate);
        ReusableMethods.wait(2);
        cvcCart.click();
        cvcCart.sendKeys(cvv);
        ReusableMethods.wait(2);
        zipCart.click();
        zipCart.sendKeys(zip);
        ReusableMethods.wait(3);
        confirmButton.click();
        ReusableMethods.wait(2);
    }


    @AndroidFindBy(accessibility = "Order History")
    public WebElement orderHistoryText;



//US027

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(18)")
    public WebElement cardIcon; //Anasayfa card


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(8)")
    public WebElement decreaseQuantity; // - butonu


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Remove\")")
    public WebElement removeProductOnTheCardButton;

    @AndroidFindBy(xpath = "(//*[@index='3'])[1]")
    public WebElement subTotalText;


    public  void SelectElementText(String description) {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebElement webElement = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().description(\"" + description + "\")"));

        webElement.click();
        assertTrue(webElement.isEnabled());
    }

}
