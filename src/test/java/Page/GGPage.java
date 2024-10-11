package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

public class GGPage {

    public GGPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    AndroidDriver driver = (AndroidDriver) getAppiumDriver();

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

    public void entersSearchTextBox(String searchingItems){

        if (searchTextBox.getText().isBlank()){

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

    public void searchResults(){

        assertTrue(searchResults.isDisplayed());
    }



}
