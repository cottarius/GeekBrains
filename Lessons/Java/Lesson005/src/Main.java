import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.println(ex2("<{a}+{(d*3)}>"));
        String line = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";
        ex3(line);
    }
    static void ex3(String line){
        /*
        Взять набор строк, например:

        Мороз и солнце день чудесный
        Еще ты дремлешь друг прелестный
        Пора красавица проснись.

        Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
        Строки с одинаковой длиной не должны "потеряться".
         */
        line = line.replace("\n", " ");
        line = line.replace(".", "");
        String[] words = line.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
    static boolean ex2(String line){
        /*
        Написать программу, определяющую правильность расстановки скобок в выражении.
        Привер 1: a+(d*3) - истина
        Привер 3: [a+(1]*3) - ложь
        Привер 3: [6+(3*3)] - истина
        Привер 4: {a}[+]{(d*3)} - истина
        Привер 5: <{a}+{(d*3)}> - истина
        Привер 6: {a+]}{(d*3)} - ложь
         */
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put('<','>');

        char[] c1 = line.toCharArray();
        for (char c : c1) {
            if (map.containsKey(c)) {
                stack.push(c);
            }
            if (map.containsValue(c)) {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    static boolean ex2_2(String line){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        map.put('>','<');

        char[] c1 = line.toCharArray();
        for (char c : c1) {
            if (map.containsValue(c)) {
                stack.push(c);
            }
            if (map.containsKey(c)) {
                if (stack.isEmpty() || map.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    static boolean ex1(String s1, String s2){
        /*
        Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
        Строки изоморфны, если одну букву в первом слове можно заменить на нектороую букву во втором слове, при этом
        повторяющиеся буквы меняются на одну и тц же букву с сохранением порядка следования.
        (Например, add - egg изоморны)
        Буква может не меняться, а оставаться такой же. (Например, note - code)
        Пример 1:
        Input: s = "foo", t = "bar"
        Output: false
        Пример 1:
        Input: s = "paper", t = "title"
        Output: true
         */
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if(map.containsKey(c1[i])){
                if(c2[i] != map.get(c1[i])){
                    return false;
                }
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }
    static void ex0(){
        /*
        Создать структуру для хранения номеров паспортов и фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.
         */
        Passports passports = new Passports();
        passports.add("123456","Иванов");
        passports.add("321456","Васильев");
        passports.add("234561","Петрова");
        passports.add("234432","Иванов");
        passports.add("654321","Петрова");
        passports.add("345678","Иванов");

//        System.out.println(passports.getByLastName("Иванов"));
        System.out.println(passports.getAllList2());
    }
}