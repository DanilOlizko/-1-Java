package Code;

import java.io.FileReader;
import java.io.IOException;
public class Format_code {
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

    public void formatString(String str) throws IOException {

        int countOpen = 0;
        int index = 0;
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
}