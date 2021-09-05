/*
Given a string,find it's all permutation using recursion
String = "abc"
all permutation = [abc,acb,bac,bca,cab,cba]
 */
package com.rishabh.recursion;

import java.util.ArrayList;

public class PermutationString {
    public static void main(String[] args) {
        String str = "abc";

        System.out.println(permutaionstring(str));

    }
    public static ArrayList<String> permutaionstring(String str){
        if(str.length() == 0){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> res = permutaionstring(ros);

        ArrayList<String> mr = new ArrayList<>();

        for(String val : res){
            for (int i = 0; i <= val.length(); i++) {
                String s = val.substring(0,i) + ch + val.substring(i);
                mr.add(s);
            }
        }
        return mr;
    }
}
