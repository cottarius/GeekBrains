package exception;

public class CustomIllegalArgumentException extends MyCustomException {
//    public CustomIllegalArgumentException(String message, int firstArgument, int secondArgument) {
//        super(message, firstArgument, secondArgument);
//    }
    public CustomIllegalArgumentException(String message){
        super(message);
    }
}
