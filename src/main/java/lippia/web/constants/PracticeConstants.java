package lippia.web.constants;

import java.util.HashMap;
import java.util.Map;

public class PracticeConstants {

    // Home
    public static final String XPATH_HOME_SHOP_BUTTON = "xpath://*[@id=\"menu-item-40\"]/a";
    public static final String XPATH_HOME_MENU_BUTTON = "xpath://*[@id=\"site-logo\"]/a";
    public static final String XPATH_HOME_SLIDERS_CONTAINER = "xpath://*[@id=\"n2-ss-6\"]/div[1]/div/div/div";
    public static final String XPATH_HOME_ARRIVAL_CONTAINER = "xpath:/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]";
    public static final String XPATH_HOME_ARRIBAL_DIV = "xpath://*[contains(@class, 'sub_column_1-0-2')]";
    public static final String XPATH_HOME_ADDTOBASKET_BUTTON = "xpath:/html/body/div[1]/div[2]/div/div/div/div[2]/form/button";
    public static final String XPATH_HOME_BASKETMENUITEM_SPAN = "xpath://*[@id=\"wpmenucartli\"]/a/span[text()='1 item']";
    public static final String XPATH_HOME_BASKETMENUITEM_ANCHOR = "xpath://*[@id=\"wpmenucartli\"]/a";
    public static final String XPATH_CHECKOUT_TOTAL = "xpath://td[@data-title='Total']/strong/span";
    public static final String XPATH_CHECKOUT_SUBTOTAL = "xpath://td[@data-title='Subtotal']/span";
    public static final String XPATH_CHECKOUT_PROCEEDTOCHECKOUT_BUTTON = "xpath://a[contains(text(), 'Proceed to Checkout')]";
    public static final String XPATH_PAYMENT_BILLINGFORM_FIRSTNAME = "xpath://*[@id=\"billing_first_name\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_LASTNAME = "xpath://*[@id=\"billing_last_name\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_COMPANY = "xpath://*[@id=\"billing_company\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_EMAIL = "xpath://*[@id=\"billing_email\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_PHONE = "xpath://*[@id=\"billing_phone\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_COUNTRY = "xpath://*[@id=\"s2id_billing_country\"]/a";
    public static final String XPATH_PAYMENT_BILLINGFORM_COUNTRYITEM_START = "xpath://div[text()='";
    public static final String XPATH_PAYMENT_BILLINGFORM_ADDRESS = "xpath://*[@id=\"billing_address_1\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_ADDRESSDETAIL = "xpath://*[@id=\"billing_address_2\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_CITY = "xpath://*[@id=\"billing_city\"]";
    public static final String XPATH_PAYMENT_BILLINGFORM_STATE = "xpath://*[@id=\"s2id_billing_state\"]/a";
    public static final String XPATH_PAYMENT_BILLINGFORM_STATEITEM_INCOMPLETE = "xpath://div[text()='";
    public static final String XPATH_PAYMENT_BILLINGFORM_POSTCODE = "xpath://*[@id=\"billing_postcode\"]";
    public static final Map<String,String> DATA_PAYMENT_BILLINGFORM = getBillingFormData();
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
    public static final String XPATH_PAYMENT_ADDITIONALDETAILS = "xpath://*[@id=\"order_comments\"]";
    public static final String XPATH_PAYMENT_TOTAL = "xpath://*[@id=\"order_review\"]/table/tfoot/tr[3]/td/strong/span";
    public static final String XPATH_PAYMENT_SUBTOTAL = "xpath://*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span";
    public static final String XPATH_PAYMENT_TAX = "xpath://*[@id=\"order_review\"]/table/tfoot/tr[2]/td/span";
    public static final String XPATH_PAYMENT_DIRECTGATEWAY = "xpath://*[@id=\"payment_method_bacs\"]";
    public static final String XPATH_PAYMENT_CHECKGATEWAY = "xpath://*[@id=\"payment_method_cheque\"]";
    public static final String XPATH_PAYMENT_CASHGATEWAY = "xpath://*[@id=\"payment_method_cod\"]";
    public static final String XPATH_PAYMENT_PAYPALGATEWAY = "xpath://*[@id=\"payment_method_ppec_paypal\"]";
    public static final String[] LOCATORS_PAYMENTGATEWAY = {
            XPATH_PAYMENT_DIRECTGATEWAY,
            XPATH_PAYMENT_CHECKGATEWAY,
            XPATH_PAYMENT_CASHGATEWAY,
            XPATH_PAYMENT_PAYPALGATEWAY
    };
    public static final int[] INDEX_PAYMENTGATEWAY = {0};
    public static final String XPATH_PAYMENT_COUPON_SHOW = "xpath://a[@class='showcoupon']";
    public static final String XPATH_PAYMENT_COUPON_INPUT = "xpath://*[@id=\"coupon_code\"]";
    public static final String XPATH_PAYMENT_COUPON_SUBMIT = "xpath://input[@name='apply_coupon']";
    public static final String VALUE_PAYMENT_COUPON = "4567";
    public static final String XPATH_PAYMENT_COUPON_MESSAGE = "xpath://*[contains(text(),'Coupon')]";
    public static final String XPATH_PAYMENT_PLACEORDER_BUTTON = "xpath://*[@id=\"place_order\"]";
    public static final String XPATH_CONFIRMATION_ORDERNUMBER = "xpath://*[contains(text(),'Order Number')]/strong";
    public static final String XPATH_CONFIRMATION_PAYMENTMETHOD = "xpath://li[@class='method']/strong";
    public static final String XPATH_CONFIRMATION_BANKDETAILS_HEADER = "xpath://h2[contains(text(),'Bank')]";
    public static final String XPATH_CONFIRMATION_BILLING_TOTAL = "xpath://table[contains(@class,'shop_table')]/tfoot/tr[4]/td/span";

