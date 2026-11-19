import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - добавить задачу");
            System.out.println("2 - удалить первую задачу");
            System.out.println("3 - удалить задачу по номеру");
            System.out.println("4 - показать все задачи");
            System.out.println("5 - выход");
            System.out.print("Команда: ");

            String command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.print("Текст задачи: ");
                String task = scanner.nextLine();
                tasks.add(task);

            } else if (command.equals("2")) {
                if (tasks.size() == 0) {
                    System.out.println("Список пуст");
                } else {
                    tasks.remove(0);
                }

            } else if (command.equals("3")) {
                System.out.print("Номер задачи: ");
                int number = Integer.parseInt(scanner.nextLine());

                if (number < 1 || number > tasks.size()) {
                    System.out.println("Неверный номер");
                } else {
                    tasks.remove(number - 1);
                }

            } else if (command.equals("4")) {
                if (tasks.size() == 0) {
                    System.out.println("Список пуст");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }

            } else if (command.equals("5")) {
                break;

            } else {
                System.out.println("Неверная команда");
            }
        }
    }
}