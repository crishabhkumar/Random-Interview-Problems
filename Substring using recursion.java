/*
You are given a String,print all of the subsequences
String = "abc"
Subsequences = " ","a","b","c","ab","bc","ac","abc"
*/
package com.rishabh.recursion;

import java.util.ArrayList;

public class AllSubsequences {
    public static void main(String[] args) {
        String name = "abc";

        System.out.println(Subsequences(name));

    }

    private static ArrayList<String> Subsequences(String str){
        if(str.length() == 0){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> res = Subsequences(ros);
        ArrayList<String> mr = new ArrayList<>();

        for(String val : res){
            mr.add(val);
            mr.add(ch + val);
        }

        return mr;
    }
}
