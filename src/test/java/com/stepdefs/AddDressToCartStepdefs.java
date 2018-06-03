package com.stepdefs;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.*;

/**
 * Created by Kunle on 01/06/2018.
 */
public class AddDressToCartStepdefs {
    private static Logger log = LogManager.getLogger(CreateNewAccountStepdefs.class.getName());

    MyAccountPage myAccountPage = new MyAccountPage(BaseUtil.driver);
    DressesPage dressesPage = new DressesPage(BaseUtil.driver);
    OrderPage orderPage = new OrderPage(BaseUtil.driver);
    MyStorePage myStorePage = new MyStorePage(BaseUtil.driver);
    LoginPage loginPage = new LoginPage(BaseUtil.driver);


    @And("^I select the most expensive dress$")
    public void iSelectTheMostExpensiveDress() throws Throwable {

        dressesPage.selectMostExpensiveDress();
        log.info("Add item yo the cart");
    }

    @Then("^I land on the shopping cart page$")
    public void iLandOnTheShoppingCartPage() throws Throwable {

        Assert.assertTrue(orderPage.validateTheTitlePageExist());
        log.info("Items displayed in cart");
    }

    @And("^I select Cart button$")
    public void iSelectCartButton() throws Throwable {

        myAccountPage.clickingCart();
        log.info("Cart button selected");
    }

    @When("^I now login with correct username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iNowLoginWithCorrectUsernameAsAndPasswordAs(String user, String pass) throws Throwable {
        myStorePage.clickingSignButton();

        loginPage.registeredUserLoginWithCorrectDetails(user, pass);
        log.info("Login successful");
    }

    @Then("^I can see a text displayed one item added to the cart$")
    public void iCanSeeATextDisplayedOneItemAddedToTheCart() throws Throwable {

        Assert.assertTrue(dressesPage.IsOneItemAddedToTheCartExist());
        log.info("One item added to the cart");
    }

    @Then("^I should  see the item in the cart$")
    public void iShouldSeeTheItemInTheCart() throws Throwable {

        Assert.assertTrue(orderPage.checkIfItemExistInTheCart());
    }

    @And("^I am searching for a particular dress$")
    public void iAmSearchingForAParticularDress() throws Throwable {
        myAccountPage.selectDressesCategory();
        log.info("Search for a particular type of cloth");
    }
}
