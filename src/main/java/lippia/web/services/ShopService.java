package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ShopService extends ActionManager {

    public static void clickCategory(int itemNumber) {
        click(PracticeConstants.XPATH_SHOP_CATEGORY_FILTERS + "[" + itemNumber + "]/a");
    }

    private static List<Integer> getReadMoreIndexes() {
        int productsQuantity = getElements(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH).size();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 1; i <= productsQuantity; i++) {
            String text = getElement(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH + "[" + i + "]/a[2]").getText();
            if (text.matches("READ MORE")) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static void clickReadMore(int number) {
        click(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH + "[" + getReadMoreIndexes().get(number-1) + "]/a[2]");
    }

    private static List<Integer> getSaleIndexes() {
        int productsQuantity = getElements(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH).size();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 1; i <= productsQuantity; i++) {
            List<WebElement> spans = getElements(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH + "[" + i + "]/a[1]/span");
            if (spans.get(0).getText().matches("SALE.")) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static void clickProductImageWithSale(int number) {
        WebActionManager.waitVisibilities(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH);
        int index = getSaleIndexes().get(number-1);
        click(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH + "[" + index + "]/a[2]");
    }

    private static List<Integer> getAddToBasketIndexes() {
        int productsQuantity = getElements(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH).size();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 1; i <= productsQuantity; i++) {
            String text = getElement(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH + "[" + i + "]/a[2]").getText();
            if (text.matches("ADD TO BASKET")) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static void clickAddToBasketNumber(int number) {
        click(PracticeConstants.XPATH_SHOP_PRODUCTITEMS_XPATH + "[" + getAddToBasketIndexes().get(number-1) + "]/a[2]");
    }

    public static void selectCountryInBillingForm(String country) {
        click(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_COUNTRY);
        click(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_COUNTRYITEM_START + country + "']");
    }
}
