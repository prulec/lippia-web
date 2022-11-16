package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeResultsService;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {

    @Given("The client is in practice page")
    public void navigateToPractice() {
        HomeService.navigateToPracticeHome();
    }

    @When("Click on Shop Menu button")
    public void goToShopPage() {
        HomeService.clickShopButton();
        HomeService.closeAds();
    }

    @And("Click on Home menu button")
    public void goHome() {
        HomeService.clickHomeButton();
        HomeService.closeAds();
    }

    // Test: Home 1
    @Then("The client verify that there are three Sliders on page")
    public void verifySliders() {
        HomeResultsService.verifySliders();
    }

    // Test: Home 3 & 8
    @And("Click on the Arrival Image whose order is (.)")
    public void goToArrivalPage(int order) {
        HomeService.clickArrivalImage(order);
    }

    // Test: Home 3
    @Then("The client verify that is in the product details page where exists an Add To Basket button")
    @And("Verify that is now in the product details page where an Add To Basket button exists")
    public void verifyArrivals() {
        HomeResultsService.verifyArrival();
    }

    // Test: Home 8 (Product details page)
    @And("Click on the Add to Basket button")
    public void addToBasket() {
        HomeService.clickAddToBasket();
    }

    @Then("The client verify that the Book is in the Menu item with price")
    @And("Verify that the Book is in the Menu item with price")
    public void verifyAddingToBasket() {
        HomeResultsService.verifyAddToBasketMenuItem();
    }

    @And("The Menu item with price has a link to the Checkout page")
    public void verifyLinkBasketMenu() {
        HomeResultsService.verifyBasketMenuLink();
    }

    @And("Verify that there are three Arrivals on page")
    public void verifyThatThereAreThreeArrivalsOnPage() {
        HomeResultsService.verifyThreeArrivalsOnHomePage();
    }

    @And("Click on the Menu item link which navigates to proceed to check out page")
    public void clickOnTheMenuItemLinkWhichNavigatesToProceedToCheckOutPage() {
        HomeService.clickMenuItemLinkToCheckoutPage();
    }

    @And("Verify that is shown the total and subtotal values, total is greater than subtotal due to taxes")
    public void verifyThatIsShownTheTotalAndSubtotalValuesTotalIsGreaterThanSubtotalDueToTaxes() {
        HomeResultsService.verifyTotalAndSubtotalOnCheckoutPage();
    }

    @And("Click on Proceed to Checkout button which navigates to payment gateway page")
    public void clickOnProceedToCheckoutButtonWhichNavigatesToPaymentGatewayPage() {
        HomeService.clickProceedToCheckout();
    }

    @And("Fill the billing details and opt for any available payment gateway in the payment gateway page")
    public void fillTheBillingDetailsAndOptForAnyAvailablePaymentGatewayInThePaymentGatewayPage() {
        HomeService.fillBillingDetailsForm();
        HomeService.selectPaymentGateway();
    }

    @And("Verify that is possible to add a coupon in the payment gateway page")
    public void verifyThatIsPossibleToAddACouponInThePaymentGatewayPage() {
        HomeResultsService.verifyCoupon();
    }

    @Then("The client can see the Billing, Order, Payment gateways and Additional details in the payment gateway page")
    public void theClientCanSeeTheBillingOrderPaymentGatewaysAndAdditionalDetailsInThePaymentGatewayPage() {
        HomeResultsService.verifyDetailsInPaymentGatewayPage();
    }

    @And("Click on the Place Order button")
    public void clickOnThePlaceOrderButton() {
        HomeService.clickOnPlaceOrderButton();
    }

    @Then("The client can see the Order confirmation page with Order, Bank and Billing details")
    public void theClientCanSeeTheOrderConfirmationPageWithOrderBankAndBillingDetails() {
        HomeResultsService.verifyOrderConfirmationPage();
    }
}
