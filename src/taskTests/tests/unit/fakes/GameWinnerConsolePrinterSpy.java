package taskTests.tests.unit.fakes;

import taskTests.game.GameWinnerPrinter;
import taskTests.game.Player;

public class GameWinnerConsolePrinterSpy implements GameWinnerPrinter {
    public Player player;
    @Override
    public void printWinner(Player winner) {
       this.player = winner;
    }
}
