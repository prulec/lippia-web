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

    @When("Click on Shop Menu")
    public void goToShopPage() {
        HomeService.clickShopButton();
    }

    @And("Click on Home menu button")
    public void clickHome() {
        HomeService.clickHomeButton();
    }

    @Then("The client verify that there are three Sliders on page")
    public void slidersVerification() {
        HomeResultsService.verifySliders();
    }

}
