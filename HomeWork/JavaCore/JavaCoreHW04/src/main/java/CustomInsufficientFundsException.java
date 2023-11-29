public class CustomInsufficientFundsException extends MyCustomException {
    //    public CustomInsufficientFundsException(String message, int limit, int withdrawal) {
//        super(message, limit, withdrawal);
//    }
    public CustomInsufficientFundsException(String message) {
        super(message);
    }
}
