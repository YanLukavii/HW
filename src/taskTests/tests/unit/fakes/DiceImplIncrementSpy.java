package taskTests.tests.unit.fakes;

import taskTests.game.Dice;

public class DiceImplIncrementSpy implements Dice {

    int randomInteger = 0;

    @Override
    public int roll() {
        this.randomInteger = randomInteger + 1;
        return randomInteger;
    }
}
