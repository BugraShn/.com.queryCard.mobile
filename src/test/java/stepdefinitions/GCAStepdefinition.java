package stepdefinitions;
import org.openqa.selenium.TimeoutException;

import Page.BSPage;
import Page.GCAPage;
import Page.QueryCardPage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.profiler.model.Profile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Collections;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.*;

public class GCAStepdefinition extends OptionsMet {

    GCAPage gcaPage = new GCAPage();



        Actions actions = new Actions(getAppiumDriver());
        TouchAction action = new TouchAction<>((PerformsTouchActions) driver);

        @Given("go to home page as a user")
        public void go_to_home_page_as_a_user() throws InterruptedException {
            getAppiumDriver();
            ReusableMethods.wait(5);
            gcaPage.userLoginWithMail();
        }

        @Given("Verify the visibility of the Women icon on Homepage and click on it")
        public void verify_the_visibility_of_the_women_icon_on_homepage_and_click_on_it() {
            ReusableMethods.wait(5);
            gcaPage.ekranKaydirmaMetodu(924, 908, 600, 600, 5);

        }

        @Given("Verify the Women page is opened")
        public void verify_the_women_page_is_opened() {
            Assert.assertTrue(gcaPage.womenCategory.isDisplayed());
            ReusableMethods.wait(2);

        }

        @Given("Verify the visibility of the {string} section")
        public void verify_the_visibility_of_the_women_section(String womenCat) {
            ReusableMethods.wait(1);
            gcaPage.ekranKaydirmaMetodu(924, 908, 600, 300, 1);
            OptionsMet.VerifyElementText(womenCat);
            ReusableMethods.wait(1);
        }

        @Given("Given User clicks on the Women icon")
        public void given_user_clicks_on_the_women_icon() {
            ReusableMethods.wait(5);
            gcaPage.ekranKaydirmaMetodu(924, 908, 600, 600, 5);
            OptionsMet.clickAndVerify(gcaPage.womenCategory);
            ReusableMethods.wait(5);

        }

        @Given("User clicks on a product on the page")
        public void user_clicks_on_a_product_on_the_page() {
            OptionsMet.clickAndVerify(gcaPage.womenCategoryUrun1);
            ReusableMethods.wait(3);
        }

        @Given("User selects the size")
        public void user_selects_the_size() {
            OptionsMet.clickAndVerify(gcaPage.sizeM);
            ReusableMethods.wait(4);
        }

        @Given("User clicks on the {string} button")
        public void user_clicks_on_the_button(String string) throws InvalidMidiDataException {
            OptionsMet.swipe(458, 1699, 458, 898);
            ReusableMethods.wait(3);
            gcaPage.addToCartIcon.click();
            ReusableMethods.wait(5);
        }

        @Given("Verify that the {string} message is visible")
        public void verify_that_the_message_is_visible(String string) {
            OptionsMet.VerifyElementText(string);
            ReusableMethods.wait(5);
        }

        @Given("User navigates to the cart in the top right corner")
        public void user_navigates_to_the_cart_in_the_top_right_corner() {
            OptionsMet.clickAndVerify(gcaPage.sepet2);
            ReusableMethods.wait(5);
        }

        @Given("Verify that the product is added to the cart")
        public void verify_that_the_product_is_added_to_the_cart() {
            assertTrue(gcaPage.sepettekiUrunTshirt.isDisplayed());
            ReusableMethods.wait(5);
        }

        @Given("User clicks on the {string} button under the added product")
        public void user_clicks_on_the_button_under_the_added_product(String string) {
            OptionsMet.clickButtonByDescription(string);
            ReusableMethods.wait(5);
        }

        @Given("Verify that the product is removed from the cart")
        public void verify_that_the_product_is_removed_from_the_cart() {
            assertTrue(gcaPage.afterRemoveGoToShpping.isDisplayed());
            ReusableMethods.wait(5);

        }

        @Given("User clicks on the {string} icon")
        public void user_clicks_on_the_icon(String string) {
            ReusableMethods.wait(5);
            gcaPage.ekranKaydirmaMetodu(924, 908, 600, 800, 6);
            clickButtonByDescription(string);
        }

        @Given("User clicks on a product on the shoes page")
        public void user_clicks_on_a_product_on_the_shoes_page() {
            gcaPage.kalpIconUrunUstunde.click();
            ReusableMethods.wait(5);


        }

        @Given("User navigates to the wishlist")
        public void user_navigates_to_the_wishlist() throws InterruptedException {
            ReusableMethods.koordinatTiklamaMethodu(61, 156);
            ReusableMethods.wait(5);
            gcaPage.wishList.click();
            ReusableMethods.wait(5);

        }

        @Given("Verify that the added product is visible in the wishlist")
        public void verify_that_the_added_product_is_visible_in_the_wishlist() {
            assertTrue(gcaPage.sepettekiUrunTshirt.isDisplayed());
            ReusableMethods.wait(5);
        }

