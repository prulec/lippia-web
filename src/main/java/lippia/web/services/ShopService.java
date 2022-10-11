package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.PracticeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ShopService extends ActionManager {

    public static void clickCategory(int itemNumber) {
        click(PracticeConstants.CATEGORY_FILTERS_XPATH + "[" + itemNumber + "]/a");
    }

    private static List<Integer> getReadMoreIndexes() {
        int productsQuantity = getElements(PracticeConstants.PRODUCTITEMS_XPATH).size();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 1; i <= productsQuantity; i++) {
            String text = getElement(PracticeConstants.PRODUCTITEMS_XPATH + "[" + i + "]/a[2]").getText();
            if (text.matches("READ MORE")) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static void clickReadMore(int number) {
        click(PracticeConstants.PRODUCTITEMS_XPATH + "[" + getReadMoreIndexes().get(number-1) + "]/a[2]");
    }

    private static List<Integer> getSaleIndexes() {
        int productsQuantity = getElements(PracticeConstants.PRODUCTITEMS_XPATH).size();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 1; i <= productsQuantity; i++) {
            List<WebElement> spans = getElements(PracticeConstants.PRODUCTITEMS_XPATH + "[" + i + "]/a[1]/span");
            if (spans.get(0).getText().matches("SALE.")) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static void clickProductImageWithSale(int number) {
        // Explicit Wait instantiation
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriverInstance(), 10);
        // Wait until the Footer is loaded in Shop page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PracticeConstants.FOOTER_XPATH)));
        click(PracticeConstants.PRODUCTITEMS_XPATH + "[" + getSaleIndexes().get(number-1) + "]/a[1]");
    }

}
