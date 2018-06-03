package componentHelpers;

import base.BaseUtil;

/**
 * Created by Kunle on 01/06/2018.
 */
public class NavigateHelper {

    /**
     * Navigate to url in test
     */
    public static void gotoExecuteAutomationPracticeSite() {

        BaseUtil.driver.get("http://automationpractice.com/index.php");
    }
}
