package Page;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static utilities.Driver.getAppiumDriver;

public class GGPage {

    public GGPage(){
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
    }


}
