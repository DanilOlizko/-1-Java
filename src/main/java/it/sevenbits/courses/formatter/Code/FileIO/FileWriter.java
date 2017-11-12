package it.sevenbits.courses.formatter.Code.FileIO;

import it.sevenbits.courses.formatter.Code.Exceptions.CloseExceptions;
import it.sevenbits.courses.formatter.Code.Interfaces.IClosable;
import it.sevenbits.courses.formatter.Code.Interfaces.IWriter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter implements IClosable, IWriter {

    File file;
    StringBuilder sb = new StringBuilder();
    //java.io.FileReader fr;
    //BufferedReader in;
    String s;
    PrintWriter out;
    public FileWriter(String path, String text)
    {
        file = new File("2.txt");
        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст v файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public void close() throws CloseExceptions {
        out.close();
    }

    @Override
    public void writeChar(char ch) {

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст v файл
                out.print(String.valueOf(ch));
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
