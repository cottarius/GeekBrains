import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Дана json строка [{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
                          {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
                          {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Задача написать метод(ы), который распарсит строку и выдаст ответ вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.

Используйте StringBuilder для подготовки ответа

Исходная json строка это просто String !!! Для работы используйте методы String, такие как replace, split, substring
и т.д. по необходимости

Создать метод, который запишет результат работы в файл. Обработайте исключения и запишите ошибки в лог файл.
2. *Получить исходную json строку из файла, используя FileReader или Scanner
3. *Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
         */
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        System.out.println(jsonString);

        StringBuilder sb = new StringBuilder();
        sb.append(jsonString.replace("[", "")
                .replace("]", "")
                .replace("фамилия", "")
                .replace("оценка", "")
                .replace("предмет", "")
                .replace("\"", "")
                .replace(":", "")
                .replace("},{", "} {")
                .replace("{", "")
                .replace("}", "")
                .toString());
        System.out.println(sb);
        String newString = sb.toString();
        System.out.println(newString);
        String[] s1 = newString.split(" ");
        System.out.println(Arrays.toString(s1));

//        List<String> stringList = new ArrayList<String>(Arrays.asList(newString.split(" ")));
//        System.out.println(stringList);
//        List<List<String>> newList = new ArrayList<List<String>>(stringList.size());
//        for (int i = 0; i < stringList.size(); i++) {
//            newList.add(stringList.subList(i, i + 1));
//        }
//        System.out.println(newList);
//        for (int i = 0; i < newList.size(); i++) {
//            System.out.printf("Студент %s получил %s по предмету %s", newList.get(i).get(0), newList.get(i),
//                    newList.get(i));
//        }
    }

    static String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder();
        String punctuations = "[]:{}\\\"";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (punctuations.indexOf(ch) < 0) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}