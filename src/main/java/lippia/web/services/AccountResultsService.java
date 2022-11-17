package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;
import org.testng.Assert;

public class AccountResultsService extends ActionManager {
    public static void verifyAccountDetailsForm() {
        Assert.assertTrue(getElement(PracticeConstants.ACCOUNTDETAILS_FIRSTNAME_INPUT_XPATH).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.ACCOUNTDETAILS_LASTNAME_INPUT_XPATH).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.ACCOUNTDETAILS_EMAIL_INPUT_XPATH).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.ACCOUNTDETAILS_CURRENTPASS_INPUT_XPATH).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.ACCOUNTDETAILS_NEWPASS_INPUT_XPATH).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.ACCOUNTDETAILS_NEWPASSCONFIRM_INPUT_XPATH).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.ACCOUNTDETAILS_SAVE_BUTTON_XPATH).isEnabled());
    }
}
