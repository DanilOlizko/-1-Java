package it.sevenbits.courses.formatter.Code.fileIo;


import it.sevenbits.courses.formatter.Code.interfaces.IClosable;
import it.sevenbits.courses.formatter.Code.interfaces.IWriter;
import it.sevenbits.courses.formatter.Code.interfaces.exceptions.ClosableExceptions;
import it.sevenbits.courses.formatter.Code.interfaces.exceptions.WriterException;

import java.io.*;

public class FileWriter implements IWriter, IClosable {

    private BufferedWriter bufferedWriter;

    public FileWriter(final String path) throws WriterException {
        try {
            FileOutputStream outputStream =
                    new FileOutputStream(new File(path));
            Writer fileWriter =
                    new OutputStreamWriter(outputStream, "utf-8");
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            throw new WriterException("Opening file error", e);
        }
    }


    @Override
    public void write(final char symbol) throws WriterException {
        try {
            bufferedWriter.write(symbol);
        } catch (IOException e) {
            throw new WriterException("Writing error", e);
        }
    }

    @Override
    public void close() throws ClosableExceptions {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new ClosableExceptions("Closing error", e);
        }
    }
}
