package taskPriceInWords.PriceInWords.tests;

import taskPriceInWords.PriceInWords.tests.unit.CaseRubTest;
import taskPriceInWords.PriceInWords.tests.unit.PriceConverterTest;
import taskPriceInWords.PriceInWords.tests.unit.PrintPriceRusTest;
import taskPriceInWords.PriceInWords.tests.unit.StarterTest;

public class AllTests {


    public static void main(String[] args) {
        new PriceConverterTest().testValidValueOutput();
        new PriceConverterTest().testValidValueOutputUsingListFromZeroToTwenty();
        new PrintPriceRusTest().testPrintPriceRusValidOutputWhenPriceEndWidthOne();
        new StarterTest().testStarterWithNulls();
        new CaseRubTest().testCorrectReturnStringWith999InputPrice();
    }
}
