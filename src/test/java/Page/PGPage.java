package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import static utilities.Driver.getAppiumDriver;

public class PGPage {

    public PGPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }



    @AndroidFindBy(xpath = "//*[@package='com.wise.querycart']")
    public List<WebElement> products;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Favorite\")")
    public WebElement favoritePropertyAsign;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"description\")")
    public WebElement textOfPrivateProduct;

    @AndroidFindBy(xpath = "(//*[@content-desc='Sign In'])[1]")
    public WebElement SignInTitle;




}
