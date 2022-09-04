package taskTests.assertions;

import taskTests.game.Player;

public class Assertions {

    public static void assertValueRange (int actual) {

        if (actual < 1 || actual > 6) {
            throw new AssertionError("Expected value [1...6] value = "+ actual);
        }
    }
    public static void assertNotEqualsValues (int actualFirstPerson, int actualSecondPerson) {

        if (actualFirstPerson == actualSecondPerson) {

            throw new AssertionError("Values must not be equal " + actualFirstPerson + " != " + actualSecondPerson);
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
