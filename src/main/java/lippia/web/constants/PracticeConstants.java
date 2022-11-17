package lippia.web.constants;

import java.util.HashMap;
import java.util.Map;

public class PracticeConstants {

    // Home
    public static final String SHOP_BUTTON_XPATH = "xpath://*[@id=\"menu-item-40\"]/a";
    public static final String HOME_MENU_BUTTON_XPATH = "xpath://*[@id=\"site-logo\"]/a";
    public static final String SLIDERS_CONTAINER_XPATH = "xpath://*[@id=\"n2-ss-6\"]/div[1]/div/div/div";
    public static final String ARRIVAL_CONTAINER_XPATH = "xpath:/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]";
    public static final String ARRIBAL_DIV_XPATH = "xpath://*[contains(@class, 'sub_column_1-0-2')]";
    public static final String ADDTOBASKET_BUTTON_XPATH = "xpath:/html/body/div[1]/div[2]/div/div/div/div[2]/form/button";
    public static final String BASKETMENUITEM_SPAN_XPATH = "xpath://*[@id=\"wpmenucartli\"]/a/span[text()='1 item']";
    public static final String BASKETMENUITEM_ANCHOR_XPATH = "xpath://*[@id=\"wpmenucartli\"]/a";
    public static final String TOTAL_BASKET_XPATH = "xpath://td[@data-title='Total']/strong/span";
    public static final String SUBTOTAL_BASKET_XPATH = "xpath://td[@data-title='Subtotal']/span";
    public static final String PROCEEDTOCHECKOUT_BUTTON_XPATH = "xpath://a[contains(text(), 'Proceed to Checkout')]";
    public static final String BILLINGFORM_FIRSTNAME_XPATH = "xpath://*[@id=\"billing_first_name\"]";
    public static final String BILLINGFORM_LASTNAME_XPATH = "xpath://*[@id=\"billing_last_name\"]";
    public static final String BILLINGFORM_COMPANY_XPATH = "xpath://*[@id=\"billing_company\"]";
    public static final String BILLINGFORM_EMAIL_XPATH = "xpath://*[@id=\"billing_email\"]";
    public static final String BILLINGFORM_PHONE_XPATH = "xpath://*[@id=\"billing_phone\"]";
    public static final String BILLINGFORM_COUNTRYFIELD_XPATH = "xpath://*[@id=\"s2id_billing_country\"]/a";
    public static final String BILLINGFORM_COUNTRYITEM_INCOMPLETE_XPATH = "xpath://div[text()='";
    public static final String BILLINGFORM_ADDRESS_XPATH = "xpath://*[@id=\"billing_address_1\"]";
    public static final String BILLINGFORM_ADDRESSDETAIL_XPATH = "xpath://*[@id=\"billing_address_2\"]";
    public static final String BILLINGFORM_CITY_XPATH = "xpath://*[@id=\"billing_city\"]";
    public static final String BILLINGFORM_STATEFIELD_XPATH = "xpath://*[@id=\"s2id_billing_state\"]/a";
    public static final String BILLINGFORM_STATEITEM_INCOMPLETE_XPATH = "xpath://div[text()='";
    public static final String BILLINGFORM_POSTCODE_XPATH = "xpath://*[@id=\"billing_postcode\"]";
    public static final Map<String,String> BILLINGFORM_DATA = getBillingFormData();
    private static Map<String,String> getBillingFormData() {
        Map<String,String> data = new HashMap<>();
        data.put("firstName", "Roberto");
        data.put("lastName", "Gómez Bolaños");
        data.put("email", "chespirito@domain.com.mx");
        data.put("phone", "+52 55 57093744");
        data.put("country", "Mexico");
        data.put("address", "Lorenzo Boturini 435");
        data.put("city", "Cuauhtémoc");
        data.put("state", "Distrito Federal");
        data.put("postcode", "10020");
        return data;
    }
    public static final String ADDITIONALDETAILS_XPATH = "xpath://*[@id=\"order_comments\"]";
    public static final String TOTAL_PAYMENTPAGE_XPATH = "xpath://*[@id=\"order_review\"]/table/tfoot/tr[3]/td/strong/span";
    public static final String SUBTOTAL_PAYMENTPAGE_XPATH = "xpath://*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span";
    public static final String PAYMENTGATEWAY_DIRECT_XPATH = "xpath://*[@id=\"payment_method_bacs\"]";
    public static final String PAYMENTGATEWAY_CHECK_XPATH = "xpath://*[@id=\"payment_method_cheque\"]";
    public static final String PAYMENTGATEWAY_CASH_XPATH = "xpath://*[@id=\"payment_method_cod\"]";
    public static final String PAYMENTGATEWAY_PAYPAL_XPATH = "xpath://*[@id=\"payment_method_ppec_paypal\"]";
    public static final String[] PAYMENTGATEWAY_LOCATORS = {
            PAYMENTGATEWAY_DIRECT_XPATH,
            PAYMENTGATEWAY_CHECK_XPATH,
            PAYMENTGATEWAY_CASH_XPATH,
            PAYMENTGATEWAY_PAYPAL_XPATH
    };
    public static final int[] PAYMENTGATEWAY_INDEX = {0};
    public static final String COUPON_SHOW_XPATH = "xpath://a[@class='showcoupon']";
    public static final String COUPON_INPUT_XPATH = "xpath://*[@id=\"coupon_code\"]";
    public static final String COUPON_SUBMIT_XPATH = "xpath://input[@name='apply_coupon']";
    public static final String COUPON_VALUE = "4567";
    public static final String COUPON_MESSAGE_XPATH = "xpath://*[contains(text(),'Coupon')]";
    public static final String PLACEORDER_BUTTON_XPATH = "xpath://*[@id=\"place_order\"]";
    public static final String ORDER_NUMBER_XPATH = "xpath://*[contains(text(),'Order Number')]/strong";
    public static final String ORDER_PAYMENTMETHOD_XPATH = "xpath://li[@class='method']/strong";
    public static final String ORDER_BANKDETAILS_HEADER_XPATH = "xpath://h2[contains(text(),'Bank')]";
    public static final String ORDER_BILLING_TOTAL_XPATH = "xpath://table[contains(@class,'shop_table')]/tfoot/tr[4]/td/span";

