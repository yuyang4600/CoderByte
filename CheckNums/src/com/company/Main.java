package com.company;

import java.util.*;
import java.io.*;

class Main {
    String CheckNums(int num1, int num2) {

        if(num1 == num2)
            return "-1";
        else if(num2 < num1)
            return "false";

        return "true";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        Main c = new Main();
        System.out.print(c.CheckNums(a, b));
    }

}

