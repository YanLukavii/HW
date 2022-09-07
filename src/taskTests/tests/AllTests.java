package taskTests.tests;

import taskTests.tests.unit.DiceImplTest;
import taskTests.tests.unit.GameTest;

public class AllTests {

    public static void main(String[] args) {

        new DiceImplTest().testDiceImplTestReturnValueInRangeOneSix(); // генерация числа от 1 до 6

        new GameTest().testGameWhenPlayerTwoAlwaysWinner();
        new GameTest().testGameWhenPlayerOneAlwaysWinner();
        new GameTest().testGameWhenEqualsDiceRoll(); // при одинаковых roll в консоль должно вывестись Ничья
        new GameTest().testGameMethodPlayGameWhenFieldNull();
        new GameTest().testGameMethodPlayGameWhenFieldNull2();

    }
}
