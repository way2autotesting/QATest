package com.stepdefs;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.LoginPage;

/**
 * Created by Kunle on 01/06/2018.
 */
public class LoginStepdefs {
    private static Logger log = LogManager.getLogger(CreateNewAccountStepdefs.class.getName());

    LoginPage loginPage = new LoginPage(BaseUtil.driver);



    @Then("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_username_as(String user, String pass) throws Throwable {

        loginPage.registeredUserLoginWithCorrectDetails(user, pass);
        log.info("Login successful");
    }
}
