$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddDressToCart.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@AddToCart"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the username as \"\u003cUsername\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am searching for a particular dress",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select the most expensive dress",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I can see a text displayed one item added to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I land on the shopping cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I finally sign out",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I now login with correct username as \"\u003cUsername\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I select Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should  see the item in the cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": ";;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 18,
      "id": ";;;1"
    },
    {
      "cells": [
        "kunle35awesu@gmail.com",
        "12345"
      ],
      "line": 19,
      "id": ";;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10149232822,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": ";;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    },
    {
      "line": 4,
      "name": "@AddToCart"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the username as \"kunle35awesu@gmail.com\" and password as \"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am searching for a particular dress",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select the most expensive dress",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I can see a text displayed one item added to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I land on the shopping cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I finally sign out",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I now login with correct username as \"kunle35awesu@gmail.com\" and password as \"12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I select Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should  see the item in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewAccountStepdefs.iNavigateToLoginPage()"
});
formatter.result({
  "duration": 1944563612,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kunle35awesu@gmail.com",
      "offset": 25
    },
    {
      "val": "12345",
      "offset": 66
    }
  ],
  "location": "LoginStepdefs.i_enter_username_as(String,String)"
});
formatter.result({
  "duration": 2538575004,
  "status": "passed"
});
formatter.match({
  "location": "AddDressToCartStepdefs.iAmSearchingForAParticularDress()"
});
formatter.result({
  "duration": 461829824,
  "status": "passed"
});
formatter.match({
  "location": "AddDressToCartStepdefs.iSelectTheMostExpensiveDress()"
});
formatter.result({
  "duration": 2441683059,
  "status": "passed"
});
formatter.match({
  "location": "AddDressToCartStepdefs.iCanSeeATextDisplayedOneItemAddedToTheCart()"
});
formatter.result({
  "duration": 908321787,
  "status": "passed"
});
formatter.match({
  "location": "AddDressToCartStepdefs.iLandOnTheShoppingCartPage()"
});
formatter.result({
  "duration": 1924217284,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccountStepdefs.iFinallySignOut()"
});
formatter.result({
  "duration": 146447489,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kunle35awesu@gmail.com",
      "offset": 38
    },
    {
      "val": "12345",
      "offset": 79
    }
  ],
  "location": "AddDressToCartStepdefs.iNowLoginWithCorrectUsernameAsAndPasswordAs(String,String)"
});
formatter.result({
  "duration": 5197713006,
  "status": "passed"
});
formatter.match({
  "location": "AddDressToCartStepdefs.iSelectCartButton()"
});
formatter.result({
  "duration": 403696482,
  "status": "passed"
});
formatter.match({
  "location": "AddDressToCartStepdefs.iShouldSeeTheItemInTheCart()"
});
formatter.result({
  "duration": 81173047559,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027product_price_4_16_68959\u0027]/span\"}\nCommand duration or timeout: 81.15 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027Way2AutoTesting\u0027, ip: \u0027192.168.189.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d33.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 3ef52340-43c1-471a-aa55-75c48b104e32\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027product_price_4_16_68959\u0027]/span}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy33.getText(Unknown Source)\r\n\tat pages.OrderPage.checkIfItemExistInTheCart(OrderPage.java:40)\r\n\tat com.stepdefs.AddDressToCartStepdefs.iShouldSeeTheItemInTheCart(AddDressToCartStepdefs.java:65)\r\n\tat ✽.Then I should  see the item in the cart(AddDressToCart.feature:15)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027product_price_4_16_68959\u0027]/span\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027Way2AutoTesting\u0027, ip: \u0027192.168.189.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/Kunle/AppData/Local/Temp/anonymous36696511863780601webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/Kunle/AppData/Local/Temp/anonymous36696511863780601webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:625)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 444090362,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login test",
  "description": "This feature deals with the login functionality of the application",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7131257876,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login with correct username and password",
  "description": "",
  "id": "login-test;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the username as \"kunle35awesu@gmail.com\" and password as \"12345\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I can see My Account created",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I finally sign out",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAccountStepdefs.iNavigateToLoginPage()"
});
formatter.result({
  "duration": 1832499159,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kunle35awesu@gmail.com",
      "offset": 25
    },
    {
      "val": "12345",
      "offset": 66
    }
  ],
  "location": "LoginStepdefs.i_enter_username_as(String,String)"
});
formatter.result({
  "duration": 2485702719,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccountStepdefs.iCanSeeMyAccountCreated()"
});
formatter.result({
  "duration": 76511407,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewAccountStepdefs.iFinallySignOut()"
});
formatter.result({
  "duration": 262844745,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1867922205,
  "status": "passed"
});
});