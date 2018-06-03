package pages;

import componentHelpers.GenericHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kunle on 01/06/2018.
 */
public class OrderPage {
    public OrderPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    /**
     * ##############################WebElement region
     */
    @FindBy(id = "cart_title")
    private WebElement shoppingCartSummary;

    @FindBy(css = ".product-name>a")
    private WebElement printedDress;

    @FindBy(xpath = ".//*[@id='product_price_4_16_68959']/span")
    private WebElement price;

    @FindBy(css = ".btn.btn-default.button.button-medium>span")
    private WebElement proceedToCheckout;

    /**
     * ##############################Action region
     */


    /**
     * Validate title page
     * @return
     */
    public boolean validateTheTitlePageExist() {

        GenericHelper.WaitForElementToBeClickable(proceedToCheckout);
        return shoppingCartSummary.isDisplayed();
    }

    /**
     * Check items in the cart
     * @return
     */
    public boolean checkIfItemExistInTheCart() {
        if (price.getText().contains("$50.99") && printedDress.isDisplayed()) {
            return true;
        }
        return false;
    }
}
