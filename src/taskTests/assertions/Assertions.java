package taskTests.assertions;

import taskTests.game.Player;

public class Assertions {

    public static void assertValueRange (int actual) {

        if (actual < 1 || actual > 6) {
            throw new AssertionError("Expected value [1...6] value = "+ actual);
        }
    }
    public static void assertThrows (Class <? extends Throwable> expected, Runnable code) {

        Throwable actual = null;

        try {
            code.run();
        } catch (Throwable e ) {
            actual = e;
        }
        if (actual == null) {

            throw new  AssertionError("Code does not throw exception");

        }
        if (!actual.getClass().equals(expected)) {
            throw new AssertionError("Expected " + expected.getSimpleName() +" = " + actual.getClass().getSimpleName());
        }
    }

    public static void assertEqualsString (String expected, String actual) {

        if (!expected.equals(actual)) {

            throw new AssertionError("Expected String not equal " + expected + " != " + actual);
        }
    }

    public static void assertEqualsPlayer (Player expected, Player actual) {

        if (!expected.equals(actual)) {

            throw new AssertionError("Expected Player not equal " + expected.getName() + " != " + actual.getName());
        }
    }

}
