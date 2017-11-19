package it.sevenbits.courses.formatter.Code.interfaces;

import it.sevenbits.courses.formatter.Code.interfaces.exceptions.WriterException;

public interface IWriter {
    void write(final char symbol) throws WriterException;
}
