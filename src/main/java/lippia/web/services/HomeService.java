package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService extends ActionManager {

    public static void navigateToPracticeHome() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickShopButton() {
        click(PracticeConstants.SHOP_BUTTON_XPATH);
    }

    public static void clickHomeButton() {
        click(PracticeConstants.HOME_MENU_BUTTON_XPATH);
    }

    public static void clickArrivalImage(int order) {
        click(PracticeConstants.ARRIVAL_CONTAINER_XPATH + "/div[" + order + "]");
    }

    public static void clickAddToBasket() {
        click(PracticeConstants.ADDTOBASKET_BUTTON_XPATH);
    }

}
