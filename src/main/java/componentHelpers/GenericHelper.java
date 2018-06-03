package componentHelpers;

import base.BaseUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static base.BaseUtil.driver;


/**
 * Created by Kunle on 01/06/2018.
 */
public class GenericHelper {

    /**
     * handling uquie element ONLY
     *
     * @param Locator
     * @return
     */
    public static boolean IsElementPresent(WebElement Locator) {
        try {
            return Locator.getSize().equals(1);   //Locator.equals(1);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Check element present
     *
     * @param Locator
     * @return
     */
    public static WebElement GetElement(WebElement Locator) {
        if (IsElementPresent(Locator))
            return Locator;
        else
            throw new NoSuchElementException("Element Not Found : " + Locator.toString());
    }

    /**
     * Check page source exist
     *
     * @param table
     * @return
     */
    public static boolean CheckSectionsExist(List<String> table) {
        String source = driver.getPageSource();
        for (String section : table) {
            if (!source.contains(section))
                return false;
        }
        return true;
    }

    /**
     * Wait for page load
     *
     * @param locator
     */
    public static void WaitForElementToLoad(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

    /**
     * Wait for element to be clickable
     *
     * @param locator
     */
    public static void WaitForElementToBeClickable(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    /**
     * Java script scroll down
     */
    public static void scrollDownPage() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
    }

}
