package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;

public class BSPage {

    public BSPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Categories\")")
    public WebElement homeCategoriesText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    public WebElement categoriesMen;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Toys\")")
    public WebElement categoriesToys;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Profile\")")
    public WebElement homePageProfileButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sing In To See Your Info\")")
    public WebElement singInToSeeText;

    @FindBy(xpath = "(//*[@content-desc='Sign Up'])[1]")
    public WebElement signUpButton1;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement signUpNameBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement signUpPhoneBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public WebElement signUpPasswordBox;

    @FindBy(xpath = "(//*[@content-desc='Sign Up'])[2]")
    public WebElement singUpButton2;

    @FindBy(xpath = "(//*[@content-desc='Sign In'])[1]")
    public WebElement signInText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"*Use Email Instead\")")
    public WebElement useEmailText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Adidas Ultraboost 21 Sneakers\n" +
            "0 (0  Reviews)\n" +
            "$180.00\")")
    public WebElement homePageadidasAyakkabi;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Edit Profile\")")
    public WebElement editProfilText;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement editPageMail;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save Changes\")")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//*[@index='2']")
    public WebElement editPageName;

    @FindBy(xpath = "//*[@index='6']")
    public WebElement editPageNumber;

    @FindBy(xpath = "//*[@index='3']")
    public WebElement actualReturnMail;


    public void SignInForm(String name, String phone, String password) {

        signUpNameBox.click();
        signUpNameBox.sendKeys(name);
        signUpPhoneBox.click();
        signUpPhoneBox.sendKeys(phone);
        signUpPasswordBox.click();
        signUpPasswordBox.sendKeys(password);
    }

    public void ProfilEditBs(String name, String mail, String phone) {

        editPageName.click();
        editPageName.clear();
        editPageName.sendKeys(ConfigReader.getProperty(name));
        ReusableMethods.wait(1);
        editPageMail.click();
        editPageMail.clear();
        editPageMail.sendKeys(ConfigReader.getProperty(mail));
        ReusableMethods.wait(1);
        editPageNumber.click();
        editPageNumber.clear();
        editPageNumber.sendKeys(ConfigReader.getProperty(phone));
        ReusableMethods.wait(1);
        saveChangesButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(actualReturnMail.isDisplayed());
    }

    // E2E testi icin lokateler
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Category\")")
    public WebElement homePagecategory;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Women\")")
    public WebElement womencategory;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement filtreleme;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sort By\")")
    public WebElement sortbyText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Top Rated\")")
    public WebElement topRated;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Nike Air Force 1 Sneakers\n" +
            "0 (0  Reviews)\n" +
            "$120.00\")")
    public WebElement nikeayakkabi;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Nike Air Force 1 Sneakers\n" +
            "White\n" +
            "$120.00\n" +
            "1\")")
    public WebElement sepettekiAyakkabi;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"White\")")
    public WebElement beyazrenk;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add To Cart\")")
    public WebElement addtoCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    public WebElement sepet;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Proceed to Checkout\")")
    public WebElement proceedCheckout;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Delivery\")")
    public WebElement deliveryButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"House\n" +
            "+1201123456789123\n" +
            "bugrasahin.user@querycart.com\n" +
            "BadBelzig,Brandenburg,Germany,333333\n" +
            "Goethe str. 19\")")
    public WebElement houseadress;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save & Pay\")")
    public WebElement saveandPay;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Cash On Delivery\")")
    public WebElement cashonDelivery;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Confirm Order\")")
    public WebElement confirmOrder;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Thank you for your order!\n" +
            "Your order is confirmed.\")")
    public WebElement thankyouOrder;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Go to order details\")")
    public WebElement orderDetails;

@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    public WebElement okayPicture;



}
