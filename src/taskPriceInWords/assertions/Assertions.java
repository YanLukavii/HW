package taskPriceInWords.assertions;

public class Assertions {

    public static void assertEqualsString(String expected, String actual) {

        if (!expected.equals(actual)) {

            throw new AssertionError("Expected String not equal " + expected + " != " + actual);
        }
    }
}
