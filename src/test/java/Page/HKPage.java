package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.assertTrue;
import static utilities.OptionsMet.*;

public class HKPage extends BasePage{


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement editButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement fullNameBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement emailBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private WebElement phoneBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Country\")")
    private WebElement selectCountryBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"State\")")
    private WebElement selectStateBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"City\")")
    private WebElement selectCityBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement searchBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    private WebElement zipCodeBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(4)")
    private WebElement streetNameBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Update Address\").instance(1)")
    private WebElement updateAddressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add Address\").instance(1)")
    private WebElement addAddressButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" + "Address Updated Successfully!\"]")
    private WebElement editSuccessMessage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" + "Address Added Successfully!\"]")
    private WebElement addedSuccessMessage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Error\n" + "Shipping & billing addresses are required.\"]")
    private WebElement noAddressErrorMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"This field is required\").instance(0)")
    private WebElement emptyNameError;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Enter Valid Email Address\")")
    private WebElement invalidMailError;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"This field is required\").instance(1)")
    private WebElement emptyPhoneError;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"This field is required\").instance(2)")
    private WebElement emptyAddressError;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
    private WebElement queryCardLogoElement;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View[6]")
    private WebElement firstProduct;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Categories\")")
    public WebElement homeCategoriesText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    public WebElement categoriesMen;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Toys\")")
    public WebElement categoriesToys;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement emailTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement passwordTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    private WebElement rememberMeCheckBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
    private WebElement signInLoginButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    private WebElement chartButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(9)")
    private WebElement actualAddress;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[2]")
    private WebElement searchBoxElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement phoneTextBox;

    @AndroidFindBy(accessibility = "See All")
    private WebElement seeAllIconElement;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(4)")
    private WebElement addWishListToast;

    public void clickEditButton(){

        editButton.click();
    }

    public void editAdress(String fullName,String email,String phoneNumber,String zipCode,String address){

        clickAndSendKeys(fullNameBox,fullName);
        clickAndSendKeys(emailBox,email);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        clickAndSendKeys(phoneBox,phoneNumber);
        ReusableMethods.wait(1);
        clickAndSendKeys(zipCodeBox,zipCode);
        ReusableMethods.wait(1);
        clickAndSendKeys(streetNameBox,address);
        hideKeyboard();
        updateAddressButton.click();

    }

    public void verifyEditSuccessMessage(){

        ReusableMethods.wait(1);
        editSuccessMessage.isDisplayed();
    }

    public void verifyAddressAddedSuccessMessage(){

        ReusableMethods.wait(1);
        addedSuccessMessage.isDisplayed();
    }

    public void verifyNoAddressErrorMessage(){

        ReusableMethods.wait(1);
        noAddressErrorMessage.isDisplayed();
    }

    public void addAdress(String fullName,String email,String phoneNumber,String country,String state,String city,String zipCode,String address){


        clickAndSendKeys(fullNameBox,fullName);
        clickAndSendKeys(emailBox,email);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        clickAndSendKeys(phoneBox,phoneNumber);
        ReusableMethods.wait(1);

        selectCountryBox.click();
        searchBox.sendKeys(country);
        touchDown(211,807);
        ReusableMethods.wait(1);
        selectStateBox.click();
        searchBox.sendKeys(state);
        touchDown(211,807);
        ReusableMethods.wait(1);
        selectCityBox.click();
        searchBox.sendKeys(city);
        touchDown(211,807);
        ReusableMethods.wait(1);

        clickAndSendKeys(zipCodeBox,zipCode);
        ReusableMethods.wait(1);
        clickAndSendKeys(streetNameBox,address);


        hideKeyboard();
        OptionsMet.clickButtonByDescription("Add Address");

    }

    public void verifyErrorMessageDisplayed(){

        emptyNameError.isDisplayed();
        invalidMailError.isDisplayed();
        emptyPhoneError.isDisplayed();
        emptyAddressError.isDisplayed();
    }

    public void verifyFooterElements(String homelink, String categorylink, String wishlistlink, String profilelink){

        ReusableMethods.wait(2);
        VerifyElementText(homelink);
        VerifyElementText(categorylink);
        VerifyElementText(wishlistlink);
        VerifyElementText(profilelink);
    }

    public void scrollPopularBrands() throws InvalidMidiDataException {

        ReusableMethods.wait(4);
        swipe(670,2475,670,75);
        swipe(670,2475,670,75);
    }

    public void verifyPopularBrands() throws InvalidMidiDataException {

        VerifyElementText("Blossom Boutique");
        VerifyElementText("Nike");
        VerifyElementText("Dr. Martens");
        VerifyElementText("Clarks");
        swipe(1274,2324,93,2324);
        ReusableMethods.wait(2);

        VerifyElementText("Converse");
        VerifyElementText("The North Face");
        VerifyElementText("Levis");
        VerifyElementText("Vans");
        swipe(1274,2324,93,2324);
        ReusableMethods.wait(2);

        VerifyElementText("Red Wing");
        VerifyElementText("Allen Edmonds");
        VerifyElementText("Adidas");
        VerifyElementText("Lesurmesure");
        swipe(1274,2324,93,2324);
        ReusableMethods.wait(2);

        VerifyElementText("Harrods");
        VerifyElementText("US Polo");
        VerifyElementText("Street Style Co.");
        VerifyElementText("Urban Casuals");
    }

    public void clickFirstProduct(){

        firstProduct.click();
    }

    public void selectSizeAndQuantity(String size,int quantity) throws InvalidMidiDataException {
        ReusableMethods.wait(2);
        clickButtonByDescription(size);
        ReusableMethods.wait(2);
        clickButtonByDescription(String.valueOf(quantity));
        ReusableMethods.wait(2);
        swipe(670,2560,670,2460);
    }

    public void verifyAddressDisplay(){

        System.out.println(actualAddress.getText());
        Assert.assertTrue(actualAddress.isDisplayed());
    }

    public void loginWithEmail(String email,String password){

        emailTextBox.click();
        emailTextBox.sendKeys(ConfigReader.getProperty(email));
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB).perform();
        passwordTextBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.wait(2);
        signInLoginButton.click();
    }

    public void clickChartButton(){
        chartButton.click();
    }

}
