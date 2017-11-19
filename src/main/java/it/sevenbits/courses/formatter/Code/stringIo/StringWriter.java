package it.sevenbits.courses.formatter.Code.stringIo;

import it.sevenbits.courses.formatter.Code.interfaces.IWriter;
import it.sevenbits.courses.formatter.Code.interfaces.exceptions.WriterException;

public class StringWriter implements IWriter {

    private StringBuilder resultString;

    public StringWriter() {
        resultString = new StringBuilder();
    }

    public final String toString() {

        return resultString.toString();
    }

    @Override
    public void write(final char symbol) throws WriterException {

        try {
            resultString.append(symbol);
        } catch (Exception e) {
            throw new WriterException("Writing error", e);
        }

    }
}