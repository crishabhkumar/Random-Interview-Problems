package com.rishabh.Day1;

import java.util.Arrays;

//BruteForce
public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        int[][] ans = fun(matrix);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    
    static int[][] fun(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k][j] != 0)
                            arr[k][j] = -1;
                    }
                    for (int k = 0; k < arr.length; k++) {
                        if(arr[i][k] != 0)
                            arr[i][k] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
        
        return arr;
    }
}
