package taskPriceInWords.PriceInWords.service;

public class CaseRub implements Case {
    @Override
    public String getPriceDescription(String userInput) {

        String result = "";

        if (userInput.length() == 0 || userInput.length() > 3) {
            return result;
        }

        boolean isCorrect = userInput.endsWith("2") || userInput.endsWith("3") || userInput.endsWith("4");

        if (userInput.length() == 1) {
            if (userInput.startsWith("1")) result = " рубль";
            else if (isCorrect) {
                result = " рубля";
            } else result = " рублей";
        } else {
            boolean isEnd = userInput.charAt(userInput.length() - 2) != '1';
            if ((isCorrect) && isEnd) {
                result = " рубля";

            } else if (userInput.endsWith("1") && isEnd) {
                result = " рубль";
            } else
                result = " рублей";
        }

        return result;
    }
}
