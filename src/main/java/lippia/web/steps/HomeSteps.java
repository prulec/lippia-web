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
    }

    @And("Click on Home menu button")
    public void goHome() {
        HomeService.clickHomeButton();
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
    public void verifyArrivals() {
        HomeResultsService.verifyArrival();
    }

    // Test: Home 8 (Product details page)
    @And("Click on the Add to Basket button")
    public void addToBasket() {
        HomeService.clickAddToBasket();
    }

    @Then("The client verify that the Book is in the Menu item with price")
    public void verifyAddingToBasket() {
        HomeResultsService.verifyAddToBasketMenuItem();
    }

    @And("The Menu item with price has a link to the Checkout page")
    public void verifyLinkBasketMenu() {
        HomeResultsService.verifyBasketMenuLink();
    }

}
