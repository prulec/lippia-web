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

    public static void clickMenuItemLinkToCheckoutPage() {
        click(PracticeConstants.BASKETMENUITEM_ANCHOR_XPATH);
    }

    public static void clickProceedToCheckout() {
        click(PracticeConstants.PROCEEDTOCHECKOUT_BUTTON_XPATH);
    }

    public static void fillBillingDetailsForm() {
        setInput(PracticeConstants.BILLINGFORM_FIRSTNAME_XPATH, "Roberto");
        setInput(PracticeConstants.BILLINGFORM_LASTNAME_XPATH, "Gómez Bolaños");
        setInput(PracticeConstants.BILLINGFORM_EMAIL_XPATH, "chespirito@domain.com.mx");
        setInput(PracticeConstants.BILLINGFORM_PHONE_XPATH, "+52 55 57093744");
        setInput(PracticeConstants.BILLINGFORM_COUNTRY_XPATH, "Mexico");
        setInput(PracticeConstants.BILLINGFORM_ADDRESS_XPATH, "Lorenzo Boturini 435");
        setInput(PracticeConstants.BILLINGFORM_CITY_XPATH, "Cuauhtémoc");
        setInput(PracticeConstants.BILLINGFORM_STATE_XPATH, "Distrito Federal");
        setInput(PracticeConstants.BILLINGFORM_POSTCODE_XPATH, "10020");
    }

    public static void selectPaymentGateway() {
        String[] paymentGatewayLocators = {
                PracticeConstants.PAYMENTGATEWAY_DIRECT_XPATH,
                PracticeConstants.PAYMENTGATEWAY_CHECK_XPATH,
                PracticeConstants.PAYMENTGATEWAY_CASH_XPATH,
                PracticeConstants.PAYMENTGATEWAY_PAYPAL_XPATH
        };
        int i = (int) (Math.random() * 4);
        click(paymentGatewayLocators[i]);
    }
}
