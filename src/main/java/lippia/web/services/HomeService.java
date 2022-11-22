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
        click(PracticeConstants.XPATH_HOME_SHOP_BUTTON);
    }

    public static void clickHomeButton() {
        click(PracticeConstants.XPATH_HOME_MENU_BUTTON);
    }

    public static void clickArrivalImage(int order) {
        click(PracticeConstants.XPATH_HOME_ARRIVAL_CONTAINER + "/div[" + order + "]");
    }

    public static void clickAddToBasket() {
        click(PracticeConstants.XPATH_HOME_ADDTOBASKET_BUTTON);
    }

    public static void closeAds() {
        WebDriver driver = DriverManager.getDriverInstance();
        try {
            WebElement iframe1 = getElement(PracticeConstants.XPATH_AD_IFRAME1);
            if (iframe1.isDisplayed()) {
                driver.switchTo().frame(iframe1);
                try {
                    getElement(PracticeConstants.XPATH_AD_CLOSE_BUTTON).click();
                } catch (Exception e) {
                    WebElement iframe2 = getElement(PracticeConstants.XPATH_AD_IFRAME2);
                    driver.switchTo().frame(iframe2);
                    click(PracticeConstants.XPATH_AD_CLOSE_BUTTON);
                }
                driver.switchTo().defaultContent();
            }
        } catch (Exception e) {
            System.out.println("NO ADS!");
        }
    }

    public static void clickMenuItemLinkToCheckoutPage() {
        click(PracticeConstants.XPATH_HOME_BASKETMENUITEM_ANCHOR);
        closeAds();
    }

    public static void clickProceedToCheckout() {
        click(PracticeConstants.XPATH_CHECKOUT_PROCEEDTOCHECKOUT_BUTTON);
    }

    public static void fillBillingDetailsForm() {
        ActionManager.waitClickable(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_FIRSTNAME);
        setInput(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_FIRSTNAME, PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("firstName"));
        setInput(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_LASTNAME, PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("lastName"));
        setInput(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_EMAIL, PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("email"));
        setInput(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_PHONE, PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("phone"));
        click(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_COUNTRY);
        click(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_COUNTRYITEM_START + PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("country") + "']");
        setInput(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_ADDRESS, PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("address"));
        setInput(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_CITY, PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("city"));
        click(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_STATE);
        click(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_STATEITEM_INCOMPLETE + PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("state") + "']");
        setInput(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_POSTCODE, PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("postcode"));
    }

    public static void selectPaymentGateway() {
        // Last option (PayPal) isn't working currently
        int i = (int) (Math.random() * 3);
        PracticeConstants.INDEX_PAYMENTGATEWAY[0] = i;
        click(PracticeConstants.LOCATORS_PAYMENTGATEWAY[i]);
    }

    public static void clickOnPlaceOrderButton() {
        click(PracticeConstants.XPATH_PAYMENT_PLACEORDER_BUTTON);
    }
}
