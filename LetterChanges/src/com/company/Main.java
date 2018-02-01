package com.company;

import java.util.*;
import java.io.*;

class Main {
    public static String LetterChanges(String str) {
    StringBuffer stringBuffer = new StringBuffer(str);
        for(int i = 0; i < stringBuffer.length(); i ++) {
            char s = str.charAt(i);
            if (s >= 'A' && s <= 'Z' || s >= 'a' && s <= 'z') {
                if (s == 'z') {
                    s = 'a';
                } else if (s == 'Z') {
                    s = 'A';
                }else {
                    s = (char) (str.charAt(i) + 1);
                }
            }
            List list = Arrays.asList('a','e','i','o','u');
            if (list.contains(s)) {
                s = String.valueOf(s).toUpperCase().charAt(0);
            }
            stringBuffer.setCharAt(i, s);
        }
        return stringBuffer.toString();
    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }

}
