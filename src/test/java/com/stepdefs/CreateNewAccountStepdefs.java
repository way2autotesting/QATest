package com.stepdefs;

import base.BaseUtil;
import componentHelpers.WindowHelper;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.MyStorePage;

/**
 * Created by Kunle on 01/06/2018.
 */
public class CreateNewAccountStepdefs {
    private static Logger log = LogManager.getLogger(CreateNewAccountStepdefs.class.getName());

    MyStorePage myStorePage = new MyStorePage(BaseUtil.driver);
    LoginPage loginPage = new LoginPage(BaseUtil.driver);
    MyAccountPage myAccountPage = new MyAccountPage(BaseUtil.driver);


    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {

        myStorePage.clickingSignButton();
        log.info("Current page tile is " + WindowHelper.GetTitle());
    }

    @When("^I create new account with the following details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iCreateNewAccountWithTheFollowingDetails(String email, String fName, String LName, String pass, String address, String city, String state, String code, String country, String mobile, String ref) throws Throwable {

        /**
         * Please enter your email address to create an account.
         */
        loginPage.inputEmailAddress(email);
        log.info("Email address entered");

        /**
         * Your personal information
         */
        loginPage.createAccountWithPersonalInfo(fName, LName, pass);

        /**
         * Your address
         */
        loginPage.createAccountWithCurrentAddress(address, city, state, code, country, mobile, ref);
        log.info("New account create");
    }

    @Then("^I can see My Account created$")
    public void iCanSeeMyAccountCreated() throws Throwable {

        Assert.assertTrue("The text My account do not exist", myAccountPage.isMyAccountTextExist());
        log.info("I can navigate to My Account page");
    }

    @And("^I finally sign out$")
    public void iFinallySignOut() throws Throwable {

        myAccountPage.signOut();
        log.info("Logout successful");
    }
}
