package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
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



}
