package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ShopResultsService extends ActionManager {

    public static void verifyFilteredProducts(int number) {
        String categoryName = getElement(PracticeConstants.CATEGORY_FILTERS_XPATH + "[" + number + "]/a").getText().toLowerCase();
        List<WebElement> products = getElements(PracticeConstants.PRODUCTITEMS_XPATH);
        for (WebElement product: products) {
            Assert.assertTrue(product.getAttribute("class").matches(".*product_cat-" + categoryName + ".*"));
        }
    }

    public static void verifyOutOfStockMessage() {
        String text = getElement(PracticeConstants.OUTOFSTOCK_XPATH).getText();
        Assert.assertTrue(text.matches("Out of stock"));
    }

    public static void verifyAddToBasketNotDisplayed() {
        Assert.assertEquals(getElements(PracticeConstants.ADDTOBASKET_BUTTON_XPATH).size(), 0);
    }

    public static void verifyCurrentPriceDisplayed() {
        List<WebElement> prices = getElements(PracticeConstants.PRICE_XPATH + "/ins");
        Assert.assertEquals(prices.size(), 1);
    }

    public static void verifyOldPriceDisplayed() {
        List<WebElement> prices = getElements(PracticeConstants.PRICE_XPATH + "/del");
        Assert.assertEquals(prices.size(), 1);
    }

}