    // Login
    public static final String LOGINEMAIL_INPUT_XPATH = "xpath://*[@id=\"username\"]";
    public static final String LOGINPASSWORD_INPUT_XPATH = "xpath://*[@id=\"password\"]";
    public static final String LOGIN_BUTTON_XPATH = "xpath://input[@type=\"submit\" and @value=\"Login\"]";
    public static final String LOGINERROR_XPATH = "xpath://ul[@class='woocommerce-error']/li";
    public static final String LOGOUT_LINK_XPATH = "xpath://a[text()='Logout']";

    // Registration
    public static final String MYACCOUNTMENU_BUTTON_XPATH = "xpath:/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a";
    public static final String REGISTERPASS_INPUT_XPATH = "xpath://*[@id=\"reg_password\"]";
    public static final String REGISTEREMAIL_INPUT_XPATH = "xpath://*[@id=\"reg_email\"]";
    public static final String REGISTER_BUTTON_XPATH = "xpath://*[@id='customer_login']/div[2]/form/p[3]/input[@type='submit']";
    public static final String SIGNOUT_XPATH = "xpath:/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]/a";
    public static final String ERROR_MESSAGE_XPATH = "xpath:/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li";

    // Shop
    public static final String CATEGORY_FILTERS_XPATH = "xpath://*[@id=\"woocommerce_product_categories-2\"]/ul/li";
    public static final String PRODUCTITEMS_XPATH = "xpath://*[@id='content']/ul/li";
    public static final String OUTOFSTOCK_XPATH = "xpath:/html/body/div[1]/div[2]/div/div/div/div[2]/p";
    public static final String PRICE_XPATH = "xpath:/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/p";

    // Ads
    public static final String AD_IFRAME1_XPATH = "xpath:/html/ins/*/*[contains(@id, 'aswift_') and not(contains(@id, 'host'))]";
    public static final String AD_IFRAME2_XPATH = "xpath://*[@id='ad_iframe']";
    public static final String AD_CLOSE_BUTTON_XPATH = "xpath://*[@id='dismiss-button']";
}
