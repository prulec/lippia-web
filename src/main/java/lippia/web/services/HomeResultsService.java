package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomeResultsService extends ActionManager {

    private static List<WebElement> getSliders() {
        return getElements(PracticeConstants.SLIDERS_CONTAINER_XPATH);
    }

    public static void verifySliders() {
        Assert.assertEquals(getSliders().size(),3);
    }

    private static String getUrl() {
        return DriverManager.getDriverInstance().getCurrentUrl();
    }

    private static WebElement getAddToBasket() {
        return getElement(PracticeConstants.ADDTOBASKET_BUTTON_XPATH);
    }

    public static void verifyArrival() {
        Assert.assertTrue(getUrl().matches("https://practice.automationtesting.in/product/(.*)/"));
        Assert.assertEquals(getAddToBasket().getText(), "ADD TO BASKET");
    }

    private static WebElement getBasketMenuItemAnchor() {
        return getElement(PracticeConstants.BASKETMENUITEM_ANCHOR_XPATH);
    }

    private static WebElement getBasketMenuItemSpan() {
        return getElement(PracticeConstants.BASKETMENUITEM_SPAN_XPATH);
    }

    public static void verifyAddToBasketMenuItem() {
        Assert.assertTrue(getBasketMenuItemSpan().getText().matches("1 Item"));
    }

    public static void verifyBasketMenuLink() {
        Assert.assertTrue(getBasketMenuItemAnchor().getAttribute("href").matches("https://practice.automationtesting.in/basket."));
    }

    public static void verifyThreeArrivalsOnHomePage() {
        List<WebElement> arrivals = getElements(PracticeConstants.ARRIBAL_DIV_XPATH);
        Assert.assertEquals(arrivals.size(), 3);
    }

    public static void verifyTotalAndSubtotalOnCheckoutPage() {
        WebElement total = getElement(PracticeConstants.TOTAL_BASKET_XPATH);
        double totalValue = Double.parseDouble(total.getText());
        WebElement subtotal = getElement(PracticeConstants.SUBTOTAL_BASKET_XPATH);
        double subtotalValue = Double.parseDouble(subtotal.getText());
        Assert.assertTrue(totalValue > 0);
        Assert.assertTrue(subtotalValue > 0);
        Assert.assertTrue(totalValue > subtotalValue);
    }
}
