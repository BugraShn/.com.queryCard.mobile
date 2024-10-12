package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static utilities.Driver.getAppiumDriver;

public class GCAPage {
    public GCAPage() {

        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    AndroidDriver driver = (AndroidDriver) getAppiumDriver();
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Profile\"]")
   public WebElement ProfileButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign In\"]")
    public WebElement SignInButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"*Use Email Instead\"]")
    public WebElement UseEmailInsteadButton;
    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement EmailButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement PasswordButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")
    public WebElement rememberMeButton;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])[2]")
    public WebElement signIn2Button;

    public  void userLoginWithMail () throws InterruptedException {
    String email = "gulcihan.user@querycart.com";
    String passWord = "Query.71024";
        ProfileButton.click();
        SignInButton.click();
        ReusableMethods.wait(3);
        UseEmailInsteadButton.click();
        ReusableMethods.wait(3);
        OptionsMet.clickAndSendKeys(EmailButton,email);

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        ReusableMethods.wait(3);
        PasswordButton.sendKeys(passWord);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        ReusableMethods.wait(3);
        rememberMeButton.click();
        ReusableMethods.wait(3);
        signIn2Button.click();
        ReusableMethods.wait(2);


    }
}