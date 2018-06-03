package pages;

import base.BaseUtil;
import componentHelpers.GenericHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kunle on 01/06/2018.
 */
public class MyStorePage {

    public MyStorePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    /**
     * ##############################WebElement region
     */
    @FindBy(id = "email")
    private WebElement emailAddressField;

    @FindBy(id = "passwd")
    private WebElement PasswordField;

    @FindBy(id = "SubmitLogin")
    private WebElement sign_inButton;

    @FindBy(css = ".login")
    private WebElement sign_inLink;

    /**
     * ##############################Action region
     */


    /**
     * Login into the site
     * @param emailAddress
     * @param password
     */
    public void existingCustomerLogin(String emailAddress, String password) {
        GenericHelper.WaitForElementToLoad(emailAddressField);
        emailAddressField.sendKeys(emailAddress);

        GenericHelper.WaitForElementToLoad(PasswordField);
        PasswordField.sendKeys(password);

        GenericHelper.WaitForElementToBeClickable(sign_inButton);
    }

    /**
     * ##############################Navigation region
     */


    /**
     * clicking sign button
     * @return
     */
    public LoginPage clickingSignButton() {

        GenericHelper.WaitForElementToBeClickable(sign_inLink);
        return new LoginPage(BaseUtil.driver);
    }


}
