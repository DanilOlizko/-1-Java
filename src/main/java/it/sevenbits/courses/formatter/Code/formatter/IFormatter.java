package it.sevenbits.courses.formatter.Code.formatter;

import it.sevenbits.courses.formatter.Code.interfaces.IReader;
import it.sevenbits.courses.formatter.Code.interfaces.IWriter;

public interface IFormatter {

    void format(IReader in, IWriter out) throws FormatterException;
}
