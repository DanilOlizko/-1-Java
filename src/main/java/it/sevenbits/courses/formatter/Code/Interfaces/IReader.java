package it.sevenbits.courses.formatter.Code.Interfaces;

import it.sevenbits.courses.formatter.Code.Exceptions.ReaderExceptions;

public interface IReader {
    public boolean hasChars() throws ReaderExceptions;
    public char readChar() throws ReaderExceptions;
}
