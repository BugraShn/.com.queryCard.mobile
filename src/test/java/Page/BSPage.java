package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy (xpath = "(//*[@content-desc='Sign Up'])[1]")
    public WebElement signUpButton1;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement signUpNameBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement signUpPhoneBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public WebElement signUpPasswordBox;

    @FindBy (xpath = "(//*[@content-desc='Sign Up'])[2]")
    public WebElement singUpButton2;

    @FindBy (xpath = "(//*[@content-desc='Sign In'])[1]")
    public WebElement signInText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"*Use Email Instead\")")
    public WebElement useEmailText;











    public void SignInForm(String name, String phone, String password){

        signUpNameBox.click();
        signUpNameBox.sendKeys(name);
        signUpPhoneBox.click();
        signUpPhoneBox.sendKeys(phone);
        signUpPasswordBox.click();
        signUpPasswordBox.sendKeys(password);
    }


}
