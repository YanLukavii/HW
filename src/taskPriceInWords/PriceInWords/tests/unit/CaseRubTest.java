package taskPriceInWords.PriceInWords.tests.unit;

import taskPriceInWords.PriceInWords.service.CaseRub;
import taskPriceInWords.assertions.Assertions;

public class CaseRubTest {


    public void testCorrectReturnStringWith999InputPrice() {

        String scenario = "Тест на правильный падеж при 999 ";

        try {
            CaseRub caseRub = new CaseRub();

            String testInputValue = "999";
            String actual = caseRub.getPriceDescription(testInputValue);

            Assertions.assertEqualsString(" рублей", actual);
            System.out.println("Passed " + scenario);

        } catch (Throwable e) {
            System.err.println(scenario + " fails with massage " + e.getMessage());
        }

    }
}
