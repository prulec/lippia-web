package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;

public class AccountService extends ActionManager {
    public static void goToAccountDetails() {
        click(PracticeConstants.ACCOUNTDETAILS_LINK_XPATH);
    }
}
