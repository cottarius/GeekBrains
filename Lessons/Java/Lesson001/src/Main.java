import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        short age = 10;
        int salary = 123456;
        System.out.println(age);
        System.out.println(salary);

        float e = 2.7F;
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);

        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));

        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        boolean flag2 = 123 >= 234;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);

        var a = 123;
        System.out.println(a);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(a));
        System.out.println(getType(d));

        //Одномерные массивы
        int[] arr = new int[10];
        System.out.println(arr.length);
        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length);

        //Многомерные массивы
        int[] arr2[] = new int[3][5];
        for (int[] line: arr2) {
            for (int item: line) {
                System.out.printf("%d", item);
            }
        }
        System.out.println();
        int[][] arr3 = new int[3][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%d", arr3[i][j]);
            }
            System.out.println();
        }

        //Получение данных из терминала
//        Scanner iScanner = new Scanner(System.in);
//        System.out.println("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//
//        System.out.println();
//
//        System.out.printf("int a: ");
//        int x = iScanner.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanner.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);
//
//        System.out.println();
//
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//
//        iScanner.close();

        Scanner in = new Scanner(System.in);
        System.out.printf("Input name: ");
        String name2 = in.nextLine();
        System.out.printf("Input age: ");
        int age2 = in.nextInt();
        System.out.printf("Input height: ");
        float height2 = in.nextFloat();
        System.out.printf("Name: %s Age: %d Height: %.2f", name2, age2, height2);
        System.out.println();

        //Форматированный вывод
        int b = 1, c = 2;
        int t = b + c;
        String res = b + " + " + c + " = " + t;
        System.out.println(res);

        String res2 = String.format("%d + %d = %d", b, c, t);
        System.out.printf("%d + %d = %d", b, c, t);
        System.out.println();
        System.out.println(res2);

        //Виды спецификаторов
        //float pi = 3.1415f;
        System.out.printf("%f\n", pi);
        System.out.printf("%.2f\n", pi);
        System.out.printf("%.3f\n", pi);
        System.out.printf("%e\n", pi);
        System.out.printf("%.2e\n", pi);
        System.out.printf("%.3e\n", pi);

    }

    private static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
