package Page;


import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public abstract class BasePage {

    public Actions actions;

    public BasePage() {

        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
        actions = new Actions(getAppiumDriver());

    }

}
