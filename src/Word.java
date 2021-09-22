import java.util.Arrays;
import java.util.HashMap;

public class Word {
    public static void main(String[] args) {
        String[] strings = {"Вася", "Игорь", "Игнат", "Вася", "Вася", "Игнат", "Джон", "Игорь", "Игорь"};

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String string : strings) {
            int n = hashMap.getOrDefault(string, 0);
            hashMap.put(string, ++n);
        }

        System.out.println("Уникальные слова в массиве: " + hashMap);
    }
}