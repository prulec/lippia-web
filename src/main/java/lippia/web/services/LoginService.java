package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginService extends ActionManager {
    public static void enterTheRegisteredEmailWithCaseChangedInTheLoginForm(String email) {
        String emailChanged = changeCase(email);
        setInput(PracticeConstants.XPATH_LOGIN_EMAIL_INPUT, emailChanged);
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
        setInput(PracticeConstants.XPATH_LOGIN_PASSWORD_INPUT, passwordChanged);
    }

    public static void clickLoginButton() {
        click(PracticeConstants.XPATH_LOGIN_BUTTON);
    }

    public static void enterEmail(String email) {
        setInput(PracticeConstants.XPATH_LOGIN_EMAIL_INPUT, email);
    }

    public static void enterPassword(String password) {
        setInput(PracticeConstants.XPATH_LOGIN_PASSWORD_INPUT, password);
    }

    public static void logoutFromMyAccount() {
        click(PracticeConstants.XPATH_LOGOUT);
    }

    public static void verifyNoAccessToProfileWithBackButton() {
        WebDriver driver = DriverManager.getDriverInstance();
        driver.navigate().back();
        Assert.assertTrue(getElement(PracticeConstants.XPATH_LOGIN_BUTTON).isDisplayed());
    }

    public static void signoutFromMyAccount() {
        click(PracticeConstants.XPATH_SIGNOUT);
    }
}
