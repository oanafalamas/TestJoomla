package util;

public class AutomationExceptions extends RuntimeException{

    public AutomationExceptions(String message, Throwable cause) {
        super(message, cause);
        System.out.println(message + "Caused by: " + cause.getStackTrace().toString());
    }

    public AutomationExceptions(String message) {
        super(message);
        System.out.println("=======================================");
        System.out.println("Following error has occured: " + message);
    }

    public AutomationExceptions(Throwable cause) {
        super(cause);
    }
}
