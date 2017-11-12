package it.sevenbits.courses.formatter.Code.Interfaces;

import it.sevenbits.courses.formatter.Code.Exceptions.CloseExceptions;

public interface IClosable extends AutoCloseable {
    @Override
    void close() throws CloseExceptions, Exception;
}