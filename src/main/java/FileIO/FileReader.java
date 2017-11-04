package FileIO;

import Interfaces.IClosable;
import Interfaces.IReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class FileReader implements IClosable, IReader
{
    File file;// = new File(fileName);
    StringBuilder sb = new StringBuilder();
    java.io.FileReader fr;
    BufferedReader in;
    String s;

    public FileReader(String path)
    {
        file = new File(path);

        try {
            //Объект для чтения файла в буфер

            fr = new java.io.FileReader(file);
            in = new BufferedReader(fr);
            try {
                //В цикле построчно считываем файл
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //Также не забываем закрыть файл
                //in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean hasChars() {
        if(s.isEmpty())
        { return false;}
        else
        { return true;}
    }

    @Override
    public char readChar() {
        return s.charAt(0);
    }

    @Override
    public void close() throws Exception {
        in.close();
    }
}
