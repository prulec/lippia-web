package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginService extends ActionManager {
    public static void enterTheRegisteredEmailWithCaseChangedInTheLoginForm(String email) {
        String emailChanged = changeCase(email);
        setInput(PracticeConstants.LOGINEMAIL_INPUT_XPATH, emailChanged);
    }
    private static String changeCase(String word) {
        String[] wordSplitted = word.split("");
        String wordChanged = "";
        for (String l: wordSplitted) {
            if (!l.toUpperCase().equals(l)) {
                wordChanged += l.toUpperCase();
            } else {
                wordChanged += l.toLowerCase();
            }
        }
        return wordChanged;
    }

    public static void enterPasswordWithCaseChangedInTheLoginForm(String password) {
        String passwordChanged = changeCase(password);
        setInput(PracticeConstants.LOGINPASSWORD_INPUT_XPATH, passwordChanged);
    }

    public static void clickLoginButton() {
        click(PracticeConstants.LOGIN_BUTTON_XPATH);
    }

    public static void enterEmail(String email) {
        setInput(PracticeConstants.LOGINEMAIL_INPUT_XPATH, email);
    }

    public static void enterPassword(String password) {
        setInput(PracticeConstants.LOGINPASSWORD_INPUT_XPATH, password);
    }

    public static void logoutFromMyAccount() {
        click(PracticeConstants.LOGOUT_LINK_XPATH);
    }

    public static void verifyNoAccessToProfileWithBackButton() {
        WebDriver driver = DriverManager.getDriverInstance();
        driver.navigate().back();
        Assert.assertTrue(getElement(PracticeConstants.LOGIN_BUTTON_XPATH).isDisplayed());
    }

    public static void signoutFromMyAccount() {
        click(PracticeConstants.SIGNOUT_LINK_XPATH);
    }
}
