package com.company;

import java.util.*;
import java.io.*;

public class Main {
    public static String FirstReverse(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        String s = "";
        for(int i = str.length() - 1; i >= 0; i --) {
            s = s + str.charAt(i);
        }
        return s;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.print(stringBuffer.reverse());
    }

}
