import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ex0();
        ex1();
    }
    static void ex0(){
        /*
        Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько
        телефонов.
         */
        System.out.println("Задание 1");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Pavel", "123456");
        phoneBook.addContact("Ivan", "456123");
        phoneBook.addContact("Ivan", "222444");
        phoneBook.addContact("Igor", "654321");

        System.out.println(phoneBook.getList());
        System.out.println(phoneBook.getByName("Igor"));
        phoneBook.deleteByName("Igor");
        System.out.println(phoneBook.getList());
    }
    static void ex1(){
        /*
        Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
        Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
        Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
         */
        System.out.println("Задание 2");
        String l = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,\n" +
              "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,\n" +
              "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";


        ArrayList<String> list = prepareString(l);
        printDuplicateNames(list);
        Map<Integer, ArrayList<String>> map = sortByReversOrder(list);
        printSortedNames(map);
    }
    static void printDuplicateNames(ArrayList<String> list){
        System.out.println("Список имён с повторениями:");
        Map<String, Integer> map = new TreeMap<>();
        for (String name: list) {
            map.put(name, Collections.frequency(list, name));
        }
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            //По условию задачи повторений каждого имени меньше 10
            if(value > 1 && value < 5) {
                System.out.println(key + " повторяется " + value + " раза");
            } else {
                System.out.println(key + " повторяется " + value + " раз");
            }
        }
        System.out.println();
    }
    static Map<Integer, ArrayList<String>> sortByReversOrder(ArrayList<String> list){
        Map<Integer, ArrayList<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String name: list) {
            int count = Collections.frequency(list, name);
            if (map.containsKey(count)) {
                ArrayList<String> list2 = map.get(count);
                if (list2.contains(name)) {
                    continue;
                } else {
                    list2.add(name);
                }
            } else {
                ArrayList<String> list2 = new ArrayList<>();
                list2.add(name);
                map.put(count, list2);
            }
        }
        return map;
    }

    static ArrayList<String> prepareString(String s){
        s = s.replace(".", "");
        s = s.replace("\n", " ");
        String[] arr = s.split(",");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] = arr[i].trim()).isEmpty()) continue;
            stringBuilder.append(arr[i].substring(0, arr[i].indexOf(" ")));
            stringBuilder.append(" ");
        }
        return new ArrayList<>(List.of(stringBuilder.toString().split(" ")));
    }
    static void printSortedNames(Map<Integer, ArrayList<String>> map){
        System.out.println("Сортировка по убыванию популярности:");
        for (Map.Entry<Integer, ArrayList<String>> entry: map.entrySet()) {
            int key = entry.getKey();
            List<String> value = entry.getValue();
            for(String name : value){
                System.out.println(name + " (" + key + ") ");
            }
        }
        System.out.println();
    }
}