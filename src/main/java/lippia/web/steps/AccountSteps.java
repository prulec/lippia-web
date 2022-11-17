package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.AccountResultsService;
import lippia.web.services.AccountService;
import lippia.web.services.HomeService;

public class AccountSteps extends PageSteps {

    @And("Click on the Account Details button")
    public void clickOnTheAccountDetailsButton() {
        AccountService.goToAccountDetails();
        HomeService.closeAds();
    }

    @Then("The client can see account details where he can change his password also")
    public void theClientCanSeeAccountDetailsWhereHeCanChangeHisPasswordAlso() {
        AccountResultsService.verifyAccountDetailsForm();
    }
}