    // Login
    public static final String XPATH_LOGIN_EMAIL_INPUT = "xpath://*[@id=\"username\"]";
    public static final String XPATH_LOGIN_PASSWORD_INPUT = "xpath://*[@id=\"password\"]";
    public static final String XPATH_LOGIN_BUTTON = "xpath://input[@type=\"submit\" and @value=\"Login\"]";
    public static final String XPATH_LOGIN_ERROR = "xpath://ul[@class='woocommerce-error']/li";
    public static final String XPATH_LOGOUT = "xpath://a[text()='Logout']";
    public static final String XPATH_SIGNOUT = "xpath://a[text()='Sign out']";

    // Registration
    public static final String XPATH_HOME_MYACCOUNT_BUTTON = "xpath:/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a";
    public static final String XPATH_REGISTER_PASS_INPUT = "xpath://*[@id=\"reg_password\"]";
    public static final String XPATH_REGISTER_EMAIL_INPUT = "xpath://*[@id=\"reg_email\"]";
    public static final String XPATH_REGISTER_BUTTON = "xpath://*[@id='customer_login']/div[2]/form/p[3]/input[@type='submit']";
    public static final String XPATH_MYACCOUNT_SIGNOUT = "xpath:/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]/a";
    public static final String XPATH_ERROR_MESSAGE = "xpath:/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li";

    // Shop
    public static final String XPATH_SHOP_CATEGORY_FILTERS = "xpath://*[@id=\"woocommerce_product_categories-2\"]/ul/li";
    public static final String XPATH_SHOP_PRODUCTITEMS_XPATH = "xpath://*[@id='content']/ul/li";
    public static final String XPATH_SHOP_OUTOFSTOCK= "xpath:/html/body/div[1]/div[2]/div/div/div/div[2]/p";
    public static final String XPATH_SHOP_PRICE = "xpath:/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/p";

    // Account
    public static final String XPATH_ACCOUNTDETAILS_LINK = "xpath://a[contains(@href,'practice.automationtesting.in/my-account/edit-account')]";
    public static final String XPATH_ACCOUNTDETAILS_FIRSTNAME_INPUT = "xpath://*[@id=\"account_first_name\"]";
    public static final String XPATH_ACCOUNTDETAILS_LASTNAME_INPUT = "xpath://*[@id=\"account_last_name\"]";
    public static final String XPATH_ACCOUNTDETAILS_EMAIL_INPUT = "xpath://*[@id=\"account_email\"]";
    public static final String XPATH_ACCOUNTDETAILS_CURRENTPASS_INPUT = "xpath://*[@id=\"password_current\"]";
    public static final String XPATH_ACCOUNTDETAILS_NEWPASS_INPUT = "xpath://*[@id=\"password_1\"]";
    public static final String XPATH_ACCOUNTDETAILS_NEWPASSCONFIRM_INPUT = "xpath://*[@id=\"password_2\"]";
    public static final String XPATH_ACCOUNTDETAILS_SAVE_BUTTON = "xpath://input[@type=\"submit\" and @value=\"Save changes\"]";

    // Ads
    public static final String XPATH_AD_IFRAME1 = "xpath:/html/ins/*/*[contains(@id, 'aswift_') and not(contains(@id, 'host'))]";
    public static final String XPATH_AD_IFRAME2 = "xpath://*[@id='ad_iframe']";
    public static final String XPATH_AD_CLOSE_BUTTON = "xpath://*[@id='dismiss-button']";
}
