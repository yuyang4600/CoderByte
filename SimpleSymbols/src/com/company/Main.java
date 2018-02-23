package com.company;

import java.util.*;
import java.io.*;

class Main {
    boolean SimpleSymbols(String str) {

        if(str.charAt(0) >= 65 && str.charAt(0) <= 122)
            return false;
        else if(str.charAt(str.length()-1) >= 65 && str.charAt(str.length()-1) <= 122 )
            return false;

        for(int i=1; i < str.length()-1; i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <=122 ){
                if(str.charAt(i-1) != '+' || str.charAt(i+1) != '+')
                    return false;
            }
        }


        return true;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        Main c = new Main();
        System.out.print(c.SimpleSymbols(s.nextLine()));
    }

}
