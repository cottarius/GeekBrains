import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/*
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = createRandomArray(10);
        bubbleSortWithLog(arr);
    }
    static Logger logger = Logger.getAnonymousLogger();
    static int[] createRandomArray(int arrayLength){
        Random rand = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }
    static int[] bubbleSortWithLog(int[] array) {
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        logger.info("Исходный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            logger.info("Результат итерации №:" + (i + 1)  + " " + Arrays.toString(array));
        }
        logger.info("Отсортированный массив: " + Arrays.toString(array));
        fileHandler.close();
        return array;
    }
}