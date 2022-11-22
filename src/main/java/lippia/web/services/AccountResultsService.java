package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;
import org.testng.Assert;

public class AccountResultsService extends ActionManager {
    public static void verifyAccountDetailsForm() {
        Assert.assertTrue(getElement(PracticeConstants.XPATH_ACCOUNTDETAILS_FIRSTNAME_INPUT).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.XPATH_ACCOUNTDETAILS_LASTNAME_INPUT).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.XPATH_ACCOUNTDETAILS_EMAIL_INPUT).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.XPATH_ACCOUNTDETAILS_CURRENTPASS_INPUT).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.XPATH_ACCOUNTDETAILS_NEWPASS_INPUT).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.XPATH_ACCOUNTDETAILS_NEWPASSCONFIRM_INPUT).isDisplayed());
        Assert.assertTrue(getElement(PracticeConstants.XPATH_ACCOUNTDETAILS_SAVE_BUTTON).isEnabled());
    }
}
