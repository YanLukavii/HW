package taskPriceInWords.PriceInWords.service;

public class PrintPriceDefault implements PrintPrice {
    @Override
    public void print(String convertedInput, String casePrice) {

        if (convertedInput == null || casePrice == null) {
            return;
        }
        System.out.println(convertedInput + casePrice);
    }
}
