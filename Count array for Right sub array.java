/*
You are given an array of integers and you have to return a new count array
the count array have property where:
    count[i] is th no. of smaller elemeents present to right of arr[i]
    
Example:    Arr = [5,2,6,1]
            Count = [2,1,1,0]
            
            
            */

//Solution:
package com.rishabh;

import java.util.Arrays;

public class NumberOfSmallerElemenFromRightArray {
    public static void main(String[] args) {
        int[] arr = {5,2,6,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(countArray(arr)));
    }

    public static int[] countArray(int[] arr){
        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    count[i]++;
                }
            }
        }
        return count;
    }
}
