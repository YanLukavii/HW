package taskPriceInWords.PriceInWords.tests.unit.fakes;

import taskPriceInWords.PriceInWords.wordsRepository.LanguageRepository;

import java.util.HashMap;

public class LanguageRusRepositoryFromZeroToTwentyFake implements LanguageRepository {


    @Override
    public HashMap<Integer, String> getHashmap() {
        HashMap<Integer,String> fakeMap = new HashMap<>();
        fakeMap.put(0, "ноль");
        fakeMap.put(1, "один");
        fakeMap.put(2, "два");
        fakeMap.put(3, "три");
        fakeMap.put(4, "четыре");
        fakeMap.put(5, "пять");
        fakeMap.put(6, "шесть");
        fakeMap.put(7, "семь");
        fakeMap.put(8, "восемь");
        fakeMap.put(9, "девять");
        fakeMap.put(10, "десять");
        fakeMap.put(11, "одиннадцать");
        fakeMap.put(12, "двенадцать");
        fakeMap.put(13, "тринадцать");
        fakeMap.put(14, "четырнадцать");
        fakeMap.put(15, "пятнадцать");
        fakeMap.put(16, "шестнадцать");
        fakeMap.put(17, "семнадцать");
        fakeMap.put(18, "восемнадцать");
        fakeMap.put(19, "девятнадцать");
        fakeMap.put(20, "двадцать");

        return fakeMap;
    }
}
