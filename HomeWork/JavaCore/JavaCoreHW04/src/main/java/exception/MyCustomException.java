package exception;

public class MyCustomException extends Exception{
    private int firstArgument;
    private int secondArgument;

    public int getFirstArgument() {
        return firstArgument;
    }

    public int getSecondArgument() {
        return secondArgument;
    }

    public MyCustomException(String message, int firstArgument, int secondArgument) {
        super(message);
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }
    public MyCustomException(String message){
        super(message);
    }

}
