package it.sevenbits.courses.formatter.Code.interfaces;

import it.sevenbits.courses.formatter.Code.interfaces.exceptions.ReaderException;

public interface IReader {

    boolean readNext() throws ReaderException;

    char getChar() throws ReaderException;
}