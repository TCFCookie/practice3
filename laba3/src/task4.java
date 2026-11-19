import java.util.ArrayList;
import java.util.List;

public class task4 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(4);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        System.out.println("Исходный список: " + numbers);

        // уникальные
        List<Integer> uniq = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (!uniq.contains(numbers.get(i))) {
                uniq.add(numbers.get(i));
            }
        }
        System.out.println("Уникальные: " + uniq);

        // частоты
        System.out.println("Частота:");
        for (int i = 0; i < uniq.size(); i++) {
            int count = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j).equals(uniq.get(i))) {
                    count++;
                }
            }
            System.out.println(uniq.get(i) + " - " + count + " раз");
        }

        // max и min
        int max = numbers.get(0);
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("Макс: " + max);
        System.out.println("Мин: " + min);

        // сумма и среднее
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + (double) sum / numbers.size());
    }
}