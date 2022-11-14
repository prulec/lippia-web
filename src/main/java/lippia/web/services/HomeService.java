package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public static void closeAds() {
        WebDriver driver = DriverManager.getDriverInstance();
        try {
            WebElement iframe1 = getElement(PracticeConstants.AD_IFRAME1_XPATH);
            if (iframe1.isDisplayed()) {
                driver.switchTo().frame(iframe1);
                try {
                    getElement(PracticeConstants.AD_CLOSE_BUTTON_XPATH).click();
                } catch(Exception e) {
                    WebElement iframe2 = getElement(PracticeConstants.AD_IFRAME2_XPATH);
                    driver.switchTo().frame(iframe2);
                    click(PracticeConstants.AD_CLOSE_BUTTON_XPATH);
                }
                driver.switchTo().defaultContent();
            }
        } catch (Exception e) {
            System.out.println("NO ADS!");
        }

    }

}
