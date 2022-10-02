package taskPriceInWords.PriceInWords.service;

public class PrintPriceRus implements PrintPrice {
    @Override
    public void print(String input, String result) {

        if (result == null || input.length() > 3) {
            return;
        }

        boolean isCorrect = input.endsWith("2") || input.endsWith("3") || input.endsWith("4");

        if (input.length() == 1) {
            if (input.startsWith("1")) result = result + " рубль";
            else if (isCorrect) { result = result + " рубля";
            } else result = result + " рублей";
        }
        else {
            boolean isEnd = input.charAt(input.length() - 2) != '1';
            if ((isCorrect) && isEnd) {
                result = result + " рубля";

            } else if (input.endsWith("1") && isEnd) {
                result = result + " рубль";
            } else
                result = result + " рублей";
        }

        System.out.println(result);

    }
}
