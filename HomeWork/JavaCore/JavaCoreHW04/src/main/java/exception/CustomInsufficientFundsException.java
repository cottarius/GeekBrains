package exception;

import exception.MyCustomException;

public class CustomInsufficientFundsException extends MyCustomException {
    public CustomInsufficientFundsException(String message, int firstArgument, int secondArgument) {
        super(message, firstArgument, secondArgument);
    }
    public CustomInsufficientFundsException(String message){
        super(message);
    }
}
