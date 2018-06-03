package pages;

import base.BaseUtil;
import componentHelpers.ComboBoxHelper;
import componentHelpers.GenericHelper;
import org.omg.IOP.ComponentIdHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kunle on 01/06/2018.
 */
public class LoginPage {

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    /**
     * ##############################WebElement region
     */
    @FindBy(css = "#email_create")
    private WebElement emilAddressField;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameField;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "address1")
    private WebElement addressField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(css = "#id_state")
    private WebElement stateField;

    @FindBy(id = "postcode")
    private WebElement postalCodeFiled;

    @FindBy(id = "id_country")
    private WebElement countryFiled;

    @FindBy(id = "phone_mobile")
    private WebElement phoneFiled;

    @FindBy(id = "alias")
    private WebElement referenceFiled;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    @FindBy(id = "email")
    private WebElement RegisterEmilAddressField;

    @FindBy(id = "passwd")
    private WebElement RegisterPasswordField;

    @FindBy(id = "SubmitLogin")
    private WebElement RegisterSignInButton;

    /**
     * ###############################Action region
     */

    /**
     * Input email address
     * @param enterEmail
     */
    public void inputEmailAddress(String enterEmail) {

        emilAddressField.sendKeys(enterEmail);//input email
        GenericHelper.WaitForElementToBeClickable(createAnAccountButton);//click Create an account
    }

    /**
     * Create an account with personal information
     * @param FName
     * @param LName
     * @param pass
     */
    public void createAccountWithPersonalInfo(String FName, String LName, String pass) {

        GenericHelper.WaitForElementToLoad(firstNameField);
        firstNameField.sendKeys(FName);

        GenericHelper.WaitForElementToLoad(lastNameField);
        lastNameField.sendKeys(LName);

        GenericHelper.WaitForElementToLoad(passwordField);
        passwordField.sendKeys(pass);
    }

    /**
     * Creat an account with current address
     * @param address
     * @param city
     * @param state
     * @param postCode
     * @param country
     * @param phone
     * @param ref
     */
    public void createAccountWithCurrentAddress(String address, String city, String state, String postCode, String country, String phone, String ref) {
        GenericHelper.WaitForElementToLoad(addressField);
        addressField.sendKeys(address);

        GenericHelper.WaitForElementToLoad(cityField);
        cityField.sendKeys(city);

        GenericHelper.scrollDownPage();
        ComboBoxHelper.SelectElement(stateField, state);

        GenericHelper.WaitForElementToLoad(postalCodeFiled);
        postalCodeFiled.sendKeys(postCode);

        ComboBoxHelper.SelectElement(countryFiled, country);

        GenericHelper.WaitForElementToLoad(phoneFiled);
        phoneFiled.sendKeys(phone);

        GenericHelper.WaitForElementToLoad(referenceFiled);
        referenceFiled.clear();
        referenceFiled.sendKeys(ref);

        GenericHelper.WaitForElementToBeClickable(registerButton);
    }

    /**
     * navigate region
     */


    /**
     * Register with correct username and password
     * @param email
     * @param pass
     * @return
     */
    public MyAccountPage registeredUserLoginWithCorrectDetails(String email, String pass) {

        GenericHelper.WaitForElementToLoad(RegisterEmilAddressField);
        RegisterEmilAddressField.sendKeys(email);//email field

        GenericHelper.WaitForElementToLoad(RegisterPasswordField);
        RegisterPasswordField.sendKeys(pass);//password field

        GenericHelper.WaitForElementToBeClickable(RegisterSignInButton);//click sign in

        return new MyAccountPage(BaseUtil.driver);
    }
}
