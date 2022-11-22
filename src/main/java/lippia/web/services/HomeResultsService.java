package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class HomeResultsService extends ActionManager {

    private static List<WebElement> getSliders() {
        return getElements(PracticeConstants.XPATH_HOME_SLIDERS_CONTAINER);
    }

    public static void verifySliders() {
        Assert.assertEquals(getSliders().size(),3);
    }

    private static String getUrl() {
        return DriverManager.getDriverInstance().getCurrentUrl();
    }

    private static WebElement getAddToBasket() {
        return getElement(PracticeConstants.XPATH_HOME_ADDTOBASKET_BUTTON);
    }

    public static void verifyArrival() {
        Assert.assertTrue(getUrl().matches("https://practice.automationtesting.in/product/(.*)/"));
        Assert.assertEquals(getAddToBasket().getText(), "ADD TO BASKET");
    }

    private static WebElement getBasketMenuItemAnchor() {
        return getElement(PracticeConstants.XPATH_HOME_BASKETMENUITEM_ANCHOR);
    }

    public static void verifyAddToBasketMenuItem() {
        ActionManager.waitVisibility(PracticeConstants.XPATH_HOME_BASKETMENUITEM_SPAN);
        WebElement menuItem = getElement(PracticeConstants.XPATH_HOME_BASKETMENUITEM_SPAN);
        Assert.assertTrue(menuItem.getText().matches("1 Item"));
    }

    public static void verifyBasketMenuLink() {
        Assert.assertTrue(getBasketMenuItemAnchor().getAttribute("href").matches("https://practice.automationtesting.in/basket."));
    }

    public static void verifyThreeArrivalsOnHomePage() {
        List<WebElement> arrivals = getElements(PracticeConstants.XPATH_HOME_ARRIBAL_DIV);
        Assert.assertEquals(arrivals.size(), 3);
    }

    public static void verifyTotalAndSubtotalOnCheckoutPage() {
        WebElement total = getElement(PracticeConstants.XPATH_CHECKOUT_TOTAL);
        double totalValue = Double.parseDouble(total.getText().substring(1));
        WebElement subtotal = getElement(PracticeConstants.XPATH_CHECKOUT_SUBTOTAL);
        double subtotalValue = Double.parseDouble(subtotal.getText().substring(1));
        Assert.assertTrue(totalValue > 0);
        Assert.assertTrue(subtotalValue > 0);
        Assert.assertTrue(totalValue > subtotalValue);
    }

    public static void verifyCoupon() {
        String couponValue = PracticeConstants.VALUE_PAYMENT_COUPON;
        WebElement showCouponForm = getElement(PracticeConstants.XPATH_PAYMENT_COUPON_SHOW);
        new Actions(DriverManager.getDriverInstance()).moveToElement(showCouponForm).perform();
        click(PracticeConstants.XPATH_PAYMENT_COUPON_SHOW);
        setInput(PracticeConstants.XPATH_PAYMENT_COUPON_INPUT, couponValue);
        click(PracticeConstants.XPATH_PAYMENT_COUPON_SUBMIT);
        ActionManager.waitVisibility(PracticeConstants.XPATH_PAYMENT_COUPON_MESSAGE);
        WebElement couponMessage = getElement(PracticeConstants.XPATH_PAYMENT_COUPON_MESSAGE);
        Assert.assertEquals(couponMessage.getText(), "Coupon \"" + couponValue + "\" does not exist!");
    }

    public static void verifyDetailsInPaymentGatewayPage() {
        validateBillingDetails();
        validateAdditionalDetails();
        validateOrderDetails();
        validatePaymentGateways();
    }

    private static void validateBillingDetails() {
        WebElement firstName = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_FIRSTNAME);
        WebElement lastName = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_LASTNAME);
        WebElement company = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_COMPANY);
        WebElement email = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_EMAIL);
        WebElement phone = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_PHONE);
        WebElement country = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_COUNTRY);
        WebElement address = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_ADDRESS);
        WebElement addressDetail = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_ADDRESSDETAIL);
        WebElement city = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_CITY);
        WebElement state = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_STATE);
        WebElement postcode = getElement(PracticeConstants.XPATH_PAYMENT_BILLINGFORM_POSTCODE);
        Assert.assertEquals(firstName.getAttribute("value"), PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("firstName"));
        Assert.assertEquals(lastName.getAttribute("value"), PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("lastName"));
        Assert.assertEquals(email.getAttribute("value"), PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("email"));
        Assert.assertEquals(phone.getAttribute("value"), PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("phone"));
        Assert.assertEquals(country.getText(), PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("country"));
        Assert.assertEquals(address.getAttribute("value"), PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("address"));
        Assert.assertEquals(city.getAttribute("value"), PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("city"));
        Assert.assertEquals(state.getText(), PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("state"));
        Assert.assertEquals(postcode.getAttribute("value"), PracticeConstants.DATA_PAYMENT_BILLINGFORM.get("postcode"));
        Assert.assertTrue(company.isDisplayed());
        Assert.assertTrue(addressDetail.isDisplayed());
    }

    private static void validateAdditionalDetails() {
        WebElement additional = getElement(PracticeConstants.XPATH_PAYMENT_ADDITIONALDETAILS);
        Assert.assertTrue(additional.isDisplayed());
    }

    private static void validateOrderDetails() {
        WebElement total = getElement(PracticeConstants.XPATH_PAYMENT_TOTAL);
        double totalValue = Double.parseDouble(total.getText().substring(1));
        WebElement subtotal = getElement(PracticeConstants.XPATH_PAYMENT_SUBTOTAL);
        double subtotalValue = Double.parseDouble(subtotal.getText().substring(1));
        Assert.assertTrue(totalValue > 0);
        Assert.assertTrue(subtotalValue > 0);
        Assert.assertTrue(totalValue > subtotalValue);
    }

    private static void validatePaymentGateways() {
        WebElement radio = getElement(PracticeConstants.LOCATORS_PAYMENTGATEWAY[PracticeConstants.INDEX_PAYMENTGATEWAY[0]]);
        Assert.assertEquals(radio.getAttribute("selected"), "true");
    }

    public static void verifyOrderConfirmationPage() {
        ActionManager.waitVisibility(PracticeConstants.XPATH_CONFIRMATION_BILLING_TOTAL);
        WebElement orderNumber = getElement(PracticeConstants.XPATH_CONFIRMATION_ORDERNUMBER);
        Assert.assertTrue(Integer.parseInt(orderNumber.getText()) > 0);
        if (getElement(PracticeConstants.XPATH_CONFIRMATION_PAYMENTMETHOD).getText().equals("Direct Bank Transfer")) {
            WebElement bankHeader = getElement(PracticeConstants.XPATH_CONFIRMATION_BANKDETAILS_HEADER);
            Assert.assertTrue(bankHeader.isDisplayed());
        }
        WebElement totalBilling = getElement(PracticeConstants.XPATH_CONFIRMATION_BILLING_TOTAL);
        Assert.assertTrue(totalBilling.isDisplayed());
    }
}
