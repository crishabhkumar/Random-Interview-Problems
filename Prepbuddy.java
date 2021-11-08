package com.rishabh.microsoftQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
Prepbuddy is a programming freak. One day seeing his interest in problem solving.
his teacher gave him an array A containing N integers and asked him to
find the count of distinct numbers in every window of size in X array A.

Note:Prepbuddy has to return an array of size (N-X+1),
where ith index of the array represents the number of distinct elemensts
in array A from index i to index i+X-1.
Also,, if the of array is smaller than X,he needs to return an empty array.

Input 1
N = 5,A = [1,2,2,3,4],X=2
Output 1
2 1 2 2

Input 2
N = 8,A=[2,2,3,4,1,2,5,6],X = 4
Output 2
3 4 4 4 4
 */
public class Prepbuddy {
    public static ArrayList<Integer> distinctCount(int[] arr,int x,int n){
        ArrayList<Integer> out = new ArrayList<>();
        if(n < x){
            return out;
        }

        HashMap<Integer,Integer> um = new HashMap<>();
        int dist_Count = 0;
        for (int i = 0; i < x; i++) {
            if (um.get(arr[i]) == 0){
                dist_Count++;
            }
            um.put(arr[i],um.get(arr[i]) + 1);
        }
        out.add(dist_Count);
        for (int i = x; i < n; i++) {
            if(um.get(arr[i-x]) == 1){
                dist_Count--;
            }
            um.put(arr[i-x],arr[i-x] - 1 );
            if(um.get(arr[i]) == 0){
                dist_Count++;
            }
            um.put(arr[i],arr[i]+1);
            out.add(dist_Count);
        }
        return out;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        int n = arr.length;
        int x = 2;
        ArrayList<Integer> output= distinctCount(arr,x,n);
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i) + " ");
        }
        System.out.println();
    }
}
