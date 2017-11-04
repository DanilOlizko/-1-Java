package StringIO;

import Interfaces.IWriter;

public class StringWriter implements IWriter {
    String str;
    public StringWriter(String string,String text) {
        str = new String(string);
        str+= text;
    }

    @Override
    public void writeChar(char ch) {
        str+=String.valueOf(ch);

    }
}