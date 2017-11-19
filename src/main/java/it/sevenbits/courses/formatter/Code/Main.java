package it.sevenbits.courses.formatter.Code;

import it.sevenbits.courses.formatter.Code.fileIo.FileReader;
import it.sevenbits.courses.formatter.Code.fileIo.FileWriter;
import it.sevenbits.courses.formatter.Code.formatter.Formatter;
import it.sevenbits.courses.formatter.Code.formatter.IFormatter;

public class Main {

    public static void main(final String[] args) throws Exception {

        IFormatter formatter = new Formatter();
        try (
                FileReader in = new FileReader(args[0]);
                FileWriter out = new FileWriter(args[1])
        )
        {

            formatter.format(in, out);
        }
    }
}
