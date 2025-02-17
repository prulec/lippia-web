package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.ShopResultsService;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {

    // Test: Shop 2
    @And("Click on an category item number (.*)")
    public void filterProductsByCategory(int itemNumber) {
        ShopService.clickCategory(itemNumber);
    }
    @Then("The client can see only products of the selected category item number (.*)")
    public void verifyFilteredProducts(int itemNumber) {
        ShopResultsService.verifyFilteredProducts(itemNumber);
    }

    // Test: Shop 8
    @And("Click on the Read more button number (.*)")
    public void goToReadMore(int number) {
        ShopService.clickReadMore(number);
    }
    @Then("The client can see \"Out of stock\" message")
    public void verifyOutOfStockMessage() {
        ShopResultsService.verifyOutOfStockMessage();
    }
    @And("The client can't see the \"Add to basket\" button")
    public void verifyAddToBasketNotDisplayed() {
        ShopResultsService.verifyAddToBasketNotDisplayed();
    }

    // Test: Shop 9
    @And("Click on the Product Image with Sale tag number (.*)")
    public void goToProductDetailsFromShopPage(int number) {
        ShopService.clickProductImageWithSale(number);
    }
    @Then("The client can see the current price")
    public void verifyCurrentPriceDisplayed() {
        ShopResultsService.verifyCurrentPriceDisplayed();
    }
    @And("The client can see the old price strikethrough")
    public void verifyOldPriceDisplayed() {
        ShopResultsService.verifyOldPriceDisplayed();
    }

    @And("Click on the Add to basket button number '(.*)'")
    public void clickOnTheAddToBasketButtonNumberNumber(int number) {
        ShopService.clickAddToBasketNumber(number);
    }

    @And("Choose '(.*)' in the country field in Billing form")
    public void chooseCountryInTheCountryFieldInBillingForm(String country) {
        ShopService.selectCountryInBillingForm(country);
    }

    @And("Verify that taxes represent (.)% of the subtotal")
    @Then("The client can see that taxes represent (.)% of the subtotal")
    public void verifyThatTaxesRepresentOfTheSubtotal(int percentage) {
        ShopResultsService.verifyTaxesPercentage(percentage);
    }
}
