import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка:");
        int size = scan.nextInt();
        System.out.print("Введите верхнюю границу для значений:");
        int max = scan.nextInt();
        logger.log("Создаём и наполняем список");

        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            source.add(new Random().nextInt(max));
        }
        System.out.println("Вот случайный список: " + source);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра");
        int threshold = scan.nextInt();
        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(threshold);
        List<Integer> filteredList = filter.filterOut(source);

        scan.close();
        logger.log("Завершаем программу");
    }
}
