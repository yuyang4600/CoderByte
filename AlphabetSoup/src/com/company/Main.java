package com.company;

import java.util.*;
import java.io.*;

class Main {
    public static String AlphabetSoup(String str) {

     char[] strings = str.toCharArray();
     int[] strtoint = new int[strings.length];
     for(int i = 0; i < strings.length; i ++) {
         strtoint[i] = (int)strings[i];
     }
     Arrays.sort(strtoint);
        for (int i = 0; i < strtoint.length; i++) {
            strings[i] = (char)(strtoint[i]);
        }
        String cd = String.valueOf(strings);
        return cd;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(AlphabetSoup(s.nextLine()));
    }

}