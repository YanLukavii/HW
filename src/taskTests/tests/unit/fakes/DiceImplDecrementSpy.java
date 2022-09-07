package taskTests.tests.unit.fakes;

import taskTests.game.Dice;

public class DiceImplDecrementSpy implements Dice {

    int randomInteger = 7;

    @Override
    public int roll() {
        this.randomInteger = randomInteger - 1;
        return randomInteger;
    }
}
