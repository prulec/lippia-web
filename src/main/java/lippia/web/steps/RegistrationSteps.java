package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.RegistrationResultsService;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {

    @When("Click on the My Account Menu button")
    public void goToMyAccount() {
        RegistrationService.clickMyAccount();
        HomeService.closeAds();
    }
    @And("Enter password (.*) in the Register form")
    public void enterPassword(String password) {
        RegistrationService.enterPassword(password);
    }
    @And("Click on the Register button")
    public void goToRegister() {
        RegistrationService.clickRegister();
    }

    // Test: Registration 1
    @And("Enter valid unregistered email in the Register form")
    public void enterValidEmail() {
        String email = "example" + System.currentTimeMillis() + "@domain.com";
        RegistrationService.enterEmail(email);
    }
    @Then("The client is registered successfully")
    public void verifySuccessfulRegistration() {
        RegistrationResultsService.verifySignOutDisplayed(true);
    }
    @And("The client is redirected to the Account page")
    public void verifyHomePageNavigation() {
        RegistrationResultsService.verifyAccountPageUrl();
    }

    // Test: Registration 3 & 5
    @And("Enter empty email in the Register form")
    public void enterEmptyEmail() {
        RegistrationService.enterEmail("");
    }
    @Then("The client is not registered")
    public void verifyDeniedRegistration() {
        RegistrationResultsService.verifySignOutDisplayed(false);
    }
    @And("The client receives a warning message (.*)")
    public void verifyRegistrationMessage(String message) {
        RegistrationResultsService.verifyErrorMessage(message);
    }

}
