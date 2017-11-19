package it.sevenbits.courses.formatter.Code.interfaces.exceptions;

public class ClosableExceptions extends Exception {

    public ClosableExceptions(final Throwable cause) {
        super(cause);
    }

    public ClosableExceptions(final String message, final Throwable cause) {
        super(message, cause);
    }
}
