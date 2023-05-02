import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ex0();


    }
    static void ex4(){
        /*
        Реализовать стэк с помощью массива.
        Нужно реализовать методы:
        size(), empty(), push(), peek(), pop()
         */
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.empty());
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
    static void ex3(){
        /*
        Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
        Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое
        очереди
         */
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
    static void ex2() {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя и "запоминает" строки.
        Если введено print, выводит строки так, чтобы последняя введеная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("Введите текст: ");
            String text = scanner.nextLine();
            switch (text) {
                case "print":
                    ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
                    while (listIterator.hasPrevious()){
                        System.out.println(listIterator.previous());
                    }
                    break;
                case "exit":
                    repeat = false;
                case "revert":
                    linkedList.removeLast();
                default:
                    linkedList.add(0, text);
            }
        }
    }
    static void ex1() {
        /*
        Реализовать консольное приложение, которое принимает от пользователя строку вида text~num
        Нужно расплитить строку по ~, сохранить text в связный список на позицию num/
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];

            switch (text) {
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

    static void ex0() {
        /*
        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
         */
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