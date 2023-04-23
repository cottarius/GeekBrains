import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //ex0();
        //ex1();
        //ex2();
        ex3();
    }
    static void ex1(){
        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.
         */
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }
    static void ex3(){
        /*
        Каталог товаров книжного магазина в виду двумерного списка List<ArrayList<String>> так,
        что на 0й позиции каждого внутреннего списка содержится название жанра,
        а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
         */

        //фантастика, гарри поттер, ночной дозор
        //роман, война и мир,
        //сказки, репка, колобок
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "фентези", "гарри поттер");
        addBook(shopBook, "сказки", "репка");
        addBook(shopBook, "фентези", "ночной дозор");
        addBook(shopBook, "роман", "война и мир");
        addBook(shopBook, "сказки", "колобок");
        System.out.println(shopBook);;
    }
    static void addBook(List<List<String>> shopBook, String genre, String name) {
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)){
                shopBook.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list);
    }
    static void ex2(){
        /*
        Создать сптсок типа ArrayList
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа
         */
        List list = new ArrayList();
        list.add(4);
        list.add("15");
        list.add("привет");
        list.add("привет");
        list.add(77);
        list.add(5);
        list.add(4.5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
    static void ex0() {
        //Даны следующие строки, сравнить их с помощью == и метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);

        System.out.println();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
    }
    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
        return list;
    }
    static void sort(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder());
    }
}