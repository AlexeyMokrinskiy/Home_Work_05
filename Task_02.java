import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_02 {
    // 2) Пусть дан список сотрудников:Иван Иванов и т.д.
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
    // Отсортировать по убыванию популярности.
    public static void main(String[] args) {
        String workers = "Егор Смольянинов " + "Евгения Горб " + "Иван Искусков " + "Константин Горюнов " +
        "Владимир Егоров " + "Валерия Новик " + "Игорь Рогачев " + "Денис Гузанов " + "Михаил Пугачев " + "Ростислав Тетерюк " + 
        "Денис Щанников " + "Hиколaй Caбaйкин " + "Короткова Елена " + "Ирина Котова " + "Александр Гульцев " + 
        "Егор Малиновский " + "Роман Савенков " + "Александр Анохин " + "Руслан Решетников " + "Михаил Семин " +
        "Юрий Мельников " + "Вячеслав Кряжев " + "Вероника Карасева " + "Илья Цигельницкий " + "Егор Сергеев " + 
        "Валерий Шаповалов " + "Наталия Щедрина " + "Николай Лобанов " + "Денис Чадов "; 

        String[] splitWorkers = workers.split(" ");
        
        System.out.println(WorkersList(splitWorkers));
        System.out.println();
        System.out.println(SortedList(splitWorkers));

    }
    public static Map<String, Integer> WorkersList (String[] data) {
        Map<String, Integer> newMap = new HashMap<>();
        for (int i = 0; i < data.length; i += 2) {
            if (newMap.containsKey(data[i])) {
                newMap.replace(data[i], newMap.get(data[i]) + 1);
            } else 
                newMap.put(data[i], 1);
        }
        return newMap;
    }

    public static Map<String, Integer> SortedList (String[] data) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : WorkersList(data).values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : WorkersList(data).entrySet()) {
                String key = entry.getKey();
                if (WorkersList(data).get(key) == i) 
                    sortedMap.put(key, WorkersList(data).get(key));
            }
        }
        return sortedMap;
    }
}
