package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.LoginResultsService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @And("Enter the registered email '(.*)' with case changed in the Login form")
    public void enterTheRegisteredEmailEmailWithCaseChangedInTheLoginForm(String email) {
        LoginService.enterTheRegisteredEmailWithCaseChangedInTheLoginForm(email);
    }

    @And("Enter password '(.*)' with case changed in the Login form")
    public void enterPasswordPasswordWithCaseChangedInTheLoginForm(String password) {
        LoginService.enterPasswordWithCaseChangedInTheLoginForm(password);
    }

    @And("Click on the Login button")
    public void clickOnTheLogin() {
        LoginService.clickLoginButton();
    }

    @Then("The client receives an error message of incorrect username-password")
    public void theClientReceivesAnErrorMessageOfIncorrectUsernamePassword() {
        LoginResultsService.validateLoginError();
    }

    @And("Enter the registered email '(.*)' in the Login form")
    public void enterTheRegisteredEmailEmailInTheLoginForm(String email) {
        LoginService.enterEmail(email);
    }

    @And("Enter password '(.*)' in the Login form")
    public void enterPasswordPasswordInTheLoginForm(String password) {
        LoginService.enterPassword(password);
    }

    @And("Click on Logout button")
    public void clickOnLogoutButton() {
        LoginService.logoutFromMyAccount();
    }

    @Then("The client can't access to the home profile page of his account without re-login")
    public void theClientCanTAccessToTheHomeProfilePageOfHisAccount() {
        LoginService.verifyNoAccessToProfileWithBackButton();
    }
}
