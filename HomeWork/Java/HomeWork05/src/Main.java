import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ex1();
    }
    static void ex0(){
        /*
        Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько
        телефонов.
         */
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
        String l = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,\n" +
              "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,\n" +
              "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";


        ArrayList<String> list = prepareString(l);
        Map<Integer, ArrayList<String>> map = prepareTreeMap(list);
        printNames(map);
    }
    static Map<Integer, ArrayList<String>> prepareTreeMap(ArrayList<String> list){
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
        //System.out.println(Arrays.toString(arr));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] = arr[i].trim()).isEmpty()) continue;
            stringBuilder.append(arr[i].substring(0, arr[i].indexOf(" ")));
            stringBuilder.append(" ");
        }
        //System.out.println(stringBuilder);
        return new ArrayList<>(List.of(stringBuilder.toString().split(" ")));
    }
    static void printNames(Map<Integer, ArrayList<String>> map){
        for (Map.Entry<Integer, ArrayList<String>> entry: map.entrySet()) {
            int key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(value + " повторяется " + key + " раз(а) ");
        }
    }
}