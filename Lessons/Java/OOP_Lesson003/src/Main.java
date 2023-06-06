import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Worker> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(new Worker("имя_" + i, rand.nextInt(18,40), rand.nextInt(1000, 3000)));
        }
        System.out.println(list);
        list.sort((w1, w2) -> Integer.compare(w1.getAge(), w2.getAge()));
        System.out.println(list);
        list.sort((w1, w2) -> Integer.compare(w1.getSalary(), w2.getSalary()));
        System.out.println(list);
    }
}