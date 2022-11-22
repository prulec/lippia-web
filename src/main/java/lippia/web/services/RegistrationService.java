package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;

public class RegistrationService extends ActionManager {

    public static void clickMyAccount() {
        click(PracticeConstants.XPATH_HOME_MYACCOUNT_BUTTON);
    }
    public static void clickRegister() {
        click(PracticeConstants.XPATH_REGISTER_BUTTON);
    }
    public static void enterPassword(String password) {
        click(PracticeConstants.XPATH_REGISTER_PASS_INPUT);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        setInput(PracticeConstants.XPATH_REGISTER_PASS_INPUT, password);
    }
    public static void enterEmail(String email) {
        setInput(PracticeConstants.XPATH_REGISTER_EMAIL_INPUT, email);
    }

}