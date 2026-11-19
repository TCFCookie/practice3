import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        // список
        words.add("listen");
        words.add("silent");
        words.add("enlist");
        words.add("hello");
        words.add("world");
        words.add("cat");
        words.add("act");
        words.add("tac");
//список группы
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[words.size()];
        // проверка
        for (int i = 0; i < words.size(); i++) {
            if (used[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(words.get(i));
            used[i] = true;
            // ищем анаграммы среди слов
            for (int j = i + 1; j < words.size(); j++) {
                if (!used[j] && isAnagram(words.get(i), words.get(j))) {
                    group.add(words.get(j));
                    used[j] = true;
                }
            }

            result.add(group);
        }

        System.out.println(result);
    }
    // проверка на размер
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        // сортировка по порядку
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}