package componentHelpers;

import base.BaseUtil;

import java.util.concurrent.TimeUnit;

/**
 * Created by Kunle on 01/06/2018.
 */
public class WindowHelper {

    /**
     * Sync. implicitly
     */
    public static void implicitlyWait() {

        BaseUtil.driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    }

    /**
     * Get current page title
     * @return
     */
    public static String GetTitle() {

        return BaseUtil.driver.getTitle();
    }
}
