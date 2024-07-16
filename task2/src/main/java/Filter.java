import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (Integer i : source) {
            if (i >= treshold) {
                logger.log(("Элемент \"" + i + "\" проходит"));
                result.add(i);
            } else {
                logger.log(String.format("Элемент \"%d\" не проходит", i));
            }
        }
        logger.log(String.format("Прошло фильтр %d элемента из %d", result.size(), source.size()));
        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список: " + result);
        //..
        return result;
    }
}
