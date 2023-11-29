public class MyCustomException extends Exception{
    private int limit;
    private int withdrawal;

    public MyCustomException(String message) {
        super(message);

    }

}
