package com.company;

import java.util.*;
import java.io.*;

class Main {
    static int flag = 1;
    public static int KaprekarsConstant(int num) {

        String str = String.valueOf(num);
        if (str.length() == 2) {
            str = "0" + "0" + str;
        }else if (str.length() == 3) {
            str = "0" + str;
        }
        char[] str_char = str.toCharArray();
        Arrays.sort(str_char);
        int num_min = Integer.parseInt(String.valueOf(str_char));
        int num_max = Integer.parseInt(new StringBuilder(String.valueOf(str_char)).reverse().toString());
        int num_result = num_max - num_min;
        if (num_result == 6174) {
            return flag;
        }else{
            flag ++;
            KaprekarsConstant(num_result);
        }
        return flag;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(KaprekarsConstant(Integer.parseInt(s.nextLine())));
    }

}