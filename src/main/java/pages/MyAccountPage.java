package pages;

import base.BaseUtil;
import componentHelpers.GenericHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Kunle on 01/06/2018.
 */
public class MyAccountPage {
    public MyAccountPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    /**
     * ##############################webElement region
     */
    @FindBy(css = ".page-heading")
    private WebElement myAccountText;

    @FindBy(css = ".logout")
    private WebElement signOut;

    @FindBy(css = ".shopping_cart>a")
    private WebElement cart;

    @FindBy(linkText = "DRESSES")
    private WebElement dresses;

    /**
     * ##############################Action region
     */

    /**
     * Check the text display "My Account"
     * @return
     */
    public boolean isMyAccountTextExist() {

        return myAccountText.isDisplayed();
    }

    /**
     * Click sign out
     */
    public void signOut() {

        GenericHelper.WaitForElementToBeClickable(signOut);
    }

    /**
     * Click the category cloth dresses
     */
    public void selectDressesCategory() {

        GenericHelper.WaitForElementToBeClickable(dresses);
    }

    /**
     * Click at the cart
     */
    public DressesPage clickingCart() {

        GenericHelper.WaitForElementToBeClickable(cart);
        return new DressesPage(BaseUtil.driver);
    }
}
