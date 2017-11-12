package it.sevenbits.courses.formatter.Code.StringIO;

import it.sevenbits.courses.formatter.Code.Interfaces.IReader;

public class StringReader implements IReader {
    String str;
    public StringReader(String string) {
       str=string;
    }

    @Override
    public boolean hasChars() {
        if(str.isEmpty())
        { return false;}
        else
        { return true;}
    }

    @Override
    public char readChar() {
        return str.charAt(0);
    }
}
