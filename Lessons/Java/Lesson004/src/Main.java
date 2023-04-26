import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
         */
        ex1();

    }
    static  void ex1(){
        /*
        Реализовать консольное приложение, которое принимает от пользователя строку вида text~num
        Нужно расплитить строку по ~, сохранить text в связный список на позицию num/
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];

            switch (text){
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("До скорой встречи");
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
            System.out.println();
        }
    }
    static void ex0(){
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}