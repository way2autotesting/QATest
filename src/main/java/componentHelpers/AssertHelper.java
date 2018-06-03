package componentHelpers;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kunle on 01/06/2018.
 */
public class AssertHelper {
    /**
     * Assertion between expected and actual
     * @param expected
     * @param actual
     */
    public static void AreEqual(String expected, String actual) {
        try {
            assertEquals(expected, actual);
        } catch (Exception e) {
            System.out.println("Assertion Error");
            e.printStackTrace();
        }
    }
}
