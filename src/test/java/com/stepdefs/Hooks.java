package com.stepdefs;

import base.BaseUtil;
import componentHelpers.BrowserHelper;
import componentHelpers.NavigateHelper;
import componentHelpers.WindowHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * Created by Kunle on 01/06/2018.
 */
public class Hooks extends BaseUtil {
    private BaseUtil baseUtil;
    private static Logger log = LogManager.getLogger(Hooks.class.getName());

    public Hooks(BaseUtil baseUtil) {

        this.baseUtil = baseUtil;
    }

    /*
    Init before loading test
     */
    @Before
    public void InitializeTest() throws IOException {
        Properties p = new Properties();
        FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\repo\\global.properties");
        p.load(fi);

        if (p.getProperty("browser").contains("firefox")) {
            driver = new FirefoxDriver();
            log.info("Run with Firefox browser");

        } else if (p.getProperty("browser").contains("chrome")) {
            ChromeOptions options = new ChromeOptions();
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            cap.setCapability(ChromeOptions.CAPABILITY, options);

            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\main\\java\\browser\\chromedriver.exe");
            driver = new ChromeDriver(cap);
            log.info("Run with Chrome browser");
        } else if (p.getProperty("browsers").contains("ie")) {
            DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
            caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            caps.setCapability(
                    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
                    true);

            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\main\\java\\browser\\IEDriverServer.exe");
            driver = new InternetExplorerDriver(caps);
            log.info("Run with Internet Explorer browser");
        }

        NavigateHelper.gotoExecuteAutomationPracticeSite();
        BrowserHelper.BrowserMaximize();
        WindowHelper.implicitlyWait();

    }

    /*
    Call after all scenario running
     */
    @After
    public void teardownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
            log.error(scenario.getName());
        }

        //Take screenshot of current scenario
        try {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (Exception e) {
            e.printStackTrace();
        }

        log.info("Closing browser");
        if (BaseUtil.driver != null) {
            BaseUtil.driver.close();
        }
    }
}
