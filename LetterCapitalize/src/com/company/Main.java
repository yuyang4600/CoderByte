package com.company;

import java.util.*;
import java.io.*;

public class Main {
    public static String LetterCapitalize(String str) {
        str = str.replace(str.substring(0, 1), str.substring(0, 1).toUpperCase());
        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i = 0; i < stringBuilder.length(); i ++) {
            char s = stringBuilder.charAt(i);
            if (Character.isSpaceChar(s)) {
                stringBuilder.replace(i + 1, i + 2, String.valueOf(str.charAt(i + 1)).toUpperCase());
            }
        }
        return stringBuilder.toString();

    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }
}

