package it.sevenbits.courses.formatter.Code.formatter;

import it.sevenbits.courses.formatter.Code.interfaces.exceptions.ReaderException;
import it.sevenbits.courses.formatter.Code.interfaces.IFormatter;
import it.sevenbits.courses.formatter.Code.interfaces.IReader;
import it.sevenbits.courses.formatter.Code.interfaces.IWriter;
import it.sevenbits.courses.formatter.Code.interfaces.exceptions.WriterException;

import java.io.IOException;

public class Formatter implements IFormatter, IReader,IWriter {
    public static String[] splitStr(final String splitString,final int stringIndex) {
        char[] firstStr = new char[stringIndex];
        char[] secondStr = new char[splitString.length() - stringIndex];
        String[] result = new String[2];

        char[] charArr = splitString.toCharArray();

        for (int i = 0; i < stringIndex; i++) {
            firstStr[i] = charArr[i];
        }
        int k = 0;
        for (int i = stringIndex; i < splitString.length(); i++) {
            secondStr[k] = charArr[i];
            k++;
        }
        result[0] = new String(firstStr);
        result[1] = new String(secondStr);
        return result;
    }

    public void formatString(IReader in, IWriter out) throws FormatterException {

        int countOpen = 0;
        int index = 0;
        String str="";
        String space = "";
        String enter = "\n";
        for (int i = 0; i <str.length() ; i++) {
            index++;
            if (str.charAt(i) == '{') {
                countOpen++;
                space += "    ";
                String[] strings = splitStr(str, index);
                str = strings[0] + enter + space + strings[1];
            }
            if (str.charAt(i) == ';') {
                String[] strings = splitStr(str, index);
                str = strings[0] + enter + space + strings[1];
            }
            if (str.charAt(i) == '}') {
                String[] strings = splitStr(str, index);
                str = strings[0] + enter + space + strings[1];
            }
            if (str.charAt(i) == '}') {
                String[] spaces = splitStr(space, countOpen * 4);
                space = spaces[0];
                countOpen--;
            }
        }
        System.out.println(str);
    }


    @Override
    public boolean readNext() throws ReaderException {
        return false;
    }

    @Override
    public char getChar() throws ReaderException {
        return 0;
    }

    @Override
    public void write(char symbol) throws WriterException {

    }
}