package com.company;

import java.util.*;
import java.io.*;

class Main {
    String TimeConvert(int num) {

        int min = num/60;
        int sec = num % 60;
        String time = min + ":" + sec;
        return time;

    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        Main c = new Main();
        System.out.print(c.TimeConvert(s.nextLine()));
    }

}
