package program;


import java.util.Random;
import java.util.Scanner;

public class Program {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '*';

    private static final int WIN_COUNT = 4;

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;


    public static void main(String[] args) {
        while (true) {
            initialize();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (checkGameState(DOT_HUMAN, "Вы победили!"))
                    break;
                aiTurn();
                printField();
                if (checkGameState(DOT_AI, "Победил компьютер!"))
                    break;
            }
            System.out.print("Желаете сыграть еще раз? (Y - да): ");
            if (!scanner.next().equalsIgnoreCase("Y"))
                break;
        }
    }

    /**
     * Инициализация игрового поля
     */
    static void initialize() {
        fieldSizeY = 4;
        fieldSizeX = 4;

        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    /**
     * Печать текущего состояния игрового поля
     */
    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX; i++) {
            System.out.print("-" + (i + 1));
        }
        System.out.println("-");

        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }

        for (int i = 0; i < fieldSizeX * 2 + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * Ход игрока (человека)
     */
    static void humanTurn() {
        int x;
        int y;

        do {
            System.out.print("Введите координаты хода X и Y (от 1 до 3)\nчерез пробел: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y) || !isCellEmpty(x, y));

        field[y][x] = DOT_HUMAN;
    }

    /**
     * Ход игрока (компьютера)
     */
    static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        }
        while (!isCellEmpty(x, y));

        field[y][x] = DOT_AI;
    }

    /**
     * Проверка, является ли ячейка игрового поля пустой
     *
     * @param x
     * @param y
     * @return
     */
    static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    /**
     * Проверка доступности ячейки игрового поля
     *
     * @param x
     * @param y
     * @return
     */
    static boolean isCellValid(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }


    /**
     * Метод проверки состояния игры
     *
     * @param dot фишка игрока
     * @param s   победный слоган
     * @return результат проверки состояния игры
     */
    static boolean checkGameState(char dot, String s) {
        if (checkWin(dot)) {
            System.out.println(s);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false; // Игра продолжается
    }

    /**
     * Проверка на ничью
     *
     * @return
     */
    static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(x, y))
                    return false;
            }
        }
        return true;
    }

    /**
     * Проверка победы игрока
     *
     * @param dot фишка игрока
     * @return признак победы
     */
    static boolean checkWin(char dot) {

        if (checkHorizontalLine(dot, WIN_COUNT)) return true;
        if (checkVerticalLines(dot, WIN_COUNT)) return true;
        if (checkDiagonalLines(dot, WIN_COUNT)) return true;

//        // Проверка по трем горизонталям
//        if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
//        if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
//        if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;
//
//        // Проверка по трем вертикалям
//        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
//        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
//        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;
//
//        // Проверка по диагоналям
//        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
//        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) return true;


        return false;
    }

    static boolean checkHorizontalLine(char dot, int winCount) {
        for (int i = 0; i < field.length; i++) {
            if (checkArrayForDots(field[i], dot, winCount)) {
                return true;
            }
        }
        return false;
    }

    static boolean checkVerticalLines(char dot, int winCount) {
        for (int i = 0; i < field[0].length; i++) {
            char[] tempArr = new char[field.length];
            for (int j = 0; j < field.length; j++) {
                tempArr[j] = field[j][i];
            }
            if (checkArrayForDots(tempArr, dot, winCount)) {
                return true;
            }
        }
        return false;
    }


    static boolean checkDiagonalLines(char dot, int winCount) {
        int arrayLength = 0;
        if (field.length < field[0].length) {
            arrayLength = field.length;
        } else {
            arrayLength = field[0].length;
        }
        char[] tempArray = new char[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            tempArray[i] = field[i][i];

        }
        if (checkArrayForDots(tempArray, dot, winCount)) {
            return true;
        }
        for (int i = 0; i < arrayLength; i++) {
            tempArray[i] = field[field.length - 1 - i][i];
        }
        if (checkArrayForDots(tempArray, dot, winCount)) {
            return true;
        }
        return false;
    }


    static boolean check4(int x, int y, char dot, int winCount) {
        return false;
    }

    /**
     * Проверка одномерного массива на подряд идущие элементы
     *
     * @param arr      массив элементов для проверки
     * @param dot      символ элемента массива для сравнения
     * @param winCount количество подряд идущих элементов
     * @return true
     */
    static boolean checkArrayForDots(char[] arr, char dot, int winCount) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == dot) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                }
            }
        }
        return count >= winCount;
    }

}
