package taskSort;

import java.util.*;


public class MySort {

    public static void main(String[] args) {

        List<Integer> list = createList(100_000);
        long start = System.currentTimeMillis();
        Collections.sort(list);
        System.out.println(System.currentTimeMillis() - start + " Millis Collections.sort " + 100_000 + " elements!");
        //4 Millis Collections.sort 100000 elements!
        List<Integer> listForInsertSort = createList(100_000);
        long startBinaryInsert = System.currentTimeMillis();
        binaryInsertSort(listForInsertSort);
        System.out.println(System.currentTimeMillis() - startBinaryInsert + " Millis BinaryInsertSort " + 100_000 + " elements!");
        // 3281 Millis BinaryInsertSort 100000 elements!

    }

    public static void binaryInsertSort(List<Integer> arr) {

        for (int i = 1; i < arr.size(); i++) {

            int current = arr.get(i);  // элемент который нужно отсортировать
            int j = i;
            // запускаем бинарный поиск чтоб найти индекс куда должно попасть элемент
            int index = binarySearch(arr, current, 0, i);
            //сдивгаем все отсортированное до index
            while (j > index) {
                arr.set(j,arr.get(j-1)) ;
                j--;
            }
            //вставляем элемент на место найденое бинарным поиском(index)
            arr.set(index,current);
        }

    }

    public static int binarySearch(List<Integer> a, int key, int left, int right) {

        while (left <= right) {
            int mid = left + (right - left) / 2; // находим mid
            if (key > a.get(mid)) { // если значение больше мид то сдивгаем левую границу
                left = mid + 1;

            } else //если нет то сдвигаем правую границу
                right = mid - 1;

        }

        return left; // когда сомкнутся границы возарщаем индекс куда ставить элемент

    }

    public static List<Integer> createList (int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {

            list.add(size - i);

        }

        return list;
    }
}
