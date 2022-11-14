package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;

public class RegistrationService extends ActionManager {

    public static void clickMyAccount() {
        click(PracticeConstants.MYACCOUNTMENU_BUTTON_XPATH);
    }
    public static void clickRegister() {
        click(PracticeConstants.REGISTER_BUTTON_XPATH);
    }
    public static void enterPassword(String password) {
        click(PracticeConstants.REGISTERPASS_INPUT_XPATH);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        setInput(PracticeConstants.REGISTERPASS_INPUT_XPATH, password);
    }
    public static void enterEmail(String email) {
        setInput(PracticeConstants.REGISTEREMAIL_INPUT_XPATH, email);
    }

}