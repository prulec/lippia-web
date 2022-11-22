package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginResultsService extends ActionManager {

    public static void validateLoginError() {
        ActionManager.waitVisibility(PracticeConstants.XPATH_LOGIN_ERROR);
        WebElement error = getElement(PracticeConstants.XPATH_LOGIN_ERROR);
        Assert.assertTrue(error.getText().contains("the password you entered for the username") && error.getText().contains("is incorrect"));
    }
}
