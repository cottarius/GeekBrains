import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n-е треугольное число: ");
        System.out.println(TriangularNumber(in.nextInt()));

        System.out.print("Введите число для вычисления факториала этого числа: ");
        System.out.println(Factorial(in.nextInt()));

        System.out.print("Введите число - конечный диапазон последовательности для определения простых чисел: ");
        PrimeNumber(in.nextInt());
        System.out.println();

        System.out.print("Калькулятор.\nВведите первое число: ");
        int firstNumber = in.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = in.nextInt();
        System.out.print("Введите знак математической операции (Допустимы: +, -, *, /, %, ^, v): ");
        char operation = in.next().charAt(0);
        System.out.printf("%.2f", Calculator(firstNumber, secondNumber, operation));

        in.close();
    }
    //
    public static double Factorial(double n) {
        if (n == 1) return 1;
        else if (n < 0) return -1;
        return n * Factorial(n - 1);
    }

    public static void PrimeNumber(int n) {
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                for (int j = 2; i * j < arr.length; j++) {
                    arr[i * j] = false;
                }
                System.out.printf("%d ", i);
            }
        }
    }

    public static int TriangularNumber(int n) {
        /*
        int res = 0;
        if (n < 0) return -1;
        for (int i = n; i > 0; i--) {
            res += i;
        }
        return res;
        */
        if (n <= 0) return -1;
        if (n == 1) return 1;
        return n + TriangularNumber(n - 1);
    }

    public static double Calculator(int firstNumber, int secondNumber, char operator) {
        double result = 0;
        switch (operator) {
            case '+' : result = firstNumber + secondNumber; break;
            case '-' : result = firstNumber - secondNumber; break;
            case '*' : result = firstNumber * secondNumber; break;
            case '/' : {
                if (secondNumber == 0){
                    System.out.println("Ошибка! Деление на 0 невозможно!"); break;
                }
                else {
                    result = (double) firstNumber / secondNumber; break;
                }
            }
            case '%' : result = firstNumber % secondNumber; break;
            case '^' : result = Math.pow(firstNumber, secondNumber); break;
            case 'v' : result = sqrt(firstNumber, secondNumber); break;
            default :
                System.out.println("Введён неправильный знак математической операции!"); break;
        }
        return result;
    }
    public static double sqrt(double x, double n){
        return Math.pow(x, 1/n);
    }
}