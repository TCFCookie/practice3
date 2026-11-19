import java.util.ArrayList;
import java.util.List;

public class task3 {

    public static void main(String[] args) {
        String text = "java is great java is powerful python is great too but java is java";
        int n = 3;

        System.out.println(getTop(text, n));
    }
    // n самых частых слов
    public static List<String> getTop(String text, int n) {
        String[] words = text.split(" ");
        //создание уникальных слов и частот
        List<String> uniq = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        //подсчет повторов
        for (int i = 0; i < words.length; i++) {
            if (!uniq.contains(words[i])) {
                uniq.add(words[i]);
                counts.add(1);
            } else {
                //
                int idx = uniq.indexOf(words[i]);
                counts.set(idx, counts.get(idx) + 1);
            }
        }
        // n самых частых
        List<String> result = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            int max = 0;
            for (int i = 1; i < counts.size(); i++) {
                if (counts.get(i) > counts.get(max)) {
                    max = i;
                }
            }
            result.add(uniq.get(max));
            counts.set(max, 0); // обнуление
        }
        return result;
    }
}