        @Given("User clicks on the Sort By icon")
        public void user_clicks_on_the_sort_by_icon() {
            gcaPage.sortByIcon.click();
            gcaPage.filteringSortByIcon.click();
        }


        @Given("User selects {string} filter")
        public void user_selects_filter(String filterName) {
            // Lokasyonu bulup tıklamak için switch-case yapısı
            WebElement filterElement = null;

            switch (filterName.toLowerCase()) {
                case "newest":
                    filterElement = gcaPage.filteringNewest;
                    break;
                case "price low to high":
                    filterElement = gcaPage.filteringPriceLowToHigh;
                    break;
                case "price high to low":
                    filterElement = gcaPage.filteringPriceHighToLow;
                    break;
                case "brands":
                    filterElement = gcaPage.filteringBrands;
                    break;
                case "nike":
                    filterElement = gcaPage.filteringBrandsNike;
                    break;
                case "size":
                    filterElement = gcaPage.filteringSize;
                    break;
//                case "M":
//                    filterElement = gcaPage.filteringSizeM;
//                    break;
                case "color":
                    filterElement = gcaPage.filteringColor;
                    break;
//                case "Red":
//                    filterElement = gcaPage.filteringColorRed;
//                    break;
                default:
                    throw new NoSuchElementException("Filter not found: " + filterName);
            }
// Eğer filtre elementi bulunursa, tıklanabilir olmasını bekleyip tıklıyoruz
            if (filterElement != null) {
                WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(10));
                // İlk adım: "Size" filtresini açıyoruz (örneğin filterName = "size" olduğunda)
                if (filterName.equalsIgnoreCase("size")) {
                    wait.until(ExpectedConditions.elementToBeClickable(filterElement));
                    filterElement.click();
                    System.out.println("Filter selected: Size");
                    WebElement sizeMElement = gcaPage.filteringSizeM;
                    sizeMElement.click();
                    System.out.println("Size M selected");
                } else if (filterName.equalsIgnoreCase("color")) {
                    wait.until(ExpectedConditions.elementToBeClickable(filterElement));
                    filterElement.click();
                    WebElement sizeMElement = gcaPage.filteringColorRed;
                    sizeMElement.click();
                    System.out.println("Red Color selected");

                } else {
                    filterElement.click();
                    System.out.println("Filter selected: " + filterName);
                }
            }
        }
    @Given("click the back button")
    public void click_the_back_button() {
        ReusableMethods.wait(2);
        OptionsMet.KeyBack();
    }


    @Given("Verify that the products on the page are sorted by newest")
        public void verify_that_the_products_on_the_page_are_sorted_by_newest() {
            assertTrue(gcaPage.newestUrun1.isDisplayed());

        }

        @Given("Verify that products are sorted from lowest price to highest price")
        public void verify_that_products_are_sorted_from_lowest_price_to_highest_price() {
            // gcaPage.sortByIcon.click();
            // gcaPage.filteringSortByIcon.click();
            // gcaPage.filteringPriceLowToHigh.click();
            double price1 = gcaPage.getPriceFromProduct(gcaPage.womenCategoryUrun1);
            double price2 = gcaPage.getPriceFromProduct(gcaPage.womenCategoryUrun2);
            Assert.assertTrue("Prices are not in ascending order!", price1 <= price2);
            System.out.println("Prices are in ascending order.");

        }

        @Given("Verify that products are sorted from highest price to lowest price")
        public void verify_that_products_are_sorted_from_highest_price_to_lowest_price() {
            double price1 = gcaPage.getPriceFromProduct(gcaPage.siralamaPriceHochUrun1);
            double price2 = gcaPage.getPriceFromProduct(gcaPage.siralamaPriceHochUrun2);
            Assert.assertTrue("Prices are not in ascending order!", price1 >= price2);
            System.out.println("Prices are in ascending order.");
        }

        @Given("Verify that only Nike products are displayed")
        public void verify_that_only_nike_products_are_displayed() {
            ReusableMethods.wait(2);
            OptionsMet.KeyBack();
            ReusableMethods.wait(2);
            assertTrue(gcaPage.nikeUrun.isDisplayed());
        }

        @Given("User clicks on the SortByHamburger By icon")
        public void user_clicks_on_the_sort_by_hamburger_by_icon() {
            gcaPage.sortByIcon.click();
            ReusableMethods.wait(4);

        }

        @Given("Verify that only M size products are displayed")
        public void then_verify_that_only_m_size_products_are_displayed() {
            ReusableMethods.wait(4);
            OptionsMet.KeyBack();
            ReusableMethods.wait(10);
            gcaPage.urunSizeM.click();
            assertTrue( gcaPage.sizeUrunM.isDisplayed());
        }

        @Given("Verify that only red-colored products are displayed")

        public void verify_that_only_red_colored_products_are_displayed() {
            ReusableMethods.wait(4);
            OptionsMet.KeyBack();
            ReusableMethods.wait(5);
            assertTrue(gcaPage.urunColorRed.isDisplayed());

        }

    }

