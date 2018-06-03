package componentHelpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by Kunle on 01/06/2018.
 */
public class ComboBoxHelper {

    private static Select select;

    /**
     * Select from a dropdown
     * @param locator
     * @param index
     */
    public static void SelectElement(WebElement locator, int index) {
        select = new Select(locator);
        select.selectByIndex(index);
    }

    public static void SelectElement(WebElement locator, String visibletext) {
        select = new Select(locator);
        select.selectByVisibleText(visibletext);
    }
}
