package componentHelpers;

import base.BaseUtil;

/**
 * Created by Kunle on 01/06/2018.
 */
public class BrowserHelper {

    /**
     * maximize window
     */
    public static void BrowserMaximize() {
        BaseUtil.driver.manage().window().maximize();
    }
}
