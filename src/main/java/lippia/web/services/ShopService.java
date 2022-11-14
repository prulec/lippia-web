package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ShopService extends ActionManager {

    public static void clickCategory(int itemNumber) {
        click(PracticeConstants.CATEGORY_FILTERS_XPATH + "[" + itemNumber + "]/a");
    }

    private static List<Integer> getReadMoreIndexes() {
        int productsQuantity = getElements(PracticeConstants.PRODUCTITEMS_XPATH).size();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 1; i <= productsQuantity; i++) {
            String text = getElement(PracticeConstants.PRODUCTITEMS_XPATH + "[" + i + "]/a[2]").getText();
            if (text.matches("READ MORE")) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static void clickReadMore(int number) {
        click(PracticeConstants.PRODUCTITEMS_XPATH + "[" + getReadMoreIndexes().get(number-1) + "]/a[2]");
    }

    private static List<Integer> getSaleIndexes() {
        int productsQuantity = getElements(PracticeConstants.PRODUCTITEMS_XPATH).size();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 1; i <= productsQuantity; i++) {
            List<WebElement> spans = getElements(PracticeConstants.PRODUCTITEMS_XPATH + "[" + i + "]/a[1]/span");
            if (spans.get(0).getText().matches("SALE.")) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static void clickProductImageWithSale(int number) {
        WebActionManager.waitVisibilities(PracticeConstants.PRODUCTITEMS_XPATH);
        int index = getSaleIndexes().get(number-1);
        click(PracticeConstants.PRODUCTITEMS_XPATH + "[" + index + "]/a[2]");
    }

}
