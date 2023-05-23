import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", "Мейнкун", 10, "Василий Петрович");
        Cat cat2 = new Cat("Васька", "Персидская", 8, "Иван");
        Cat cat3 = new Cat("Васька", "Персидская", 8, "Иван");
//        System.out.println(cat1);
//        System.out.println(cat2);
//        System.out.println(cat2);

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
    static void ex0() {
        /*
        1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
        2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
        3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
         */
        Integer[] arr = new Integer[]{3, 2, 6, 1, 2, 4, 5, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
    static void ex1(){
        /*
        1. Напишите метод, который заполнит мвссиы из 1000 элементов случайными цифрами от 0 д о 24.
        2. Создайте метод, в который передайте заполненный выше массив и и спомощью Set вычислите процент уникальных
        значений в данном массив е и верните его в виде числа с плавающей запятой.
        Для вычисление процента используйте формулу:
        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве
         */
        Integer[] arr = createArray(1000, 0, 24);
        //System.out.println(Arrays.toString(arr));
        System.out.println(unicPercent(arr));

    }
    static double unicPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double unicPercent = (double) (set.size() * 100) / arr.length;
        return unicPercent;
    }
    static Integer[] createArray(int capacity, int min, int max){
        Integer[] arr = new Integer[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
}
