package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;

public class ShopService extends ActionManager {

    public static void clickCategory(int itemNumber) {
        click(PracticeConstants.CATEGORY_FILTERS_XPATH + "[" + itemNumber + "]");
    }
    public static void clickReadMore(int number) {
        click(PracticeConstants.PRODUCTITEMS_XPATH + "[" + number + "]/a[2]");
    }
    public static void clickProductImageWithSale(int number) {
        click(PracticeConstants.PRODUCTITEMS_XPATH + "[" + number + "]/a[1]");
    }

}
