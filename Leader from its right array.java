/*
Given an Array A of +ve integers.Find the leaders in the array. An element of array is leader
if it is greater than or equal to all the elements to its right side.

Example:
I/P : A[] = {16,17,4,3,5,2}
O/P : 17,5,2

I/P : A[] = {1,2,3,4,0}
O/P : 4,0
 */
package com.rishabh.arrays;

import java.util.Arrays;

public class LeaderElementFromRightArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        leaderArray(arr);
    }

    public static void leaderArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i+1; j < arr.length; j++) {
                if(arr[i] <= arr[j]) {
                    //System.out.println(arr[j]);
                    break;
                }
            }
            if(j == arr.length){
                System.out.println(arr[i]);
            }
        }
    }
}
