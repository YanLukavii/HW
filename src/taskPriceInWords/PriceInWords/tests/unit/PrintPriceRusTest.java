package taskPriceInWords.PriceInWords.tests.unit;

import taskPriceInWords.PriceInWords.service.PrintPriceRus;
import taskPriceInWords.assertions.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintPriceRusTest {


    public void testPrintPriceRusValidOutputWhenPriceEndWidthOne() {

        String scenario = "Тест на правильный вывод при числе оканичающемся на 1 (от 21 до 91)";

        try {

            PrintPriceRus printPriceRus = new PrintPriceRus();

            for (int i = 21; i <= 91; i = i + 10) {

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(baos);
                PrintStream oldStream = System.out;
                System.setOut(printStream);
                printPriceRus.print(String.valueOf(i), "");
                System.out.flush();
                System.setOut(oldStream);
                String mess = String.valueOf(baos);

                Assertions.assertEqualsString(" рубль\r\n", mess);
                System.out.println("Passed " + scenario + " " + i);

            }

        } catch (Throwable e) {
            System.err.println(scenario + " fails with massage " + e.getMessage());
        }
    }

}
