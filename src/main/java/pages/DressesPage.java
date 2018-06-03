package pages;

import base.BaseUtil;
import componentHelpers.GenericHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.BaseUtil.driver;

/**
 * Created by Kunle on 01/06/2018.
 */
public class DressesPage {
    Actions action = new Actions(BaseUtil.driver);

    public DressesPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    /**
     * ##############################WebElement region
     */
    @FindBy(xpath = ".//*[@id='center_column']/ul/li[2]/div/div[1]/div/a[1]/img")
    private WebElement maxQuickView;

    @FindBy(xpath = ".//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]/span")
    private WebElement maxAddToCart;

    @FindBy(css = ".btn.btn-default.button.button-medium>span")
    private WebElement proceedToCheckout;

    @FindBy(css = ".layer_cart_product.col-xs-12.col-md-6>h2")
    private WebElement itemAddedToCart;


    /**
     * ##############################Action region
     */

    /**
     * click the most expensive dress
     */
    public void selectMostExpensiveDress() {

        GenericHelper.scrollDownPage();
        action.moveToElement(maxQuickView);
        action.moveToElement(maxAddToCart);
        action.click();
        action.perform();//Mouse Hover
    }

    /**
     * Check if item added to cart
     * @return
     */
    public boolean IsOneItemAddedToTheCartExist() {
        GenericHelper.WaitForElementToLoad(itemAddedToCart);
        if (itemAddedToCart.isDisplayed()) {
            return true;
        }
        return false;
    }
}
