package com.company;

import java.util.*;
import java.io.*;

public class Main {
    public static int FirstFactorial(int num) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        int num1 = num;
        while(num > 1) {
            num1 = num1 * (num - 1);
            num = num - 1;
        }
        return num1;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        while(true) {
            int num = s.nextInt();
            if (num < 1 || num > 18) {
                System.out.print("请输入1-18以内的整数\n");
            }else {
                System.out.print(FirstFactorial(num));
                System.out.print("\n");
            }
        }
    }
}
