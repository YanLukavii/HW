package taskPriceInWords.PriceInWords.tests.unit;

import taskPriceInWords.PriceInWords.service.CaseRub;
import taskPriceInWords.PriceInWords.service.PrintPriceDefault;
import taskPriceInWords.assertions.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintPriceRusTest {


    public void testPrintPriceRusValidOutputWhenPriceEndWidthOne() {

        String scenario = "Тест на правильный вывод при числе оканчивающемся на 1 (от 21 до 91)";

        try {

            PrintPriceDefault printPriceDefault = new PrintPriceDefault();
            CaseRub caseRub = new CaseRub();


            for (int i = 21; i <= 91; i = i + 10) {

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(baos);
                PrintStream oldStream = System.out;
                System.setOut(printStream);
                String fakeUserInput = String.valueOf(i);
                printPriceDefault.print("", caseRub.getPriceDescription(fakeUserInput));
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
