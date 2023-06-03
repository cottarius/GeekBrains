
public class Action {
    public static void action(String firstStr, String op, String secondStr){
        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;

        try {
            firstNumber = Double.parseDouble(firstStr);
            secondNumber = Double.parseDouble(secondStr);
        }  catch (Exception e1) {
            System.out.println("Вы ввели не верные данные");
            System.exit(0);
        }
        MathOperation mathOperation;
        switch (op) {
            case "-" -> {
                mathOperation = new Substraction();
                result = mathOperation.mathOperation(firstNumber, secondNumber);
                System.out.println(result);
            }
            case "+" -> {
                mathOperation = new Addition();
                result = mathOperation.mathOperation(firstNumber, secondNumber);
                System.out.println(result);
            }
            case "*" -> {
                mathOperation = new Multiplication();
                result = mathOperation.mathOperation(firstNumber, secondNumber);
                System.out.println(result);
            }
            case "/" -> {
                mathOperation = new Division();
                result = mathOperation.mathOperation(firstNumber, secondNumber);
                System.out.println(result);
            }
            default -> System.out.println("Вы ввели неправильный знак операции");
        }
    }
}
