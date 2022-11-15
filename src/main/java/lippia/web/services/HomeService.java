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
                } catch (Exception e) {
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

    public static void clickMenuItemLinkToCheckoutPage() {
        click(PracticeConstants.BASKETMENUITEM_ANCHOR_XPATH);
    }

    public static void clickProceedToCheckout() {
        click(PracticeConstants.PROCEEDTOCHECKOUT_BUTTON_XPATH);
    }

    public static void fillBillingDetailsForm() {
        setInput(PracticeConstants.BILLINGFORM_FIRSTNAME_XPATH, PracticeConstants.BILLINGFORM_DATA.get("firstName"));
        setInput(PracticeConstants.BILLINGFORM_LASTNAME_XPATH, PracticeConstants.BILLINGFORM_DATA.get("lastName"));
        setInput(PracticeConstants.BILLINGFORM_EMAIL_XPATH, PracticeConstants.BILLINGFORM_DATA.get("email"));
        setInput(PracticeConstants.BILLINGFORM_PHONE_XPATH, PracticeConstants.BILLINGFORM_DATA.get("phone"));
        setInput(PracticeConstants.BILLINGFORM_COUNTRY_XPATH, PracticeConstants.BILLINGFORM_DATA.get("country"));
        setInput(PracticeConstants.BILLINGFORM_ADDRESS_XPATH, PracticeConstants.BILLINGFORM_DATA.get("address"));
        setInput(PracticeConstants.BILLINGFORM_CITY_XPATH, PracticeConstants.BILLINGFORM_DATA.get("city"));
        setInput(PracticeConstants.BILLINGFORM_STATE_XPATH, PracticeConstants.BILLINGFORM_DATA.get("state"));
        setInput(PracticeConstants.BILLINGFORM_POSTCODE_XPATH, PracticeConstants.BILLINGFORM_DATA.get("postcode"));
    }

    public static void selectPaymentGateway() {
        int i = (int) (Math.random() * 4);
        PracticeConstants.PAYMENTGATEWAY_INDEX[0] = i;
        click(PracticeConstants.PAYMENTGATEWAY_LOCATORS[i]);
    }

    public static void clickOnPlaceOrderButton() {
        click(PracticeConstants.PLACEORDER_BUTTON_XPATH);
    }
}
