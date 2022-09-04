package taskTests.tests.unit;

import taskTests.assertions.Assertions;
import taskTests.game.*;
import taskTests.tests.unit.fakes.DiceImplDecrementSpy;
import taskTests.tests.unit.fakes.DiceImplConstIntSpy;
import taskTests.tests.unit.fakes.DiceImplIncrementSpy;
import taskTests.tests.unit.fakes.GameWinnerConsolePrinterSpy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameTest {

    public void testGameWhenPlayerTwoAlwaysWinner() {

        String scenario = "Тест на правильного победителя (должен всегда возвращаться  player2)";

        try {
            DiceImplIncrementSpy diceSpy = new DiceImplIncrementSpy();
            GameWinnerConsolePrinterSpy gameWinnerPrinterSpy = new GameWinnerConsolePrinterSpy();
            Game game = new Game(diceSpy, gameWinnerPrinterSpy);
            Player player1 = new Player("1");
            Player player2 = new Player("2");

            game.playGame(player1, player2);
            Player winner = gameWinnerPrinterSpy.player;

            Assertions.assertEqualsPlayer(player2, winner);
            System.out.println("Passed " + scenario);

        } catch (Throwable e) {

            System.err.println(scenario + " fails with massage " + e.getMessage());

        }
    }
    public void testGameWhenPlayerOneAlwaysWinner() {

        String scenario = "Тест на правильного победителя (должен всегда возвращаться  player1)";

        try {
            DiceImplDecrementSpy diceSpy = new DiceImplDecrementSpy();
            GameWinnerConsolePrinterSpy gameWinnerPrinterSpy = new GameWinnerConsolePrinterSpy();
            Game game = new Game(diceSpy, gameWinnerPrinterSpy);
            Player player1 = new Player("1");
            Player player2 = new Player("2");

            game.playGame(player1, player2);
            Player winner = gameWinnerPrinterSpy.player;

            Assertions.assertEqualsPlayer(player1, winner);
            System.out.println("Passed " + scenario);

        } catch (Throwable e) {

            System.err.println(scenario + " fails with massage " + e.getMessage());

        }
    }
    public void testGameWhenEqualsDiceRoll() {

        String scenario = "Тест на одинаковые значения dice.roll";

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(baos);
            PrintStream oldStream = System.out;

            DiceImplConstIntSpy diceSpy = new DiceImplConstIntSpy();
            GameWinnerPrinter gameWinnerPrinterSpy = new GameWinnerConsolePrinter();
            Game game = new Game(diceSpy, gameWinnerPrinterSpy);

            System.setOut(printStream);
            game.playGame(new Player("1"), new Player("2"));
            System.out.flush();
            System.setOut(oldStream);
            String mess = String.valueOf(baos);

            Assertions.assertEqualsString("Ничья",mess);

            System.out.println("Passed " + scenario);

        } catch (Throwable e) {

            System.err.println(scenario + " fails with massage " + e.getMessage());

        }
    }
}


