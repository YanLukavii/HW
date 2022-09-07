package taskTests.tests.unit.fakes;

import taskTests.game.Dice;

public class DiceImplConstIntSpy implements Dice {
    @Override
    public int roll() {
        return 1;
    }
}
