package Page;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class GGPage extends BasePage {

    AndroidDriver driver = (AndroidDriver) getAppiumDriver();
    String password = ConfigReader.getProperty("ggValidPass");

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"App Download\")")
    private WebElement appDownloadLink;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Forgot Password\")")
    private WebElement forgotPasswordLink;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement goBackArrow;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    private WebElement manCategoryLink;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement searchButton;

    @AndroidFindBy(className = "android.widget.EditText")
    private WebElement searchTextBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Search Results\")")
    private WebElement searchResults;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement emailPhoneBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Reset Password\")")
    private WebElement resetPassHeader;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement newPasswordBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement confirmPasswordBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Error\n" + "This email does not exist.\")")
    private WebElement errorMessageEmail;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Error\n" + "This phone does not exist.\")")
    private WebElement errorMessagePhone;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement oldPassdBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement newPasswBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private WebElement confirmPassBox;

   @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
   private WebElement passwordBox;

   @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Change Password\n" + "Password Updated Successfully\")")
   private WebElement passwordChangeMessage;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Change Password\n" + "The old password does not match.\")")
    private WebElement passwordChangeErroeMessage;
















    public void appDownloadLinkVisibilty() {
        assertTrue(appDownloadLink.isDisplayed());
    }

    public void forgotPasswordLinkVisibilty() {
        assertTrue(forgotPasswordLink.isDisplayed());
    }

    public void manCategoryLinkVisibilty() {
        assertTrue(manCategoryLink.isDisplayed());
    }


    public void searchButtonClick() {
        searchButton.click();
    }

    public void entersSearchTextBox(String searchingItems) {

        if (searchTextBox.getText().isBlank()) {

            searchTextBox.sendKeys(searchingItems);
            ReusableMethods.wait(1);
            driver.pressKey(new KeyEvent(AndroidKey.ENTER));
            ReusableMethods.wait(3);

        } else {
            searchTextBox.clear();
            searchTextBox.sendKeys(searchingItems);
            ReusableMethods.wait(1);
            driver.pressKey(new KeyEvent(AndroidKey.ENTER));
            ReusableMethods.wait(3);
        }


    }

    public void searchResults() {

        assertTrue(searchResults.isDisplayed());
    }

    public void entersEmail(String emailOrPhone) {
        emailPhoneBox.click();
        emailPhoneBox.sendKeys(emailOrPhone);
    }

    public void verifyResetPassPage() {
        assertTrue(resetPassHeader.isDisplayed());
    }

    public void resetPassword() {


        ReusableMethods.wait(1);
        newPasswordBox.click();
        newPasswordBox.sendKeys(password);
        ReusableMethods.wait(1);
        confirmPasswordBox.click();
        confirmPasswordBox.sendKeys(password);

        OptionsMet.clickButtonByDescription("Submit");

    }

    public void phoneErrorMessageIsDisplayed() {
        assertTrue(errorMessagePhone.isDisplayed());

    }

    public void emailErrorMessageIsDisplayed() {
        assertTrue(errorMessageEmail.isDisplayed());

    }

    public void entersOldPass(String oldpass){

        oldPassdBox.click();
        oldPassdBox.sendKeys(oldpass);

    }

    public void entersNewPass(String newpass){



        newPasswBox.click();
        newPasswBox.sendKeys(newpass);
        confirmPassBox.click();
        confirmPassBox.sendKeys(newpass);


    }

    public void sigInMail(String email){
        emailPhoneBox.click();
        emailPhoneBox.sendKeys(email);

    }

    public void sigInPass(String password){

        passwordBox.click();
        passwordBox.sendKeys(password);


    }

    public void verifiesOldPass(){
        assertTrue(oldPassdBox.isDisplayed());
    }

    public void verifiesNewPass(){
        assertTrue(newPasswBox.isDisplayed());
    }

    public void verifiesConfirmPass(){
        assertTrue(confirmPassBox.isDisplayed());
    }

    public void passChangeMessageIsDisplayed(){

        assertTrue(passwordChangeMessage.isDisplayed());

    }


    public void passChangeErrorMessageIsDisplayed(){

        assertTrue(passwordChangeErroeMessage.isDisplayed());

    }

}
