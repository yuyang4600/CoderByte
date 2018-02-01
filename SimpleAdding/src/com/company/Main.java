package com.company;

import java.util.*;
import java.io.*;

public class Main {
    public static int SimpleAdding(int num) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        for(int i = num; i > 0; i --) {
            num = num + (i - 1);
        }
        return num;
    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        while (true) {
            int num = s.nextInt();
            if (num < 1 || num > 1000) {
                System.out.println("请输入1-1000以内的数");
            } else {
                System.out.println(SimpleAdding(num));
            }
        }
    }
}

