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

    public static void verifyCoupon() {
        String couponValue = PracticeConstants.COUPON_VALUE;
        click(PracticeConstants.COUPON_SHOW_XPATH);
        setInput(PracticeConstants.COUPON_INPUT_XPATH, couponValue);
        click(PracticeConstants.COUPON_SUBMIT_XPATH);
        WebElement couponMessage = getElement(PracticeConstants.COUPON_MESSAGE_XPATH);
        Assert.assertEquals(couponMessage.getText(), "Coupon " + couponValue + " does not exist!");
    }

    public static void verifyDetailsInPaymentGatewayPage() {
        validateBillingDetails();
        validateAdditionalDetails();
        validateOrderDetails();
        validatePaymentGateways();
    }

    private static void validateBillingDetails() {
        WebElement firstName = getElement(PracticeConstants.BILLINGFORM_FIRSTNAME_XPATH);
        WebElement lastName = getElement(PracticeConstants.BILLINGFORM_LASTNAME_XPATH);
        WebElement company = getElement(PracticeConstants.BILLINGFORM_COMPANY_XPATH);
        WebElement email = getElement(PracticeConstants.BILLINGFORM_EMAIL_XPATH);
        WebElement phone = getElement(PracticeConstants.BILLINGFORM_PHONE_XPATH);
        WebElement country = getElement(PracticeConstants.BILLINGFORM_COUNTRY_XPATH);
        WebElement address = getElement(PracticeConstants.BILLINGFORM_ADDRESS_XPATH);
        WebElement addressDetail = getElement(PracticeConstants.BILLINGFORM_ADDRESSDETAIL_XPATH);
        WebElement city = getElement(PracticeConstants.BILLINGFORM_CITY_XPATH);
        WebElement state = getElement(PracticeConstants.BILLINGFORM_STATE_XPATH);
        WebElement postcode = getElement(PracticeConstants.BILLINGFORM_POSTCODE_XPATH);
        Assert.assertEquals(firstName.getText(), PracticeConstants.BILLINGFORM_DATA.get("firstName"));
        Assert.assertEquals(lastName.getText(), PracticeConstants.BILLINGFORM_DATA.get("lastName"));
        Assert.assertEquals(email.getText(), PracticeConstants.BILLINGFORM_DATA.get("email"));
        Assert.assertEquals(phone.getText(), PracticeConstants.BILLINGFORM_DATA.get("phone"));
        Assert.assertEquals(country.getText(), PracticeConstants.BILLINGFORM_DATA.get("country"));
        Assert.assertEquals(address.getText(), PracticeConstants.BILLINGFORM_DATA.get("address"));
        Assert.assertEquals(city.getText(), PracticeConstants.BILLINGFORM_DATA.get("city"));
        Assert.assertEquals(state.getText(), PracticeConstants.BILLINGFORM_DATA.get("state"));
        Assert.assertEquals(postcode.getText(), PracticeConstants.BILLINGFORM_DATA.get("postcode"));
        Assert.assertTrue(company.isDisplayed());
        Assert.assertTrue(addressDetail.isDisplayed());
    }

    private static void validateAdditionalDetails() {
        WebElement additional = getElement(PracticeConstants.ADDITIONALDETAILS_XPATH);
        Assert.assertTrue(additional.isDisplayed());
    }

    private static void validateOrderDetails() {
        WebElement total = getElement(PracticeConstants.TOTAL_PAYMENTPAGE_XPATH);
        double totalValue = Double.parseDouble(total.getText());
        WebElement subtotal = getElement(PracticeConstants.SUBTOTAL_PAYMENTPAGE_XPATH);
        double subtotalValue = Double.parseDouble(subtotal.getText());
        Assert.assertTrue(totalValue > 0);
        Assert.assertTrue(subtotalValue > 0);
        Assert.assertTrue(totalValue > subtotalValue);
    }

    private static void validatePaymentGateways() {
        WebElement radio = getElement(PracticeConstants.PAYMENTGATEWAY_LOCATORS[PracticeConstants.PAYMENTGATEWAY_INDEX[0]]);
        Assert.assertTrue(radio.isSelected());
    }

    public static void verifyOrderConfirmationPage() {
        WebElement orderNumber = getElement(PracticeConstants.ORDER_NUMBER_XPATH);
        Assert.assertTrue(Integer.parseInt(orderNumber.getText()) > 0);
        WebElement bankHeader = getElement(PracticeConstants.ORDER_BANKDETAILS_HEADER_XPATH);
        Assert.assertTrue(bankHeader.isDisplayed());
        WebElement totalBilling = getElement(PracticeConstants.ORDER_BILLING_TOTAL_XPATH);
        Assert.assertTrue(totalBilling.isDisplayed());
    }
}
