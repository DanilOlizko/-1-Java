package it.sevenbits.courses.formatter.Code.formatter;

public class FormatterException extends Exception{

    public FormatterException(final Throwable cause) {
        super(cause);
    }

    public FormatterException(final String message, final Throwable cause) {
        super(message, cause);
    }
}