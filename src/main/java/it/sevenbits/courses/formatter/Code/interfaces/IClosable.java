package it.sevenbits.courses.formatter.Code.interfaces;

import it.sevenbits.courses.formatter.Code.interfaces.exceptions.ClosableExceptions;

public interface IClosable extends AutoCloseable {

    @Override
    void close() throws ClosableExceptions;
}