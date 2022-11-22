package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class RegistrationResultsService extends ActionManager {

    private static boolean isSignOutDisplayed() {
        List<WebElement> signOutList = getElements(PracticeConstants.XPATH_MYACCOUNT_SIGNOUT);
        if (signOutList.size() > 0) {
            return signOutList.get(0).isDisplayed();
        }
        return false;
    }
    public static void verifySignOutDisplayed(boolean expectedResult) {
        if (expectedResult) {
            Assert.assertTrue(isSignOutDisplayed());
        } else {
            Assert.assertFalse(isSignOutDisplayed());
        }
    }

    private static String getUrl() {
        return DriverManager.getDriverInstance().getCurrentUrl();
    }
    public static void verifyAccountPageUrl() {
        Assert.assertTrue(getUrl().matches("https://practice.automationtesting.in/my-account/"));
    }

    private static String getErrorMessage() {
        return getElement(PracticeConstants.XPATH_ERROR_MESSAGE).getText();
    }
    public static void verifyErrorMessage(String message) {
        String error = getErrorMessage();
        Assert.assertTrue(error.matches(".*" + message + ".*"));
    }

}
