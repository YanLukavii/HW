package taskTests.tests.unit;

import taskTests.assertions.Assertions;
import taskTests.game.Dice;
import taskTests.game.DiceImpl;

public class DiceImplTest {

    public void testDiceImplTestReturnValueInRangeOneSix() {

        String scenario = "Тест возвращаемого значения на принадлежность диапозону [1...6]";

        try {
            Dice dice = new DiceImpl();
            int actual = dice.roll();
            Assertions.assertValueRange(actual);
            System.out.println("Passed" + scenario);
        } catch (Throwable e) {

            System.err.println(scenario + " fails with massage " + e.getMessage());

        }


    }


}
