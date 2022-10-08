package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomeResultsService extends ActionManager {

    private static List<WebElement> getSliders() {
        return getElements(PracticeConstants.SLIDERS_CONTAINER_XPATH);
    }

    public static void verifySliders() {
        Assert.assertEquals(getSliders().size(),3);
    }

}
