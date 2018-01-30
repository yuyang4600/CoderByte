import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Main {
    public static String LongestWord(String sen) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

        String[] strings = sen.replaceAll("[^a-zA-Z]", " ").split(" ");
        int smallest = 0;
        String string = "a";
        for(String str:strings) {
            if (str.length() > string.length()) {
                smallest = str.length();
                string = str;
            }
        }
        return string;

    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}


