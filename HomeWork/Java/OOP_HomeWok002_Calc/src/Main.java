import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные в виде: число действие число. (Пробелы обязательны)");
        String input = in.nextLine();
        Collections.addAll(list, input.split(" "));
        try {
            Action.action(list.get(0), list.get(1), list.get(2));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Нужно было вводить данные с пробелом");
        }
    }
}