package lippia.web.constants;

public class PracticeConstants {

    // Home
    public static final String SHOP_BUTTON_XPATH = "xpath://*[@id=\"menu-item-40\"]/a";
    public static final String HOME_MENU_BUTTON_XPATH = "xpath://*[@id=\"site-logo\"]/a";
    public static final String SLIDERS_CONTAINER_XPATH = "xpath://*[@id=\"n2-ss-6\"]/div[1]/div/div/div";
    public static final String ARRIVAL_CONTAINER_XPATH = "xpath:/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]";
    public static final String ARRIBAL_DIV_XPATH = "xpath://*[contains(@class, 'sub_column_1-0-2')]";
    public static final String ADDTOBASKET_BUTTON_XPATH = "xpath:/html/body/div[1]/div[2]/div/div/div/div[2]/form/button";
    public static final String BASKETMENUITEM_SPAN_XPATH = "xpath:/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a/span[1]";
    public static final String BASKETMENUITEM_ANCHOR_XPATH = "xpath:/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a";
    public static final String TOTAL_BASKET_XPATH = "xpath://td[@data-title='Total']/strong/span";
    public static final String SUBTOTAL_BASKET_XPATH = "xpath://td[@data-title='Subtotal']/span";
    public static final String PROCEEDTOCHECKOUT_BUTTON_XPATH = "xpath://a[contains(text(), 'Proceed to Checkout')]";
    public static final String BILLINGFORM_FIRSTNAME_XPATH = "xpath://*[@id=\"billing_first_name\"]";
    public static final String BILLINGFORM_LASTNAME_XPATH = "xpath://*[@id=\"billing_last_name\"]";
    public static final String BILLINGFORM_EMAIL_XPATH = "xpath://*[@id=\"billing_email\"]";
    public static final String BILLINGFORM_PHONE_XPATH = "xpath://*[@id=\"billing_phone\"]";
    public static final String BILLINGFORM_COUNTRY_XPATH = "xpath://*[@id=\"billing_country\"]/option[text()='Argentina']";
    public static final String BILLINGFORM_ADDRESS_XPATH = "xpath://*[@id=\"billing_address_1\"]";
    public static final String BILLINGFORM_CITY_XPATH = "xpath://*[@id=\"billing_city\"]";
    public static final String BILLINGFORM_STATE_XPATH = "xpath://*[@id=\"billing_state\"]/option[text()='Río Negro']";
    public static final String BILLINGFORM_POSTCODE_XPATH = "xpath://*[@id=\"billing_postcode\"]";
    public static final String PAYMENTGATEWAY_DIRECT_XPATH = "xpath://*[@id=\"payment_method_bacs\"]";
    public static final String PAYMENTGATEWAY_CHECK_XPATH = "xpath://*[@id=\"payment_method_cheque\"]";
    public static final String PAYMENTGATEWAY_CASH_XPATH = "xpath://*[@id=\"payment_method_cod\"]";
    public static final String PAYMENTGATEWAY_PAYPAL_XPATH = "xpath://*[@id=\"payment_method_ppec_paypal\"]";

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
