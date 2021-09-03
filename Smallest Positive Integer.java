/*
Given an unsorted array of integers,
return the smallest positive integer

eg: 
        arr = [1,2,0]   => ans = 3
        arr = [3,4,-1,1] => ans = 2
        arr = [7,8,9,11,12] => ans = 1
        
       */

//Solution:
package com.rishabh;

public class FindMissingPositiveNumber {
    public static void main(String[] args) {
        System.out.println(findMissingPositiveNumbe(new int[] {3,4,-1,1}));
    }

    private static int findMissingPositiveNumbe(int[] arr){
        int n = arr.length;

        int contains = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                contains++;
                break;
            }
        }

        if(contains == 0){
            return 1;
        }

        for (int i = 0; i < n;i++){
            if(arr[i] <= 0 || arr[i] > n){
                arr[i] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int a = Math.abs(arr[i]);

            if (a == n) {
                arr[0] = -Math.abs(arr[0]);
            } else {
                arr[a] = -Math.abs(arr[a]);
            }
        }

        for (int i = 1; i < n; i++) {
                if (arr[i] > 0) {
                    return i;
                }
        }

        if(arr[0] > 0) {
            return n;
        }

        return n + 1;
    }
}


        
